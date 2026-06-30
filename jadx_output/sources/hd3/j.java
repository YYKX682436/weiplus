package hd3;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f280560e;

    public j(java.lang.String str, long j17) {
        this.f280559d = str;
        this.f280560e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.b0.e("heap snapshot path: " + this.f280559d);
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Heap snapshot saved! Path copied to clipboard, size=" + this.f280560e, 1).show();
    }
}
