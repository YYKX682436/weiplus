package vt4;

/* loaded from: classes9.dex */
public class a implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440043a;

    public a(android.content.Context context) {
        this.f440043a = context;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayUUtil", "hy: user clicked the span");
        com.tencent.mm.wallet_core.ui.r1.V(this.f440043a, "https://www.payu.co.za/wechat/terms-and-conditions/", true);
    }
}
