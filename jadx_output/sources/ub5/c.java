package ub5;

/* loaded from: classes5.dex */
public final class c implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ub5.j f426205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f426206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f426207c;

    public c(ub5.j jVar, yz5.a aVar, com.tencent.mm.storage.z3 z3Var) {
        this.f426205a = jVar;
        this.f426206b = aVar;
        this.f426207c = z3Var;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        ub5.j jVar = this.f426205a;
        if (jVar != null) {
            jVar.b(false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpAppCancel, talker: ");
        com.tencent.mm.storage.z3 z3Var = this.f426207c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
        ub5.j jVar = this.f426205a;
        if (jVar != null) {
            java.util.Map map = jVar.f426234c;
            map.putAll(kz5.c1.k(new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(jVar.f426232a.size())), new jz5.l("selected_msg_list", (java.lang.String) ((jz5.n) jVar.f426235d).getValue())));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_exp", map, 35480);
        }
    }

    @Override // xj.l
    public void onJumpAppFail() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpAppFail, talker: ");
        com.tencent.mm.storage.z3 z3Var = this.f426207c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
        yz5.a aVar = this.f426206b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        ub5.j jVar = this.f426205a;
        if (jVar != null) {
            jVar.b(true);
        }
        yz5.a aVar = this.f426206b;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpAppSuccess, talker: ");
        com.tencent.mm.storage.z3 z3Var = this.f426207c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        ub5.j jVar = this.f426205a;
        if (jVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("jump_yuanbao_download_end", jVar.f426234c, 35480);
        }
        yz5.a aVar = this.f426206b;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpDownloadPage, talker: ");
        com.tencent.mm.storage.z3 z3Var = this.f426207c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
    }
}
