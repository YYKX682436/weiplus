package gr2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gr2.o f274781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f274782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f274783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f274784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274786i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f274788n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f274789o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f274790p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f274791q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gr2.o oVar, int i17, so2.j5 j5Var, java.util.ArrayList arrayList, android.view.View view, java.lang.String str, java.lang.String str2, int i18, android.os.Bundle bundle, so2.j5 j5Var2, long j17) {
        super(2);
        this.f274781d = oVar;
        this.f274782e = i17;
        this.f274783f = j5Var;
        this.f274784g = arrayList;
        this.f274785h = view;
        this.f274786i = str;
        this.f274787m = str2;
        this.f274788n = i18;
        this.f274789o = bundle;
        this.f274790p = j5Var2;
        this.f274791q = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        long j17;
        int i17;
        java.lang.String str2;
        java.lang.Object obj3;
        java.lang.String str3;
        int i18;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.uo1 liveDesc;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject5;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject6;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject7;
        int i19;
        java.lang.String str4;
        java.lang.Object obj4;
        int i27;
        java.lang.String str5;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject8;
        r45.yz2 yz2Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject9;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject10;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject11;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject12;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject13;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        gr2.o oVar = this.f274781d;
        oVar.getClass();
        so2.j5 j5Var = this.f274783f;
        if (j5Var instanceof vp2.j0) {
            r45.uc1 uc1Var = new r45.uc1();
            vp2.j0 j0Var = (vp2.j0) j5Var;
            uc1Var.set(0, new java.util.LinkedList(j0Var.f438929u));
            r45.c72 c72Var = j0Var.f438930v;
            uc1Var.set(1, c72Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) c72Var.getCustom(0) : null);
            intent2.putExtra("FINDER_JUMP_INFO_WITH_OUTSIDE", uc1Var.toByteArray());
        }
        if (j5Var instanceof vp2.i0) {
            vp2.i0 i0Var = (vp2.i0) j5Var;
            if (i0Var.f438928u) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 13);
                i0Var.f438928u = false;
            }
        }
        zl2.l lVar = zl2.l.f473865a;
        int i28 = this.f274782e;
        android.view.View view = this.f274785h;
        java.lang.String str6 = this.f274786i;
        java.lang.String str7 = this.f274787m;
        int i29 = this.f274788n;
        android.os.Bundle bundle = this.f274789o;
        android.content.Context context = oVar.f274798a;
        long j18 = 0;
        if (i29 == 3 || i29 == 6) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(j5Var);
            intent2.putExtra("key_chnl_extra", oVar.b(i28, view, "onItemClick"));
            boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed == null || (feedObject7 = baseFinderFeed.getFeedObject()) == null) {
                str = "key_chnl_extra";
                j17 = 0;
            } else {
                str = "key_chnl_extra";
                j17 = feedObject7.getId();
            }
            intent2.putExtra("CURRENT_FEED_ID", j17);
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            r45.k42 k42Var = new r45.k42();
            r45.j42 j42Var = new r45.j42();
            r45.kc1 kc1Var = new r45.kc1();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
            java.lang.String str8 = str;
            zy2.b8 b8Var = (zy2.b8) zVar.a(appCompatActivity).c(zy2.b8.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed2 != null && (feedObject6 = baseFinderFeed2.getFeedObject()) != null) {
                j18 = feedObject6.getId();
            }
            r45.kc1 P6 = ((com.tencent.mm.plugin.finder.feed.fg) b8Var).P6(j18);
            if (P6 != null) {
                i17 = 0;
                str2 = P6.getString(0);
            } else {
                i17 = 0;
                str2 = null;
            }
            kc1Var.set(i17, str2);
            j42Var.set(i17, kc1Var);
            k42Var.set(i17, j42Var);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            k42Var.set(1, (baseFinderFeed3 == null || (feedObject5 = baseFinderFeed3.getFeedObject()) == null) ? null : feedObject5.getDescription());
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed4 == null || (feedObject4 = baseFinderFeed4.getFeedObject()) == null || (finderObject2 = feedObject4.getFinderObject()) == null || (objectDesc = finderObject2.getObjectDesc()) == null || (liveDesc = objectDesc.getLiveDesc()) == null || (obj3 = liveDesc.getString(1)) == null) {
                obj3 = "";
            }
            k42Var.set(3, obj3);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            k42Var.set(2, (baseFinderFeed5 == null || (feedObject3 = baseFinderFeed5.getFeedObject()) == null) ? null : feedObject3.getLocation());
            intent2.putExtra("PRE_JOIN_LIVE_INFO", k42Var.toByteArray());
            if (z17) {
                intent2.putExtra("CURRENT_FEED_ID", ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId());
            }
            intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            if (bundle != null) {
                intent2.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
                intent2.putExtra(str8, oVar.a(bundle));
            }
            jz5.l d17 = lVar.d(arrayList, j5Var, false);
            java.util.List list = (java.util.List) d17.f302833d;
            int intValue = ((java.lang.Number) d17.f302834e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, str6);
            wk0Var.set(1, str7);
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            y74Var.set(1, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5)));
            boolean z19 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed6 = z19 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed6 == null || (feedObject2 = baseFinderFeed6.getFeedObject()) == null || (str3 = feedObject2.getNickName()) == null) {
                str3 = "";
            }
            y74Var.set(2, str3);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed7 = z19 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed7 == null || (feedObject = baseFinderFeed7.getFeedObject()) == null) {
                i18 = 5;
                finderObject = null;
            } else {
                finderObject = feedObject.getFeedObject();
                i18 = 5;
            }
            y74Var.set(i18, finderObject);
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var = new r45.ta4();
            java.util.LinkedList list2 = ta4Var.getList(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(this.f274791q));
            list2.add(qa4Var);
            wk0Var.set(7, ta4Var);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(oVar.f274798a, intent2, list, intValue, wk0Var, null);
        } else {
            intent2.putExtra("key_chnl_extra", oVar.b(i28, view, "onItemClick"));
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            boolean z27 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            if (z27) {
                intent2.putExtra("CURRENT_FEED_ID", ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId());
            }
            if (bundle != null) {
                intent2.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
                intent2.putExtra("key_chnl_extra", oVar.a(bundle));
            }
            r45.k42 k42Var2 = new r45.k42();
            r45.j42 j42Var2 = new r45.j42();
            r45.kc1 kc1Var2 = new r45.kc1();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            boolean z28 = context instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z28) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = (androidx.appcompat.app.AppCompatActivity) context;
            zy2.b8 b8Var2 = (zy2.b8) zVar2.a(appCompatActivity2).c(zy2.b8.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed8 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            r45.kc1 P62 = ((com.tencent.mm.plugin.finder.feed.fg) b8Var2).P6((baseFinderFeed8 == null || (feedObject13 = baseFinderFeed8.getFeedObject()) == null) ? 0L : feedObject13.getId());
            if (P62 != null) {
                i19 = 0;
                str4 = P62.getString(0);
            } else {
                i19 = 0;
                str4 = null;
            }
            kc1Var2.set(i19, str4);
            j42Var2.set(i19, kc1Var2);
            k42Var2.set(i19, j42Var2);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed9 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            k42Var2.set(1, (baseFinderFeed9 == null || (feedObject12 = baseFinderFeed9.getFeedObject()) == null) ? null : feedObject12.getDescription());
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed10 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed10 == null || (feedObject11 = baseFinderFeed10.getFeedObject()) == null || (finderObject3 = feedObject11.getFinderObject()) == null || (objectDesc2 = finderObject3.getObjectDesc()) == null || (liveDesc2 = objectDesc2.getLiveDesc()) == null || (obj4 = liveDesc2.getString(1)) == null) {
                obj4 = "";
            }
            k42Var2.set(3, obj4);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed11 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            k42Var2.set(2, (baseFinderFeed11 == null || (feedObject10 = baseFinderFeed11.getFeedObject()) == null) ? null : feedObject10.getLocation());
            intent2.putExtra("PRE_JOIN_LIVE_INFO", k42Var2.toByteArray());
            intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            r45.q92 q92Var = new r45.q92();
            java.util.ArrayList<so2.j5> arrayList2 = this.f274784g;
            for (so2.j5 j5Var2 : arrayList2) {
                if (j5Var2 instanceof wp2.b) {
                    wp2.b bVar = (wp2.b) j5Var2;
                    if (bVar.getFeedObject().field_id != 0) {
                        q92Var.getList(0).add(java.lang.Long.valueOf(bVar.getFeedObject().field_id));
                    }
                }
            }
            so2.j5 j5Var3 = this.f274790p;
            boolean z29 = j5Var3 instanceof vp2.q;
            if (z29) {
                java.util.LinkedList list3 = q92Var.getList(0);
                java.util.ArrayList arrayList3 = ((vp2.q) j5Var3).f438951e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    so2.j5 j5Var4 = (so2.j5) it.next();
                    vp2.p pVar = j5Var4 instanceof vp2.p ? (vp2.p) j5Var4 : null;
                    arrayList4.add((pVar == null || (feedObject9 = pVar.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject9.field_id));
                }
                list3.addAll(arrayList4);
            }
            q92Var.set(2, j5Var instanceof wp2.b ? ((wp2.b) j5Var).f448384p.f374132n : z29 ? ((vp2.q) j5Var3).f438950d.f374132n : null);
            dr2.c cVar = oVar.f274800c;
            q92Var.set(1, (cVar == null || (yz2Var = ((wq2.e) cVar).f448522a.f448532d) == null) ? null : yz2Var.f391522i);
            if (!q92Var.getList(0).isEmpty()) {
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_SQUARE_EXTRA_INFO", q92Var.toByteArray());
            }
            jz5.l d18 = lVar.d(arrayList2, j5Var, false);
            java.util.List list4 = (java.util.List) d18.f302833d;
            int intValue2 = ((java.lang.Number) d18.f302834e).intValue();
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar3 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar3.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n == 182) {
                for (int i37 = 0; i37 < intValue2; i37++) {
                    java.util.ArrayList arrayList5 = list4 instanceof java.util.ArrayList ? (java.util.ArrayList) list4 : null;
                    if (arrayList5 != null) {
                    }
                }
                i27 = 0;
                intValue2 = 0;
            } else {
                i27 = 0;
            }
            r45.wk0 wk0Var2 = new r45.wk0();
            wk0Var2.set(i27, str6);
            wk0Var2.set(1, str7);
            wk0Var2.set(2, java.lang.Boolean.FALSE);
            wk0Var2.set(3, 1001);
            wk0Var2.set(4, -1);
            wk0Var2.set(5, 1);
            r45.y74 y74Var2 = new r45.y74();
            pf5.z zVar4 = pf5.z.f353948a;
            if (!z28) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            y74Var2.set(1, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar4.a(appCompatActivity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5)));
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed12 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed12 == null || (feedObject8 = baseFinderFeed12.getFeedObject()) == null || (str5 = feedObject8.getNickName()) == null) {
                str5 = "";
            }
            y74Var2.set(2, str5);
            wk0Var2.set(6, y74Var2);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(oVar.f274798a, intent2, list4, intValue2, wk0Var2, null);
        }
        ig2.o.f291411a.a("startActivity");
        return jz5.f0.f302826a;
    }
}
