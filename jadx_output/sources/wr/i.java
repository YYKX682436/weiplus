package wr;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.c f448746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.j f448747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wr.k f448749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wr.c cVar, wr.j jVar, java.lang.String str, wr.k kVar) {
        super(2);
        this.f448746d = cVar;
        this.f448747e = jVar;
        this.f448748f = str;
        this.f448749g = kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String identifier = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(identifier, "identifier");
        wr.j jVar = this.f448747e;
        wr.c cVar = this.f448746d;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "remote thumb img downloaded. md5:" + cVar.f448733a);
            jVar.getClass();
            pm0.v.X(new wr.e(jVar, this.f448748f));
        } else {
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageMgr", "failed to load thumb img. fallback to local gen. md5:" + cVar.f448733a + ", url:" + this.f448749g.f448753a);
            jVar.c(cVar.f448734b);
        }
        return jz5.f0.f302826a;
    }
}
