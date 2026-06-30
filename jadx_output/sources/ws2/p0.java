package ws2;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout f449117a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f449118b;

    /* renamed from: c, reason: collision with root package name */
    public gk2.e f449119c;

    public p0(com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f449117a = layout;
        this.f449118b = "FinderLiveReplayPluginLayoutHelper";
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ws2.p0 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.p0.a(ws2.p0, boolean, boolean):void");
    }

    public final androidx.lifecycle.c1 b(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        gk2.e eVar = this.f449119c;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        return null;
    }

    public final void c(gk2.e liveBuContext, boolean z17, boolean z18) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.dm2 object_extend;
        km2.r rVar;
        km2.r rVar2;
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        this.f449119c = liveBuContext;
        r45.qt2 qt2Var = new r45.qt2();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        int i17 = 0;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 != null && (rVar = nVar2.f309151c) != null) {
            i17 = rVar.f309206k;
        }
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFinderObject liveBuContext:");
        sb6.append(liveBuContext.hashCode());
        sb6.append(",objectId:");
        ct2.j jVar = (ct2.j) b(ct2.j.class);
        java.lang.String str = null;
        sb6.append(jVar != null ? java.lang.Long.valueOf(jVar.Q6()) : null);
        sb6.append(",forRestar:");
        sb6.append(z17);
        sb6.append(",playTransition:");
        sb6.append(z18);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f449118b;
        r4Var.M2(str2, sb7);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = this.f449117a.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        ct2.j jVar2 = (ct2.j) b(ct2.j.class);
        long Q6 = jVar2 != null ? jVar2.Q6() : 0L;
        ct2.j jVar3 = (ct2.j) b(ct2.j.class);
        java.lang.String str3 = "";
        if (jVar3 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) jVar3.business(mm2.c1.class)).f328846n;
            java.lang.String objectNonceId = finderObject2 != null ? finderObject2.getObjectNonceId() : null;
            if (objectNonceId != null) {
                str3 = objectNonceId;
            }
        }
        ct2.j jVar4 = (ct2.j) b(ct2.j.class);
        if (jVar4 != null && (finderObject = ((mm2.c1) jVar4.business(mm2.c1.class)).f328846n) != null && (object_extend = finderObject.getObject_extend()) != null) {
            str = object_extend.getString(62);
        }
        c61.yb.Gh(ybVar, mMActivity, Q6, str3, 0, 2, "", true, null, null, 0L, null, false, false, null, qt2Var, false, 0, str, new ws2.l0(new java.lang.ref.WeakReference(this), str2, z17, z18), 114560, null);
    }
}
