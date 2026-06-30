package ra4;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.plugin.sns.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.animation.Animation f393547d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Animation f393548e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f393549f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f393550g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f393551h;

    public b(android.content.Context context, com.tencent.mm.plugin.sns.ui.listener.i iVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        new java.util.HashMap();
        this.f393549f = new java.util.HashMap();
        this.f393550g = new java.util.HashSet();
        this.f393551h = new java.util.HashMap();
        com.tencent.mm.plugin.sns.model.l4.vj().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.tencent.mm.plugin.sns.model.l4.vj().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        this.f393547d = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f393547d = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477758an);
        this.f393548e = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f393548e = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477759ao);
    }

    @Override // com.tencent.mm.plugin.sns.model.g1
    public void a(int i17, java.lang.String str, long j17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
        if (z17) {
            java.util.HashSet hashSet = this.f393550g;
            boolean contains = hashSet.contains(java.lang.Long.valueOf(j17));
            java.util.Map map = this.f393549f;
            if (contains) {
                java.util.HashMap hashMap = this.f393551h;
                if (hashMap.containsKey(java.lang.Long.valueOf(j17)) ? ((java.lang.Boolean) hashMap.get(java.lang.Long.valueOf(j17))).booleanValue() : false) {
                    ra4.a aVar = (ra4.a) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17));
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }
            ((java.util.HashMap) map).remove(java.lang.Long.valueOf(j17));
            hashSet.remove(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
    }

    @Override // com.tencent.mm.plugin.sns.model.g1
    public void b(int i17, java.lang.String str, long j17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
    }
}
