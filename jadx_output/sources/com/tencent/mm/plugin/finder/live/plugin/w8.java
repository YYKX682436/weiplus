package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f114884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.b9 f114886f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(int i17, int i18, com.tencent.mm.plugin.finder.live.plugin.b9 b9Var) {
        super(0);
        this.f114884d = i17;
        this.f114885e = i18;
        this.f114886f = b9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f114884d;
        com.tencent.mm.plugin.finder.live.plugin.b9 b9Var = this.f114886f;
        if (i17 == 0 && this.f114885e == 0) {
            mm2.c1 c1Var = (mm2.c1) b9Var.P0(mm2.c1.class);
            r45.jy1 jy1Var = new r45.jy1();
            jy1Var.set(0, 0);
            jy1Var.set(2, 0);
            c1Var.W9(jy1Var, false, new com.tencent.mm.plugin.finder.live.plugin.v8(b9Var));
        } else if (((mm2.c1) b9Var.P0(mm2.c1.class)).a8()) {
            com.tencent.mm.plugin.finder.live.view.k0 R0 = b9Var.R0();
            android.content.Context context = b9Var.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            R0.showAlertDialog((android.app.Activity) context, "", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e3o), "");
            if (pm0.v.z(((mm2.c1) b9Var.P0(mm2.c1.class)).f328807g2, 524288)) {
                com.tencent.mm.plugin.finder.live.plugin.t8 t8Var = (com.tencent.mm.plugin.finder.live.plugin.t8) b9Var.X0(com.tencent.mm.plugin.finder.live.plugin.t8.class);
                if (t8Var != null) {
                    t8Var.t1();
                }
            } else {
                qo0.c.a(b9Var.f111986p, qo0.b.f365405q4, null, 2, null);
            }
        } else {
            com.tencent.mars.xlog.Log.e(b9Var.f111987q, "handleResumeLiveResp liveState:" + ((mm2.c1) b9Var.P0(mm2.c1.class)).f328813h2 + '!');
        }
        return jz5.f0.f302826a;
    }
}
