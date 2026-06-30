package e04;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanMaterialCodeEvent f246141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f246143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246144g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f246145h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e04.p f246146i;

    public w0(e04.p pVar, com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent, android.content.Context context, int i17, java.lang.String str, int i18) {
        this.f246146i = pVar;
        this.f246141d = scanMaterialCodeEvent;
        this.f246142e = context;
        this.f246143f = i17;
        this.f246144g = str;
        this.f246145h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent = this.f246141d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(scanMaterialCodeEvent.f54732h.f8212a);
        android.content.Context context = this.f246142e;
        e04.p pVar = this.f246146i;
        if (!K0) {
            if (context != null) {
                dp.a.makeText(context, scanMaterialCodeEvent.f54732h.f8212a, 1).show();
            }
            pVar.t(false, null);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(scanMaterialCodeEvent.f54732h.f8214c)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QBarStringHandler", "resp url is null!");
            pVar.t(false, null);
        } else {
            if (scanMaterialCodeEvent.f54732h.f8213b == 1) {
                ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).Ni(this.f246142e, scanMaterialCodeEvent.f54732h.f8214c, this.f246143f, this.f246144g, this.f246145h, null);
                pVar.t(true, null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", scanMaterialCodeEvent.f54732h.f8214c);
            ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).D(intent, context);
            pVar.t(true, null);
        }
    }
}
