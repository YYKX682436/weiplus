package sc3;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406499d;

    public m(java.lang.String str) {
        this.f406499d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "frame capture succeed", 1).show();
        com.tencent.mm.sdk.platformtools.b0.e("cpu profile path: " + this.f406499d);
    }
}
