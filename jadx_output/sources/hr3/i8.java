package hr3;

/* loaded from: classes.dex */
public class i8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.l8 f283651d;

    public i8(hr3.l8 l8Var) {
        this.f283651d = l8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (com.tencent.mm.sdk.platformtools.a0.f192439b == 1) {
            android.content.Intent addFlags = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details?id=com.tencent.qqpim")).addFlags(268435456);
            hr3.l8 l8Var = this.f283651d;
            if (com.tencent.mm.sdk.platformtools.t8.I0(l8Var.f283750d, addFlags, true, false)) {
                try {
                    android.content.Context context = l8Var.f283750d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(addFlags);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactWidgetQQSync", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
