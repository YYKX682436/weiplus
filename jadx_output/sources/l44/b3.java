package l44;

/* loaded from: classes4.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.b3 f316041a = new l44.b3();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316042b;

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316043c;

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316044d;

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316045e;

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316046f;

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316047g;

    /* renamed from: h, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316048h;

    /* renamed from: i, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316049i;

    /* renamed from: j, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316050j;

    /* renamed from: k, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.j2 f316051k;

    /* renamed from: l, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316052l;

    /* renamed from: m, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316053m;

    /* renamed from: n, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316054n;

    static {
        u26.u uVar = u26.u.DROP_OLDEST;
        f316042b = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316043c = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316044d = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316045e = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316046f = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316047g = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316048h = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316049i = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316050j = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316051k = kotlinx.coroutines.flow.i3.a(null);
        f316052l = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316053m = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        f316054n = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
    }

    public final kotlinx.coroutines.flow.j a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.p0 p0Var = new l44.p0(f316043c, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        return p0Var;
    }

    public final kotlinx.coroutines.flow.j b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdUnlikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.n1 n1Var = new l44.n1(f316044d, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUnlikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        return n1Var;
    }

    public final kotlinx.coroutines.flow.j c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInteractFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLikeResponseFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.s0 s0Var = new l44.s0(f316053m, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLikeResponseFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCommentFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.j0 j0Var = new l44.j0(f316042b, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommentFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLikeAnimEndFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.m0 m0Var = new l44.m0(f316045e, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLikeAnimEndFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdUnLikeStateSingleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.k1 k1Var = new l44.k1(f316046f, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUnLikeStateSingleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLikedStateSingleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.y0 y0Var = new l44.y0(f316047g, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLikedStateSingleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdUnLikeStateDoubleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.h1 h1Var = new l44.h1(f316048h, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUnLikeStateDoubleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLikedStateDoubleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.v0 v0Var = new l44.v0(f316049i, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLikedStateDoubleTapFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdNotifyPlayFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        l44.b1 b1Var = new l44.b1(f316050j, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdNotifyPlayFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        kotlinx.coroutines.flow.j[] jVarArr = {new l44.v1(s0Var), new l44.y1(a(str)), new l44.b2(b(str)), new l44.e2(j0Var), new l44.h2(m0Var), new l44.k2(k1Var), new l44.n2(y0Var), new l44.q2(h1Var), new l44.t2(v0Var), new l44.u1(b1Var)};
        int i17 = kotlinx.coroutines.flow.i1.f310295a;
        v26.v vVar = new v26.v(kz5.z.B(jVarArr), oz5.m.f350329d, -2, u26.u.SUSPEND);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInteractFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        return vVar;
    }

    public final void d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdComment", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mars.xlog.Log.i("AdInteractHelper", "onAdComment() called with: snsInfo = " + snsInfo);
        ((kotlinx.coroutines.flow.q2) f316042b).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdComment", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdLike() called with: snsInfo = ");
        sb6.append(snsInfo);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) f316043c).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLikeAnimEnd", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mars.xlog.Log.i("AdInteractHelper", "onAdLikeAnimEnd() called with: snsInfo = " + snsInfo);
        ((kotlinx.coroutines.flow.q2) f316045e).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLikeAnimEnd", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void g(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLikedStateSingleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdLikedStateSingleTap() called with: snsInfo = ");
        sb6.append(snsInfo);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) f316047g).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLikedStateSingleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void h(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdNotifyPlay", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdNotifyPlay() called with: snsInfo = ");
        sb6.append(snsInfo);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) f316050j).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdNotifyPlay", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void i(l44.d0 d0Var) {
        com.tencent.mm.plugin.sns.storage.SnsInfo a17;
        com.tencent.mm.plugin.sns.storage.SnsInfo a18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdNotifyPlay", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdNotifyPlay() called with: snsInfo = ");
        java.lang.String str = null;
        sb6.append(d0Var != null ? d0Var.a() : null);
        sb6.append(", model snsId is ");
        if (d0Var != null && (a18 = d0Var.a()) != null) {
            str = a18.getSnsId();
        }
        sb6.append(str);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0((d0Var == null || (a17 = d0Var.a()) == null) ? 0L : a17.field_snsId));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.h3) f316051k).k(d0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdNotifyPlay", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void j(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdUnLikeStateDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdUnLikeStateDoubleTap() called with: snsInfo = ");
        sb6.append(snsInfo);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) f316048h).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdUnLikeStateDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdUnLikeStateSingleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdUnLikeStateSingleTap() called with: snsInfo = ");
        sb6.append(snsInfo);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) f316046f).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdUnLikeStateSingleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    public final void l(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdUnlike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdUnlike() called with: snsInfo = ");
        sb6.append(snsInfo);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) f316044d).e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdUnlike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }
}
