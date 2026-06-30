package xb3;

/* loaded from: classes9.dex */
public class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI f452899a;

    public f(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f452899a = luckyMoneyHKReceiveUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f452899a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.p43 p43Var = (r45.p43) fVar.f70618d;
            if (p43Var.f382727d == 0) {
                gb3.l.b(luckyMoneyHKReceiveUI.f145149w, com.tencent.mm.plugin.luckymoney.model.g5.e(p43Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "go to before detail ui");
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(luckyMoneyHKReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.class);
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_jump_from", 2);
                intent.putExtra("key_native_url", luckyMoneyHKReceiveUI.f145150x);
                intent.putExtra("key_sendid", luckyMoneyHKReceiveUI.f145149w);
                intent.putExtra("key_anim_slide", true);
                intent.putExtra("key_username", luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"));
                intent.putExtra("key_way", luckyMoneyHKReceiveUI.f145151y);
                intent.putExtra("key_msgid", luckyMoneyHKReceiveUI.f145152z);
                intent.putExtra("key_hk_scene", luckyMoneyHKReceiveUI.getIntent().getIntExtra("key_hk_scene", 0));
                com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch();
                luckyMoneyEmojiSwitch.f145155f = p43Var.H;
                luckyMoneyEmojiSwitch.f145156g = p43Var.I;
                intent.putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(luckyMoneyHKReceiveUI, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "gotoBeforeDetailUI", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyHKReceiveUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(luckyMoneyHKReceiveUI, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "gotoBeforeDetailUI", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                java.lang.String str = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.B;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(p43Var.f382728e)) {
                    str = p43Var.f382728e;
                }
                db5.e1.T(luckyMoneyHKReceiveUI.getContext(), str);
            }
        } else {
            java.lang.String str2 = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.B;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.f70617c)) {
                str2 = fVar.f70617c;
            }
            db5.e1.T(luckyMoneyHKReceiveUI.getContext(), str2);
        }
        luckyMoneyHKReceiveUI.finish();
        return null;
    }
}
