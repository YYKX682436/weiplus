package oh5;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh5.i f345494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f345495e;

    public f(oh5.i iVar, android.content.Intent intent) {
        this.f345494d = iVar;
        this.f345495e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (oh5.i.f345498d.e(true)) {
            pm0.v.X(new oh5.e(this.f345494d, this.f345495e));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixMemoryHookResultHelper", "skip start ui, no leak now");
        }
    }
}
