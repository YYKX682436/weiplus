package mn2;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330165d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f330166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f330168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cp0.n f330169h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kotlin.jvm.internal.h0 h0Var, android.graphics.Bitmap bitmap, cp0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330167f = h0Var;
        this.f330168g = bitmap;
        this.f330169h = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mn2.y0 y0Var = new mn2.y0(this.f330167f, this.f330168g, this.f330169h, continuation);
        y0Var.f330166e = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mn2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330165d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f330166e;
            u26.w a17 = u26.z.a(0, null, null, 7, null);
            um5.p pVar = new um5.p();
            android.graphics.Bitmap bitmap = this.f330168g;
            kotlin.jvm.internal.o.d(bitmap);
            pVar.l(bitmap);
            this.f330169h.getClass();
            int width = bitmap.getWidth();
            pVar.j(width, a06.d.b(((width * 1.0f) * bitmap.getHeight()) / bitmap.getWidth()));
            pVar.d();
            pVar.f429208q = new mn2.v0(pVar);
            pVar.f429193b.d();
            pVar.i(new mn2.x0(y0Var, a17, bitmap));
            kotlin.jvm.internal.h0 h0Var2 = this.f330167f;
            this.f330166e = h0Var2;
            this.f330165d = 1;
            java.lang.Object r17 = ((u26.k) a17).r(this);
            if (r17 == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            obj = r17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f330166e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        return jz5.f0.f302826a;
    }
}
