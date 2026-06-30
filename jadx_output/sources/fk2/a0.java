package fk2;

/* loaded from: classes3.dex */
public final class a0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f263299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f263300h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263301i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263302j;

    public a0(bm2.h1 h1Var, java.lang.String str, android.content.Context context, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, int i17, int i18, boolean z17, fk2.g0 g0Var, java.lang.String str2, java.lang.String str3) {
        this.f263293a = h1Var;
        this.f263294b = str;
        this.f263295c = context;
        this.f263296d = f0Var;
        this.f263297e = i17;
        this.f263298f = i18;
        this.f263299g = z17;
        this.f263300h = g0Var;
        this.f263301i = str2;
        this.f263302j = str3;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bm2.h1 h1Var = this.f263293a;
        java.lang.Object tag = h1Var.itemView.getTag();
        java.lang.String str = this.f263294b;
        if (kotlin.jvm.internal.o.b(tag, str)) {
            if (bitmap != null) {
                pm0.v.X(new fk2.z(this.f263295c, bitmap, this.f263296d, this.f263297e, this.f263298f, this.f263299g, this.f263293a, this.f263300h, this.f263301i, this.f263302j));
                return;
            } else {
                com.tencent.mars.xlog.Log.i("CommentItemComboLiveReward", "onBindComboLiveRewardMsg resource is null!");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("CommentItemComboLiveReward", "onBindComboLiveRewardMsg tag:" + h1Var.itemView.getTag() + ",payload id:" + str);
    }
}
