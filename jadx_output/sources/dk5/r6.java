package dk5;

/* loaded from: classes9.dex */
public final class r6 implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk5.e6 f234852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f234853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f234858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f234859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f234860i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234861j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f234862k;

    public r6(dk5.e6 e6Var, com.tencent.mm.pluginsdk.model.app.m mVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, java.lang.String str3, dk5.f6 f6Var) {
        this.f234852a = e6Var;
        this.f234853b = mVar;
        this.f234854c = wXMediaMessage;
        this.f234855d = linkedList;
        this.f234856e = str;
        this.f234857f = str2;
        this.f234858g = i17;
        this.f234859h = z17;
        this.f234860i = z18;
        this.f234861j = str3;
        this.f234862k = f6Var;
    }

    @Override // dk5.h2
    public final void a(java.lang.String str, boolean z17) {
        dk5.e6 e6Var = this.f234852a;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendWXMediaMessageHelper", "thumb img CDN upload fail!");
            if (e6Var != null) {
                dk5.e6.a(e6Var, 5, null, 2, null);
                return;
            }
            return;
        }
        if (e6Var != null) {
            dk5.e6.a(e6Var, 4, null, 2, null);
        }
        dk5.y6.f235010a.j(this.f234853b, this.f234854c, this.f234855d, this.f234856e, this.f234857f, this.f234858g, this.f234859h, this.f234860i, this.f234861j, str, null, this.f234852a, this.f234862k);
        if (e6Var != null) {
            dk5.e6.a(e6Var, 6, null, 2, null);
        }
    }
}
