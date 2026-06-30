package os3;

/* loaded from: classes8.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f348187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.s3 f348188e;

    public r3(os3.s3 s3Var, android.os.Bundle bundle) {
        this.f348188e = s3Var;
        this.f348187d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f348187d;
        int i17 = bundle.getInt("err_type");
        int i18 = bundle.getInt("err_type");
        java.lang.String string = bundle.getString("err_msg");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(string);
        os3.s3 s3Var = this.f348188e;
        if (K0) {
            string = s3Var.f348197d.getString(com.tencent.mm.R.string.hkf);
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.makeText(s3Var.f348197d, string, 1).show();
            return;
        }
        s3Var.f348197d.f154938t.setEnabled(false);
        s3Var.f348197d.f154938t.setText(com.tencent.mm.R.string.f492761hs2);
        s3Var.f348197d.f154938t.setTextColor(-7829368);
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = s3Var.f348197d;
        readMailUI.f154938t.setCompoundDrawablesWithIntrinsicBounds(i65.a.i(readMailUI, com.tencent.mm.R.drawable.bms), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        s3Var.f348197d.V6();
    }
}
