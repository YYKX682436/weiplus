package vy3;

/* loaded from: classes.dex */
public final class e extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.e f441468e = new vy3.e();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        boolean z17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("content");
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCopy", "ScanJsApi-Call:copy content: %s", str);
        com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, str, str, null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f450647d == 0 || java.lang.System.currentTimeMillis() - this.f450647d >= 2000) {
            this.f450647d = currentTimeMillis;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            android.content.Context context = env.f340860a;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.f490361st));
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "copy";
    }
}
