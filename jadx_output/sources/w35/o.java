package w35;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f442747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w35.q f442748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f442750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f442751h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f442752i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.ui.widget.dialog.f4 f4Var, w35.q qVar, android.content.Context context, android.content.Intent intent, com.tencent.mm.pluginsdk.ui.otherway.w wVar, com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        super(0);
        this.f442747d = f4Var;
        this.f442748e = qVar;
        this.f442749f = context;
        this.f442750g = intent;
        this.f442751h = wVar;
        this.f442752i = r6Var;
        this.f442753m = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent;
        this.f442747d.dismiss();
        android.content.Intent intent2 = this.f442750g;
        kotlin.jvm.internal.o.f(intent2, "$intent");
        android.content.Context context = this.f442749f;
        w35.q qVar = this.f442748e;
        if (!qVar.c(context, intent2)) {
            com.tencent.mars.xlog.Log.e(qVar.f442760e, "open file failed, action: " + intent2.getAction() + ", filePath: " + qVar.f442726d);
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = this.f442751h.f191014d;
            if (xVar != null && (intent = xVar.f191037p) != null) {
                android.content.Context context2 = this.f442749f;
                com.tencent.mm.sdk.platformtools.i1.e(context2, intent, this.f442752i, qVar.f442723a.f189310c, qVar.f442725c, false);
                intent.setPackage(this.f442753m);
                qVar.c(context2, intent);
            }
        }
        w35.a aVar = qVar.f442724b;
        if (aVar != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
        }
        return jz5.f0.f302826a;
    }
}
