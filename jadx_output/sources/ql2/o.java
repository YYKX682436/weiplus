package ql2;

/* loaded from: classes10.dex */
public final class o implements zy2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql2.r f364535a;

    public o(ql2.r rVar) {
        this.f364535a = rVar;
    }

    @Override // zy2.k5
    public void a(int i17, int i18, java.lang.String str, r45.z61 resp) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 != 0 || i18 != 0 || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1)) == null || (liveInfo = finderObject.getLiveInfo()) == null) {
            return;
        }
        ql2.r rVar = this.f364535a;
        rVar.f364543f.put(pm0.v.u(liveInfo.getLong(0)), liveInfo);
        if (rVar.f364544g == 1) {
            rVar.o();
        }
    }
}
