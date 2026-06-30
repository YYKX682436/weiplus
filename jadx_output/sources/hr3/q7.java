package hr3;

/* loaded from: classes9.dex */
public class q7 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f283914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f283915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f283916c;

    public q7(boolean z17, android.content.Context context, com.tencent.mm.ui.z9 z9Var) {
        this.f283914a = z17;
        this.f283915b = context;
        this.f283916c = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        boolean z17 = this.f283914a;
        if (z17) {
            hr3.u7.b(true);
        }
        int n17 = c01.z1.n();
        int i17 = z17 ? n17 & (-17) : n17 | 16;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            hr3.u7.a(this.f283915b);
        }
        com.tencent.mm.ui.z9 z9Var = this.f283916c;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
