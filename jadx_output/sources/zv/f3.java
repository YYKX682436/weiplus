package zv;

/* loaded from: classes10.dex */
public final class f3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475968a;

    public f3(java.lang.String str) {
        this.f475968a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && finderObject != null && finderObject.getLiveInfo() != null) {
            vw.r rVar = (vw.r) i95.n0.c(vw.r.class);
            rVar.getClass();
            java.lang.String exportId = this.f475968a;
            kotlin.jvm.internal.o.g(exportId, "exportId");
            rVar.f440723d.put(exportId, finderObject);
        }
        return jz5.f0.f302826a;
    }
}
