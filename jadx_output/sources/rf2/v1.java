package rf2;

/* loaded from: classes10.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f394920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394922h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394923i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394924m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(rf2.c2 c2Var, rf2.d2 d2Var, java.lang.String str, android.widget.TextView textView, java.lang.String str2, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394919e = c2Var;
        this.f394920f = d2Var;
        this.f394921g = str;
        this.f394922h = textView;
        this.f394923i = str2;
        this.f394924m = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.v1(this.f394919e, this.f394920f, this.f394921g, this.f394922h, this.f394923i, this.f394924m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394918d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rf2.c2 c2Var = this.f394919e;
            rf2.d2 d2Var = this.f394920f;
            java.lang.String str = this.f394921g;
            android.widget.TextView textView = this.f394922h;
            java.lang.String str2 = this.f394923i;
            android.view.View view = this.f394924m;
            this.f394918d = 1;
            if (rf2.c2.a(c2Var, d2Var, str, textView, str2, view, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
