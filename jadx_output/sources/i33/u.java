package i33;

/* loaded from: classes.dex */
public final class u extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f288268d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f288269e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f288270f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f288271g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f288272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288268d = jz5.h.b(new i33.t(this));
        this.f288269e = jz5.h.b(i33.k.f288206d);
        this.f288270f = jz5.h.b(new i33.n(this, activity));
        this.f288271g = jz5.h.b(new i33.j(this));
        this.f288272h = jz5.h.b(new i33.s(this));
        new java.util.LinkedHashMap();
    }

    public final em.c T6() {
        return (em.c) ((jz5.n) this.f288268d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dyn;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
        if (baseMvvmActivity != null) {
            baseMvvmActivity.setMMTitle("");
            baseMvvmActivity.hideActionbarLine();
            baseMvvmActivity.hideActionBarOperationArea();
            androidx.appcompat.app.b supportActionBar = baseMvvmActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
        }
        em.c T6 = T6();
        if (T6.f254146e == null) {
            T6.f254146e = (com.tencent.mm.view.recyclerview.WxRecyclerView) T6.f254142a.findViewById(com.tencent.mm.R.id.lqa);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = T6.f254146e;
        jz5.g gVar = this.f288271g;
        wxRecyclerView.setAdapter((xm3.t0) ((jz5.n) gVar).getValue());
        em.c T62 = T6();
        if (T62.f254146e == null) {
            T62.f254146e = (com.tencent.mm.view.recyclerview.WxRecyclerView) T62.f254142a.findViewById(com.tencent.mm.R.id.lqa);
        }
        T62.f254146e.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        java.lang.Object b17 = c01.n2.d().c("data_center_album_file_preview_data_list", true).b("album_file_preview_data_list");
        java.util.ArrayList arrayList = b17 instanceof java.util.ArrayList ? (java.util.ArrayList) b17 : null;
        int size = arrayList != null ? arrayList.size() : 0;
        em.c T63 = T6();
        if (T63.f254147f == null) {
            T63.f254147f = (android.widget.TextView) T63.f254142a.findViewById(com.tencent.mm.R.id.qxd);
        }
        android.widget.TextView textView = T63.f254147f;
        int intExtra = getIntent().getIntExtra("total_count", 0);
        int intExtra2 = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        j33.c.f297404e.getClass();
        j33.c cVar = (j33.c) ((java.util.LinkedHashMap) j33.c.f297405f).get(java.lang.Integer.valueOf(intExtra2));
        if (cVar == null) {
            cVar = j33.c.f297406g;
        }
        switch (cVar.ordinal()) {
            case 0:
            case 10:
                i17 = com.tencent.mm.R.string.mjv;
                break;
            case 1:
                i17 = com.tencent.mm.R.string.mxq;
                break;
            case 2:
                i17 = com.tencent.mm.R.string.n3z;
                break;
            case 3:
                i17 = com.tencent.mm.R.string.n3p;
                break;
            case 4:
                i17 = com.tencent.mm.R.string.n3y;
                break;
            case 5:
                i17 = com.tencent.mm.R.string.meu;
                break;
            case 6:
                i17 = com.tencent.mm.R.string.mk9;
                break;
            case 7:
                i17 = com.tencent.mm.R.string.mjs;
                break;
            case 8:
                i17 = com.tencent.mm.R.string.mk8;
                break;
            case 9:
                i17 = com.tencent.mm.R.string.f490316ml1;
                break;
            default:
                throw new jz5.j();
        }
        android.content.res.Resources resources = getContext().getResources();
        java.lang.String string = resources != null ? resources.getString(i17, java.lang.String.valueOf(intExtra)) : null;
        textView.setText(string != null ? string : "");
        com.tencent.mm.ui.dl.i(textView.getPaint());
        textView.setGravity(17);
        em.c T64 = T6();
        if (T64.f254145d == null) {
            T64.f254145d = (com.tencent.mm.ui.widget.button.WeButton) T64.f254142a.findViewById(com.tencent.mm.R.id.sci);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = T64.f254145d;
        android.content.res.Resources resources2 = getContext().getResources();
        weButton.setText(resources2 != null ? resources2.getString(com.tencent.mm.R.string.njv, java.lang.String.valueOf(size)) : null);
        weButton.setVisibility(0);
        weButton.setOnClickListener(new i33.o(this));
        em.c T65 = T6();
        if (T65.f254143b == null) {
            T65.f254143b = (com.tencent.mm.ui.widget.button.WeButton) T65.f254142a.findViewById(com.tencent.mm.R.id.sch);
        }
        T65.f254143b.setOnClickListener(new i33.p(this));
        em.c T66 = T6();
        if (T66.f254144c == null) {
            T66.f254144c = (android.widget.LinearLayout) T66.f254142a.findViewById(com.tencent.mm.R.id.hhc);
        }
        T66.f254144c.setOnClickListener(new i33.q(this));
        ((xm3.t0) ((jz5.n) gVar).getValue()).B = (i33.r) ((jz5.n) this.f288272h).getValue();
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new i33.m(this, null), 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        c01.n2.d().e("data_center_album_file_preview_data_list");
    }
}
