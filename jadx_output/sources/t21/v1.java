package t21;

/* loaded from: classes12.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.w1 f414998e;

    public v1(t21.w1 w1Var, java.lang.String str) {
        this.f414998e = w1Var;
        this.f414997d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.w1 w1Var = this.f414998e;
        t21.u1 u1Var = w1Var.f415055a;
        java.lang.String str = this.f414997d;
        if (u1Var.I(str).equals(str)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(w1Var.f415055a.I(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "delete thumbPath %s", str);
    }
}
