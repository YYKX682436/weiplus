package hr3;

/* loaded from: classes11.dex */
public class x9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f284176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.z9 f284177e;

    public x9(hr3.z9 z9Var, android.widget.CheckBox checkBox) {
        this.f284177e = z9Var;
        this.f284176d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.z9 z9Var = this.f284177e;
        hr3.va vaVar = z9Var.f284238d.f283696d;
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = vaVar.f284109e;
        c01.e2.k0(normalUserFooterPreference.L);
        normalUserFooterPreference.L.E2();
        if (normalUserFooterPreference.X) {
            normalUserFooterPreference.H1.setVisibility(0);
            vaVar.f();
        }
        hr3.ja jaVar = z9Var.f284238d;
        if (jaVar.f283696d.f284109e.L.getSource() == 18) {
            jaVar.f283696d.f284109e.N = 9;
            if (this.f284176d.isChecked()) {
                hr3.va.b(jaVar.f283696d);
            }
        }
    }
}
