package dk2;

/* loaded from: classes3.dex */
public final class v4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234231d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f234232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234233f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f234234g;

    public v4(android.content.Context context, gk2.e buContext) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f234231d = context;
        this.f234232e = buContext;
        this.f234233f = "";
        this.f234234g = true;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("FinderLiveBlackResultCa", "onModifyResult black: " + this.f234234g + " userName: " + this.f234233f + " :" + ret.getInteger(1));
        int integer = ret.getInteger(1);
        android.content.Context context = this.f234231d;
        if (integer != 0) {
            java.lang.String string = this.f234234g ? context.getResources().getString(com.tencent.mm.R.string.e7h) : context.getResources().getString(com.tencent.mm.R.string.e7w);
            kotlin.jvm.internal.o.d(string);
            db5.t7.g(context, string);
        } else {
            ((mm2.c1) this.f234232e.a(mm2.c1.class)).S5.put(this.f234233f, java.lang.Boolean.valueOf(this.f234234g));
            java.lang.String string2 = this.f234234g ? context.getResources().getString(com.tencent.mm.R.string.e7g) : context.getResources().getString(com.tencent.mm.R.string.e7v);
            kotlin.jvm.internal.o.d(string2);
            db5.t7.h(context, string2);
        }
    }
}
