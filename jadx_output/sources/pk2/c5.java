package pk2;

/* loaded from: classes3.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355606d;

    /* renamed from: e, reason: collision with root package name */
    public int f355607e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f355608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.h5 f355609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355610h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f355611i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355612m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(pk2.h5 h5Var, android.view.View view, boolean z17, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355609g = h5Var;
        this.f355610h = view;
        this.f355611i = z17;
        this.f355612m = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.c5 c5Var = new pk2.c5(this.f355609g, this.f355610h, this.f355611i, this.f355612m, continuation);
        c5Var.f355608f = ((java.lang.Boolean) obj).booleanValue();
        return c5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.c5) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355607e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355608f;
            qk2.f.f(this.f355609g, false, 1, null);
            android.view.View view = this.f355610h;
            int i18 = (z17 && this.f355611i) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pk2.o9 o9Var = this.f355612m;
            this.f355606d = o9Var;
            this.f355608f = z17;
            this.f355607e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(8, !z17, true, new pk2.b5(z17, o9Var, new v65.n(rVar)));
            obj = rVar.j();
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
