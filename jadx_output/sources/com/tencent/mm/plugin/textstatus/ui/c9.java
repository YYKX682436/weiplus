package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class c9 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.e8 f173771c;

    public c9(java.lang.String str, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, com.tencent.mm.plugin.textstatus.ui.e8 e8Var) {
        this.f173769a = str;
        this.f173770b = textStatusEditActivity;
        this.f173771c = e8Var;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        boolean j17 = com.tencent.mm.vfs.w6.j(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "trydownload imgback end:" + this.f173769a + " path:" + str2 + " bitmap:" + bitmap + " exist:" + j17 + " len:" + com.tencent.mm.vfs.w6.k(str2));
        if (bitmap == null) {
            ym5.a1.f(new com.tencent.mm.plugin.textstatus.ui.y8(this.f173770b));
            return;
        }
        if (j17) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173770b;
            com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
            textStatusEditActivity.t7(str2, 1);
            this.f173770b.Q7();
            com.tencent.mm.plugin.textstatus.ui.e8 e8Var = this.f173771c;
            if (e8Var != null) {
                kotlin.jvm.internal.o.d(str2);
                ((com.tencent.mm.plugin.textstatus.ui.j9) e8Var).a(str2);
            }
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.textstatus.ui.a9(bitmap, str2, this.f173770b, this.f173771c));
        }
        ym5.a1.f(new com.tencent.mm.plugin.textstatus.ui.b9(this.f173770b));
    }
}
