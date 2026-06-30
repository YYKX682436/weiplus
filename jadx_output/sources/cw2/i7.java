package cw2;

/* loaded from: classes15.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f223773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, int i17, yz5.a aVar) {
        super(1);
        this.f223771d = finderThumbPlayerProxy;
        this.f223772e = i17;
        this.f223773f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.HashSet hashSet = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
            int i17 = this.f223772e;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223771d;
            finderThumbPlayerProxy.L = i17;
            finderThumbPlayerProxy.P = false;
            android.os.ConditionVariable conditionVariable = finderThumbPlayerProxy.H1;
            if (conditionVariable != null) {
                conditionVariable.open();
            }
        } else {
            java.util.HashSet hashSet2 = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
            com.tencent.mars.xlog.Log.e("FTPP.FinderThumbPlayerProxy", "Failed to init post processor");
            this.f223773f.invoke();
        }
        return jz5.f0.f302826a;
    }
}
