package dw3;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f244234d;

    public m(ct0.b bVar) {
        this.f244234d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "deleteDaemonMediaFile");
        dw3.c0 c0Var = dw3.c0.f244182a;
        ct0.b bVar = this.f244234d;
        c0Var.j(bVar.f222209f);
        c0Var.j(bVar.f222210g);
    }
}
