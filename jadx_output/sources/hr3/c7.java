package hr3;

/* loaded from: classes9.dex */
public class c7 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f283446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f283447b;

    public c7(boolean z17, com.tencent.mm.ui.z9 z9Var) {
        this.f283446a = z17;
        this.f283447b = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f283446a;
        int i17 = z17 ? n17 & (-8193) : n17 | 8192;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            m61.k.Bi().f392869d.A("facebookfriend", "delete from facebookfriend");
            c01.d9.b().p().w(65828, "");
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("facebookapp");
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).J0("facebookapp");
        }
        com.tencent.mm.ui.z9 z9Var = this.f283447b;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
