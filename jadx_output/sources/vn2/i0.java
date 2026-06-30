package vn2;

/* loaded from: classes.dex */
public final class i0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f438308c;

    public i0(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f438306a = str;
        this.f438307b = str2;
        this.f438308c = obj;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MegaVideoManager", "dispatchStore createStore fail!");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MegaVideoManager", "dispatchStore createStore success, dispatchStore result:" + ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(this.f438306a, this.f438307b, this.f438308c) + '!');
    }
}
