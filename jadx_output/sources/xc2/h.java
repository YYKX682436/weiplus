package xc2;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.j f453145d;

    public h(xc2.j jVar) {
        this.f453145d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "doPreload");
        this.f453145d.l();
    }
}
