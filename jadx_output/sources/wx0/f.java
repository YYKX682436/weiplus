package wx0;

/* loaded from: classes5.dex */
public final class f extends mx0.a {

    /* renamed from: p, reason: collision with root package name */
    public static final wx0.d f450476p = new wx0.d(null);

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f450477g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f450478h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f450479i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJCamSegmentationDesc f450480m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.maas.camstudio.MJCamSegmentationDesc f450481n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f450482o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.view.ViewGroup r2, android.view.ViewGroup r3, yx0.b8 r4) {
        /*
            r1 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "templateCorePlugin"
            kotlin.jvm.internal.o.g(r4, r0)
            r0 = 2131299126(0x7f090b36, float:1.8216245E38)
            android.view.View r2 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r2, r0)
            r1.<init>(r2)
            r1.f450477g = r4
            r2 = 2131299139(0x7f090b43, float:1.821627E38)
            android.view.View r2 = r3.findViewById(r2)
            kotlin.jvm.internal.o.f(r2, r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r1.f450478h = r2
            r4 = 2131299156(0x7f090b54, float:1.8216305E38)
            android.view.View r3 = r3.findViewById(r4)
            kotlin.jvm.internal.o.f(r3, r0)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.f450479i = r3
            com.tencent.maas.camstudio.MJCamSegmentationDesc r4 = new com.tencent.maas.camstudio.MJCamSegmentationDesc
            r0 = 1077936128(0x40400000, float:3.0)
            r4.<init>(r0)
            r1.f450480m = r4
            r1.f450481n = r4
            android.view.View r4 = r1.f331814d
            wx0.a r0 = new wx0.a
            r0.<init>(r1)
            r4.setOnClickListener(r0)
            wx0.b r4 = new wx0.b
            r4.<init>(r1)
            r2.setOnClickListener(r4)
            wx0.c r2 = new wx0.c
            r2.<init>(r1)
            r3.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.f.<init>(android.view.ViewGroup, android.view.ViewGroup, yx0.b8):void");
    }

    public final void b() {
        com.tencent.maas.camstudio.MJCamSegmentationDesc segmentationDesc = this.f450482o ? this.f450481n : new com.tencent.maas.camstudio.MJCamSegmentationDesc();
        yx0.b8 b8Var = this.f450477g;
        b8Var.getClass();
        kotlin.jvm.internal.o.g(segmentationDesc, "segmentationDesc");
        kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.q5(b8Var, segmentationDesc, null), 3, null);
        c();
    }

    public final void c() {
        android.view.View view = this.f331814d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView sideBarItemView = (com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView) view;
        boolean z17 = this.f450482o;
        android.widget.FrameLayout frameLayout = this.f450479i;
        android.widget.FrameLayout frameLayout2 = this.f450478h;
        if (!z17) {
            sideBarItemView.setImageResource(com.tencent.mm.R.drawable.f481045da5);
            frameLayout2.setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        sideBarItemView.setImageResource(com.tencent.mm.R.drawable.da6);
        com.tencent.maas.camstudio.x0 x0Var = this.f450481n.f47898a;
        int i17 = x0Var == null ? -1 : wx0.e.f450473a[x0Var.ordinal()];
        if (i17 == 1) {
            frameLayout2.setVisibility(0);
            frameLayout.setVisibility(8);
        } else if (i17 != 2) {
            wx0.d.a(f450476p, false, null, 2, null);
        } else {
            frameLayout2.setVisibility(0);
            frameLayout.setVisibility(0);
        }
    }

    @Override // yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        qg.c cVar;
        java.util.ArrayList parcelableArrayListExtra;
        if (i17 == 672) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_mix_media_list")) == null) ? null : (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.a0(parcelableArrayListExtra, 0);
            if (i18 != -1 || galleryItem$MediaItem == null) {
                return;
            }
            int type = galleryItem$MediaItem.getType();
            if (type == 1) {
                cVar = qg.c.Image;
            } else if (type != 2) {
                return;
            } else {
                cVar = qg.c.Video;
            }
            this.f450481n = new com.tencent.maas.camstudio.MJCamSegmentationDesc(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(qg.a.Filepath, galleryItem$MediaItem.f138430e, cVar));
            b();
        }
    }

    @Override // mx0.a, yt3.r2
    public void setVisibility(int i17) {
        if (i17 != 4 && i17 != 8) {
            android.view.View view = this.f331814d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c();
            return;
        }
        android.view.View view2 = this.f331814d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f450478h.setVisibility(8);
        this.f450479i.setVisibility(8);
    }
}
