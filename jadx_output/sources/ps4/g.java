package ps4;

@j95.b
/* loaded from: classes9.dex */
public class g extends i95.w implements o05.l {

    /* renamed from: d, reason: collision with root package name */
    public o05.k f358151d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.g f358152e = new ps4.e(this);

    public void Ai(android.view.ViewGroup viewGroup) {
        if (viewGroup instanceof com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) {
            ((com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) viewGroup).u();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletService", "showNumKeyboard error, kbView is not WcPayKeyboard");
        }
    }

    public void Bi(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("real_name_verify_mode", 2);
        com.tencent.mm.wallet_core.a.j(activity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
    }

    public android.view.ViewGroup wi(android.content.Context context, android.view.ViewGroup viewGroup, o05.j jVar) {
        if (viewGroup == null) {
            return null;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard(context, true);
        viewGroup.addView(wcPayKeyboard);
        wcPayKeyboard.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = wcPayKeyboard.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        wcPayKeyboard.setLayoutParams(layoutParams);
        wcPayKeyboard.setActionText(context.getString(com.tencent.mm.R.string.hys));
        wcPayKeyboard.setInnerMode(true);
        wcPayKeyboard.H = new ps4.f(this, jVar);
        return wcPayKeyboard;
    }
}
