package ha1;

/* loaded from: classes7.dex */
public abstract class v {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f279789b = jz5.h.b(ha1.t.f279787d);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f279790a;

    public final void a(android.content.Context context, java.lang.String str) {
        new android.app.AlertDialog.Builder(context).setTitle("").setMessage(str).setNegativeButton("cancel", (android.content.DialogInterface.OnClickListener) null).setPositiveButton("restart", ha1.u.f279788d).show();
    }

    public e42.d0 b() {
        return null;
    }

    public boolean c() {
        return true;
    }

    public java.lang.String d() {
        return null;
    }

    public java.lang.Object e() {
        java.lang.Object f17;
        java.lang.Object obj = this.f279790a;
        if (obj != null) {
            return obj;
        }
        if (d() != null) {
            java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("WAGameDynamicConfig").u("WAGameDynamicConfig" + d(), null);
            f17 = u17 != null ? g(u17) : null;
            if (f17 != null) {
                com.tencent.mars.xlog.Log.i("WAGameDynamicConfig", "hit localstorage");
                this.f279790a = f17;
                return f17;
            }
        }
        if (b() != null) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(b(), "", true);
            if (Zi != null && (f17 = g(Zi)) != null) {
                com.tencent.mars.xlog.Log.i("WAGameDynamicConfig", "hit ABTest");
                this.f279790a = f17;
                return f17;
            }
        }
        f17 = f();
        this.f279790a = f17;
        return f17;
    }

    public abstract java.lang.Object f();

    public abstract java.lang.Object g(java.lang.String str);

    public final java.lang.Boolean h(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if ("true".contentEquals(str)) {
            return java.lang.Boolean.TRUE;
        }
        if ("false".contentEquals(str)) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.Integer h17 = r26.h0.h(str);
        if (h17 == null) {
            return null;
        }
        if (h17.intValue() > 0) {
            return java.lang.Boolean.TRUE;
        }
        if (h17.intValue() == 0 || h17.intValue() == -1) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.IllegalStateException("Ambiguity name");
    }
}
