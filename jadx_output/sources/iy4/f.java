package iy4;

/* loaded from: classes11.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iy4.g f295959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f295960b;

    public f(iy4.g gVar, long j17) {
        this.f295959a = gVar;
        this.f295960b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        long j17 = this.f295960b;
        iy4.g gVar = this.f295959a;
        if (fVar == null) {
            com.tencent.wechat.aff.ext_device.e eVar = gVar.f295963b;
            if (eVar != null) {
                eVar.W(j17, -1, "result is null");
                return f0Var;
            }
        } else {
            com.tencent.wechat.aff.ext_device.e eVar2 = gVar.f295963b;
            if (eVar2 != null) {
                int i17 = fVar.f70616b;
                java.lang.String str = fVar.f70617c;
                if (str == null) {
                    str = "";
                }
                eVar2.W(j17, i17, str);
                return f0Var;
            }
        }
        return null;
    }
}
