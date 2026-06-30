package le1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f318126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ le1.f f318128f;

    public d(le1.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f318128f = fVar;
        this.f318126d = lVar;
        this.f318127e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f318128f.C(this.f318126d, this.f318127e);
    }
}
