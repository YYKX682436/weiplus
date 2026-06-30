package ku3;

/* loaded from: classes3.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(ku3.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312304d = n2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.l2(this.f312304d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.l2 l2Var = (ku3.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.n2 n2Var = this.f312304d;
        n2Var.b().setVisibility(4);
        android.view.View a17 = n2Var.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin$showPermissionAfterHint$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin$showPermissionAfterHint$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
