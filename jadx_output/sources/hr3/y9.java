package hr3;

/* loaded from: classes11.dex */
public class y9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f284207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.z9 f284208e;

    public y9(hr3.z9 z9Var, android.widget.CheckBox checkBox) {
        this.f284208e = z9Var;
        this.f284207d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.z9 z9Var = this.f284208e;
        z9Var.f284238d.f283696d.c();
        if (z9Var.f284238d.f283696d.f284109e.L.getSource() == 18) {
            z9Var.f284238d.f283696d.f284109e.N = 9;
            if (this.f284207d.isChecked()) {
                hr3.va.b(z9Var.f284238d.f283696d);
            }
        }
    }
}
