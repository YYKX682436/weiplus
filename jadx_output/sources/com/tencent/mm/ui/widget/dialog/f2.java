package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class f2 extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f211788a;

    public f2(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f211788a = y1Var;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        if (i17 == 4) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211788a;
            if (y1Var.e() && y1Var.f212025d.isShowing()) {
                y1Var.q();
            }
        }
    }
}
