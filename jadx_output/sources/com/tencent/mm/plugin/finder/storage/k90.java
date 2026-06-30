package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class k90 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f127059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(2);
        this.f127059d = finderItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        android.content.Context context;
        java.lang.String str2;
        int i17;
        int i18;
        android.content.Context context2;
        java.lang.String str3;
        java.lang.String topic = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.assist.q0 clickExtra = (com.tencent.mm.plugin.finder.assist.q0) obj2;
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(clickExtra, "clickExtra");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f127059d;
        clickExtra.f102475d = finderItem.getTopicClickExtra().f102475d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        clickExtra.f102476e = bool;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f128006wc;
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
        mu2.b bVar = mu2.b.f331394a;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        if (intValue == 1) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
            if (!(objectDesc != null && objectDesc.getMediaType() == 2)) {
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                android.content.Intent a17 = su4.r2.a();
                a17.putExtra("ftsbizscene", 1013);
                a17.putExtra("ftsType", 14);
                java.util.Map b17 = su4.r2.b(1013, false, 14);
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                long g17 = o13.n.g(1013);
                java.util.HashMap hashMap = (java.util.HashMap) b17;
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(g17));
                hashMap.put("subSessionId", java.lang.String.valueOf(g17));
                hashMap.put("query", tg0.r2.a(1013) ? topic : fp.s0.a(topic));
                a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(g17));
                a17.putExtra("subSessionId", java.lang.String.valueOf(g17));
                java.lang.ref.WeakReference weakReference = clickExtra.f102475d;
                android.content.Context context3 = weakReference != null ? (android.content.Context) weakReference.get() : null;
                if (context3 == null) {
                    com.tencent.mars.xlog.Log.i("FinderCommonService", "jumpSearch try foreground context");
                    context3 = ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
                }
                android.content.Context context4 = context3;
                if (context4 == null) {
                    com.tencent.mars.xlog.Log.i("FinderCommonService", "jumpSearch try no context");
                } else {
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context4);
                    if (e17 != null) {
                        if (context4 instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
                            com.tencent.mm.plugin.finder.report.r0 r0Var = e17.T;
                            com.tencent.mm.plugin.finder.report.k4 k4Var = r0Var instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) r0Var : null;
                            if (k4Var != null) {
                                k4Var.U0();
                            }
                            com.tencent.mm.plugin.finder.report.l1 l1Var = e17.f135394x1;
                            if (!(l1Var instanceof com.tencent.mm.plugin.finder.report.k4)) {
                                l1Var = null;
                            }
                            if (l1Var != null) {
                                l1Var.U0();
                            }
                            com.tencent.mm.plugin.finder.report.k4 k4Var2 = e17.f135393x0;
                            if (k4Var2 != null) {
                                k4Var2.U0();
                            }
                            com.tencent.mm.plugin.finder.report.l1 l1Var2 = e17.B1;
                            if (!(l1Var2 instanceof com.tencent.mm.plugin.finder.report.k4)) {
                                l1Var2 = null;
                            }
                            if (l1Var2 != null) {
                                l1Var2.U0();
                            }
                        } else {
                            com.tencent.mm.plugin.finder.report.r0 a76 = e17.a7(-1);
                            com.tencent.mm.plugin.finder.report.k4 k4Var3 = a76 instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) a76 : null;
                            if (k4Var3 != null) {
                                k4Var3.U0();
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.report.s3 s3Var = com.tencent.mm.plugin.finder.report.s3.f125345a;
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context4);
                    if (e18 == null || (str3 = e18.V6().getString(1)) == null) {
                        str3 = "";
                    }
                    org.json.JSONObject c17 = com.tencent.mm.plugin.finder.report.s3.c(s3Var, str3, null, 2, null);
                    com.tencent.mars.xlog.Log.i("FinderCommonService", "jumpTopicSearch:searchReportInfo:" + c17);
                    java.lang.String str4 = su4.r2.e(b17, 0) + "&thirdExtParam=" + c17;
                    com.tencent.mars.xlog.Log.i("FinderCommonService", "searchEntranceLayout url:" + str4);
                    a17.putExtra("rawUrl", str4);
                    a17.putExtra("ftsQuery", topic);
                    if (kotlin.jvm.internal.o.b(clickExtra.f102476e, bool)) {
                        bVar.a(context4, "link_topic_tag", 1, clickExtra.f102472a, 0L, topic);
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context4);
                    a17.putExtra("key_context_id", e19 != null ? e19.f135382p : null);
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context4);
                    com.tencent.mm.plugin.finder.report.s0.f125340b = e27 != null ? e27.f135382p : null;
                    j45.l.z(context4, a17, null);
                }
                return jz5.f0.f302826a;
            }
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        java.lang.Long valueOf = java.lang.Long.valueOf(finderItem.field_id);
        java.lang.String dupFlag = finderItem.getDupFlag();
        ((c61.p2) ybVar).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 1);
        intent.putExtra("key_topic_title", topic);
        intent.putExtra("key_ref_object_id", valueOf);
        intent.putExtra("key_ref_object_dup_flag", dupFlag);
        intent.putExtra("key_entrance_type", 2);
        intent.putExtra("key_ref_feed_id", valueOf);
        intent.putExtra("key_ref_feed_dup_flag", dupFlag);
        java.lang.ref.WeakReference weakReference2 = clickExtra.f102475d;
        if (weakReference2 == null || (context2 = (android.content.Context) weakReference2.get()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(context2);
            r45.qt2 V6 = e28 != null ? e28.V6() : null;
            intent.putExtra("key_ref_comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            str = null;
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context2, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        i0Var.hl(context5, intent);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onclick topic:");
        sb6.append(topic);
        sb6.append(" refObjectId:");
        sb6.append(valueOf != null ? pm0.v.u(valueOf.longValue()) : str);
        com.tencent.mars.xlog.Log.i("FinderCommonService", sb6.toString());
        java.lang.ref.WeakReference weakReference3 = clickExtra.f102475d;
        if (weakReference3 != null && (context = (android.content.Context) weakReference3.get()) != null) {
            if (kotlin.jvm.internal.o.b(clickExtra.f102476e, bool)) {
                str2 = str;
                i17 = 1;
                i18 = 0;
                bVar.a(context, "link_topic_tag", 1, clickExtra.f102472a, 0L, topic);
            } else {
                str2 = str;
                i17 = 1;
                i18 = 0;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : str2;
            if (nyVar != 0) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).cj(clickExtra.f102472a, topic, clickExtra.f102474c, 0L, nyVar.f135380n);
                ec2.d e29 = zy2.ra.e2(nyVar, i18, i17, str2);
                if (e29 != null) {
                    e29.a(new ec2.a(18, clickExtra.f102472a, clickExtra.f102473b));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
