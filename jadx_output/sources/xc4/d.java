package xc4;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xc4.p pVar) {
        super(0);
        this.f453353d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hm5.c cVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        com.tencent.mm.protocal.protobuf.SnsObject d17 = this.f453353d.d1();
        if (d17.LikeUserList.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<r45.e86> it = d17.LikeUserList.iterator();
            while (it.hasNext()) {
                r45.e86 next = it.next();
                com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(next.f373126d);
                str = "";
                if (f07 != null) {
                    str2 = f07.g2();
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String Q0 = f07.Q0();
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    java.lang.String G0 = f07.G0();
                    str3 = G0 != null ? G0 : "";
                    str = Q0;
                } else {
                    java.lang.String str4 = next.f373126d;
                    str2 = str4 == null ? "" : str4;
                    str3 = "";
                }
                arrayList.add(nm5.j.e(next.f373126d, str2, str, str3));
            }
            cVar = new hm5.c(arrayList, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        } else {
            hm5.c cVar2 = new hm5.c(new java.util.ArrayList(), null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
            cVar = cVar2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        return cVar;
    }
}
