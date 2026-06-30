package w35;

/* loaded from: classes8.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w35.q f442741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f442743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442744d;

    public m(w35.q qVar, android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w wVar, java.lang.String str) {
        this.f442741a = qVar;
        this.f442742b = context;
        this.f442743c = wVar;
        this.f442744d = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Intent b17;
        android.content.Intent intent;
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        if (z17) {
            w35.q qVar = this.f442741a;
            android.content.Context context = this.f442742b;
            com.tencent.mm.pluginsdk.ui.otherway.w info = this.f442743c;
            java.lang.String packageName = this.f442744d;
            qVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(info, "info");
            kotlin.jvm.internal.o.g(packageName, "packageName");
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = info.f191014d;
            if (xVar == null || (b17 = xVar.f191036o) == null) {
                b17 = com.tencent.mm.pluginsdk.ui.tools.f.b(context, qVar.f442725c, qVar.f442726d, qVar.f442723a.f189310c);
            }
            android.content.Intent intent2 = b17;
            if (qVar.f442761f) {
                intent2.setPackage(packageName);
                com.tencent.mars.xlog.Log.i(qVar.f442760e, "try open file: " + qVar.f442726d + ", " + qVar.f442725c + ", by: " + packageName);
                if (!qVar.c(context, intent2)) {
                    com.tencent.mars.xlog.Log.e(qVar.f442760e, "open file failed, action: " + intent2.getAction() + ", filePath: " + qVar.f442726d);
                    com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = info.f191014d;
                    if (xVar2 != null && (intent = xVar2.f191037p) != null) {
                        intent.setPackage(packageName);
                        qVar.c(context, intent);
                    }
                }
                com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a(packageName, qVar.f442725c);
                w35.a aVar = qVar.f442724b;
                if (aVar != null) {
                    ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
                }
            } else {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211780g = 2;
                e4Var.f211778e = false;
                ((ku5.t0) ku5.t0.f312615d).g(new w35.p(qVar, intent2, packageName, context, e4Var.c(), info));
            }
            com.tencent.mm.pluginsdk.model.p3 p3Var = this.f442741a.f442723a.f189319l;
            if (p3Var == null || (k0Var = p3Var.f189406c) == null) {
                return;
            }
            ((kb0.f) k0Var).a(true, this.f442743c);
        }
    }
}
