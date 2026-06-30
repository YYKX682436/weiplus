package dk5;

/* loaded from: classes9.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f234944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234946h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f234947i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f234948m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f234949n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234950o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f234951p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234952q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f234953r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ dk5.e6 f234954s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(android.content.Context context, android.content.Intent intent, com.tencent.mm.pluginsdk.model.app.m mVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.util.LinkedList linkedList, int i17, boolean z17, boolean z18, java.lang.String str, int i18, java.lang.String str2, int i19, dk5.e6 e6Var) {
        super(1);
        this.f234942d = context;
        this.f234943e = intent;
        this.f234944f = mVar;
        this.f234945g = wXMediaMessage;
        this.f234946h = linkedList;
        this.f234947i = i17;
        this.f234948m = z17;
        this.f234949n = z18;
        this.f234950o = str;
        this.f234951p = i18;
        this.f234952q = str2;
        this.f234953r = i19;
        this.f234954s = e6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "checkAndCopyFileIfNeed  callBack:" + intValue);
        dk5.y6 y6Var = dk5.y6.f235010a;
        if (intValue == 0) {
            y6Var.d(this.f234942d, this.f234943e, this.f234944f, this.f234945g, this.f234946h, this.f234947i, this.f234948m, this.f234949n, this.f234950o, this.f234951p, this.f234952q, this.f234953r, this.f234954s, (r31 & 8192) != 0 ? null : null);
        } else if (intValue == 2) {
            y6Var.d(this.f234942d, this.f234943e, this.f234944f, this.f234945g, this.f234946h, this.f234947i, this.f234948m, this.f234949n, this.f234950o, this.f234951p, this.f234952q, this.f234953r, this.f234954s, (r31 & 8192) != 0 ? null : null);
        } else if (intValue == 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, WXMediaMessage file check fail");
            dk5.e6 e6Var = this.f234954s;
            if (e6Var != null) {
                ((dk5.z4) e6Var).b(3, "cb_key_file_check_invalid");
            }
        }
        return jz5.f0.f302826a;
    }
}
