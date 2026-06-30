package z63;

/* loaded from: classes5.dex */
public class w0 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z63.x0 f470447a;

    public w0(z63.x0 x0Var) {
        this.f470447a = x0Var;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "dealWithRequestCode() REQUEST_CODE_VIEW_GROUP_SOLITATIRE resultCode:%s", java.lang.Integer.valueOf(i18));
            if (-1 == i18) {
                z63.x0 x0Var = this.f470447a;
                z63.e1 e1Var = x0Var.f470449d.f470386g;
                if (e1Var != null) {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.b2) e1Var).f190185a;
                    chatFooter.D();
                    chatFooter.b1();
                    z63.f1 f1Var = x0Var.f470449d;
                    f1Var.f470389j = "";
                    f1Var.f470397r = null;
                    f1Var.f470391l = null;
                    if (intent != null) {
                        z63.e1 e1Var2 = f1Var.f470386g;
                        java.lang.String stringExtra = intent.getStringExtra("key_group_solitatire_content");
                        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = ((com.tencent.mm.pluginsdk.ui.chat.b2) e1Var2).f190185a;
                        if (chatFooter2.f190090x0 != null && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                            chatFooter2.f190090x0.h(stringExtra);
                        }
                    }
                    f1Var.f470388i = true;
                }
            }
        }
    }
}
