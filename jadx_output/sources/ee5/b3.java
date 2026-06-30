package ee5;

/* loaded from: classes9.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.e3 f251836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(ee5.e3 e3Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251836d = e3Var;
        this.f251837e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.b3(this.f251836d, this.f251837e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.b3 b3Var = (ee5.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        de5.a aVar2 = de5.a.f229396a;
        pf5.u uVar = pf5.u.f353936a;
        ee5.e3 e3Var = this.f251836d;
        int R6 = ((ee5.z) uVar.c(e3Var.getActivity()).a(ee5.z.class)).R6();
        int P6 = ((ee5.z) uVar.c(e3Var.getActivity()).a(ee5.z.class)).P6();
        java.lang.String query = this.f251837e;
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "report do search " + de5.a.f229398c + ", " + de5.a.f229401f + ", " + R6 + ", " + P6 + ' ' + query);
        aVar2.i(R6);
        de5.a.f229401f = query;
        de5.a.f229409n = P6;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        de5.a.f229403h = currentTimeMillis;
        de5.a.f229398c = java.lang.String.valueOf(currentTimeMillis);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSearchSessionId >> ");
        sb6.append(de5.a.f229398c);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = aVar2.a();
        a17.f60286f = 4L;
        a17.p(query);
        a17.k();
        ((ee5.a3) uVar.c(e3Var.getActivity()).a(ee5.a3.class)).P6(8);
        ((ee5.q3) uVar.c(e3Var.getActivity()).a(ee5.q3.class)).T6(0);
        ((ee5.z) uVar.c(e3Var.getActivity()).a(ee5.z.class)).X6(query);
        ee5.q3 q3Var = (ee5.q3) uVar.c(e3Var.getActivity()).a(ee5.q3.class);
        q3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "updateQuery");
        java.lang.Object obj2 = q3Var.f252009g.get(0);
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment");
        ((com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment) obj2).f202679r = true;
        q3Var.f252020u = 0;
        kotlinx.coroutines.r2 r2Var = q3Var.f252019t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = q3Var.f252021v;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        fn5.o0 o0Var = fn5.o0.f264743d;
        if (q3Var.f252017r) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = q3Var.f252014o;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            android.widget.TextView textView = q3Var.f252013n;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        q3Var.f252023x = true;
        ee5.h0 h0Var = (ee5.h0) uVar.c(e3Var.getActivity()).a(ee5.h0.class);
        h0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "onSearch: ".concat(query));
        h0Var.Q6();
        kotlinx.coroutines.r2 r2Var3 = h0Var.f251909u;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        androidx.appcompat.app.AppCompatActivity activity = h0Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.search.multi.FTSChattingConvMultiTabUI");
        for (com.tencent.mm.ui.component.UIComponent uIComponent : ((com.tencent.mm.ui.chatting.search.multi.FTSChattingConvMultiTabUI) activity).getUiComponents()) {
            if (uIComponent instanceof ee5.t2) {
                ee5.t2 t2Var = (ee5.t2) uIComponent;
                ae5.n nVar = ae5.n.f4433e;
                t2Var.getClass();
                com.tencent.mars.xlog.Log.i(t2Var.f252048d, "updateSearchState >> searchState " + nVar);
                t2Var.f252052h.postValue(nVar);
                kotlinx.coroutines.r2 r2Var4 = t2Var.f252055n;
                if (r2Var4 != null) {
                    kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
                }
            }
        }
        h0Var.f251898g.setValue(ae5.n.f4433e);
        if (h0Var.f251896e != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(h0Var.f251896e);
        }
        java.util.List list = h0Var.f251900i;
        kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.fts.api.model.MatchInfo>");
        ((java.util.ArrayList) list).clear();
        h0Var.f251908t = false;
        h0Var.f251901m.clear();
        h0Var.f251902n.clear();
        h0Var.f251907s.clear();
        h0Var.f251906r.clear();
        ce5.d dVar = h0Var.f251911w;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadMoreImageDataModel", "reset");
        dVar.f40812a = null;
        kotlinx.coroutines.r2 r2Var5 = dVar.f40814c;
        if (r2Var5 != null) {
            kotlinx.coroutines.p2.a(r2Var5, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var6 = h0Var.f251912x;
        if (r2Var6 != null) {
            kotlinx.coroutines.p2.a(r2Var6, null, 1, null);
        }
        h0Var.f251913y = false;
        h0Var.f251914z = false;
        h0Var.A = false;
        h0Var.B = false;
        h0Var.C = false;
        h0Var.D = false;
        h0Var.G.clear();
        h0Var.H = 0L;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = h0Var.I;
        atomicBoolean.set(false);
        h0Var.f251894J = 0L;
        if (!h0Var.K) {
            h0Var.H = java.lang.System.currentTimeMillis();
            atomicBoolean.set(false);
            h0Var.f251894J = 0L;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = h0Var.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((ee5.q3) zVar.a(activity2).a(ee5.q3.class)).getClass();
        h0Var.f251897f = query;
        p13.u uVar2 = new p13.u();
        uVar2.f351141c = query;
        uVar2.f351142d = h0Var.f251895d;
        uVar2.f351150l = r13.e.f368605d;
        uVar2.f351148j.add("create_talker_message\u200b");
        uVar2.f351151m = h0Var;
        uVar2.f351152n = new com.tencent.mm.sdk.platformtools.n3();
        uVar2.f351140b = 3;
        h0Var.f251896e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar2);
        androidx.appcompat.app.AppCompatActivity activity3 = h0Var.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        if (((ee5.z) zVar.a(activity3).a(ee5.z.class)).f252105o) {
            androidx.appcompat.app.AppCompatActivity activity4 = h0Var.getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            if (((ee5.z) zVar.a(activity4).a(ee5.z.class)).f252104n) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getDataFromFlow >> " + query + ", " + h0Var.f251895d + ", " + h0Var.f251910v);
                if (!(query.length() == 0)) {
                    h0Var.f251912x = kotlinx.coroutines.l.d(h0Var.getMainScope(), null, null, new ee5.e0(h0Var, query, null), 3, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
