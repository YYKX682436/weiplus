package eu0;

/* loaded from: classes5.dex */
public final class d implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256711b;

    public d(yz5.a aVar, yz5.a aVar2) {
        this.f256710a = aVar;
        this.f256711b = aVar2;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MJCC.LiteAppStore", "startLiteApp failed");
        this.f256711b.invoke();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "startLiteApp success");
        this.f256710a.invoke();
    }
}
