package zs4;

/* loaded from: classes9.dex */
public class g implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f475290c;

    public g(zs4.q qVar, int i17, java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f475288a = i17;
        this.f475289b = str;
        this.f475290c = mMActivity;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.r0(3, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f475288a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f475289b);
        intent.putExtra("showShare", false);
        com.tencent.mm.wallet_core.ui.r1.T(this.f475290c, intent);
    }
}
