package u71;

/* loaded from: classes2.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final u71.c f425091a = new u71.c();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.wechat.aff.IlinkAuthKeeper ilinkAuthKeeper = com.tencent.wechat.aff.IlinkAuthKeeper.getInstance();
        com.tencent.mm.protobuf.g gVar = ((r45.c6) fVar.f70618d).f371300d;
        kotlin.jvm.internal.o.d(gVar);
        ilinkAuthKeeper.notifyGetAuthCodeComplete(i18, gVar.i());
        return jz5.f0.f302826a;
    }
}
