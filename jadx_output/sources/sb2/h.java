package sb2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb2.i f405413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sb2.i iVar) {
        super(1);
        this.f405413d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool;
        android.content.Context context;
        android.view.Window window;
        x4.a aVar;
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter;
        jz5.f0 it = (jz5.f0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sb2.i iVar = this.f405413d;
        tc2.g gVar = iVar.f417141d;
        in5.r rVar = gVar.f417150m;
        com.tencent.mm.plugin.finder.convert.zf zfVar = rVar instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) rVar : null;
        in5.s0 s0Var = gVar.f417149i;
        if (s0Var == null || (finderLiveBubbleLayoutCompatSlideEnter = (com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter) s0Var.p(com.tencent.mm.R.id.f484610ti1)) == null) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(finderLiveBubbleLayoutCompatSlideEnter.M || finderLiveBubbleLayoutCompatSlideEnter.N);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToStartGuideTimer showAnimGuide tabType=");
        sb6.append(zfVar != null ? java.lang.Integer.valueOf(zfVar.f104360h) : null);
        sb6.append(" isSliding=");
        sb6.append(bool);
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", sb6.toString());
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool, bool2)) {
            com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "in sliding");
        } else {
            if (zfVar != null && zfVar.f104360h == 4) {
                tc2.g gVar2 = iVar.f417141d;
                in5.s0 s0Var2 = gVar2.f417149i;
                if (s0Var2 != null && (context = s0Var2.f293121e) != null) {
                    iVar.Y6();
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
                    in5.s0 s0Var3 = gVar2.f417149i;
                    android.view.View h17 = (s0Var3 == null || (aVar = s0Var3.f293123g) == null) ? null : aVar.h();
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) from.inflate(com.tencent.mm.R.layout.e_j, h17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) h17 : null, false);
                    iVar.f405416g = viewGroup;
                    com.tencent.mm.view.MMPAGView mMPAGView = viewGroup != null ? (com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.v6p) : null;
                    if (mMPAGView != null) {
                        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463304d2));
                    }
                    if (mMPAGView != null) {
                        mMPAGView.setProgress(0.0d);
                    }
                    if (mMPAGView != null) {
                        mMPAGView.setRepeatCount(-1);
                    }
                    if (mMPAGView != null && mMPAGView.getUseRfx()) {
                        if (mMPAGView != null) {
                            mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(context.getAssets(), "finder_live_slide_to_enter_anim_tip.pag"));
                        }
                    } else if (mMPAGView != null) {
                        mMPAGView.setComposition(org.libpag.PAGFile.Load(context.getAssets(), "finder_live_slide_to_enter_anim_tip.pag"));
                    }
                    if (mMPAGView != null) {
                        mMPAGView.g();
                    }
                    android.view.ViewGroup viewGroup2 = iVar.f405416g;
                    if (viewGroup2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(viewGroup2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Integer.valueOf(intValue));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(viewGroup2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        viewGroup2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(viewGroup2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.ViewGroup viewGroup3 = iVar.f405416g;
                    if (viewGroup3 != null) {
                        viewGroup3.setOnTouchListener(new sb2.d(mMPAGView, iVar));
                    }
                    android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                    android.view.ViewGroup viewGroup4 = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                    if (viewGroup4 != null) {
                        iVar.Z6(false);
                        viewGroup4.addView(iVar.f405416g);
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "showGuide guideTipView=" + iVar.f405416g);
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_SHOW_SLIDE_TO_ENTER_BOOLEAN_SYNC, bool2);
                com.tencent.mm.sdk.platformtools.b4 b4Var = iVar.f405415f;
                if (b4Var != null) {
                    b4Var.d();
                }
                com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "startHideTimer");
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4("HideSlideToCloseTip::Timer", (com.tencent.mm.sdk.platformtools.a4) new sb2.e(iVar), false);
                iVar.f405415f = b4Var2;
                b4Var2.c(5000L, 5000L);
            }
        }
        return jz5.f0.f302826a;
    }
}
