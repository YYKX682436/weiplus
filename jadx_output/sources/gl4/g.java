package gl4;

/* loaded from: classes11.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272855d;

    public g(qk.y8 y8Var) {
        this.f272855d = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$joinMembershipByBindQQMusicVIP$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gl4.z.a(this.f272855d);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$joinMembershipByBindQQMusicVIP$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
