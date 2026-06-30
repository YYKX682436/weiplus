package gg4;

/* loaded from: classes3.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference f271739d;

    public b(com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference addFriendSearchPreference) {
        this.f271739d = addFriendSearchPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f271739d.M.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
