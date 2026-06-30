package pp3;

/* loaded from: classes5.dex */
public class j implements pp3.b {

    /* renamed from: f, reason: collision with root package name */
    public static final int f357481f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_double_click_avatar_delay_interval, android.view.ViewConfiguration.getDoubleTapTimeout());

    /* renamed from: a, reason: collision with root package name */
    public mp3.l f357482a;

    /* renamed from: b, reason: collision with root package name */
    public mp3.m f357483b;

    /* renamed from: c, reason: collision with root package name */
    public op3.c f357484c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f357485d = new pp3.c(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f357486e = new pp3.d(this, android.os.Looper.getMainLooper());

    public void a() {
        this.f357486e.removeMessages(292);
        this.f357484c = null;
    }

    public void b() {
        this.f357486e.removeMessages(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX);
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        db5.h3 h3Var = new db5.h3(((android.view.View) this.f357482a).getContext());
        h3Var.L.setText(str);
        h3Var.M.setText(str2);
        h3Var.N.setOnClickListener(new pp3.e(this, h3Var));
        h3Var.C();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pp3.j.d():void");
    }
}
