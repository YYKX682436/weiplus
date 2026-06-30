package j00;

/* loaded from: classes9.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ecs.EcsGiftStatusInfoForUpdate f296791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296793f;

    public i1(com.tencent.pigeon.ecs.EcsGiftStatusInfoForUpdate ecsGiftStatusInfoForUpdate, java.lang.String str, j00.k1 k1Var) {
        this.f296791d = ecsGiftStatusInfoForUpdate;
        this.f296792e = str;
        this.f296793f = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateEcsGiftMsgStatus, status:");
        com.tencent.pigeon.ecs.EcsGiftStatusInfoForUpdate ecsGiftStatusInfoForUpdate = this.f296791d;
        sb6.append(ecsGiftStatusInfoForUpdate.getStatus());
        sb6.append(", wording:");
        sb6.append(ecsGiftStatusInfoForUpdate.getStatusWording());
        sb6.append(", version:");
        sb6.append(ecsGiftStatusInfoForUpdate.getStatusVersion());
        sb6.append(", style:");
        sb6.append(ecsGiftStatusInfoForUpdate.getStatusStyle());
        sb6.append(", detail wording:");
        sb6.append(ecsGiftStatusInfoForUpdate.getDetailStatusWording());
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", sb6.toString());
        if (ecsGiftStatusInfoForUpdate.getStatus() == null || ecsGiftStatusInfoForUpdate.getStatusStyle() == null || ecsGiftStatusInfoForUpdate.getStatusVersion() == null || ecsGiftStatusInfoForUpdate.getStatusWording() == null || ecsGiftStatusInfoForUpdate.getDetailStatusWording() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus failed");
            return;
        }
        n00.f a17 = n00.d.f333815a.a();
        java.lang.String str = this.f296792e;
        n00.e y07 = a17.y0(str);
        long j17 = y07.field_msgLocalId;
        java.lang.String str2 = y07.field_talkerUserName;
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k17 = e0Var.k(str2, j17);
        if (k17 != null) {
            l15.c cVar = new l15.c();
            java.lang.String j18 = k17.j();
            if (j18 == null) {
                j18 = "";
            }
            cVar.fromXml(j18);
            v05.b k18 = cVar.k();
            w05.d dVar = k18 != null ? (w05.d) k18.getCustom(k18.f432315e + 66) : null;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, ecsGiftAppMsgInfo is null");
                return;
            }
            if (dVar.s().size() <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, gift app msg gift list size is empty");
                return;
            }
            w05.e eVar = (w05.e) dVar.s().get(0);
            java.lang.Long status = ecsGiftStatusInfoForUpdate.getStatus();
            kotlin.jvm.internal.o.d(status);
            eVar.z(status.longValue());
            w05.e eVar2 = (w05.e) dVar.s().get(0);
            java.lang.Long statusVersion = ecsGiftStatusInfoForUpdate.getStatusVersion();
            kotlin.jvm.internal.o.d(statusVersion);
            eVar2.B(statusVersion.longValue());
            w05.e eVar3 = (w05.e) dVar.s().get(0);
            java.lang.Long statusStyle = ecsGiftStatusInfoForUpdate.getStatusStyle();
            kotlin.jvm.internal.o.d(statusStyle);
            eVar3.A(statusStyle.longValue());
            w05.e eVar4 = (w05.e) dVar.s().get(0);
            java.lang.String statusWording = ecsGiftStatusInfoForUpdate.getStatusWording();
            kotlin.jvm.internal.o.d(statusWording);
            eVar4.C(statusWording);
            w05.e eVar5 = (w05.e) dVar.s().get(0);
            java.lang.String detailStatusWording = ecsGiftStatusInfoForUpdate.getDetailStatusWording();
            kotlin.jvm.internal.o.d(detailStatusWording);
            eVar5.y(detailStatusWording);
            java.lang.String xml = cVar.toXml(false);
            j00.k1 k1Var = this.f296793f;
            k17.d1(k1Var.hj(k17, xml));
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, giftMsgId:" + str);
            com.tencent.mm.storage.f9 k19 = e0Var.k(str2, j17);
            if (k19 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, gift app msg gift list size is empty");
                return;
            }
            if (!k1Var.Ni(k19, k17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, update failed");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, update msg by id: " + ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(k17.getMsgId(), k17, true));
        }
    }
}
