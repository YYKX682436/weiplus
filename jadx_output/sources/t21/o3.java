package t21;

/* loaded from: classes3.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414857e;

    public o3(t21.p3 p3Var, java.lang.String str, int i17) {
        this.f414856d = str;
        this.f414857e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f414857e;
        java.lang.String str = this.f414856d;
        t21.d3.E(str, i17);
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null || h17.f415011i == 199) {
            return;
        }
        if (h17.j()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "start complete online video");
            t21.d3.K(str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "start complete offline video");
            t21.d3.L(str);
        }
    }
}
