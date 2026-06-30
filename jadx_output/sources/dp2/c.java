package dp2;

/* loaded from: classes2.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f242189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242190b;

    public c(long j17, java.lang.String str) {
        this.f242189a = j17;
        this.f242190b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        dp2.e.f242193b = false;
        int i17 = fVar.f70615a;
        long j17 = this.f242189a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject fetch time:" + (java.lang.System.currentTimeMillis() - dp2.e.f242195d));
                dp2.e.f242194c.put(dp2.e.f242192a.f(j17, this.f242190b), finderObject);
            }
            dp2.e eVar = dp2.e.f242192a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 != null) {
                j17 = finderObject2.getId();
            }
            dp2.e.b(eVar, j17, (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2));
        } else {
            dp2.e.b(dp2.e.f242192a, j17, null);
        }
        return jz5.f0.f302826a;
    }
}
