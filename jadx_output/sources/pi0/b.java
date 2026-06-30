package pi0;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint f354519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f354521i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f354522m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pi0.q qVar, android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.lang.String str, boolean z17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354517e = qVar;
        this.f354518f = context;
        this.f354519g = dartEntrypoint;
        this.f354520h = str;
        this.f354521i = z17;
        this.f354522m = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.b(this.f354517e, this.f354518f, this.f354519g, this.f354520h, this.f354521i, this.f354522m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354516d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.q qVar = this.f354517e;
            android.content.Context context = this.f354518f;
            io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = this.f354519g;
            java.lang.String str = this.f354520h;
            boolean z17 = this.f354521i;
            java.util.List list = this.f354522m;
            this.f354516d = 1;
            obj = qVar.c(context, dartEntrypoint, str, z17, list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
