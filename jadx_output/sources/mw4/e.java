package mw4;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f331763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ipcinvoker.r rVar) {
        super(1);
        this.f331763d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.ipcinvoker.r rVar = this.f331763d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(path));
        }
        return jz5.f0.f302826a;
    }
}
