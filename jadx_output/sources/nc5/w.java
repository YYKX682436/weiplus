package nc5;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f336238a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.Activity f336239b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f336240c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f336241d = "";

    /* renamed from: e, reason: collision with root package name */
    public m11.b0 f336242e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f336243f;

    public w() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f336243f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.query.ScanTransImage$scanTranslationResultEventListener$1
            {
                this.__eventId = -1699517927;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
                com.tencent.mm.autogen.events.ScanTranslationResultEvent event = scanTranslationResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ct ctVar = event.f54739g;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTransImageUtil", "scanTranslationResult %d, %s", java.lang.Integer.valueOf(ctVar.f6400a), java.lang.Boolean.valueOf(ctVar.f6402c));
                com.tencent.mm.sdk.platformtools.u3.h(new nc5.v(nc5.w.this, event));
                return true;
            }
        };
    }
}
