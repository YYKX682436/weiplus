package z63;

/* loaded from: classes5.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.g f470363d;

    public a(z63.g gVar) {
        this.f470363d = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.String str2;
        u11.a a17;
        z63.g gVar = this.f470363d;
        android.content.Intent intent = new android.content.Intent(gVar.f470407c, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
        intent.putExtra("bind_scene", 0);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) gVar.f470407c.getSystemService("phone")).getSimCountryIso();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f423729c);
            intent.putExtra("couttry_code", a17.f423728b);
        }
        android.content.Context context = gVar.f470407c;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TiemDatePicker", "startWizardActivity()");
        iz5.a.g("startWizardActivity: Param context should be a Activity :" + context.toString(), context instanceof android.app.Activity);
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            str = intent2.getStringExtra("WizardRootClass");
            str2 = intent2.getStringExtra("WizardTransactionId");
        } else {
            str = null;
            str2 = null;
        }
        intent.putExtra("WizardRootClass", str);
        if (str2 != null) {
            intent.putExtra("WizardTransactionId", str2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4098);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker", "startBindActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
