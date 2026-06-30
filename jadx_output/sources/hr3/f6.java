package hr3;

/* loaded from: classes.dex */
public class f6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283543e;

    public f6(hr3.t6 t6Var, java.lang.String str) {
        this.f283543e = t6Var;
        this.f283542d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + this.f283542d));
        hr3.t6 t6Var = this.f283543e;
        if (com.tencent.mm.sdk.platformtools.t8.I0(t6Var.f284002d, intent, true, false)) {
            try {
                com.tencent.mm.ui.MMActivity mMActivity = t6Var.f284002d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$16", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mMActivity, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$16", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactWidgetBizInfo", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
