package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f211817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f211818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f211819f;

    public h3(com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        this.f211819f = z2Var;
        this.f211817d = charSequence;
        this.f211818e = charSequence2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f211819f;
        android.text.Layout layout = z2Var.f212069u.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        com.tencent.mm.ui.yk.c("MicroMsg.MMHalfBottomDialog", "RightButton text too long, show updown mode!!", new java.lang.Object[0]);
        com.tencent.mm.ui.widget.dialog.z2.a(z2Var, this.f211817d, this.f211818e);
    }
}
