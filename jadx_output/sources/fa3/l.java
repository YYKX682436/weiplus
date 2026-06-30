package fa3;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f260766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260768f;

    public l(fa3.b bVar, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260768f = bVar;
        this.f260766d = map;
        this.f260767e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f260768f.g(this.f260766d, this.f260767e);
    }
}
