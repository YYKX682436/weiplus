package w;

/* loaded from: classes16.dex */
public final class h extends com.tencent.mm.plugin.finder.live.widget.e0 {

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.List f441824b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f441825c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, java.util.List cellItems) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(cellItems, "cellItems");
        this.f441824b2 = cellItems;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9u;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.oql);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.content.Context context = this.f118183e;
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
        Y(com.tencent.mm.R.color.f478490b);
        d0();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.suu);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        java.lang.String e17 = xy2.c.e(context);
        java.util.List<qe2.c> list = this.f441824b2;
        for (qe2.c cVar : list) {
            if (cVar.f362035a.length() > 0) {
                boolean z17 = e17.length() > 0;
                java.lang.String str = cVar.f362035a;
                if (z17 && com.tencent.mm.sdk.platformtools.t8.D0(str, e17)) {
                    cVar.f362040f = true;
                }
                ya2.b2 b17 = ya2.h.f460484a.b(str);
                if (b17 != null) {
                    int i17 = b17.field_follow_Flag;
                    l75.e0 e0Var = ya2.b2.O2;
                    cVar.f362038d = i17 == ya2.b2.Q2;
                    if (cVar.f362037c.length() == 0) {
                        java.lang.String str2 = b17.field_avatarUrl;
                        if (!(str2 == null || str2.length() == 0)) {
                            java.lang.String field_avatarUrl = b17.field_avatarUrl;
                            kotlin.jvm.internal.o.f(field_avatarUrl, "field_avatarUrl");
                            cVar.f362037c = field_avatarUrl;
                        }
                    }
                    if (cVar.f362039e == null && (finderAuthInfo = b17.field_authInfo) != null) {
                        cVar.f362039e = finderAuthInfo;
                    }
                }
            }
        }
        final qe2.b bVar = new qe2.b(context, list, this);
        recyclerView.setAdapter(bVar);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.coauthor.FinderLiveCoAuthorSheet$CoAuthorSheetPanel$initContentView$listener$1
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                am.zd zdVar;
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                w.h hVar = w.h.this;
                java.util.Iterator it = hVar.f441824b2.iterator();
                int i18 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    zdVar = event.f54346g;
                    if (!hasNext) {
                        i18 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((qe2.c) it.next()).f362035a, zdVar.f8551a)) {
                        break;
                    }
                    i18++;
                }
                if (i18 != -1) {
                    int i19 = zdVar.f8552b;
                    if (!(i19 == 4 || i19 == 1)) {
                        if (i19 != 5 && i19 != 2) {
                            r4 = false;
                        }
                        r4 = r4 ? false : true;
                    }
                    ((qe2.c) hVar.f441824b2.get(i18)).f362038d = r4;
                    pm0.v.X(new w.g(bVar, i18));
                }
                return false;
            }
        };
        iListener.alive();
        this.f441825c2 = iListener;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        com.tencent.mm.sdk.event.IListener iListener = this.f441825c2;
        if (iListener != null) {
            iListener.dead();
        }
        this.f441825c2 = null;
    }
}
