package os3;

/* loaded from: classes8.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f348045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f348046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348049h;

    public c0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI, int i17, com.tencent.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f348049h = composeUI;
        this.f348045d = i17;
        this.f348046e = r6Var;
        this.f348047f = str;
        this.f348048g = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348049h;
        if (composeUI.f154853y.d() + this.f348045d > 52428800) {
            db5.e1.m(composeUI, com.tencent.mm.R.string.hkr, com.tencent.mm.R.string.f490573yv, null);
            return;
        }
        if (composeUI.f154844q.getText().toString().trim().length() == 0) {
            java.lang.String trim = this.f348046e.getName().trim();
            int lastIndexOf = trim.lastIndexOf(".");
            android.widget.EditText editText = composeUI.f154844q;
            if (lastIndexOf <= 0) {
                lastIndexOf = trim.length();
            }
            editText.setText(trim.substring(0, lastIndexOf));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "in upload file mode = %d", java.lang.Integer.valueOf(composeUI.M));
        os3.v1 v1Var = composeUI.f154853y;
        v1Var.getClass();
        java.lang.String str = this.f348047f;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) v1Var.f348226h;
        if (hashMap.containsKey(str)) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Mail.FileUploadHelper", "file path is not exist: %s", str);
            return;
        }
        ks3.v0 v0Var = new ks3.v0();
        v0Var.f311755d = str;
        java.lang.String str2 = this.f348048g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            v0Var.f311756e = r6Var.getName();
        } else {
            v0Var.f311756e = str2;
        }
        v0Var.f311757f = r6Var.C();
        v0Var.f311758g = 0;
        hashMap.put(str, v0Var);
        v1Var.i(v0Var);
    }
}
