package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yd f135324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.g80 f135326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar, boolean z17, bw5.g80 g80Var, java.lang.String str, bw5.i80 i80Var) {
        super(0);
        this.f135324d = ydVar;
        this.f135325e = z17;
        this.f135326f = g80Var;
        this.f135327g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar = this.f135324d;
        az2.f fVar = ydVar.f136560o;
        if (fVar != null) {
            fVar.b();
        }
        if (this.f135325e) {
            bw5.g80 g80Var = this.f135326f;
            if (g80Var != null && g80Var.f27727h == 4) {
                java.lang.String str = this.f135327g;
                java.lang.ref.WeakReference weakReference = ydVar.f136559n;
                in5.s0 s0Var2 = weakReference != null ? (in5.s0) weakReference.get() : null;
                xc2.p0 p0Var = ydVar.f136558m;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var != null ? p0Var.f453244f : null;
                if (s0Var2 != null && baseFinderFeed != null && p0Var != null) {
                    ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                    gm4.a aVar = gm4.a.f273557a;
                    if (aVar.a("finder_thumb_up_like_education_has_show", false)) {
                        ydVar.i7(baseFinderFeed, p0Var, str, ydVar.f136557i, ydVar.getContext().getString(com.tencent.mm.R.string.mqx), ydVar.getContext().getString(com.tencent.mm.R.string.mqw), new com.tencent.mm.plugin.finder.viewmodel.component.vd(ydVar, baseFinderFeed));
                    } else {
                        ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                        aVar.g("finder_thumb_up_like_education_has_show", true);
                        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                        androidx.appcompat.app.AppCompatActivity activity = ydVar.getActivity();
                        jz5.l lVar = new jz5.l("half_screen_title", ydVar.getContext().getString(com.tencent.mm.R.string.mqz));
                        jz5.l lVar2 = new jz5.l("half_screen_desc", ydVar.getContext().getString(com.tencent.mm.R.string.mqy));
                        jz5.l lVar3 = new jz5.l("half_screen_image_light", "assets/weicons/ting_like_edu_thumb_up_light.svg");
                        jz5.l lVar4 = new jz5.l("half_screen_image_dark", "assets/weicons/ting_like_edu_thumb_up_dark.svg");
                        jz5.l lVar5 = new jz5.l("half_screen_image_height", java.lang.Float.valueOf(288.0f));
                        jz5.l lVar6 = new jz5.l("half_screen_identifier", "thumb_like_education");
                        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                        ((rk4.k8) aj6).F(activity, "common_half_screen_edu", kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, new jz5.l("half_screen_report_scene", 1620)), new com.tencent.mm.flutter.ui.FlutterPageStyle(0, -1, null, false, false, false, null, 0, false, false, false, null, 3581, null));
                    }
                }
            } else {
                java.lang.ref.WeakReference weakReference2 = ydVar.f136559n;
                in5.s0 s0Var3 = weakReference2 != null ? (in5.s0) weakReference2.get() : null;
                xc2.p0 p0Var2 = ydVar.f136558m;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = p0Var2 != null ? p0Var2.f453244f : null;
                if (s0Var3 != null && baseFinderFeed2 != null && p0Var2 != null) {
                    ydVar.i7(baseFinderFeed2, p0Var2, g80Var != null ? g80Var.getListenId() : null, ydVar.f136557i, ydVar.getString(com.tencent.mm.R.string.f491946mr0), ydVar.getString(com.tencent.mm.R.string.ms_), new com.tencent.mm.plugin.finder.viewmodel.component.td(ydVar, baseFinderFeed2, this.f135327g));
                }
            }
        }
        java.lang.ref.WeakReference weakReference3 = ydVar.f136559n;
        if (weakReference3 != null && (s0Var = (in5.s0) weakReference3.get()) != null) {
            ydVar.l7(s0Var);
        }
        return jz5.f0.f302826a;
    }
}
