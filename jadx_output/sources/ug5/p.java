package ug5;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427639d;

    public p(ug5.v vVar) {
        this.f427639d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ug5.v vVar = this.f427639d;
        if (vVar.f427662e) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "fallback to exec completed. ");
        vVar.b(true);
    }
}
