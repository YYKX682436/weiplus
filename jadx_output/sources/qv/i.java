package qv;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w implements rv.q2 {
    public void Ai(com.tencent.mm.ui.MMActivity mMActivity, android.content.Intent intent) {
        if (mMActivity == null || intent == null) {
            return;
        }
        androidx.fragment.app.DialogFragment wi6 = ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).wi(mMActivity, intent, null, 0, true);
        wi6.setMenuVisibility(false);
        wi6.show(mMActivity.getSupportFragmentManager(), "BizContactInfoDialogFragment");
    }

    public void Bi(android.content.Context context, java.lang.String params, int i17) {
        eq1.x xVar = eq1.x.f255875a;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        xVar.a(context, params, i17, false, null, null, null, null);
    }

    public boolean wi() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_send_private_msg_scope_enable_android, 0) == 1;
    }
}
