package up3;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f429810e;

    public a0(up3.b0 b0Var, java.lang.String str, android.content.Intent intent) {
        this.f429809d = str;
        this.f429810e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = up3.b0.f429813c;
        java.lang.String str2 = this.f429809d;
        boolean equals = str.equals(str2);
        android.content.Intent intent = this.f429810e;
        if (!equals) {
            if (up3.b0.f429815e.equals(str2) && com.tencent.mm.sdk.platformtools.x2.n()) {
                up3.d0.a(intent.getStringExtra(up3.b0.f429816f), intent.getStringExtra(up3.b0.f429817g), intent.getBooleanExtra(up3.b0.f429818h, false));
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra(up3.b0.f429816f);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra(up3.b0.f429814d);
        if (com.tencent.mm.sdk.platformtools.t8.N0(stringArrayExtra)) {
            return;
        }
        for (java.lang.String str3 : stringArrayExtra) {
            if (str3.equals(bm5.f1.a())) {
                try {
                    com.tencent.mm.vfs.r6 e17 = up3.d0.e();
                    java.lang.String str4 = "" + tp3.b.a("êê»¶ª¥¢³²øã") + str3 + "\n";
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/proc/self/smaps"));
                    up3.b.k(r6Var);
                    up3.b.b(r6Var, e17, null, str4);
                    up3.b0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, stringExtra, e17.o(), true);
                    return;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(up3.d0.f429823d, th6, "Explained by code.", new java.lang.Object[0]);
                    return;
                }
            }
        }
    }
}
