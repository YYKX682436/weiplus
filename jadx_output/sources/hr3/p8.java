package hr3;

/* loaded from: classes9.dex */
public class p8 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f283879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f283880b;

    public p8(boolean z17, com.tencent.mm.ui.z9 z9Var) {
        this.f283879a = z17;
        this.f283880b = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f283879a;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-33554433) : n17 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62));
        r45.u85 u85Var = new r45.u85();
        u85Var.f387136d = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        u85Var.f387137e = !z17 ? 1 : 0;
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(39, u85Var));
        com.tencent.mm.ui.z9 z9Var = this.f283880b;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
