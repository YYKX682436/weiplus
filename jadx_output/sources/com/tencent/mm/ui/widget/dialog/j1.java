package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class j1 implements db5.m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k1 f211846a;

    public j1(com.tencent.mm.ui.widget.dialog.l1 l1Var, com.tencent.mm.ui.widget.dialog.k1 k1Var) {
        this.f211846a = k1Var;
    }

    public void a(db5.h4 h4Var) {
        com.tencent.mm.ui.widget.dialog.k1 k1Var = this.f211846a;
        java.lang.Object tag = k1Var.f211896f.getTag();
        if ((tag instanceof db5.h4) && h4Var.equals((db5.h4) tag)) {
            k1Var.f211896f.setVisibility(0);
            k1Var.f211896f.setImageDrawable(h4Var.getIcon());
        }
    }
}
