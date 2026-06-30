package yn2;

/* loaded from: classes2.dex */
public final class a extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public long f463960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463961h;

    public a(yn2.m mVar) {
        this.f463961h = mVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof ec2.f) || ((event instanceof fc2.s) && ((fc2.s) event).f260980d == 2) || (event instanceof fc2.t);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            yn2.m mVar = this.f463961h;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = mVar.f464001o;
            androidx.recyclerview.widget.f2 adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter == null) {
                return;
            }
            fc2.t tVar = (fc2.t) ev6;
            int i17 = 0;
            int i18 = tVar.f260985d;
            if (i18 != 6) {
                if (i18 == 10) {
                    if (((in5.s0) in5.n0.Y(wxRecyclerAdapter, tVar.f260992k, false, 2, null)) != null) {
                        com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", "on tab invisible lastCenterFeedId:" + this.f463960g);
                        return;
                    }
                    return;
                }
                if (i18 != 9 || (recyclerView = mVar.f464001o) == null) {
                    return;
                }
                int childCount = recyclerView.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = recyclerView.getChildAt(i19);
                    if (!(childAt != null && childAt.getVisibility() == 0) && childAt != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$1$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$1$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                return;
            }
            long j17 = this.f463960g;
            long j18 = tVar.f260992k;
            if (j17 != j18) {
                this.f463960g = j18;
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = mVar.f463994e;
                java.util.Iterator it = ((xn2.p0) eVar).j().getDataListJustForAdapter().iterator();
                java.util.LinkedList linkedList = null;
                java.util.LinkedList linkedList2 = null;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i27 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var = (so2.j5) next;
                    int i28 = tVar.f260994m;
                    if (i17 != i28 && java.lang.Math.abs(i28 - i17) <= 2 && (j5Var instanceof zn2.a)) {
                        if (linkedList == null) {
                            linkedList = new java.util.LinkedList();
                        }
                        linkedList.add(j5Var);
                        if (linkedList2 == null) {
                            linkedList2 = new java.util.LinkedList();
                        }
                        linkedList2.add(java.lang.Integer.valueOf(i17));
                    }
                    i17 = i27;
                }
                android.app.Activity activity = ((xn2.p0) eVar).f455543a;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
                if (linkedList != null && appCompatActivity != null) {
                    vn2.i iVar = vn2.i.f438303a;
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(appCompatActivity).a(um3.b.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    pf5.e.launch$default((pf5.e) a17, null, null, new vn2.g(linkedList, null), 3, null);
                }
                com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", "lastCenterFeedId=" + pm0.v.u(this.f463960g) + ", new centerFeedId=" + pm0.v.u(tVar.f260992k) + ",center position=" + tVar.f260994m + ",preload position=" + linkedList2);
            }
        }
    }

    @Override // fc2.d
    public void H0() {
    }
}
