package n74;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b f335454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n74.b1 f335455e;

    public z0(n74.b1 b1Var, ca4.b bVar) {
        this.f335455e = b1Var;
        this.f335454d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ca4.b bVar = this.f335454d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$1");
        try {
            java.lang.String str = bVar.f39825g;
            n74.b1 b1Var = this.f335455e;
            if (str != null) {
                n74.b1.a(b1Var).adExtTailWording = bVar.f39825g;
            }
            n74.b1.a(b1Var).adExtTailWordingExchangeValue = bVar.f39826h;
            com.tencent.mars.xlog.Log.i("DynamicDataReqHelper", "adExtTailWordingExchangeValue: " + n74.b1.a(b1Var).adExtTailWordingExchangeValue + ", adExtTailWording: " + n74.b1.a(b1Var).adExtTailWording + "，adInfo hashcode: " + n74.b1.a(b1Var).hashCode());
            if (bVar.f39821c != null) {
                n74.b1.a(b1Var).adActionExtTailLink = bVar.f39821c;
            }
            n74.b1.a(b1Var).adActionExtTailType = bVar.f39819a;
            if (bVar.f39822d.size() > 0) {
                n74.b1.a(b1Var).adActionExtUserList.clear();
                n74.b1.a(b1Var).adActionExtUserList.addAll(bVar.f39822d);
            }
            if (bVar.f39820b != null) {
                n74.b1.a(b1Var).adActionExtTailWording = bVar.f39820b;
            }
            if (bVar.f39823e != null) {
                n74.b1.a(b1Var).adActionExtTailUserDisplayName = bVar.f39823e;
            }
            if (bVar.f39824f != null) {
                n74.b1.a(b1Var).adActionExtTailFormattedWording = bVar.f39824f;
            }
            com.tencent.mars.xlog.Log.i("DynamicDataReqHelper", "adActionExtTailWording: " + n74.b1.a(b1Var).adActionExtTailWording + "，adInfo hashcode: " + n74.b1.a(b1Var).hashCode());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$1");
    }
}
