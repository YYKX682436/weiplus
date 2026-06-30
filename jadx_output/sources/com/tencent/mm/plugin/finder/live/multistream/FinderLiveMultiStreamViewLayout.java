package com.tencent.mm.plugin.finder.live.multistream;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamViewLayout;", "Landroid/widget/RelativeLayout;", "Lmn0/b0;", "getPlayer", "Lcom/tencent/mm/live/core/view/LiveVideoView;", "getPlayerView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "e", "Ljz5/g;", "getBgView", "()Landroid/widget/ImageView;", "bgView", "Landroid/widget/ProgressBar;", "f", "getLoadingView", "()Landroid/widget/ProgressBar;", "loadingView", "liveTxLivePlayerPreview", "Lcom/tencent/mm/live/core/view/LiveVideoView;", "getLiveTxLivePlayerPreview", "()Lcom/tencent/mm/live/core/view/LiveVideoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveMultiStreamViewLayout extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f111744m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111745d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bgView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadingView;

    /* renamed from: g, reason: collision with root package name */
    public uk2.b f111748g;

    /* renamed from: h, reason: collision with root package name */
    public tk2.a f111749h;

    /* renamed from: i, reason: collision with root package name */
    public mn0.b0 f111750i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiStreamViewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111745d = "MultiStreamViewLayout_" + hashCode();
        this.bgView = jz5.h.b(new rk2.e(this));
        this.loadingView = jz5.h.b(new rk2.i(this));
    }

    private final android.widget.ImageView getBgView() {
        return (android.widget.ImageView) this.bgView.getValue();
    }

    private final com.tencent.mm.live.core.view.LiveVideoView getLiveTxLivePlayerPreview() {
        return (com.tencent.mm.live.core.view.LiveVideoView) findViewById(com.tencent.mm.R.id.ig8);
    }

    private final android.widget.ProgressBar getLoadingView() {
        return (android.widget.ProgressBar) this.loadingView.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.tencent.mm.plugin.finder.live.view.k0 k0Var, mn0.b0 b0Var, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, uk2.b data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindCurrentPlayer ");
        sb6.append(b0Var);
        sb6.append(" currentBindData: ");
        sb6.append(this.f111748g);
        sb6.append(" curView: ");
        sb6.append(tXCloudVideoView);
        sb6.append(" parent: ");
        sb6.append(tXCloudVideoView != null ? tXCloudVideoView.getParent() : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f111745d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        d(false);
        if (b0Var == null || tXCloudVideoView == null) {
            c(data);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "onPreDraw finish");
        this.f111748g = data;
        this.f111750i = b0Var;
        if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh()) {
            com.tencent.mm.live.core.view.LiveVideoView liveTxLivePlayerPreview = getLiveTxLivePlayerPreview();
            if (liveTxLivePlayerPreview == null) {
                return;
            }
            pg2.j0 j0Var = (pg2.j0) i95.n0.c(pg2.j0.class);
            android.content.Context context = k0Var != null ? k0Var.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            long j17 = data.f428523c.f329773d;
            rk2.g gVar = new rk2.g(this, liveTxLivePlayerPreview, tXCloudVideoView);
            j0Var.getClass();
            ug5.v a17 = ug5.v.f427655g.a(java.lang.String.valueOf(j17));
            if (k0Var != null) {
                mn0.y yVar = (mn0.y) b0Var;
                if (!kotlin.jvm.internal.o.b(yVar.o(), liveTxLivePlayerPreview)) {
                    liveTxLivePlayerPreview.a(true);
                    yVar.O(liveTxLivePlayerPreview, new pg2.o(gVar, k0Var, activity, a17));
                }
            }
        } else {
            android.view.ViewParent parent = tXCloudVideoView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(tXCloudVideoView);
            }
            if (viewGroup instanceof com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) {
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.live.core.view.LiveVideoView liveVideoView = new com.tencent.mm.live.core.view.LiveVideoView(context2);
                liveVideoView.setId(com.tencent.mm.R.id.ig8);
                ((com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) viewGroup).addView(liveVideoView, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            }
            removeView(getLiveTxLivePlayerPreview());
            tXCloudVideoView.setId(com.tencent.mm.R.id.ig8);
            addView(tXCloudVideoView);
        }
        uk2.b bVar = this.f111748g;
        if (bVar != null) {
            java.util.HashMap hashMap = rk2.d.f396450a;
            com.tencent.mars.xlog.Log.i("MultiStreamPlayerManager", "savePlayer key: " + bVar.a() + " player: " + b0Var);
            rk2.d.f396450a.put(bVar.a(), b0Var);
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z17 = pm0.v.z(c1Var != null ? c1Var.f328807g2 : 0, 524288);
        mn0.b0 b0Var2 = this.f111750i;
        if (b0Var2 != null) {
            tk2.a aVar = this.f111749h;
            ((mn0.y) b0Var2).G((aVar != null && ((mm2.w) ((com.tencent.mm.plugin.finder.live.plugin.zz) aVar).P0(mm2.w.class)).O6()) == true || efVar.z() || z17);
        }
    }

    public final void b(uk2.b data) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.f111745d, "bindViewData: " + data);
        this.f111748g = data;
        f(false);
        com.tencent.mm.plugin.finder.live.util.i iVar = com.tencent.mm.plugin.finder.live.util.i.f115540a;
        tk2.a aVar = this.f111749h;
        if (aVar == null || (str = ((com.tencent.mm.plugin.finder.live.plugin.zz) aVar).v1()) == null) {
            str = "";
        }
        android.widget.ImageView bgView = getBgView();
        kotlin.jvm.internal.o.f(bgView, "<get-bgView>(...)");
        iVar.b(data.f428521a, str, bgView, rk2.h.f396457d);
    }

    public final void c(uk2.b data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f111748g = data;
        for (java.util.Map.Entry entry : rk2.d.f396450a.entrySet()) {
            if (!kotlin.jvm.internal.o.b(entry.getKey(), data.a())) {
                mn0.b0.C((mn0.b0) entry.getValue(), false, false, false, 6, null);
            }
        }
        mn0.b0 b0Var = this.f111750i;
        boolean z17 = b0Var != null && ((mn0.y) b0Var).b(false);
        java.lang.String str = this.f111745d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "onItemStartPlay: data: " + data.a() + " is playing");
            mn0.b0 b0Var2 = this.f111750i;
            if (b0Var2 != null) {
                tk2.a aVar = this.f111749h;
                ((mn0.y) b0Var2).G(aVar != null && ((mm2.w) ((com.tencent.mm.plugin.finder.live.plugin.zz) aVar).P0(mm2.w.class)).O6());
                return;
            }
            return;
        }
        d(true);
        com.tencent.mars.xlog.Log.i(str, "onItemStartPlay: data: " + data.a() + " start play");
        e();
        mn0.b0 b0Var3 = this.f111750i;
        if (b0Var3 != null) {
            tk2.a aVar2 = this.f111749h;
            ((mn0.y) b0Var3).G(aVar2 != null && ((mm2.w) ((com.tencent.mm.plugin.finder.live.plugin.zz) aVar2).P0(mm2.w.class)).O6());
        }
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f111745d, "showCoverView isShow: " + z17);
        android.widget.ImageView bgView = getBgView();
        r1.intValue();
        java.lang.Integer num = z17 ? r1 : null;
        bgView.setVisibility(num != null ? num.intValue() : 8);
        android.widget.ProgressBar loadingView = getLoadingView();
        r1.intValue();
        r1 = z17 ? 0 : null;
        loadingView.setVisibility(r1 != null ? r1.intValue() : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout.e():void");
    }

    public final void f(boolean z17) {
        int i17;
        int i18;
        uk2.b bVar = this.f111748g;
        if (bVar != null) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                r45.la4 la4Var = bVar.f428522b;
                r45.ka4 ka4Var = la4Var.f379273d;
                if (ka4Var != null && ka4Var.V >= ka4Var.W) {
                    if (((ka4Var == null || ka4Var.V == 0 || ka4Var.W == 0) ? false : true) && getContext().getResources().getConfiguration().orientation != 2) {
                        r45.ka4 ka4Var2 = la4Var.f379273d;
                        int i19 = ka4Var2.V;
                        int i27 = ka4Var2.W;
                        tk2.a aVar = this.f111749h;
                        if (aVar != null) {
                            int B0 = zl2.r4.f473950a.B0(i19, i27);
                            df2.nv nvVar = (df2.nv) ((com.tencent.mm.plugin.finder.live.plugin.zz) aVar).U0(df2.nv.class);
                            i17 = B0 + (nvVar != null ? nvVar.f230890q : 0);
                        } else {
                            i17 = 0;
                        }
                        marginLayoutParams.topMargin = i17;
                        if (!com.tencent.mm.ui.bk.Q() || z17) {
                            android.content.Context context = getContext();
                            if (context == null) {
                                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            }
                            i18 = com.tencent.mm.ui.bl.b(context).x;
                        } else {
                            tk2.a aVar2 = this.f111749h;
                            if (aVar2 != null) {
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.live.plugin.zz) aVar2).f365323d.getWidth());
                                java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
                                if (num != null) {
                                    i18 = num.intValue();
                                }
                            }
                            android.content.Context context2 = getContext();
                            if (context2 == null) {
                                context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            }
                            i18 = com.tencent.mm.ui.bl.b(context2).x;
                        }
                        marginLayoutParams.width = i18;
                        marginLayoutParams.height = (int) (i18 / (i19 / i27));
                    }
                }
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
            }
            requestLayout();
        }
    }

    /* renamed from: getPlayer, reason: from getter */
    public final mn0.b0 getF111750i() {
        return this.f111750i;
    }

    public final com.tencent.mm.live.core.view.LiveVideoView getPlayerView() {
        return getLiveTxLivePlayerPreview();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiStreamViewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111745d = "MultiStreamViewLayout_" + hashCode();
        this.bgView = jz5.h.b(new rk2.e(this));
        this.loadingView = jz5.h.b(new rk2.i(this));
    }
}
