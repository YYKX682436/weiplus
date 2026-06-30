package gc0;

/* loaded from: classes5.dex */
public final class x extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f270348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f270352i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        super(1, null);
        this.f270348e = weakReference;
        this.f270349f = str;
        this.f270350g = str2;
        this.f270351h = str3;
        this.f270352i = j17;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Context context = (android.content.Context) this.f270348e.get();
        if (context != null) {
            java.lang.String str = this.f270350g;
            java.lang.String str2 = this.f270351h;
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str3 = this.f270349f;
            intent.putExtra("Contact_User", str3);
            intent.putExtra("view_mode", true);
            intent.putExtra("contact_set_remark_from_recommend", str);
            intent.putExtra("contact_add_phone_from_recommend", str2);
            gc0.y0 y0Var = gc0.y0.f270365a;
            pm0.v.K(null, new gc0.p0(str3 == null ? "" : str3));
            long j17 = this.f270352i;
            if (j17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleRecommendRemarkSendTipClickListener", "onClickImp() called launch no img");
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, context);
                if (context instanceof android.app.Activity) {
                    ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                    return;
                }
                return;
            }
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(str3, j17);
            android.content.Context context2 = widget.getContext();
            kotlinx.coroutines.y0 a17 = v65.m.a(widget);
            if (k17 != null) {
                kotlinx.coroutines.l.d(a17, null, null, new gc0.w(context2, k17, intent, str, str2, context, null), 3, null);
            }
        }
    }
}
