/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ACmpgtBinop extends PBinop
{
    private TCmpgt _cmpgt_;

    public ACmpgtBinop()
    {
        // Constructor
    }

    public ACmpgtBinop(
        @SuppressWarnings("hiding") TCmpgt _cmpgt_)
    {
        // Constructor
        setCmpgt(_cmpgt_);

    }

    @Override
    public Object clone()
    {
        return new ACmpgtBinop(
            cloneNode(this._cmpgt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpgtBinop(this);
    }

    public TCmpgt getCmpgt()
    {
        return this._cmpgt_;
    }

    public void setCmpgt(TCmpgt node)
    {
        if(this._cmpgt_ != null)
        {
            this._cmpgt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpgt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmpgt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmpgt_ == child)
        {
            this._cmpgt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmpgt_ == oldChild)
        {
            setCmpgt((TCmpgt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}