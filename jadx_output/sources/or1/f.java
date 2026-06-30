package or1;

/* loaded from: classes12.dex */
public class f extends pr1.a {

    /* renamed from: k, reason: collision with root package name */
    public static fb5.b f347485k;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f347486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f347487i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f347488j;

    public f(java.lang.Object obj, java.lang.String str) {
        super(6, obj);
        this.f347488j = str;
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        java.lang.Object obj;
        if (this.f260883c) {
            return;
        }
        if (context == null || aVar == null || (obj = this.f260882b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "The DataItem is not a instance of BizProductViewHolder.");
            return;
        }
        if (!(obj instanceof r45.fx5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "The data is not a instance of SearchOrRecommendItem.");
            return;
        }
        or1.e eVar = (or1.e) aVar;
        r45.fx5 fx5Var = (r45.fx5) obj;
        r45.du5 du5Var = fx5Var.f374702e;
        java.lang.String str = du5Var != null ? du5Var.f372756d : "";
        try {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = eVar.f347477c.getTextSize();
            ((ke0.e) xVar).getClass();
            this.f347486h = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
        } catch (java.lang.Exception unused) {
            this.f347486h = "";
        }
        this.f347487i = fx5Var.f374701d.f372756d;
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.e();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f347485k == null) {
            f347485k = new or1.d(this);
        }
        return f347485k;
    }
}
