package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class dr implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f131926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.er f131927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f131928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f131930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f131931f;

    public dr(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.view.er erVar, long j17, java.lang.String str, int i17, android.content.Intent intent) {
        this.f131926a = finderObject;
        this.f131927b = erVar;
        this.f131928c = j17;
        this.f131929d = str;
        this.f131930e = i17;
        this.f131931f = intent;
    }

    @Override // ss5.d0
    public void b(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.rp1 rp1Var;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f131926a;
        if (finderObject2 != null && finderObject2.getLiveInfo() == null) {
            finderObject2.setLiveInfo(finderObject.getLiveInfo());
        }
        com.tencent.mm.plugin.finder.view.er erVar = this.f131927b;
        java.lang.String name = erVar.f132053a.getClass().getName();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = finderObject2 == null ? finderObject : finderObject2;
        com.tencent.mm.plugin.finder.view.er erVar2 = this.f131927b;
        erVar.d(name, finderObject3, erVar2.f132055c, erVar2.f132056d, this.f131928c, this.f131929d);
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        if (contact != null && contact.getLiveStatus() == 1) {
            android.content.Context context = erVar2.f132053a;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[9];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderObject.getId()));
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            lVarArr[1] = new jz5.l("live_id", liveInfo != null ? pm0.v.u(liveInfo.getLong(0)) : null);
            lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f131930e));
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
            lVarArr[3] = new jz5.l("finder_username", contact2 != null ? contact2.getUsername() : null);
            lVarArr[4] = new jz5.l("session_buffer", finderObject.getSessionBuffer());
            lVarArr[5] = new jz5.l("behaviour_session_id", V6.getString(1));
            lVarArr[6] = new jz5.l("finder_tab_context_id", V6.getString(2));
            ml2.v1 v1Var = ml2.v1.f328140e;
            lVarArr[7] = new jz5.l("live_enter_status", 1L);
            lVarArr[8] = new jz5.l("share_username", "");
            ((cy1.a) rVar).Cj("finder_feed_living_label_click", null, kz5.c1.k(lVarArr), 26236);
        }
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        int integer = liveInfo2 != null ? liveInfo2.getInteger(42) : 0;
        android.content.Intent intent = this.f131931f;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", integer);
        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
        if (liveInfo3 == null || (rp1Var = (r45.rp1) liveInfo3.getCustom(45)) == null) {
            return;
        }
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.toByteArray());
    }
}
