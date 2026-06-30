package gm0;

/* loaded from: classes5.dex */
public class q extends com.tencent.mm.network.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.y f273266d;

    public q(gm0.y yVar) {
        this.f273266d = yVar;
    }

    @Override // com.tencent.mm.network.e0
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "callback, kv:%s", str);
        this.f273266d.getClass();
        com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent networkDiagnoseResultEvent = new com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent();
        am.zk zkVar = networkDiagnoseResultEvent.f54528g;
        zkVar.f8574a = i17;
        zkVar.f8575b = i18;
        zkVar.f8576c = z17;
        zkVar.f8577d = str;
        networkDiagnoseResultEvent.e();
    }
}
