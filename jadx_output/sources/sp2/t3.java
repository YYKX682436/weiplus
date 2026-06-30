package sp2;

/* loaded from: classes2.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f411223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f411224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ja2 f411225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(sp2.x3 x3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, r45.ja2 ja2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411222d = x3Var;
        this.f411223e = arrayList;
        this.f411224f = arrayList2;
        this.f411225g = ja2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.t3(this.f411222d, this.f411223e, this.f411224f, this.f411225g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sp2.t3 t3Var = (sp2.t3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f A[LOOP:4: B:98:0x01a9->B:130:0x021f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223 A[EDGE_INSN: B:131:0x0223->B:132:0x0223 BREAK  A[LOOP:4: B:98:0x01a9->B:130:0x021f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03dc A[EDGE_INSN: B:305:0x03dc->B:306:0x03dc BREAK  A[LOOP:14: B:292:0x03ad->B:313:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[LOOP:14: B:292:0x03ad->B:313:?, LOOP_END, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
