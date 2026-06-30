package vw;

@j95.b
/* loaded from: classes9.dex */
public final class b extends i95.w implements rv.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f440590d = jz5.h.b(vw.a.f440582d);

    public void Ai(int i17, java.lang.String frameSetName, java.lang.String frameSetData) {
        com.tencent.wechat.mm.biz.b1 b17;
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        if (yw.h1.f466332a.n() && (b17 = yw.q3.f466437a.b()) != null) {
            b17.c(i17, frameSetName, frameSetData);
        }
    }

    public java.util.List wi(int i17) {
        java.util.LinkedList<com.tencent.wechat.mm.biz.q3> linkedList;
        if (!yw.h1.f466332a.n()) {
            return new java.util.LinkedList();
        }
        com.tencent.wechat.mm.biz.b1 b17 = yw.q3.f466437a.b();
        com.tencent.wechat.mm.biz.r3 b18 = b17 != null ? b17.b(i17) : null;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (b18 != null && (linkedList = b18.f218522d) != null) {
            for (com.tencent.wechat.mm.biz.q3 q3Var : linkedList) {
                long j17 = q3Var.f218486d;
                boolean[] zArr = q3Var.f218492m;
                java.lang.String str = zArr[2] ? q3Var.f218487e : "";
                kotlin.jvm.internal.o.f(str, "getFrameSetName(...)");
                java.lang.String str2 = zArr[3] ? q3Var.f218488f : "";
                kotlin.jvm.internal.o.f(str2, "getFrameSetData(...)");
                int i18 = q3Var.f218489g;
                java.lang.String str3 = zArr[5] ? q3Var.f218490h : "";
                kotlin.jvm.internal.o.f(str3, "getCardId(...)");
                linkedList2.add(new r01.l(j17, str, str2, i18, str3, q3Var.f218491i));
            }
        }
        return linkedList2;
    }
}
