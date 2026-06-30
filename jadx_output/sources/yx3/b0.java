package yx3;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.y f467893d;

    public b0(yx3.y yVar) {
        this.f467893d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx3.y yVar = this.f467893d;
        if (yVar != null) {
            yVar.onStart();
        }
    }
}
