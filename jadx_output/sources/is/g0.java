package is;

/* loaded from: classes11.dex */
public class g0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f294335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js.v0 f294336e;

    public g0(is.i0 i0Var, android.app.Activity activity, js.v0 v0Var) {
        this.f294335d = activity;
        this.f294336e = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        u11.a a17;
        android.app.Activity activity = this.f294335d;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
        intent.putExtra("bind_scene", 3);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) activity.getSystemService("phone")).getSimCountryIso();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f423729c);
            intent.putExtra("couttry_code", a17.f423728b);
        }
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) activity, ".plugin.account.bind.ui.BindMContactUI", intent, 1, new is.f0(this));
    }
}
