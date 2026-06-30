package e0;

/* loaded from: classes14.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f245536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f245537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e0.f1 f1Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245535d = f1Var;
        this.f245536e = i17;
        this.f245537f = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e0.d1(this.f245535d, this.f245536e, this.f245537f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        e0.d1 d1Var = (e0.d1) create((b0.p2) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        e0.f1 f1Var = this.f245535d;
        e0.z0 z0Var = f1Var.f245575a;
        z0Var.a(this.f245536e, this.f245537f);
        z0Var.f245735f = null;
        e0.q qVar = (e0.q) ((n0.q4) f1Var.f245586l).getValue();
        if (qVar != null) {
            ((java.util.LinkedHashMap) qVar.f245671c).clear();
            qVar.f245672d = kz5.q0.f314001d;
            qVar.f245673e = -1;
            qVar.f245674f = 0;
            qVar.f245675g = -1;
            qVar.f245676h = 0;
        }
        s1.r1 r1Var = f1Var.f245584j;
        if (r1Var != null) {
            ((u1.w) r1Var).h();
        }
        return jz5.f0.f302826a;
    }
}
