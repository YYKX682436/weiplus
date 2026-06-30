package f93;

/* loaded from: classes3.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f260367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(f93.p5 p5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260367d = p5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f93.j5(this.f260367d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f93.j5 j5Var = (f93.j5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        f93.p5 p5Var = this.f260367d;
        p5Var.f260429u.append((java.lang.CharSequence) (" (" + p5Var.A.size() + ')'));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) p5Var.f260432x).getValue();
        if (textView != null) {
            textView.setText(p5Var.f260429u);
        }
        android.view.View view = (android.view.View) ((jz5.n) p5Var.f260431w).getValue();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/LabelDetailDialog$initView$2$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/LabelDetailDialog$initView$2$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((f93.e5) ((jz5.n) p5Var.B).getValue()).notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
