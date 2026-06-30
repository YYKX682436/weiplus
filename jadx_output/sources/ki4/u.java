package ki4;

/* loaded from: classes9.dex */
public final class u implements bi4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ki4.x f308154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f308156c;

    public u(ki4.x xVar, java.lang.String str, android.content.Context context) {
        this.f308154a = xVar;
        this.f308155b = str;
        this.f308156c = context;
    }

    @Override // bi4.v0
    public final void a(boolean z17, java.util.List list) {
        android.content.Context context = this.f308156c;
        if (z17) {
            this.f308154a.Bi(this.f308155b, context);
        } else {
            db5.e1.s(context, context.getString(com.tencent.mm.R.string.msg_net_error), "");
        }
    }
}
