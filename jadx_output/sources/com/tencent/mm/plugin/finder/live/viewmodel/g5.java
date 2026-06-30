package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f117113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, android.content.Intent intent) {
        super(0);
        this.f117112d = r5Var;
        this.f117113e = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117112d;
        com.tencent.mm.ui.MMActivity N6 = r5Var.N6();
        if (!(N6 != null && N6.isFinishing())) {
            com.tencent.mm.ui.MMActivity N62 = r5Var.N6();
            if (!(N62 != null && N62.isDestroyed())) {
                android.content.Intent intent = this.f117113e;
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_PARAMS_DO_ACTION_PARAMS") : null;
                com.tencent.mars.xlog.Log.i(r5Var.f117358m, "[clickGame] param = " + stringExtra);
                qo0.b bVar = qo0.b.B2;
                android.os.Bundle bundle = new android.os.Bundle();
                if (stringExtra != null) {
                    bundle.putString("KEY_PARAMS_DO_ACTION_PARAMS", stringExtra);
                }
                r5Var.X6(bVar, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
