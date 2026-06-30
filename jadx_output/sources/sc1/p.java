package sc1;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc1.f f405707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405708e;

    public p(sc1.z zVar, sc1.f fVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405707d = fVar;
        this.f405708e = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        this.f405707d.a();
        this.f405708e.K(this);
    }
}
