package i53;

/* loaded from: classes8.dex */
public class w2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public i53.t f288769d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288770e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f288771f;

    /* renamed from: g, reason: collision with root package name */
    public i53.n0 f288772g;

    /* renamed from: h, reason: collision with root package name */
    public i53.d2 f288773h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.ThreeDotsLoadingView f288774i;

    /* renamed from: m, reason: collision with root package name */
    public final int f288775m;

    /* renamed from: n, reason: collision with root package name */
    public long f288776n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f288777o;

    /* renamed from: p, reason: collision with root package name */
    public int f288778p;

    public w2(android.content.Context context, int i17) {
        super(context);
        this.f288777o = true;
        this.f288775m = i17;
        b(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDataFromNet() {
        this.f288769d.d(new i53.u2(this));
    }

    public final void b(int i17, int i18, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8766, i17, i18, this.f288778p, lj0.a.a(6, map));
    }

    public final void c(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        android.view.View view = this.f288771f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabGalleryView", "setData, data is null : %b", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.L0(linkedList)));
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            android.view.View view2 = this.f288770e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b(502, 1, null);
        } else {
            android.view.View view3 = this.f288770e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.tencent.mm.sdk.platformtools.o4.M(i53.t.b("game_haowan_mmkv_key")).getBoolean("game_tab_gallery_first_enter", true)) {
                com.tencent.mm.sdk.platformtools.o4.M(i53.t.b("game_haowan_mmkv_key")).putBoolean("game_tab_gallery_first_enter", false);
                com.tencent.mm.sdk.platformtools.u3.i(new i53.v2(this), 500L);
            }
        }
        this.f288772g.g1(linkedList, z17, z18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f288769d.a();
    }

    public void setLocalAlbumInfos(org.json.JSONArray jSONArray) {
        i53.t tVar = new i53.t();
        this.f288769d = tVar;
        i53.t.f288715p = tVar;
        tVar.h(jSONArray);
        i53.n0 n0Var = new i53.n0(getContext(), 8766, this.f288778p);
        this.f288772g = n0Var;
        n0Var.setBackgroundColor(-1);
        this.f288772g.i(new i53.m2(this));
        this.f288772g.setOnItemClickListener(new i53.n2(this));
        i53.d2 d2Var = new i53.d2(getContext());
        this.f288773h = d2Var;
        d2Var.setPullDownEnabled(true);
        this.f288773h.setNeedStay(true);
        this.f288773h.setOnPullDownListener(new i53.p2(this));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bdu, (android.view.ViewGroup) this, false);
        this.f288774i = (com.tencent.mm.ui.widget.ThreeDotsLoadingView) inflate.findViewById(com.tencent.mm.R.id.gof);
        this.f288773h.f(inflate, this.f288772g);
        addView(this.f288773h, -1, -1);
        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bdr, (android.view.ViewGroup) this, false);
        this.f288770e = inflate2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate2, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(this.f288770e, -1, -1);
        android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bdt, (android.view.ViewGroup) this, false);
        this.f288771f = inflate3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(inflate3, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(this.f288771f, -1, -1);
        java.util.LinkedList c17 = this.f288769d.c();
        if (com.tencent.mm.sdk.platformtools.t8.L0(c17)) {
            android.view.View view = this.f288771f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.ui.widget.ThreeDotsLoadingView) this.f288771f.findViewById(com.tencent.mm.R.id.f485130gn5)).e();
        } else {
            c(c17, false, true);
            postDelayed(new i53.q2(this), 0L);
        }
        getDataFromNet();
    }
}
