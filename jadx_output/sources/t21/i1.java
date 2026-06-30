package t21;

/* loaded from: classes12.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.l1 f414793e;

    public i1(t21.l1 l1Var, java.lang.String str) {
        this.f414793e = l1Var;
        this.f414792d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.l1 l1Var = this.f414793e;
        t21.w0 w0Var = l1Var.f414831a;
        java.lang.String str = this.f414792d;
        if (w0Var.K(str).equals(str)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(l1Var.f414831a.K(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "delete thumbPath %s", str);
    }
}
