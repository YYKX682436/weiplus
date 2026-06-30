package com.tencent.mm.ui.base;

@java.lang.Deprecated
/* loaded from: classes12.dex */
public class MMAutoSwitchEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {

    /* renamed from: d, reason: collision with root package name */
    public final db5.j1 f197315d;

    public MMAutoSwitchEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        db5.j1 j1Var = new db5.j1(this);
        this.f197315d = j1Var;
        addTextChangedListener(j1Var);
        setOnKeyListener(j1Var);
    }

    public void setIndex(int i17) {
        this.f197315d.f228404h = i17;
    }

    public void setMaxInputCount(int i17) {
        this.f197315d.f228405i = i17;
    }

    public void setOnDelAllContent(db5.k1 k1Var) {
        this.f197315d.f228401e = k1Var;
    }

    public void setOnExceedMaxLimitCount(db5.l1 l1Var) {
        this.f197315d.f228400d = l1Var;
    }

    public void setOnTextInputChanged(db5.m1 m1Var) {
        this.f197315d.f228402f = m1Var;
    }
}
