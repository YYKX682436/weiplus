package qf2;

/* loaded from: classes3.dex */
public final class c4 extends if2.b implements if2.d, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f362317m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f362318n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Space f362319o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f362320p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f362321q;

    /* renamed from: r, reason: collision with root package name */
    public int f362322r;

    /* renamed from: s, reason: collision with root package name */
    public int f362323s;

    /* renamed from: t, reason: collision with root package name */
    public xh2.b f362324t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f362322r = -1;
        this.f362323s = 1;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        this.f362324t = micInfoData;
        a7(micInfoData, "onMicInfoChanged");
    }

    public final void Z6() {
        android.view.ViewGroup viewGroup = this.f362320p;
        if (viewGroup != null) {
            if (kotlin.jvm.internal.o.b(viewGroup != null ? viewGroup.getParent() : null, this.f362317m)) {
                return;
            }
            android.view.ViewGroup viewGroup2 = this.f362320p;
            java.lang.Object parent = viewGroup2 != null ? viewGroup2.getParent() : null;
            android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.f362320p);
            }
            android.widget.FrameLayout frameLayout = this.f362317m;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            android.widget.FrameLayout frameLayout2 = this.f362317m;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f362320p);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (((mm2.c1) business(mm2.c1.class)).R7() == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(xh2.b r10, java.lang.String r11) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = r10.f454522a
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkContentModeChange source: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = " micCount: "
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "TopContentLayoutControl"
            com.tencent.mars.xlog.Log.i(r1, r11)
            java.lang.Class<mm2.e1> r11 = mm2.e1.class
            androidx.lifecycle.c1 r11 = r9.business(r11)
            mm2.e1 r11 = (mm2.e1) r11
            boolean r11 = r11.g7()
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r10.f454525d
            if (r11 == 0) goto L39
            r9.Z6()
            goto La6
        L39:
            if (r0 <= r3) goto La3
            if (r4 != r3) goto L3f
            r11 = r3
            goto L40
        L3f:
            r11 = r2
        L40:
            if (r11 != 0) goto La3
            zl2.r4 r11 = zl2.r4.f473950a
            boolean r11 = r11.x1()
            if (r11 != 0) goto L69
            dk2.ef r11 = dk2.ef.f233372a
            tn0.w0 r11 = dk2.ef.f233378d
            if (r11 == 0) goto L58
            boolean r11 = r11.X()
            if (r11 != r3) goto L58
            r11 = r3
            goto L59
        L58:
            r11 = r2
        L59:
            if (r11 != 0) goto L69
            java.lang.Class<mm2.c1> r11 = mm2.c1.class
            androidx.lifecycle.c1 r11 = r9.business(r11)
            mm2.c1 r11 = (mm2.c1) r11
            boolean r11 = r11.R7()
            if (r11 == 0) goto La3
        L69:
            android.view.ViewGroup r11 = r9.f362320p
            if (r11 == 0) goto La6
            android.view.ViewParent r11 = r11.getParent()
            android.widget.FrameLayout r0 = r9.f362318n
            boolean r11 = kotlin.jvm.internal.o.b(r11, r0)
            if (r11 != 0) goto La6
            android.view.ViewGroup r11 = r9.f362320p
            if (r11 == 0) goto L82
            android.view.ViewParent r11 = r11.getParent()
            goto L83
        L82:
            r11 = r1
        L83:
            boolean r0 = r11 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8a
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            goto L8b
        L8a:
            r11 = r1
        L8b:
            if (r11 == 0) goto L92
            android.view.ViewGroup r0 = r9.f362320p
            r11.removeView(r0)
        L92:
            android.widget.FrameLayout r11 = r9.f362318n
            if (r11 == 0) goto L99
            r11.removeAllViews()
        L99:
            android.widget.FrameLayout r11 = r9.f362318n
            if (r11 == 0) goto La6
            android.view.ViewGroup r0 = r9.f362320p
            r11.addView(r0)
            goto La6
        La3:
            r9.Z6()
        La6:
            int r11 = r9.f362322r
            java.util.LinkedHashMap r10 = r10.f454522a
            if (r11 != r4) goto Lb4
            int r11 = r10.size()
            int r0 = r9.f362323s
            if (r11 == r0) goto Lb5
        Lb4:
            r2 = r3
        Lb5:
            r9.f362322r = r4
            int r10 = r10.size()
            r9.f362323s = r10
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            r5 = 0
            qf2.b4 r6 = new qf2.b4
            r6.<init>(r9, r2, r1)
            r7 = 2
            r8 = 0
            r3 = r9
            com.tencent.mm.plugin.finder.live.util.y.o(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.c4.a7(xh2.b, java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f362324t = null;
        com.tencent.mars.xlog.Log.i("TopContentLayoutControl", "onLiveDeactivate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f362317m = (android.widget.FrameLayout) pluginLayout.findViewById(com.tencent.mm.R.id.fnx);
        this.f362318n = (android.widget.FrameLayout) pluginLayout.findViewById(com.tencent.mm.R.id.jji);
        this.f362319o = (android.widget.Space) pluginLayout.findViewById(com.tencent.mm.R.id.afi);
        this.f362320p = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.fnw);
        this.f362321q = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.c8f);
        xh2.b bVar = this.f362324t;
        if (bVar != null) {
            a7(bVar, "onViewMount");
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f362321q = null;
        this.f362320p = null;
        this.f362319o = null;
        this.f362318n = null;
        this.f362317m = null;
    }
}
