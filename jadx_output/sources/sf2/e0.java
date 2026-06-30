package sf2;

/* loaded from: classes3.dex */
public final class e0 extends if2.b implements if2.e, te2.l0 {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.i8 f407111m;

    /* renamed from: n, reason: collision with root package name */
    public bm2.a0 f407112n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f407113o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f407114p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f407115q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f407113o = kz5.c1.l(new jz5.l(r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic, null), new jz5.l(r45.xg7.emFinderLiveGetMusicTabListType_Recommend, null), new jz5.l(r45.xg7.emFinderLiveGetMusicTabListType_Like, null));
        this.f407115q = "";
    }

    @Override // te2.l0
    public boolean D2(int i17, r45.xg7 xg7Var) {
        dk2.p Z6 = ((mm2.c1) business(mm2.c1.class)).Z6();
        if (xg7Var != null) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) Z6.f233882k).get(xg7Var);
            int intValue = num != null ? num.intValue() : 0;
            java.util.List list = (java.util.List) Z6.f233884m.get(xg7Var);
            int size = list != null ? list.size() : 0;
            if (i17 > size - 3) {
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "load more type " + xg7Var + ", music list size " + size);
                if (intValue > 0) {
                    return true;
                }
            }
        } else if (Z6.f233881j > 0 && i17 >= Z6.f233878g.size() - 1) {
            return true;
        }
        return false;
    }

    public final void Z6() {
        java.util.List list;
        dk2.p Z6 = ((mm2.c1) business(mm2.c1.class)).Z6();
        Z6.f233878g.clear();
        Z6.f233879h = "";
        bm2.a0 a0Var = this.f407112n;
        if (a0Var != null && (list = a0Var.f21749f) != null) {
            ((java.util.ArrayList) list).clear();
        }
        bm2.a0 a0Var2 = this.f407112n;
        if (a0Var2 != null) {
            a0Var2.notifyDataSetChanged();
        }
    }

    public final void a7(r45.xg7 type, yz5.l lVar) {
        kotlin.jvm.internal.o.g(type, "type");
        new ek2.f1(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328985o, xy2.c.e(O6()), ((mm2.e1) business(mm2.e1.class)).f328983m, type, (com.tencent.mm.protobuf.g) ((java.util.LinkedHashMap) ((mm2.c1) business(mm2.c1.class)).Z6().f233883l).get(type), new sf2.z(this, type, lVar)).l().f(N6());
    }

    public final void b7() {
        android.widget.TextView textView;
        java.util.ArrayList searchData = ((mm2.c1) business(mm2.c1.class)).Z6().f233878g;
        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = this.f407111m;
        if (i8Var != null) {
            kotlin.jvm.internal.o.g(searchData, "searchData");
            com.tencent.mm.plugin.finder.live.widget.r7 r7Var = i8Var.N;
            if (r7Var != null && (textView = r7Var.f119585f) != null) {
                int i17 = searchData.isEmpty() ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "showSearchEmptyResultView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "showSearchEmptyResultView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(textView.getResources().getString(com.tencent.mm.R.string.lqo));
            }
        }
        if (searchData.isEmpty()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "updateSearchView, searchData:" + searchData);
        }
        bm2.a0 a0Var = this.f407112n;
        if (a0Var != null) {
            a0Var.B(searchData, ((mm2.c1) business(mm2.c1.class)).Z6().f233881j != 0);
            a0Var.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        Z6();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (((mm2.c1) business(mm2.c1.class)).Y4) {
            com.tencent.mm.ui.MMActivity N6 = N6();
            android.view.View findViewById = N6 != null ? N6.findViewById(com.tencent.mm.R.id.emb) : null;
            if (findViewById != null) {
                findViewById.setElevation(O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480546a43));
            }
        }
        com.tencent.mm.ui.MMActivity N62 = N6();
        this.f407111m = N62 != null ? new com.tencent.mm.plugin.finder.live.widget.i8(O6(), N62, this) : null;
        java.util.Map map = this.f407113o;
        r45.xg7 xg7Var = r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic;
        map.put(xg7Var, new bm2.a0(O6(), this, xg7Var));
        r45.xg7 xg7Var2 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend;
        map.put(xg7Var2, new bm2.a0(O6(), this, xg7Var2));
        r45.xg7 xg7Var3 = r45.xg7.emFinderLiveGetMusicTabListType_Like;
        map.put(xg7Var3, new bm2.a0(O6(), this, xg7Var3));
        this.f407112n = new bm2.a0(O6(), this, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        java.util.List list;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "onViewUnmount");
        java.util.Iterator it = ((mm2.c1) business(mm2.c1.class)).Z6().f233884m.entrySet().iterator();
        while (it.hasNext()) {
            ((java.util.List) ((java.util.Map.Entry) it.next()).getValue()).clear();
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f407113o).entrySet()) {
            bm2.a0 a0Var = (bm2.a0) entry.getValue();
            if (a0Var != null && (list = a0Var.f21749f) != null) {
                ((java.util.ArrayList) list).clear();
            }
            bm2.a0 a0Var2 = (bm2.a0) entry.getValue();
            if (a0Var2 != null) {
                a0Var2.notifyDataSetChanged();
            }
        }
        this.f407111m = null;
    }

    @Override // te2.l0
    public void u5(boolean z17, r45.xg7 xg7Var, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        dk2.p Z6 = ((mm2.c1) business(mm2.c1.class)).Z6();
        if (xg7Var != null) {
            Z6.f233882k.put(xg7Var, 0);
            a7(xg7Var, callback);
            return;
        }
        if (Z6.f233879h.length() == 0) {
            callback.invoke(0);
        } else {
            Z6.f233881j = 0;
            new ek2.k2(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328985o, xy2.c.e(O6()), ((mm2.e1) business(mm2.e1.class)).f328983m, Z6.f233879h, Z6.f233880i, new sf2.b0(Z6, callback)).l().f(N6());
        }
    }
}
