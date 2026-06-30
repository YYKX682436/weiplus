package wk;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public w21.k0 f446889d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f446890e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f446891f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f446892g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f446893h;

    public n() {
        super(0);
    }

    public final void b() {
        w21.k0 k0Var = this.f446889d;
        if (k0Var != null) {
            k0Var.stopRecord();
            java.lang.Runnable runnable = this.f446893h;
            if (runnable != null) {
                if (this.f446892g) {
                    ((com.tencent.mm.plugin.webview.ui.tools.jsapi.k6) runnable).run();
                }
                this.f446893h = null;
            }
            this.f446891f = true;
        }
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtSimpleRecordEvent extSimpleRecordEvent = (com.tencent.mm.autogen.events.ExtSimpleRecordEvent) iEvent;
        if (!(extSimpleRecordEvent instanceof com.tencent.mm.autogen.events.ExtSimpleRecordEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.ExtSimpleRecord", "mismatched event");
            return false;
        }
        am.q8 q8Var = extSimpleRecordEvent.f54208g;
        int i17 = q8Var.f7696a;
        am.r8 r8Var = extSimpleRecordEvent.f54209h;
        if (i17 == 1) {
            if (this.f446889d == null) {
                this.f446889d = new w21.k0();
            }
            this.f446893h = q8Var.f7699d;
            w21.k0 k0Var = this.f446889d;
            if (k0Var.f442419c == 1) {
                k0Var.stopRecord();
            }
            this.f446889d.startRecord(q8Var.f7697b);
            r8Var.getClass();
            int i18 = q8Var.f7698c;
            if (i18 <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtSimpleRecord", "duration is invalid, less than 0");
                i18 = 60;
            }
            if (i18 > 600) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtSimpleRecord", "duration is invalid, more than %d", 600);
                i18 = 600;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtSimpleRecord", "MaxVoiceRecordTime (%d)s", java.lang.Integer.valueOf(i18));
            long j17 = i18 * 1000;
            if (this.f446890e == null) {
                this.f446890e = new com.tencent.mm.sdk.platformtools.b4(new wk.m(this), false);
            }
            if (this.f446890e.e()) {
                this.f446890e.d();
            }
            this.f446892g = false;
            this.f446890e.c(j17, j17);
            this.f446891f = false;
        } else if (i17 == 2 && this.f446889d != null) {
            if (!this.f446891f) {
                this.f446890e.d();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtSimpleRecord", "Voice record stop.");
                b();
            }
            r8Var.getClass();
        }
        return true;
    }
}
