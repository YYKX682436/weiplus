package dz4;

/* loaded from: classes12.dex */
public final class c2 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih0.p f245181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.d2 f245184d;

    public c2(ih0.p pVar, android.app.Activity activity, java.lang.String str, dz4.d2 d2Var) {
        this.f245181a = pVar;
        this.f245182b = activity;
        this.f245183c = str;
        this.f245184d = d2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245181a).f257944c;
            if ((weakReference != null ? (android.app.Activity) weakReference.get() : null) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "showSelectForwardUI: context null");
                return;
            }
            android.app.Activity activity = this.f245182b;
            ih0.p pVar = this.f245181a;
            this.f245184d.b(new dz4.g2(activity, pVar, ((ez4.u) pVar).f257942a, this.f245183c, str));
        }
    }
}
