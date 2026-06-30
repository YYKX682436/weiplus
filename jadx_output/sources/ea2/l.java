package ea2;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f250569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f250570g;

    public l(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, java.util.List list, int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f250567d = finderMusicTopicHeaderUIC;
        this.f250568e = list;
        this.f250569f = i17;
        this.f250570g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.hj2 hj2Var;
        java.util.LinkedList list;
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250567d;
        if (finderMusicTopicHeaderUIC.f101759g == null) {
            android.view.View inflate = android.view.LayoutInflater.from(finderMusicTopicHeaderUIC.getContext()).inflate(com.tencent.mm.R.layout.adr, (android.view.ViewGroup) null, false);
            y9.i iVar = new y9.i(finderMusicTopicHeaderUIC.getContext(), com.tencent.mm.R.style.f30do);
            finderMusicTopicHeaderUIC.f101759g = iVar;
            iVar.setContentView(inflate);
            y9.i iVar2 = finderMusicTopicHeaderUIC.f101759g;
            if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                window2.setDimAmount(0.4f);
            }
            y9.i iVar3 = finderMusicTopicHeaderUIC.f101759g;
            if (iVar3 != null && (window = iVar3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(com.tencent.mm.R.drawable.ayr);
            }
            y9.i iVar4 = finderMusicTopicHeaderUIC.f101759g;
            if (iVar4 != null) {
                iVar4.setOnDismissListener(new ea2.f0(finderMusicTopicHeaderUIC));
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.e8x);
            if (textView != null) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                r45.r03 r03Var = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.eqh, java.lang.Integer.valueOf((r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null || (list = hj2Var.getList(2)) == null) ? 0 : list.size())));
            }
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.e8u);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ea2.g0(finderMusicTopicHeaderUIC));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.e8w);
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(finderMusicTopicHeaderUIC.getActivity(), 1, false));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f250568e.iterator();
            while (it.hasNext()) {
                arrayList2.add(new z92.a((r45.iw2) it.next()));
            }
            wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$buildItemCoverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new ca2.c();
                }
            }, arrayList2, false));
        }
        y9.i iVar5 = finderMusicTopicHeaderUIC.f101759g;
        if (iVar5 != null) {
            iVar5.show();
        }
        fa2.a aVar = fa2.a.f260706a;
        android.app.Activity context = finderMusicTopicHeaderUIC.getContext();
        r45.r03 r03Var2 = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        aVar.b(context, 1, r03Var2 != null ? (r45.hj2) r03Var2.getCustom(19) : null, this.f250569f, (java.lang.String) this.f250570g.f310123d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
