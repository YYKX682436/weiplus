package rw2;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.j f400593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk4.h f400594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f400595f;

    public f(rw2.j jVar, kk4.h hVar, java.lang.Object obj) {
        this.f400593d = jVar;
        this.f400594e = hVar;
        this.f400595f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rw2.j jVar = this.f400593d;
        java.lang.String str = jVar.f400607c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create new TPTrackThumbFetcher, mediaInfo:");
        rw2.k kVar = jVar.f400605a;
        sb6.append(kVar.f400614n);
        sb6.append(", loader.isAllComplete:");
        kk4.h hVar = this.f400594e;
        sb6.append(hVar != null ? hVar.f308548g : false);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kk4.v vVar = new kk4.v(context);
        jVar.f400611g = vVar;
        vVar.C(true);
        if (hVar != null) {
            kk4.v vVar2 = jVar.f400611g;
            if (vVar2 != null) {
                dk4.a mediaInfo = kVar.f400614n;
                kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
                com.tencent.mars.xlog.Log.i(vVar2.f308576a, "setCdnResourceLoader, loader:" + hVar.hashCode() + ", mediaId:" + hVar.f308545d + ", isMoovReady:" + hVar.f308547f);
                vVar2.f308580e = hVar;
                vVar2.f308578c = mediaInfo;
                vVar2.f308582g = true;
                vVar2.S(true);
                vVar2.H = true;
            }
        } else {
            kk4.v vVar3 = jVar.f400611g;
            if (vVar3 != null) {
                vVar3.B(kVar.f400614n);
            }
        }
        jVar.f400612h = hVar != null ? hVar.f308548g : false;
        kk4.v vVar4 = jVar.f400611g;
        if (vVar4 != null) {
            vVar4.f308585j = true;
        }
        if (vVar4 != null) {
            vVar4.G = true;
        }
        kk4.h hVar2 = vVar4 != null ? vVar4.f308580e : null;
        if (hVar2 != null) {
            hVar2.f308551m = new rw2.c(jVar);
        }
        dk4.a mediaInfo2 = kVar.f400614n;
        rw2.t tVar = jVar.f400608d;
        tVar.getClass();
        kotlin.jvm.internal.o.g(mediaInfo2, "mediaInfo");
        com.tencent.mars.xlog.Log.i(tVar.f400626c, "mediaInfo:" + mediaInfo2);
        tVar.f400635l = mediaInfo2;
        rw2.d dVar = new rw2.d(jVar, this.f400595f);
        tVar.getClass();
        com.tencent.mars.xlog.Log.i(tVar.f400626c, "setup, output size:[" + tVar.f400624a + ',' + tVar.f400625b + ']');
        tVar.f400630g = dVar;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("TPTrackThumbRenderer@");
        sb7.append(tVar.hashCode());
        java.lang.String sb8 = sb7.toString();
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(sb8, 0);
        a17.start();
        tVar.f400629f = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        tVar.f400628e = a17;
        tVar.b(new rw2.l(tVar));
        tVar.b(new rw2.o(tVar));
        tVar.b(new rw2.p(tVar));
        tVar.b(new rw2.s(tVar));
        rw2.e eVar = new rw2.e(jVar);
        tVar.getClass();
        tVar.f400638o = eVar;
    }
}
