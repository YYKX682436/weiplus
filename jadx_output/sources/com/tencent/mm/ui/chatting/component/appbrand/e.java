package com.tencent.mm.ui.chatting.component.appbrand;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f198668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.appbrand.f f198669e;

    public e(com.tencent.mm.ui.chatting.component.appbrand.f fVar, java.lang.Runnable runnable) {
        this.f198669e = fVar;
        this.f198668d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String c17;
        com.tencent.mm.ui.chatting.component.appbrand.f fVar = this.f198669e;
        java.lang.String b17 = ab5.c0.b(fVar.f198685d.x());
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            b17 = fVar.f198685d.x();
            c17 = com.tencent.mm.sdk.platformtools.t8.K0(fVar.f198685d.w()) ? ab5.c0.c(fVar.f198685d.x()) : fVar.f198685d.w();
        } else {
            c17 = ab5.c0.c(b17);
        }
        if (fVar.f198670e == 3 && android.text.TextUtils.isEmpty(fVar.f198672g.f77482h)) {
            fVar.f198672g.f77482h = c17;
        }
        int i17 = fVar.f198670e;
        if (i17 != 2 && i17 != 3) {
            k91.z5 z5Var = new k91.z5();
            z5Var.f305863a = ab5.c0.a(b17);
            z5Var.f305872j = 4;
            z5Var.f305866d = b17;
            z5Var.f305867e = c17;
            fVar.f198672g = z5Var.a();
        }
        java.lang.Runnable runnable = this.f198668d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
