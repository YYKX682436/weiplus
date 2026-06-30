package tv2;

/* loaded from: classes2.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv2.m f422313a;

    public k(tv2.m mVar) {
        this.f422313a = mVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        tv2.m mVar = this.f422313a;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((r45.fg2) fVar.f70618d).f374306d;
        tv2.m.k(mVar, i17, i18, str, finderObject != null ? finderObject.getId() : 0L);
        return jz5.f0.f302826a;
    }
}
