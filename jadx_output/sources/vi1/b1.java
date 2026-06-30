package vi1;

/* loaded from: classes7.dex */
public final class b1 implements vi1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f437273a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f437274b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f437275c;

    /* renamed from: d, reason: collision with root package name */
    public vi1.e0 f437276d;

    public b1(android.content.Context mContext, java.lang.String mAppId, yz5.a onDone) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mAppId, "mAppId");
        kotlin.jvm.internal.o.g(onDone, "onDone");
        this.f437273a = mContext;
        this.f437274b = mAppId;
        this.f437275c = onDone;
    }

    public final void a(java.lang.String str) {
        android.content.Context context = this.f437273a;
        com.tencent.mm.plugin.appbrand.utils.m1.a(context, str, context.getString(com.tencent.mm.R.string.f490143m4), vi1.v0.f437468d);
    }
}
