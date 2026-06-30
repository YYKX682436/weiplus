package tt2;

/* loaded from: classes2.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f421940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f421941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f421940d = hVar;
        this.f421941e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.j0(this.f421940d, continuation, this.f421941e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        tt2.j0 j0Var = (tt2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protobuf.g byteString = ((r45.nd2) ((xg2.i) this.f421940d).f454393b).getByteString(1);
        if (byteString != null) {
            r45.ju1 ju1Var = new r45.ju1();
            try {
                ju1Var.parseFrom(byteString.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                ju1Var = null;
            }
            this.f421941e.f310123d = ju1Var;
        }
        return jz5.f0.f302826a;
    }
}
