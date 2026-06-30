package sg3;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407979f;

    public n(sg3.r rVar, java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f407977d = str;
        this.f407978e = str2;
        this.f407979f = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/messenger/PluginMessenger$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f407977d);
        intent.putExtra("AntispamTicket", this.f407978e);
        j45.l.n(this.f407979f, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/messenger/PluginMessenger$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
