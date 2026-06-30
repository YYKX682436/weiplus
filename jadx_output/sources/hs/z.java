package hs;

@j95.b
/* loaded from: classes10.dex */
public final class z extends i95.w implements qk.t7 {
    public y51.c Ai(a61.a config, android.content.Context context) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(context, "context");
        config.f1718b.getClass();
        y51.b bVar = new y51.b(context);
        java.util.HashMap hashMap = bVar.f459466d;
        java.lang.String canonicalName = z51.r.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName);
        hashMap.put(canonicalName, new z51.r(bVar));
        java.lang.String canonicalName2 = z51.p.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName2);
        hashMap.put(canonicalName2, new z51.p(bVar));
        java.lang.String canonicalName3 = z51.w.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName3);
        hashMap.put(canonicalName3, new z51.w(bVar));
        java.lang.String canonicalName4 = z51.c.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName4);
        hashMap.put(canonicalName4, new z51.c(bVar));
        java.lang.String canonicalName5 = z51.h.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName5);
        hashMap.put(canonicalName5, new z51.h(bVar));
        java.lang.String canonicalName6 = z51.g.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName6);
        hashMap.put(canonicalName6, new z51.g(bVar));
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).d(config);
        }
        android.widget.RelativeLayout relativeLayout = bVar.f459467e;
        z51.w wVar = (z51.w) bVar.a(z51.w.class);
        android.content.Context context2 = bVar.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.view.View view = null;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(context2, null);
        wVar.f470228f = multiTouchImageView;
        multiTouchImageView.setCustomScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = wVar.f470228f;
        if (multiTouchImageView2 == null) {
            kotlin.jvm.internal.o.o("thumbView");
            throw null;
        }
        multiTouchImageView2.setVisibility(wVar.f470232j ? 0 : 4);
        wVar.f470229g = kotlinx.coroutines.l.d(wVar.f470236c, null, null, new z51.t(wVar, null), 3, null);
        if (wVar.f470231i) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView3 = wVar.f470228f;
            if (multiTouchImageView3 == null) {
                kotlin.jvm.internal.o.o("thumbView");
                throw null;
            }
            multiTouchImageView3.setOnLongClickListener(new z51.u(wVar));
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView4 = wVar.f470228f;
            if (multiTouchImageView4 == null) {
                kotlin.jvm.internal.o.o("thumbView");
                throw null;
            }
            multiTouchImageView4.setOnTouchListener(new z51.v(wVar));
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView5 = wVar.f470228f;
        if (multiTouchImageView5 == null) {
            kotlin.jvm.internal.o.o("thumbView");
            throw null;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        relativeLayout.addView(multiTouchImageView5, layoutParams);
        z51.p pVar = (z51.p) bVar.a(z51.p.class);
        android.content.Context context3 = bVar.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pVar.f470199f = new android.widget.FrameLayout(context3);
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer(context3, null, 0, 6, null);
        pVar.f470200g = thumbPlayerViewContainer;
        thumbPlayerViewContainer.setVisibility(8);
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer2 = pVar.f470200g;
        if (thumbPlayerViewContainer2 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        a61.d dVar = pVar.f470205l;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("uiConfig");
            throw null;
        }
        thumbPlayerViewContainer2.setMute(dVar.f1730g);
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer3 = pVar.f470200g;
        if (thumbPlayerViewContainer3 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        if (pVar.f470205l == null) {
            kotlin.jvm.internal.o.o("uiConfig");
            throw null;
        }
        thumbPlayerViewContainer3.setScaleType(com.tencent.mm.pluginsdk.ui.e1.DEFAULT);
        android.widget.FrameLayout frameLayout = pVar.f470199f;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("videoViewContainer");
            throw null;
        }
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer4 = pVar.f470200g;
        if (thumbPlayerViewContainer4 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        frameLayout.addView(thumbPlayerViewContainer4, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer5 = pVar.f470200g;
        if (thumbPlayerViewContainer5 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer5.setOnSurfaceCallback(new z51.i(pVar));
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer6 = pVar.f470200g;
        if (thumbPlayerViewContainer6 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer6.setOnInfoCallback(new z51.j(pVar));
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer7 = pVar.f470200g;
        if (thumbPlayerViewContainer7 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer7.setVideoCallback(new z51.k(pVar));
        android.widget.FrameLayout frameLayout2 = pVar.f470199f;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("videoViewContainer");
            throw null;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13, -1);
        relativeLayout.addView(frameLayout2, layoutParams2);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13, -1);
        bVar.addView(relativeLayout, layoutParams3);
        z51.r rVar = (z51.r) bVar.a(z51.r.class);
        android.content.Context context4 = bVar.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        if (rVar.f470211f) {
            android.view.View view2 = rVar.f470212g;
            if (view2 != null) {
                rVar.f470214i = view2;
            } else {
                com.tencent.mm.player.ui.MMLivePhotoDefaultPlayerPlayTagView mMLivePhotoDefaultPlayerPlayTagView = new com.tencent.mm.player.ui.MMLivePhotoDefaultPlayerPlayTagView(context4);
                rVar.f470214i = mMLivePhotoDefaultPlayerPlayTagView;
                mMLivePhotoDefaultPlayerPlayTagView.setOnClickListener(new z51.q(rVar));
                qk.t7 t7Var = (qk.t7) i95.n0.c(qk.t7.class);
                android.view.View view3 = rVar.f470214i;
                kotlin.jvm.internal.o.d(view3);
                ((hs.z) t7Var).wi(view3);
            }
            view = rVar.f470214i;
        }
        if (view != null) {
            bVar.addView(view, ((z51.r) bVar.a(z51.r.class)).l());
        }
        return bVar;
    }

    public void wi(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE, view, b18, b17, b18, b17, false, 32, null);
    }
}
