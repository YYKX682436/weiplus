package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class cr implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.er f131798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f131799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f131800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f131801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131802e;

    public cr(com.tencent.mm.plugin.finder.view.er erVar, android.content.Intent intent, int i17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str) {
        this.f131798a = erVar;
        this.f131799b = intent;
        this.f131800c = i17;
        this.f131801d = finderObject;
        this.f131802e = str;
    }

    @Override // ss5.d0
    public void d(com.tencent.mm.modelbase.f it) {
        android.content.Intent intent;
        int i17;
        r45.rp1 rp1Var;
        boolean z17;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.z61) it.f70618d).getCustom(1);
        if (finderObject != null) {
            java.lang.String str = this.f131802e;
            com.tencent.mm.plugin.finder.view.er erVar = this.f131798a;
            boolean z18 = erVar.f132056d;
            android.content.Intent intent2 = this.f131799b;
            android.content.Context context = erVar.f132053a;
            if (z18) {
                intent = intent2;
            } else {
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                zy2.v9 v9Var = (zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class);
                r45.md5 md5Var = new r45.md5();
                r45.nw1 liveInfo = finderObject.getLiveInfo();
                md5Var.set(1, java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
                com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar = (com.tencent.mm.plugin.finder.live.viewmodel.aa) v9Var;
                android.content.Intent intent3 = intent2 == null ? new android.content.Intent() : intent2;
                r45.md5 md5Var2 = aaVar.f116907e;
                if (md5Var2 != null) {
                    intent = intent2;
                    if (md5Var2.getLong(0) == erVar.f132057e) {
                        z17 = true;
                        if (!z17 || aaVar.f116908f) {
                            com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h.a(intent3, aaVar.f116906d, md5Var);
                        }
                    }
                } else {
                    intent = intent2;
                }
                z17 = false;
                if (!z17) {
                }
                com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h.a(intent3, aaVar.f116906d, md5Var);
            }
            c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
            int i18 = this.f131800c;
            p2Var.Fj(finderObject, i18);
            java.lang.String name = context.getClass().getName();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f131801d;
            if (finderObject2 == null) {
                finderObject2 = finderObject;
            }
            erVar.d(name, finderObject2, erVar.f132055c, erVar.f132056d, 0L, str);
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            if (contact != null && contact.getLiveStatus() == 1) {
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[9];
                i17 = 0;
                lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderObject.getId()));
                r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                lVarArr[1] = new jz5.l("live_id", liveInfo2 != null ? pm0.v.u(liveInfo2.getLong(0)) : null);
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(i18));
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
                lVarArr[3] = new jz5.l("finder_username", contact2 != null ? contact2.getUsername() : null);
                lVarArr[4] = new jz5.l("session_buffer", finderObject.getSessionBuffer());
                lVarArr[5] = new jz5.l("behaviour_session_id", V6.getString(1));
                lVarArr[6] = new jz5.l("finder_tab_context_id", V6.getString(2));
                ml2.v1 v1Var = ml2.v1.f328140e;
                lVarArr[7] = new jz5.l("live_enter_status", 1L);
                lVarArr[8] = new jz5.l("share_username", "");
                ((cy1.a) rVar).Cj("finder_feed_living_label_click", null, kz5.c1.k(lVarArr), 26236);
            } else {
                i17 = 0;
            }
            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
            android.content.Intent intent4 = intent;
            intent4.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", liveInfo3 != null ? liveInfo3.getInteger(42) : i17);
            r45.nw1 liveInfo4 = finderObject.getLiveInfo();
            if (liveInfo4 == null || (rp1Var = (r45.rp1) liveInfo4.getCustom(45)) == null) {
                return;
            }
            intent4.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.toByteArray());
        }
    }
}
