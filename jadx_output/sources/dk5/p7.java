package dk5;

/* loaded from: classes9.dex */
public class p7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f234813a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f234814b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f234815c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f234816d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234818f;

    /* renamed from: h, reason: collision with root package name */
    public int f234820h;

    /* renamed from: j, reason: collision with root package name */
    public dk5.o7 f234822j;

    /* renamed from: g, reason: collision with root package name */
    public boolean f234819g = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f234821i = new dk5.n7(this);

    public p7(android.content.Context context) {
        this.f234813a = context;
    }

    public void a() {
        this.f234816d = true;
        if (true && this.f234815c) {
            com.tencent.mm.sdk.platformtools.u3.l(this.f234821i);
            dk5.o7 o7Var = this.f234822j;
            if (o7Var != null) {
                o7Var.a(this.f234817e, this.f234818f, this.f234820h, this.f234819g);
            }
        }
    }

    public void b(boolean z17, java.lang.String str, int i17, boolean z18) {
        this.f234815c = true;
        this.f234817e = z17;
        this.f234818f = str;
        this.f234820h = i17;
        this.f234819g = z18;
        if (true && this.f234816d) {
            dk5.o7 o7Var = this.f234822j;
            if (o7Var != null) {
                o7Var.a(z17, str, i17, z18);
                return;
            }
            return;
        }
        if (z17) {
            android.content.Context context = this.f234813a;
            this.f234814b = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.iij), false, true, null);
            com.tencent.mm.sdk.platformtools.u3.i(this.f234821i, 5000L);
        }
    }
}
