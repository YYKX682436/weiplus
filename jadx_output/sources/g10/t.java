package g10;

/* loaded from: classes.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267550d;

    public t(java.lang.String str) {
        this.f267550d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "download failed with reason " + this.f267550d, 1).show();
    }
}
