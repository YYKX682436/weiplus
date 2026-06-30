package sb4;

/* loaded from: classes4.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f405443d;

    public a0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f405443d = snsInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$4");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f405443d;
        if (snsInfo != null) {
            long j17 = snsInfo.field_snsId;
            if (!sb4.z.a().containsKey(java.lang.Long.valueOf(j17))) {
                sb4.e0 e0Var = new sb4.e0();
                if (snsInfo.getTimeLine() != null && snsInfo.getTimeLine().ContentObj != null && snsInfo.isPhoto() && snsInfo.getTimeLine().ContentObj.f369840h != null && snsInfo.getTimeLine().ContentObj.f369840h.size() > 0) {
                    e0Var.f405482a = snsInfo.getTimeLine().ContentObj.f369840h.size();
                    e0Var.f405483b = new java.util.HashSet();
                    e0Var.f405484c = new java.util.HashSet();
                    e0Var.f405485d = new java.util.HashSet();
                    e0Var.f405486e = new java.util.HashSet();
                    e0Var.f405489h = snsInfo.getTimeLine().Id;
                    e0Var.f405494m = snsInfo.getTimeLine().showFlag;
                    try {
                        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
                        e0Var.f405492k = e17.LikeCount;
                        e0Var.f405493l = e17.CommentCount;
                    } catch (java.lang.Exception unused) {
                        e0Var.f405492k = 0;
                        e0Var.f405493l = 0;
                    }
                    try {
                        gm0.j1.i();
                        e0Var.f405491j = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(snsInfo.getUserName());
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        gm0.j1.i();
                        e0Var.f405490i = (currentTimeMillis - ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(snsInfo.getUserName())) / 1000;
                    } catch (java.lang.Exception unused2) {
                        e0Var.f405491j = 0;
                        e0Var.f405490i = 0L;
                    }
                    sb4.z.a().put(java.lang.Long.valueOf(j17), e0Var);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$4");
    }
}
