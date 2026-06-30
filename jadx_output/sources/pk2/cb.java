package pk2;

/* loaded from: classes3.dex */
public final class cb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(pk2.o9 o9Var) {
        super(1);
        this.f355639d = o9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nw1 liveInfo;
        if (((java.lang.Boolean) obj).booleanValue()) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f328076q;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("share_scene", java.lang.String.valueOf(zl2.r4.f473950a.Z0()));
            pk2.o9 o9Var = this.f355639d;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            hashMap.put("liveid", pm0.v.u((finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0)));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            hashMap.put("feedid", pm0.v.u(finderObject2 != null ? finderObject2.getId() : 0L));
            zy2.zb.I8(zbVar, u1Var, hashMap, null, null, null, null, false, 124, null);
        }
        return jz5.f0.f302826a;
    }
}
