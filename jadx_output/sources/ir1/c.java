package ir1;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.d f293942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293943e;

    public c(ir1.d dVar, android.view.View view, int i17) {
        this.f293942d = dVar;
        this.f293943e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f293942d.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
