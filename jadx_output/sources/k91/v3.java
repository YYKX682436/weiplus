package k91;

/* loaded from: classes3.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f305793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305794e;

    public v3(yz5.a aVar, java.lang.String str) {
        this.f305793d = aVar;
        this.f305794e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f305793d.invoke();
        com.tencent.mars.xlog.Log.i("Luggage.WeDataExptInfoStorage", "updateExptInfo(" + this.f305794e + ") done");
    }
}
