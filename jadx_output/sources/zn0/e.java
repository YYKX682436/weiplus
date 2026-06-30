package zn0;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn0.i f474331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig f474332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, zn0.i iVar, com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        super(2);
        this.f474330d = str;
        this.f474331e = iVar;
        this.f474332f = tRTCTranscodingConfig;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List configList = (java.util.List) obj;
        java.util.LinkedList userList = (java.util.LinkedList) obj2;
        kotlin.jvm.internal.o.g(configList, "configList");
        kotlin.jvm.internal.o.g(userList, "userList");
        int i17 = 0;
        for (java.lang.Object obj3 : configList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            zn0.v vVar = (zn0.v) obj3;
            vVar.f474411i = this.f474330d;
            com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) kz5.n0.a0(userList, vVar.f474413n - 1);
            if (tRTCMixUser != null) {
                java.lang.String str = vVar.f474406d;
                tRTCMixUser.userId = str;
                tRTCMixUser.streamType = vVar.f474407e;
                tRTCMixUser.pureAudio = true;
                zn0.g0 i19 = this.f474331e.f474352b.i(str, 0);
                if (i19 != null) {
                    tRTCMixUser.pureAudio = i19.f474348c;
                }
                this.f474332f.mixUsers.add(tRTCMixUser);
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
