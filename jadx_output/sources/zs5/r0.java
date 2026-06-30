package zs5;

/* loaded from: classes15.dex */
public class r0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zs5.u0 f475468a;

    public r0(zs5.u0 u0Var) {
        this.f475468a = u0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "onEnterForeground");
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "onExitForeground");
        this.f475468a.e();
    }
}
