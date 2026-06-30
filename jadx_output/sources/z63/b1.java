package z63;

/* loaded from: classes5.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f470367d;

    /* renamed from: e, reason: collision with root package name */
    public final z63.u0 f470368e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f470369f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470370g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470371h;

    public b1(android.content.Context context, com.tencent.mm.sdk.platformtools.n3 n3Var, z63.u0 u0Var) {
        this.f470367d = context;
        this.f470369f = n3Var;
        this.f470368e = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        try {
            android.util.Pair j17 = ((t63.e) i95.n0.c(t63.e.class)).wi().j(this.f470370g, 1, this.f470371h);
            int intValue = ((java.lang.Integer) j17.first).intValue();
            int w17 = x63.g.w();
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f470369f;
            if (intValue > w17) {
                n3Var.sendEmptyMessage(20002);
                return;
            }
            int intValue2 = ((java.lang.Integer) j17.first).intValue();
            z63.u0 u0Var = this.f470368e;
            if (intValue2 < 1 && ((obj = j17.second) == null || ((y63.a) obj).Q < 1)) {
                if (!x63.g.B(this.f470367d, this.f470370g)) {
                    n3Var.sendEmptyMessage(20002);
                    return;
                }
                ((z63.f1) u0Var).f470391l = null;
                android.os.Message message = new android.os.Message();
                message.what = 20001;
                message.arg1 = 1;
                ((z63.f1) u0Var).f470392m = this.f470370g.trim();
                n3Var.sendMessage(message);
                return;
            }
            java.lang.Object obj2 = j17.second;
            ((z63.f1) u0Var).f470391l = (y63.a) obj2;
            if (!x63.g.C((y63.a) obj2)) {
                n3Var.sendEmptyMessage(20002);
                return;
            }
            android.os.Message message2 = new android.os.Message();
            message2.what = 20001;
            message2.obj = x63.g.o((y63.a) j17.second);
            n3Var.sendMessage(message2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "CheckRunnable run() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
