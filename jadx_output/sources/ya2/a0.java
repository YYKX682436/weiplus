package ya2;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f460420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f460422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f460423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, java.lang.String str, int i17, android.content.Intent intent, android.content.Context context) {
        super(0);
        this.f460420d = j17;
        this.f460421e = str;
        this.f460422f = i17;
        this.f460423g = intent;
        this.f460424h = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.xk a17;
        java.lang.String string;
        com.tencent.mm.protocal.protobuf.FinderObject Yk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yk(this.f460420d, this.f460421e, this.f460422f, "");
        android.content.Context context = this.f460424h;
        if (Yk == null) {
            com.tencent.mars.xlog.Log.e("FinderRouterApi", "enterFinderProfileUI requestFinderObject null");
            pm0.v.X(new ya2.y(context));
        } else {
            java.lang.String str = "";
            android.content.Intent intent = this.f460423g;
            if (intent != null) {
                java.lang.String username = Yk.getUsername();
                if (username == null) {
                    username = "";
                }
                intent.putExtra("finder_username", username);
            }
            if (intent != null) {
                java.lang.String username2 = Yk.getUsername();
                if (username2 == null) {
                    username2 = "";
                }
                intent.putExtra("key_finder_teen_mode_user_id", username2);
            }
            if (intent != null) {
                com.tencent.mm.protocal.protobuf.FinderContact contact = Yk.getContact();
                if (contact != null && (a17 = ya2.d.a(contact, false)) != null && (string = a17.getString(0)) != null) {
                    str = string;
                }
                intent.putExtra("key_biz_username", str);
            }
            pm0.v.X(new ya2.z(context, intent));
        }
        return jz5.f0.f302826a;
    }
}
