package t21;

/* loaded from: classes12.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.c1 f415070e;

    public z0(t21.c1 c1Var, java.lang.String str) {
        this.f415070e = c1Var;
        this.f415069d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.c1 c1Var = this.f415070e;
        t21.w0 w0Var = c1Var.f414719a;
        java.lang.String str = this.f415069d;
        if (w0Var.K(str).equals(str)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(c1Var.f414719a.K(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "delete thumbPath %s", str);
    }
}
