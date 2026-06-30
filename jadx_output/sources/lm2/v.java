package lm2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vr1 f319453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.h0 f319454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f319455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r45.vr1 vr1Var, lm2.h0 h0Var, com.tencent.mm.modelbase.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319453d = vr1Var;
        this.f319454e = h0Var;
        this.f319455f = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm2.v(this.f319453d, this.f319454e, this.f319455f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lm2.v vVar = (lm2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
