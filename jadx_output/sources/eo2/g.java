package eo2;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eo2.i f255568d;

    public g(eo2.i iVar) {
        this.f255568d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/MemberActionBarUIC$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eo2.i iVar = this.f255568d;
        if (!iVar.getActivity().isFinishing()) {
            iVar.getActivity().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/MemberActionBarUIC$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
