package ho1;

/* loaded from: classes5.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282761e;

    public n0(ho1.a1 a1Var, long j17) {
        this.f282760d = a1Var;
        this.f282761e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        int c17 = com.tencent.mm.plugin.backup.roambackup.v1.f92914a.c();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (c17 == 1) {
            string = context.getString(com.tencent.mm.R.string.n4h);
            kotlin.jvm.internal.o.d(string);
        } else if (c17 != 2) {
            string = context.getString(com.tencent.mm.R.string.n4i);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = kn1.k.z(context);
            if (string == null) {
                string = "Unknown";
            }
        }
        com.tencent.wechat.aff.affroam.e0 e0Var = this.f282760d.f282623b;
        if (e0Var != null) {
            e0Var.e0(this.f282761e, string);
        }
    }
}
