package hr3;

/* loaded from: classes3.dex */
public final class f9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.j9 f283548d;

    public f9(hr3.j9 j9Var) {
        this.f283548d = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/FriendProfilePreference$onBindView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f283548d.f283691h;
        kotlin.jvm.internal.o.d(view);
        lVar.invoke(view);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/FriendProfilePreference$onBindView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
