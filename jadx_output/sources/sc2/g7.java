package sc2;

/* loaded from: classes2.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f405917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(in5.s0 s0Var, java.lang.String str, sc2.r7 r7Var) {
        super(1);
        this.f405915d = s0Var;
        this.f405916e = str;
        this.f405917f = r7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        in5.s0 s0Var = this.f405915d;
        java.lang.Object obj2 = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
        if (baseFinderFeed2 != null && hc2.o0.D(baseFinderFeed2.getFeedObject().getFeedObject(), false)) {
            com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "onJumpViewFocus feedId=" + pm0.v.u(baseFinderFeed2.getItemId()) + ", source=" + this.f405916e);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hasObserver", java.lang.String.valueOf(true));
            xc2.p0 p0Var = observer.f3147h;
            xc2.o0 o0Var = p0Var != null ? p0Var.f453246h : null;
            xc2.n0 n0Var = o0Var instanceof xc2.n0 ? (xc2.n0) o0Var : null;
            long j17 = n0Var != null ? n0Var.f453230i : 0L;
            long itemId = (p0Var == null || (baseFinderFeed = p0Var.f453244f) == null) ? 0L : baseFinderFeed.getItemId();
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
            if (p1Var != null) {
                str = "getContext(...)";
                p1Var.O6(itemId, "onJumpViewFocus", jSONObject, j17);
            } else {
                str = "getContext(...)";
            }
            kotlin.jvm.internal.o.f(context, str);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
            com.tencent.mm.plugin.finder.viewmodel.component.m1 a17 = com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a();
            com.tencent.mm.protocal.protobuf.FinderObject feed = baseFinderFeed2.getFeedObject().getFeedObject();
            a17.getClass();
            kotlin.jvm.internal.o.g(feed, "feed");
            if (com.tencent.mm.plugin.finder.viewmodel.component.m1.f135110e.contains(java.lang.Integer.valueOf(integer))) {
                com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) a17.f135112a.get(new com.tencent.mm.plugin.finder.viewmodel.component.k1(feed.getId(), integer));
                if (j1Var == null || j1Var.f134794f < 2) {
                    com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onFeedFocused return! focus without consume and dispatch, commentScene=" + integer + " feedId=" + pm0.v.u(feed.getId()));
                } else {
                    j1Var.f134794f = 3;
                    j1Var.f134797i = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onFeedFocused dispatchFeed=" + j1Var + " [focus-consume]=" + (j1Var.f134797i - j1Var.f134796h) + "ms");
                }
            }
        }
        xc2.p0 p0Var2 = observer.f3147h;
        android.view.View view = observer.f3143d;
        java.lang.String str2 = this.f405916e;
        if (p0Var2 != null && view != null) {
            s0Var.itemView.setTag(com.tencent.mm.R.id.eid, java.lang.Boolean.TRUE);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpViewFocus source=");
            sb6.append(str2);
            sb6.append(", feedId=");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = p0Var2.f453244f;
            sb6.append(pm0.v.u(baseFinderFeed3 != null ? baseFinderFeed3.getItemId() : 0L));
            sb6.append(" appearConditionType=");
            sb6.append(p0Var2.B);
            sb6.append(" isRealShow=");
            sc2.q8 q8Var = p0Var2.f453233J;
            sb6.append(q8Var != null && q8Var.f406177a);
            sb6.append(" delayAppearMs=");
            sb6.append(p0Var2.f453258t);
            com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
            int i17 = p0Var2.B;
            if (i17 == 0) {
                sc2.q8 q8Var2 = p0Var2.f453233J;
                if (q8Var2 != null && q8Var2.f406177a) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onJumpViewFocus source=");
                    sb7.append(str2);
                    sb7.append(", feedId=");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = p0Var2.f453244f;
                    sb7.append(pm0.v.u(baseFinderFeed4 != null ? baseFinderFeed4.getItemId() : 0L));
                    sb7.append(" not need delay, just show");
                    com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb7.toString());
                    ad2.k.b(observer, s0Var, view, p0Var2, false, null, 16, null);
                } else {
                    long j18 = p0Var2.f453258t;
                    if (j18 > 0) {
                        long uptimeMillis = j18 + android.os.SystemClock.uptimeMillis();
                        sc2.r7 r7Var = this.f405917f;
                        com.tencent.mm.sdk.platformtools.n3 n3Var = r7Var.f406209e;
                        java.lang.Object obj3 = p0Var2.f453242e;
                        n3Var.removeCallbacksAndMessages(obj3);
                        r7Var.f406209e.postAtTime(new sc2.f7(p0Var2, observer, s0Var, view, str2), obj3, uptimeMillis);
                        p0Var2.A = true;
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onJumpViewFocus source=");
                        sb8.append(str2);
                        sb8.append(", feedId=");
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = p0Var2.f453244f;
                        sb8.append(pm0.v.u(baseFinderFeed5 != null ? baseFinderFeed5.getItemId() : 0L));
                        sb8.append(" not need delay, just show");
                        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb8.toString());
                        ad2.k.b(observer, s0Var, view, p0Var2, false, null, 16, null);
                    }
                }
            } else {
                sc2.q8 q8Var3 = p0Var2.f453233J;
                if ((q8Var3 != null && q8Var3.f406177a) && i17 != 2) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onJumpViewFocus source=");
                    sb9.append(str2);
                    sb9.append(", feedId=");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed6 = p0Var2.f453244f;
                    sb9.append(pm0.v.u(baseFinderFeed6 != null ? baseFinderFeed6.getItemId() : 0L));
                    sb9.append(" not need delay, just show");
                    com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb9.toString());
                    ad2.k.b(observer, s0Var, view, p0Var2, false, null, 16, null);
                }
            }
            observer.v(s0Var, view, p0Var2);
        }
        return jz5.f0.f302826a;
    }
}
