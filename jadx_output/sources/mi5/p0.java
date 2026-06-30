package mi5;

/* loaded from: classes9.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l15.c f326896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context, l15.c cVar) {
        super(1);
        this.f326895d = context;
        this.f326896e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c it = (a11.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = it.f504a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ChattingUrlView$onUpdateViewModel$1$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/msgviewfactory/view/ChattingUrlView$onUpdateViewModel$1$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        te5.t tVar = te5.t.f418749a;
        android.content.Context context = this.f326895d;
        kotlin.jvm.internal.o.f(context, "$context");
        l15.c cVar = this.f326896e;
        tVar.l(context, it, te5.u.a(cVar, context));
        tVar.m(context, it, te5.u.b(cVar));
        return jz5.f0.f302826a;
    }
}
