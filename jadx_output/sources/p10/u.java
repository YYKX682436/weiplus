package p10;

/* loaded from: classes.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351005d;

    public u(java.lang.String str) {
        this.f351005d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Heap snapshot script dispatched: " + this.f351005d, 0).show();
    }
}
