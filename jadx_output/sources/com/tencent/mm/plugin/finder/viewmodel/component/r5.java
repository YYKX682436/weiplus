package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class r5 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f135766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t5 f135767e;

    public r5(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.finder.viewmodel.component.t5 t5Var) {
        this.f135766d = mMEditText;
        this.f135767e = t5Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.t5 t5Var = this.f135767e;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f135766d;
        if (z17) {
            mMEditText.addTextChangedListener(t5Var);
        } else {
            mMEditText.removeTextChangedListener(t5Var);
        }
    }
}
