package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151361d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f151362e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151363f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151364g;

    /* renamed from: h, reason: collision with root package name */
    public im3.g f151365h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList f151366i;

    /* renamed from: m, reason: collision with root package name */
    public xm3.t0 f151367m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f151368n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.l f151369o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.k f151370p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151361d = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.n(activity));
        this.f151362e = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.c(activity));
        this.f151363f = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.m(this));
        this.f151364g = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.p(activity));
        this.f151368n = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.o(activity));
        this.f151369o = new com.tencent.mm.plugin.mv.ui.uic.l(this, activity);
        this.f151370p = new com.tencent.mm.plugin.mv.ui.uic.k(this, activity);
    }

    public static final int O6(com.tencent.mm.plugin.mv.ui.uic.q qVar, r45.oc5 oc5Var, java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList;
        qVar.getClass();
        java.util.LinkedList sourceList = oc5Var.f382149d;
        kotlin.jvm.internal.o.f(sourceList, "sourceList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : sourceList) {
            if (kotlin.jvm.internal.o.b(((r45.nc5) obj).f381246e, str)) {
                arrayList.add(obj);
            }
        }
        r45.nc5 nc5Var = (r45.nc5) kz5.n0.a0(arrayList, 0);
        if (nc5Var == null || (linkedList = nc5Var.f381245d) == null) {
            return 0;
        }
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (kotlin.jvm.internal.o.b(((r45.mc5) obj2).f380363d, str2)) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }

    public final android.widget.CheckBox P6() {
        return (android.widget.CheckBox) ((jz5.n) this.f151368n).getValue();
    }

    public final qk4.b Q6() {
        return (qk4.b) ((jz5.n) this.f151364g).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f151361d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.b bVar = (com.tencent.mm.plugin.mv.ui.uic.b) a17;
        bVar.O6().z3(getActivity(), com.tencent.mm.plugin.mv.ui.uic.d.f151092d);
        bVar.O6().m3(getActivity(), new com.tencent.mm.plugin.mv.ui.uic.h(this));
        com.tencent.mm.sdk.platformtools.t8.q(P6(), 100, 100, 100, 100);
        P6().setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.i(bVar, this));
        bVar.O6().m3(getActivity(), new com.tencent.mm.plugin.mv.ui.uic.j(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        qk4.f fVar = (qk4.f) Q6();
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = fVar.f364447e;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            kk4.v player = ((com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) it.next()).getPlayer();
            if (player != null) {
                player.recycle();
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f364448f;
        java.util.Iterator it6 = concurrentHashMap.entrySet().iterator();
        while (it6.hasNext()) {
            kk4.v player2 = ((com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) ((java.util.Map.Entry) it6.next()).getKey()).getPlayer();
            if (player2 != null) {
                player2.recycle();
            }
        }
        concurrentLinkedDeque.clear();
        concurrentHashMap.clear();
    }
}
