package es2;

/* loaded from: classes2.dex */
public final class a implements cs2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f256325d;

    /* renamed from: e, reason: collision with root package name */
    public final es2.g f256326e;

    public a(android.content.Context context, es2.g preloadInStream) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(preloadInStream, "preloadInStream");
        this.f256325d = context;
        this.f256326e = preloadInStream;
    }

    @Override // cs2.j
    public void B(java.lang.String mediaId, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f256326e.B(mediaId, z17, i17);
    }

    @Override // cs2.j
    public void C0() {
        this.f256326e.C0();
    }

    @Override // cs2.j
    public void G(vr2.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f256326e.G(callback);
    }

    @Override // cs2.j
    public void M(cw2.wa mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        cs2.k a17 = a();
        cs2.j jVar = a17 != null ? a17.f222076d : null;
        if (jVar != null) {
            jVar.M(mediaSource);
        }
        int m17 = jVar != null ? jVar.m() : 0;
        es2.g gVar = this.f256326e;
        if (m17 > 0) {
            gVar.i0(mediaSource);
        } else {
            gVar.M(mediaSource);
        }
    }

    @Override // cs2.j
    public void P(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f256326e.P(source);
    }

    @Override // cs2.j
    public void V(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f256326e.V(context);
    }

    public final cs2.k a() {
        cs2.k kVar;
        android.content.Context context = this.f256325d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity == null) {
            return null;
        }
        if (appCompatActivity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
            kotlin.jvm.internal.o.g(fragment, "fragment");
            kVar = (cs2.k) pf5.z.f353948a.b(fragment).a(cs2.k.class);
        } else {
            kVar = (cs2.k) pf5.z.f353948a.a(appCompatActivity).a(cs2.k.class);
        }
        return kVar;
    }

    public void b(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList, int i17, int i18, fc2.c cVar) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f256326e.P0(dataList, i17, i18, cVar);
    }

    @Override // cs2.j
    public void f(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f256326e.getClass();
    }

    @Override // cs2.j
    public int getCommentScene() {
        return this.f256326e.f256346g;
    }

    @Override // cs2.j
    public void i0(cw2.wa mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        cs2.k a17 = a();
        cs2.j jVar = a17 != null ? a17.f222076d : null;
        if (jVar != null) {
            jVar.i0(mediaSource);
        }
        this.f256326e.i0(mediaSource);
    }

    @Override // cs2.j
    public int m() {
        return this.f256326e.m();
    }

    @Override // cs2.j
    public void p(java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        this.f256326e.p(invokeSource);
    }

    @Override // cs2.j
    public void p0(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f256326e.p0(source);
    }

    @Override // cs2.j
    public void q(yz5.p pVar) {
        this.f256326e.f256362z = pVar;
    }

    @Override // cs2.j
    public void u0(java.lang.String mediaId, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f256326e.u0(mediaId, z17);
    }

    @Override // cs2.j
    public void x0(cw2.wa mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f256326e.x0(mediaSource);
    }

    @Override // cs2.j
    public void z(cw2.wa mediaSource, java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        this.f256326e.z(mediaSource, invokeSource);
    }
}
