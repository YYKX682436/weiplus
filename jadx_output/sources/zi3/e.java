package zi3;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi3.f f473167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cv.v0 f473168e;

    public e(zi3.f fVar, cv.v0 v0Var) {
        this.f473167d = fVar;
        this.f473168e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.Toast toast = this.f473167d.f473179t;
        if (toast != null) {
            toast.cancel();
        }
        this.f473167d.f473179t = db5.t7.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f492579m21, this.f473168e.f222517b));
        android.widget.Toast toast2 = this.f473167d.f473179t;
        if (toast2 != null) {
            toast2.show();
        }
    }
}
