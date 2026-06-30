package g42;

/* loaded from: classes13.dex */
public class b extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g42.f f268713d;

    public b(g42.f fVar) {
        this.f268713d = fVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (g42.i.h()) {
            com.tencent.mars.xlog.Log.e("EdgeComputingMgr", "[onAppBackground]");
            g42.f fVar = this.f268713d;
            fVar.f268729o.removeMessages(1004);
            fVar.f268729o.sendEmptyMessageDelayed(1004, 1000L);
            fVar.f268729o.removeMessages(1001);
            fVar.f268729o.sendEmptyMessageDelayed(1001, 1000L);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (g42.i.h()) {
            com.tencent.mars.xlog.Log.e("EdgeComputingMgr", "[onAppForeground]");
            g42.f fVar = this.f268713d;
            fVar.f268729o.removeMessages(1004);
            fVar.f268729o.removeMessages(1001);
        }
    }
}
