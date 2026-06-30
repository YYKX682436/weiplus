package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class f1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144817d;

    public f1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144817d = x1Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (3 != i17) {
            return false;
        }
        com.tencent.mm.plugin.location.ui.impl.w1 w1Var = com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED;
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144817d;
        x1Var.y(w1Var);
        x1Var.U1 = true;
        return false;
    }
}
