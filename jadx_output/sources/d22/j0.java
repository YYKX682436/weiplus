package d22;

/* loaded from: classes12.dex */
public final class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f225849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225850e;

    public j0(d22.k0 k0Var, android.content.Context context) {
        this.f225849d = k0Var;
        this.f225850e = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        y12.h Ni;
        int itemId = menuItem.getItemId();
        d22.k0 k0Var = this.f225849d;
        k0Var.getClass();
        android.content.Context context = this.f225850e;
        if (itemId == 0) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = k0Var.f225852i;
            int i18 = emojiInfo.field_catalog;
            l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
            if (i18 == 17) {
                return;
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            if (com.tencent.mm.storage.n5.f().c().u1(emojiInfo.getMd5()) == null) {
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
            }
            com.tencent.mm.feature.emoji.b0 b0Var = (com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class);
            if (b0Var != null && (Ni = b0Var.Ni()) != null) {
                Ni.U(context, emojiInfo, k0Var.f364223a + 100000 + 1000000, k0Var.f364225c);
            }
            k0Var.c(3);
            return;
        }
        if (itemId == k0Var.f225854k) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = k0Var.f225852i;
            if (com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo2.getMd5())) {
                com.tencent.mars.xlog.Log.w(k0Var.f225853j, "forward failed. emojiMsgWrap is null.");
                return;
            }
            new lb5.a().n(emojiInfo2.getMd5());
            emojiInfo2.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_PREVIEW;
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).hj(context, emojiInfo2.getMd5(), emojiInfo2);
            k0Var.c(1);
            return;
        }
        if (itemId != k0Var.f225856m) {
            if (itemId == k0Var.f225855l) {
                k0Var.c(5);
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211780g = 2;
                e4Var.f211776c = context.getText(com.tencent.mm.R.string.ggc);
                new rr.e(context, k0Var.f225852i, null, new d22.g0(e4Var.c(), context, k0Var));
                return;
            }
            return;
        }
        android.content.Context context2 = this.f225850e;
        k0Var.getClass();
        if (j62.e.g().l("clicfg_emoji_expose_config_switch_android", false, false, true)) {
            android.os.Bundle bundle = new android.os.Bundle();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":51}");
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.add(k0Var.f364230h);
            bundle2.putStringArrayList("k_outside_expose_proof_item_list", arrayList);
            if (com.tencent.mm.sdk.platformtools.t8.K0(k0Var.f364228f)) {
                bundle2.putString("k_username", k0Var.f364225c);
            } else {
                bundle2.putString("k_username", k0Var.f364228f);
            }
            bundle2.putLong("k_expose_msg_id", k0Var.f364229g);
            bundle2.putInt("k_expose_msg_type", 47);
            bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
            com.tencent.mars.xlog.Log.i(k0Var.f225853j, "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var != null) {
                ((com.tencent.mm.feature.lite.i) g0Var).kk(context2, bundle, true, false, new d22.h0(k0Var, context2));
            }
        } else {
            k0Var.a(context2);
        }
        k0Var.c(6);
    }
}
