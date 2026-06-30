package md1;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f325727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f325728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.qd f325730d;

    public e(md1.f fVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, boolean z17, int i17, com.tencent.mm.plugin.appbrand.page.qd qdVar) {
        this.f325727a = tVar;
        this.f325728b = z17;
        this.f325729c = i17;
        this.f325730d = qdVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c
    public void d(int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.s M = this.f325727a.M(this.f325728b);
        ((com.tencent.mm.plugin.appbrand.page.ia) M).i(this.f325729c, this.f325730d, i17);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c
    public void exitFullScreen() {
        ((com.tencent.mm.plugin.appbrand.page.ia) this.f325727a.M(this.f325728b)).j(this.f325729c);
    }
}
