package uf5;

/* loaded from: classes4.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427310d;

    public v0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427310d = contactMgrUIBase;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f427310d.W6();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
