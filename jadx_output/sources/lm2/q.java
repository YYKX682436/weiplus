package lm2;

/* loaded from: classes3.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.s f319432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f319434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319437i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lm2.s sVar, boolean z17, com.tencent.mm.protobuf.g gVar, java.util.List list, java.util.List list2, java.util.List list3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319432d = sVar;
        this.f319433e = z17;
        this.f319434f = gVar;
        this.f319435g = list;
        this.f319436h = list2;
        this.f319437i = list3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm2.q(this.f319432d, this.f319433e, this.f319434f, this.f319435g, this.f319436h, this.f319437i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lm2.q qVar = (lm2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd A[LOOP:5: B:72:0x019c->B:80:0x01cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7 A[EDGE_INSN: B:81:0x01d7->B:82:0x01d7 BREAK  A[LOOP:5: B:72:0x019c->B:80:0x01cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027c A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
