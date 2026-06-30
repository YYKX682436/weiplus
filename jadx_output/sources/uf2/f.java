package uf2;

/* loaded from: classes3.dex */
public final class f extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f427178m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f427179n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f427180o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f427178m = new java.util.LinkedHashMap();
        this.f427179n = new java.util.LinkedHashMap();
        this.f427180o = new java.util.LinkedHashMap();
    }

    public static final boolean Z6(uf2.f fVar, uf2.a aVar, int i17) {
        fVar.getClass();
        if (i17 > 100 || i17 < 0) {
            return false;
        }
        android.widget.FrameLayout frameLayout = aVar.f427162a;
        android.view.ViewGroup b76 = fVar.b7();
        int width = b76 != null ? b76.getWidth() : 0;
        android.view.ViewGroup b77 = fVar.b7();
        int height = b77 != null ? b77.getHeight() : 0;
        if (width != 0 && height != 0) {
            android.graphics.Rect rect = aVar.f427164c;
            int i18 = rect != null ? rect.left : 0;
            int i19 = rect != null ? rect.top : 0;
            if (rect != null) {
                width = rect.right;
            }
            if (rect != null) {
                height = rect.bottom;
            }
            int i27 = height - i19;
            int i28 = (int) (i17 * i27 * 0.01f);
            frameLayout.setTranslationX(i18);
            frameLayout.setTranslationY(i19);
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width - i18;
                layoutParams.height = i27;
                frameLayout.setLayoutParams(layoutParams);
            }
            com.tencent.mm.view.MMPAGView mMPAGView = aVar.f427163b;
            float translationY = mMPAGView.getTranslationY();
            float f17 = i27 - i28;
            if (translationY < f17) {
                mMPAGView.setTranslationY(f17);
            } else {
                android.view.ViewPropertyAnimator animate = mMPAGView.animate();
                animate.setUpdateListener(new uf2.b(f17, translationY, mMPAGView));
                animate.setListener(new uf2.c(mMPAGView, f17));
                animate.start();
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = mMPAGView.getLayoutParams();
            if (layoutParams2 != null) {
                int i29 = width - i18;
                layoutParams2.width = i29;
                layoutParams2.height = java.lang.Math.max(i28, i29);
                mMPAGView.setLayoutParams(layoutParams2);
            }
        }
        return true;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : micInfoData.f454522a.entrySet()) {
            sb6.append(((java.lang.String) entry.getKey()) + ':' + entry.getValue() + ' ');
        }
        com.tencent.mars.xlog.Log.i("Finder.PkGiftForegroundPagController", "#onMicUserChanged " + ((java.lang.Object) sb6));
        pm0.v.X(new uf2.d(this, micInfoData));
    }

    public final void a7() {
        com.tencent.mars.xlog.Log.i("Finder.PkGiftForegroundPagController", "#cleanAllStreamWidget");
        java.util.Map map = this.f427178m;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            c7((uf2.a) ((java.util.Map.Entry) it.next()).getValue());
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    public final android.view.ViewGroup b7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) T6(com.tencent.mm.R.id.r9z, com.tencent.mm.R.id.r9y);
        if (viewGroup != null) {
            return (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.r_8);
        }
        return null;
    }

    public final void c7(uf2.a aVar) {
        com.tencent.mars.xlog.Log.i("Finder.PkGiftForegroundPagController", "#removeStreamWidget widget=" + aVar);
        aVar.f427163b.n();
        android.widget.FrameLayout frameLayout = aVar.f427162a;
        android.view.ViewParent parent = frameLayout.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
    }

    public final void d7(java.lang.String sdkId, java.lang.String giftId, int i17) {
        r45.gs5 gs5Var;
        kotlin.jvm.internal.o.g(sdkId, "sdkId");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mars.xlog.Log.i("Finder.PkGiftForegroundPagController", "#updateForegroundInfo sdkId=" + sdkId + " giftId=" + giftId + " height=" + i17);
        dk2.u7 u7Var = dk2.u7.f234181a;
        r45.l43 l43Var = (r45.l43) dk2.u7.f234191k.get(giftId);
        boolean z17 = false;
        java.lang.String string = (l43Var == null || (gs5Var = (r45.gs5) l43Var.getCustom(0)) == null) ? null : gs5Var.getString(0);
        boolean z18 = string == null || string.length() == 0;
        com.tencent.mars.xlog.Log.i("Finder.PkGiftForegroundPagController", "#updateForegroundInfo pagIsEmpty=" + z18);
        if (i17 <= 0 || z18) {
            return;
        }
        this.f427179n.put(sdkId, new jz5.o(giftId, java.lang.Integer.valueOf(i17), 0));
        tf2.n nVar = (tf2.n) controller(tf2.n.class);
        if (nVar != null && nVar.f418938m) {
            z17 = true;
        }
        if (z17) {
            e7(sdkId, giftId, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(java.lang.String r18, java.lang.String r19, int r20) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf2.f.e7(java.lang.String, java.lang.String, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        ((java.util.LinkedHashMap) this.f427179n).clear();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        tf2.n nVar = (tf2.n) controller(tf2.n.class);
        boolean z17 = false;
        if (nVar != null && nVar.f418938m) {
            z17 = true;
        }
        if (z17) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f427179n).entrySet()) {
                e7((java.lang.String) entry.getKey(), (java.lang.String) ((jz5.o) entry.getValue()).f302841d, ((java.lang.Number) ((jz5.o) entry.getValue()).f302842e).intValue());
            }
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        a7();
    }
}
