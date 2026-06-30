package gl4;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272874d;

    public p(qk.y8 y8Var) {
        this.f272874d = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.y8 y8Var = this.f272874d;
        if (y8Var != null) {
            y8Var.a(new qk.ea(qk.ga.f364137g, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
