package yw;

/* loaded from: classes4.dex */
public final class b1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.b1 f466280a = new yw.b1();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetUserContactListResp");
            java.util.LinkedList<r45.q80> contact_list = ((r45.kq3) fVar2).f378901d;
            kotlin.jvm.internal.o.f(contact_list, "contact_list");
            for (r45.q80 q80Var : contact_list) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(q80Var.f383754d, true);
                if (n17 != null) {
                    n17.u1(q80Var.f383755e);
                }
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                yw.h1 h1Var = yw.h1.f466332a;
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed update contact:" + q80Var.f383754d + " createtime:" + q80Var.f383755e);
            }
            yw.h1.f466332a.m().B("key_biz_fetch_contact_create_time_fetch_last_time", com.tencent.mm.sdk.platformtools.t8.i1());
        } else {
            yw.h1 h1Var2 = yw.h1.f466332a;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed error:" + fVar.f70615a + ' ' + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
