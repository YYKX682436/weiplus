package io;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf5.c f293409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ em.w0 f293410e;

    public i(mf5.c cVar, em.w0 w0Var) {
        this.f293409d = cVar;
        this.f293410e = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingFunctionGuideItemView$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, viewModel: ");
        mf5.c cVar = this.f293409d;
        sb6.append(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFunctionGuideItemView", sb6.toString());
        java.lang.String str = cVar.f326181f;
        if (str != null) {
            if (!(r26.n0.u0(str).toString().length() > 0)) {
                str = null;
            }
            if (str != null) {
                bc0.i iVar = (bc0.i) i95.n0.c(bc0.i.class);
                android.content.Context context = this.f293410e.f254883a.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((qv.c0) iVar).bj(context, str, null);
                yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingFunctionGuideItemView$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingFunctionGuideItemView$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
