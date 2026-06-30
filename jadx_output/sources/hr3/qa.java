package hr3;

/* loaded from: classes11.dex */
public class qa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283920d;

    public qa(hr3.va vaVar) {
        this.f283920d = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        hr3.va vaVar = this.f283920d;
        intent.putExtra("sns_permission_userName", vaVar.f284109e.L.d1());
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 4);
        j45.l.j(vaVar.f284109e.K1, "sns", ".ui.SnsPermissionUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
