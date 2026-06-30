package ml2;

/* loaded from: classes10.dex */
public final class b0 implements e62.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml2.c0 f327210a;

    public b0(ml2.c0 c0Var) {
        this.f327210a = c0Var;
    }

    @Override // e62.e
    public void a(java.lang.Object obj, l52.g gVar, android.view.View view) {
    }

    @Override // e62.e
    public void b(java.lang.Object obj, l52.g gVar, android.view.View view) {
        if (gVar == null || view == null || !(view.getTag() instanceof ed4.p)) {
            return;
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(gVar.f316614h);
        ml2.c0 c0Var = this.f327210a;
        if (!isEmpty) {
            c0Var.getClass();
            java.lang.String str = gVar.f316613g;
            int i17 = gVar.f316608b;
            java.lang.String str2 = android.text.TextUtils.isEmpty(gVar.f316615i) ? gVar.f316607a.f382838d : gVar.f316615i;
            kotlin.jvm.internal.o.d(str2);
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(gVar.f316607a.f382838d);
            long E12 = com.tencent.mm.sdk.platformtools.t8.E1(gVar.f316609c);
            ml2.x1 x1Var = ml2.x1.f328202f;
            java.lang.String userName = gVar.f316607a.f382856y;
            kotlin.jvm.internal.o.f(userName, "userName");
            ml2.e0 e0Var = ml2.e0.f327370e;
            ml2.v3[] v3VarArr = ml2.v3.f328148d;
            ml2.f0 f0Var = new ml2.f0(null, str, i17, str2, E1, E12, x1Var, "37", -1, userName, e0Var, true, true, 3, null, null, null, gVar.f316616j, 0L, null, 0, com.tencent.mm.sdk.platformtools.t8.E1(gVar.f316607a.f382838d), com.tencent.mm.sdk.platformtools.t8.D1(c0Var.f327317k, 0), null, null, null, 60669952, null);
            ml2.x0 x0Var = c0Var.f327307a;
            if (x0Var != null) {
                ((ml2.b) x0Var).a(f0Var, false);
                return;
            }
            return;
        }
        c0Var.getClass();
        fe0.l4 l4Var = (fe0.l4) i95.n0.c(fe0.l4.class);
        java.lang.Object tag = view.getTag();
        ((ee0.p4) l4Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
        com.tencent.mm.plugin.sns.ui.item.n nVar = tag instanceof com.tencent.mm.plugin.sns.ui.item.n ? (com.tencent.mm.plugin.sns.ui.item.n) tag : null;
        if (nVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
        } else {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = nVar.timeLineObject;
            if (timeLineObject == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
            } else {
                r45.a90 a90Var = timeLineObject.ContentObj;
                r8 = a90Var != null ? a90Var.f369848s : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
            }
        }
        if (r8 == null) {
            return;
        }
        java.lang.String string = r8.getString(1);
        java.lang.String str3 = string == null ? "" : string;
        int i18 = gVar.f316608b;
        java.lang.String string2 = r8.getString(2);
        java.lang.String str4 = string2 == null ? "" : string2;
        long E13 = com.tencent.mm.sdk.platformtools.t8.E1(r8.getString(2));
        long E14 = com.tencent.mm.sdk.platformtools.t8.E1(r8.getString(0));
        ml2.x1 x1Var2 = ml2.x1.f328202f;
        java.lang.String str5 = c0Var.f327317k;
        java.lang.String string3 = r8.getString(3);
        java.lang.String str6 = string3 == null ? "" : string3;
        ml2.e0 e0Var2 = r8.getInteger(13) == 1 ? ml2.e0.f327370e : ml2.e0.f327371f;
        ml2.v3[] v3VarArr2 = ml2.v3.f328148d;
        ml2.f0 f0Var2 = new ml2.f0(null, str3, i18, str4, E13, E14, x1Var2, str5, -1, str6, e0Var2, true, true, 3, null, null, null, gVar.f316616j, 0L, null, 0, com.tencent.mm.sdk.platformtools.t8.E1(r8.getString(2)), com.tencent.mm.sdk.platformtools.t8.D1(c0Var.f327317k, 0), null, null, null, 60669952, null);
        ml2.x0 x0Var2 = c0Var.f327307a;
        if (x0Var2 != null) {
            ((ml2.b) x0Var2).a(f0Var2, false);
        }
    }
}
