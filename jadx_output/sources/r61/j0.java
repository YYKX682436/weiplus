package r61;

/* loaded from: classes15.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f392888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.n0 f392889e;

    public j0(r61.n0 n0Var, int i17) {
        this.f392889e = n0Var;
        this.f392888d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/model/FriendAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r61.n0 n0Var = this.f392889e;
        int i17 = n0Var.f392915m;
        int i18 = this.f392888d;
        if (i17 == 1) {
            n0Var.f392914i[i18] = 1;
        } else if (i17 == 2) {
            n0Var.f392914i[i18] = 2;
        }
        n0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/model/FriendAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
