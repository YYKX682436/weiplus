package df2;

/* loaded from: classes.dex */
public final class rx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(java.lang.String str, int i17, android.content.Context context) {
        super(0);
        this.f231272d = str;
        this.f231273e = i17;
        this.f231274f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f231272d;
        if (str != null) {
            int i17 = this.f231273e;
            android.content.Context context = this.f231274f;
            if (i17 == 1) {
                db5.t7.makeText(context, str, 1).show();
            } else if (i17 != 2) {
                db5.t7.makeText(context, str, 1).show();
            } else {
                db5.t7.m(context, str);
            }
        }
        return jz5.f0.f302826a;
    }
}
