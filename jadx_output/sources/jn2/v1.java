package jn2;

/* loaded from: classes10.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.s1 f300718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300719e;

    public v1(jn2.s1 s1Var, jn2.z1 z1Var) {
        this.f300718d = s1Var;
        this.f300719e = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f300718d.getAdapterPosition();
        jn2.z1 z1Var = this.f300719e;
        if (adapterPosition >= 0 && adapterPosition < z1Var.f300769h.size()) {
            java.lang.Object obj = z1Var.f300769h.get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            nf2.w wVar = (nf2.w) z1Var.f300767f.controller(nf2.w.class);
            if (wVar != null) {
                nf2.d1 d1Var = wVar.f336808m;
                if (d1Var != null) {
                    com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
                    if (finderLiveNormalRoomLyricsRenderView != null) {
                        finderLiveNormalRoomLyricsRenderView.i();
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "stopRender");
                }
                wVar.f336813r = false;
                wVar.b7();
            }
            yz5.p pVar = z1Var.f300771m;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(adapterPosition), z22Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
