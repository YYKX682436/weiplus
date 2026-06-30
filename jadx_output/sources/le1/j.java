package le1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f318136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ le1.k f318138f;

    public j(le1.k kVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f318138f = kVar;
        this.f318136d = lVar;
        this.f318137e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f318138f.C(this.f318136d, this.f318137e);
    }
}
