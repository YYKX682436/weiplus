package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class q8 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210657d;

    public q8(com.tencent.mm.ui.tools.c9 c9Var) {
        this.f210657d = c9Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.ui.tools.c9 c9Var;
        com.tencent.mm.ui.tools.b9 b9Var;
        if (3 != i17 || (b9Var = (c9Var = this.f210657d).f210324i) == null) {
            return false;
        }
        return b9Var.n5(c9Var.g());
    }
}
