package lu1;

/* loaded from: classes.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f321353d;

    public l(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f321353d = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        com.tencent.mm.ui.MMActivity mMActivity = this.f321353d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/card/util/CardDialogHelper$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/card/util/CardDialogHelper$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
