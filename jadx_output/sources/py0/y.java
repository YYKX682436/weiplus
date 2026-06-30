package py0;

/* loaded from: classes5.dex */
public abstract class y extends com.tencent.mm.ui.component.UIComponent implements dz0.k {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f359029d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f359030e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.SurfaceView f359031f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f359032g;

    /* renamed from: h, reason: collision with root package name */
    public ty0.b1 f359033h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f359034i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f359035m;

    /* renamed from: n, reason: collision with root package name */
    public final ry0.e f359036n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f359029d = jz5.h.b(new py0.c(this));
        this.f359030e = jz5.h.b(new py0.t(this));
        this.f359032g = jz5.h.b(new py0.j(this));
        ry0.e eVar = new ry0.e(getMainScope());
        new py0.x(this, eVar, null);
        this.f359036n = eVar;
    }

    @Override // dz0.k
    public void A(float f17) {
        py0.f0 P6 = P6();
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.gvr, java.lang.Integer.valueOf(a06.d.b(f17 * 100)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        P6.c(string);
    }

    @Override // dz0.k
    public java.lang.Object H6(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public abstract jz5.l O6();

    public final py0.f0 P6() {
        return (py0.f0) ((jz5.n) this.f359032g).getValue();
    }

    @Override // dz0.k
    public void Q1() {
        ((com.tencent.mm.mm_compose.MMComposeView) ((jz5.n) this.f359029d).getValue()).setVisibility(0);
        android.view.SurfaceView surfaceView = this.f359031f;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
        P6().dismiss();
    }

    public abstract void Q6();

    @Override // dz0.k
    public java.lang.Object R1(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public void R6(java.lang.String path, java.lang.String str) {
        r45.ko6 ko6Var;
        n0.e5 e5Var;
        kotlin.jvm.internal.o.g(path, "path");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = getContext();
        android.content.Intent intent = new android.content.Intent();
        qc0.d1 b17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.b(path);
        boolean z17 = (b17 != null ? b17.f361366d : 0L) > 60000;
        intent.putExtras(getIntent());
        intent.putExtra("ORIGIN_MUSIC_INFO", getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO"));
        intent.putExtra("ORIGIN_MUSIC_ID", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
        if (!intent.hasExtra("post_id")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(gm0.j1.b().j());
            sb6.append('_');
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            intent.putExtra("post_id", sb6.toString());
        }
        intent.putExtra("postType", 4);
        intent.putExtra("postMediaList", kz5.c0.d(path));
        intent.putExtra("postTypeList", kz5.c0.d(4));
        r45.q23 q23Var = new r45.q23();
        jz5.l O6 = O6();
        q23Var.f383585d = (java.lang.String) O6.f302833d;
        q23Var.f383586e = 1;
        q23Var.f383587f = com.tencent.maas.MJMaasVersion.VERSION_NUMBER_INT_VALUE;
        q23Var.f383589h = getIntent().getIntExtra("key_maas_entrance", 0);
        ty0.b1 b1Var = this.f359033h;
        if ((b1Var == null || (e5Var = b1Var.f422794d) == null || ((java.lang.Boolean) e5Var.getValue()).booleanValue()) ? false : true) {
            com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "performPost has music id");
            q23Var.f383591m = (java.lang.String) O6.f302834e;
        }
        if (str != null) {
            ko6Var = new r45.ko6();
            ko6Var.f378884i = str;
        } else {
            ko6Var = null;
        }
        q23Var.f383601w = ko6Var;
        intent.putExtra("KEY_POST_VIDEO_TEMPLATE", q23Var.toByteArray());
        intent.putExtra("isLongVideoPost", z17);
        intent.putExtra("edit_id", bz0.a.f36722a);
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(context, intent);
    }

    public final void S6(int i17) {
        if (this.f359035m) {
            return;
        }
        bz0.f fVar = bz0.f.f36735a;
        bz0.f.f36738d = kotlinx.coroutines.l.d(bz0.f.f36736b, null, null, new bz0.e(bz0.f.f36738d, i17, null), 3, null);
        this.f359035m = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        S6(1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        Q6();
        P6().e(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dz0.l lVar = (dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class);
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).f69799w = py0.a.f358965a;
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).f69785f = this;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f359031f = null;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69785f = null;
        S6(5);
    }

    @Override // dz0.k
    public void y1() {
        android.view.SurfaceHolder holder;
        com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "onMovieSessionCreated: ");
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(getActivity());
        this.f359031f = surfaceView;
        surfaceView.setVisibility(4);
        android.view.SurfaceView surfaceView2 = this.f359031f;
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.addCallback(new py0.k(this));
        }
        ((android.widget.FrameLayout) ((jz5.n) this.f359030e).getValue()).addView(this.f359031f, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // dz0.k
    public java.lang.Object z2(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }
}
