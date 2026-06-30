package hr3;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f283904d;

    public q(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI) {
        this.f283904d = addDescriptionUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f283904d.getContext(), view);
        rVar.f397351u = new hr3.o(this);
        rVar.f397354x = new hr3.p(this);
        rVar.m();
        yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
