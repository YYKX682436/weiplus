package q10;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359505d;

    public e(java.lang.String str) {
        this.f359505d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.b0.e(this.f359505d);
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Upload failed! Error copied to clipboard", 0).show();
    }
}
