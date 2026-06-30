package hr3;

/* loaded from: classes11.dex */
public class gb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.hb f283585d;

    public gb(hr3.hb hbVar) {
        this.f283585d = hbVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fo3.s.INSTANCE.O6(1, 1, 5);
        android.content.Intent intent = new android.content.Intent();
        hr3.hb hbVar = this.f283585d;
        intent.putExtra("Contact_User", hbVar.f283611f.L.d1());
        intent.putExtra("Contact_Scene", hbVar.f283611f.N);
        intent.putExtra("AntispamTicket", hbVar.f283611f.L.F1);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.z(intent, hbVar.f283611f.f197770d);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
