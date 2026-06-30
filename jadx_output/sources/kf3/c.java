package kf3;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f307323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f307324b;

    public c(boolean z17, com.tencent.mm.ui.z9 z9Var) {
        this.f307323a = z17;
        this.f307324b = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f307323a;
        int i17 = z17 ? n17 & (-65537) : n17 | 65536;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            kf3.e.a();
        }
        com.tencent.mm.ui.z9 z9Var = this.f307324b;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
