package yk2;

/* loaded from: classes3.dex */
public abstract class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f462791d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lk2 f462792e;

    public g(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f462791d = root;
        root.setOnClickListener(this);
        root.setVisibility(c());
    }

    public void a(r45.lk2 response) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
    }

    public final java.lang.String b() {
        java.lang.String num;
        android.content.Context context = this.f462791d.getContext();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        return (mMFinderUI == null || (num = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) ? "" : num;
    }

    public abstract int c();

    public abstract void d();

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/personal/LivePersonalItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f462791d.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/personal/LivePersonalItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
