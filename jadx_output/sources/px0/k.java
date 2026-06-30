package px0;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d01 f358784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r45.d01 d01Var, com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358784d = d01Var;
        this.f358785e = materialImportPreviewFragment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px0.k(this.f358784d, this.f358785e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        px0.k kVar = (px0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnAIGCTaskCreate ");
        r45.d01 d01Var = this.f358784d;
        sb6.append(d01Var.getString(1));
        sb6.append(" showLongWaitButton:");
        sb6.append(d01Var.getInteger(5));
        sb6.append(" waitTime:");
        sb6.append(d01Var.getInteger(6));
        com.tencent.mars.xlog.Log.i("MaterialImportPreviewFragment", sb6.toString());
        boolean z17 = d01Var.getInteger(5) > 0;
        java.lang.String string = d01Var.getString(1);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358785e;
        materialImportPreviewFragment.f69655s = string;
        android.view.View view = (android.view.View) materialImportPreviewFragment.f69647h.getValue();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$handleOnAIGCTaskCreate$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$handleOnAIGCTaskCreate$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            kotlinx.coroutines.l.d(materialImportPreviewFragment.f69643d, null, null, new px0.j(materialImportPreviewFragment, d01Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
