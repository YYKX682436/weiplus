package gb1;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f269981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f269982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f269984g;

    public c(gb1.d dVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, boolean z17, int i17, c01.l2 l2Var) {
        this.f269981d = tVar;
        this.f269982e = z17;
        this.f269983f = i17;
        this.f269984g = l2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        this.f269981d.M(this.f269982e).a(this.f269983f);
        this.f269984g.h();
    }
}
