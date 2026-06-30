package mm3;

/* loaded from: classes10.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f329653d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f329654e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f329655f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f329656g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f329657h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f329658i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f329659m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f329660n;

    /* renamed from: o, reason: collision with root package name */
    public int f329661o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f329662p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f329663q;

    /* renamed from: r, reason: collision with root package name */
    public final qm3.i f329664r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f329658i = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));
        this.f329661o = -1;
        this.f329663q = new java.util.HashMap();
        this.f329664r = new qm3.i(new mm3.m(activity));
    }

    public static final void O6(mm3.n nVar) {
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "exitSelectMode");
        android.view.ViewGroup viewGroup = nVar.f329654e;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("selectButtonsContainer");
            throw null;
        }
        viewGroup.setVisibility(8);
        android.widget.Button button = nVar.f329655f;
        if (button == null) {
            kotlin.jvm.internal.o.o("completeButton");
            throw null;
        }
        button.setVisibility(0);
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = nVar.f329653d;
        if (mvTracksEditView == null) {
            kotlin.jvm.internal.o.o("tracksEditView");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "stopSelecting: " + mvTracksEditView.getSelectedIndex());
        int selectedIndex = mvTracksEditView.getSelectedIndex();
        sm3.o oVar = mvTracksEditView.f152014g;
        if (selectedIndex >= 0) {
            int selectedIndex2 = mvTracksEditView.getSelectedIndex();
            oVar.getClass();
            oVar.notifyItemChanged(selectedIndex2 + 1);
            mvTracksEditView.setSelectedIndex(-1);
        }
        oVar.f409898f = null;
        mvTracksEditView.f152012e.setVisibility(0);
        mvTracksEditView.f152027w.f409832q = true;
        mvTracksEditView.f152011d.D0();
        androidx.appcompat.app.AppCompatActivity activity = nVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h6.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pk4.c cVar = ((com.tencent.mm.plugin.mv.ui.uic.h6) a17).f151186n;
        if (cVar != null) {
            gk4.r rVar = ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).f174566f;
            com.tencent.mars.xlog.Log.i(rVar.f272602g, "clearPlayRange");
            rVar.f272617v = -1L;
            rVar.f272618w = -1L;
        }
        nVar.f329663q.clear();
    }

    public final void P6(long j17) {
        java.util.LinkedList linkedList = this.f329657h;
        if (linkedList == null) {
            kotlin.jvm.internal.o.o("trackList");
            throw null;
        }
        e06.k m17 = e06.p.m(0, linkedList.size() - 1);
        java.util.LinkedList linkedList2 = this.f329657h;
        if (linkedList2 == null) {
            kotlin.jvm.internal.o.o("trackList");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add((r45.jf2) linkedList2.get(((kz5.x0) it).b()));
        }
        java.util.Iterator it6 = arrayList.iterator();
        long j18 = 0;
        while (it6.hasNext()) {
            ((r45.jf2) it6.next()).set(0, java.lang.Long.valueOf(j18));
            j18 += r7.getInteger(1);
        }
        java.util.LinkedList linkedList3 = this.f329657h;
        if (linkedList3 == null) {
            kotlin.jvm.internal.o.o("trackList");
            throw null;
        }
        r45.jf2 jf2Var = (r45.jf2) linkedList3.getLast();
        jf2Var.set(0, java.lang.Long.valueOf(j18));
        jf2Var.set(1, java.lang.Integer.valueOf((int) j17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        qm3.i iVar = this.f329664r;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbCachedLoader", "release");
        java.util.Collection<qm3.a> values = iVar.f364785b.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (qm3.a aVar : values) {
            u26.x0.a(aVar.f364763e, null, 1, null);
            rm5.k kVar = aVar.f364759a;
            if (kVar != null) {
                kVar.destroy();
            }
            aVar.f364759a = null;
        }
        kotlinx.coroutines.z0.e(iVar.f364786c, null, 1, null);
        kotlinx.coroutines.z0.e(this.f329658i, null, 1, null);
    }
}
