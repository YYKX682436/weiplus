package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pv extends com.tencent.mm.ui.component.UIComponent implements zy2.x9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f135628d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f135629e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f135630f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f135631g;

    /* renamed from: h, reason: collision with root package name */
    public bq.z1 f135632h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.jv f135633i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135628d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.kv(this));
        this.f135629e = new java.util.LinkedHashSet();
        this.f135630f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.iv(this));
        this.f135633i = new com.tencent.mm.plugin.finder.viewmodel.component.jv(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.viewmodel.component.pv r8, java.lang.String r9, java.lang.String r10, com.tencent.mm.plugin.finder.storage.FinderItem r11, com.tencent.mm.protobuf.g r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.pv.O6(com.tencent.mm.plugin.finder.viewmodel.component.pv, java.lang.String, java.lang.String, com.tencent.mm.plugin.finder.storage.FinderItem, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.qt2 P6(java.lang.String str) {
        boolean z17 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.F0().r()).intValue() == 1;
        boolean b17 = kotlin.jvm.internal.o.b(str, xy2.c.e(getContext()));
        int i17 = (!b17 || z17) ? (b17 && z17) ? 137 : ((b17 || z17) && !b17 && z17) ? 136 : 32 : 33;
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(getContextObj().getInteger(5) | i17));
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "lastCommentScene: " + getContextObj().getInteger(5) + ", fromCommentScene: " + qt2Var.getInteger(7) + ", commentScene: " + qt2Var.getInteger(5));
        qt2Var.set(0, getContextObj().getString(0));
        qt2Var.set(1, getContextObj().getString(1));
        qt2Var.set(2, getContextObj().getString(2));
        qt2Var.set(6, java.lang.Long.valueOf(getContextObj().getLong(6)));
        qt2Var.set(3, getContextObj().getString(3));
        qt2Var.set(4, java.lang.Integer.valueOf(getContextObj().getInteger(4)));
        qt2Var.set(10, java.lang.Integer.valueOf(getContextObj().getInteger(10)));
        qt2Var.set(8, java.lang.Integer.valueOf(getContextObj().getInteger(8)));
        qt2Var.set(9, getContextObj().getString(9));
        java.lang.String string = getContextObj().getString(17);
        if (string == null) {
            string = "";
        }
        qt2Var.set(17, string);
        java.lang.String string2 = getContextObj().getString(11);
        if (string2 == null) {
            string2 = "";
        }
        qt2Var.set(11, string2);
        java.lang.String string3 = getContextObj().getString(12);
        qt2Var.set(12, string3 != null ? string3 : "");
        qt2Var.set(14, java.lang.Integer.valueOf(getContextObj().getInteger(14)));
        qt2Var.set(15, getContextObj().getString(15));
        qt2Var.set(16, getContextObj().getString(16));
        qt2Var.set(13, java.lang.Boolean.valueOf(getContextObj().getBoolean(13)));
        return qt2Var;
    }

    public final void Q6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        boolean containsKey;
        r45.qq2 qq2Var;
        r45.gr2 gr2Var;
        r45.qq2 qq2Var2;
        r45.gr2 gr2Var2;
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        boolean z17 = false;
        if (object_extend != null && (qq2Var2 = (r45.qq2) object_extend.getCustom(3)) != null && (gr2Var2 = (r45.gr2) qq2Var2.getCustom(4)) != null) {
            z17 = gr2Var2.getBoolean(0);
        }
        r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        com.tencent.mm.protobuf.g byteString = (object_extend2 == null || (qq2Var = (r45.qq2) object_extend2.getCustom(3)) == null || (gr2Var = (r45.gr2) qq2Var.getCustom(4)) == null) ? null : gr2Var.getByteString(2);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "[handlePreloadOnPlayEnd] userPageIsPreload:" + z17);
        if (z17) {
            java.lang.String userName = baseFinderFeed.getFeedObject().getUserName();
            r45.xk bizInfo = baseFinderFeed.getFeedObject().getBizInfo();
            java.util.Set set = this.f135629e;
            if (set.contains(userName) || bizInfo != null) {
                return;
            }
            bu2.g0 g0Var = bu2.g0.f24511a;
            kotlin.jvm.internal.o.g(userName, "userName");
            synchronized (g0Var) {
                containsKey = bu2.g0.f24512b.containsKey(userName);
            }
            if (containsKey) {
                return;
            }
            set.add(userName);
            R6(userName, "handlePreloadOnPlayEnd", baseFinderFeed.getFeedObject(), byteString);
        }
    }

    public final void R6(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar) {
        long j17;
        com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "requestHeader:" + str + ", source:" + str2);
        r45.qt2 P6 = P6(str);
        r45.r13 r13Var = new r45.r13();
        r13Var.f384417d = str;
        java.lang.String f17 = xy2.c.f(P6);
        r13Var.f384423m = f17;
        java.lang.String str3 = null;
        r13Var.f384419f = (r26.i0.q(r13Var.f384417d, f17, false, 2, null) || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.F1().r()).booleanValue()) ? 1 : 0;
        r13Var.f384421h = getActivity().getIntent().getStringExtra("key_biz_username");
        r45.y13 y13Var = new r45.y13();
        y13Var.set(1, 1);
        y13Var.set(0, gVar);
        r13Var.f384426p = y13Var;
        r13Var.f384427q = !kotlin.jvm.internal.o.b(str, r13Var.f384423m) ? 1 : 0;
        if (r13Var.f384420g == 0) {
            r13Var.f384420g = P6.getInteger(8);
        }
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 b17 = t4Var.b(9037, P6);
        r13Var.f384418e = b17;
        b17.set(1, java.lang.Integer.valueOf(P6.getInteger(7)));
        if (t4Var.q()) {
            j17 = finderItem.getFeedObject().getId();
            str3 = finderItem.getDupFlag();
        } else {
            j17 = 0;
        }
        t4Var.h(r13Var.f384418e, P6, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(getContextObj().getInteger(5)), java.lang.Long.valueOf(j17), str3)));
        com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "doHeaderCgi param, username: " + r13Var.f384417d + ", viewer: " + r13Var.f384423m + ", needFans: " + r13Var.f384419f + ", bizName: " + r13Var.f384421h + ", enterType: " + r13Var.f384420g);
        pq5.g l17 = r13Var.b().l();
        l17.K(new com.tencent.mm.plugin.finder.viewmodel.component.nv(str, this, str2, gVar, finderItem));
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context);
    }

    public final r45.qt2 getContextObj() {
        return (r45.qt2) this.f135630f.getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        int i17 = finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : -1;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(i17);
        if (Y6 != null) {
            Y6.a(this.f135633i);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPostDestroyed() {
        com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "onPostDestroyed");
        super.onPostDestroyed();
        kotlinx.coroutines.r2 r2Var = this.f135631g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f135631g = null;
        this.f135632h = null;
        this.f135629e.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135628d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.kv(this));
        this.f135629e = new java.util.LinkedHashSet();
        this.f135630f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.iv(this));
        this.f135633i = new com.tencent.mm.plugin.finder.viewmodel.component.jv(this);
    }
}
