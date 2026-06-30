package dd5;

/* loaded from: classes4.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f229095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229095d = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dd5.b3(this.f229095d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        com.tencent.mm.storage.f9 f9Var = this.f229095d;
        java.lang.String tj6 = ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        android.database.Cursor Ai = ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).Ai(f9Var.z0(), new java.lang.String[]{"videolength"});
        if (Ai != null) {
            try {
                r2 = Ai.moveToFirst() ? Ai.getInt(0) : 0;
                vz5.b.a(Ai, null);
            } finally {
            }
        }
        return new jz5.l(tj6, new java.lang.Integer(r2));
    }
}
