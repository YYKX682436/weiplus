package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f173823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f173824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.app.Activity activity, com.tencent.mm.plugin.textstatus.ui.j2 j2Var, java.lang.String str) {
        super(0);
        this.f173823d = activity;
        this.f173824e = j2Var;
        this.f173825f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final android.app.Activity activity = this.f173823d;
        if (activity == null || activity.isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "onClickSetStatusButton: host activity invalid, skip jump");
        } else {
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f354941h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
            final com.tencent.mm.plugin.textstatus.ui.j2 j2Var = this.f173824e;
            d1Var.f354942i = j2Var.f173996f.f21051c;
            final android.os.Handler handler = j2Var.f173999i;
            bi4.o1.f21075a.a(activity, d1Var, new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.plugin.textstatus.ui.MultipleTextStatusCardDialog$onClickSetStatusButton$1$resultReceiver$1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "onReceiveResult: code=" + i17);
                    if (i17 == -1) {
                        com.tencent.mm.plugin.textstatus.ui.j2 j2Var2 = com.tencent.mm.plugin.textstatus.ui.j2.this;
                        j2Var2.f173999i.post(new com.tencent.mm.plugin.textstatus.ui.i2(activity, j2Var2));
                    }
                }
            });
            bi4.h1 h1Var = j2Var.f173996f;
            java.lang.String str = h1Var.f21049a;
            long j17 = h1Var.f21051c;
            java.lang.String str2 = d1Var.f354941h;
            java.lang.String str3 = this.f173825f;
            kotlin.jvm.internal.o.d(str2);
            qj4.s.f363958a.u(new qj4.l(str, true, j17, str3, str2, null, null, 32, null));
        }
        return jz5.f0.f302826a;
    }
}
