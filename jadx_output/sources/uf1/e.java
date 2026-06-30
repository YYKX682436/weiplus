package uf1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f427156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf1.a f427157e;

    public e(uf1.a aVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f427157e = aVar;
        this.f427156d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uf1.a.r(this.f427157e, this.f427156d);
    }
}
