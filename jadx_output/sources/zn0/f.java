package zn0;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f474333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TRTCCloudDef.TRTCMixUser f474334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn0.i f474335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.LinkedList linkedList, com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser, zn0.i iVar) {
        super(1);
        this.f474333d = linkedList;
        this.f474334e = tRTCMixUser;
        this.f474335f = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0) {
            java.util.LinkedList linkedList = this.f474333d;
            if (intValue < linkedList.size()) {
                int i17 = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(intValue)).f215699x;
                com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser = this.f474334e;
                tRTCMixUser.f215699x = i17;
                tRTCMixUser.f215700y = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(intValue)).f215700y;
                tRTCMixUser.width = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(intValue)).width;
                tRTCMixUser.height = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(intValue)).height;
                ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(intValue)).userId = this.f474335f.f474354d;
                ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(intValue)).zOrder = intValue + 1;
            }
        }
        return jz5.f0.f302826a;
    }
}
