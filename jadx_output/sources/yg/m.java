package yg;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e8.e f462104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f462106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.github.henryye.nativeiv.ImageDecodeConfig f462107g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462108h;

    public m(com.tencent.magicbrush.MBRuntime mBRuntime, e8.e eVar, java.lang.String str, java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        this.f462108h = mBRuntime;
        this.f462104d = eVar;
        this.f462105e = str;
        this.f462106f = obj;
        this.f462107g = imageDecodeConfig;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462108h.f48577a != 0) {
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462108h;
            mBRuntime.nativeNotifyImageDecoded(mBRuntime.f48577a, this.f462105e, this.f462106f, this.f462107g);
            return;
        }
        e8.e eVar = this.f462104d;
        java.lang.Object obj = this.f462106f;
        ((d8.c) eVar).getClass();
        if (obj != null) {
            ((com.github.henryye.nativeiv.bitmap.IBitmap) obj).recycle();
        }
    }
}
