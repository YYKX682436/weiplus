package gx0;

/* loaded from: classes5.dex */
public final class af extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f276211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(gx0.bf bfVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276210d = bfVar;
        this.f276211e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.af(this.f276210d, this.f276211e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.af) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f276210d.f276256w != gx0.fd.f276432h) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar = this.f276210d;
        boolean booleanValue = ((java.lang.Boolean) kotlinx.coroutines.l.e(bfVar.f276252s, new gx0.ze(bfVar, null))).booleanValue();
        if (booleanValue) {
            yy0.m7 m7Var = (yy0.m7) this.f276210d.R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.m4(m7Var, null), 3, null);
        }
        if (!this.f276211e && booleanValue) {
            gx0.bf bfVar2 = this.f276210d;
            gx0.fd fdVar = gx0.fd.f276433i;
            bfVar2.f276256w = fdVar;
            bfVar2.f276254u.postValue(fdVar);
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}
