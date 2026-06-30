package s65;

/* loaded from: classes.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s65.m f403446d;

    public f(s65.m mVar) {
        this.f403446d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/"));
        intent.addFlags(268435456);
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403446d.f403492a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(appUpdaterUI, arrayList.toArray(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appUpdaterUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(appUpdaterUI, "com/tencent/mm/sandbox/updater/AppUpdaterUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
