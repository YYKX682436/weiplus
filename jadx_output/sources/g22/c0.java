package g22;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267799d;

    public c0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f267799d = emojiStoreV3HomeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI.f98433v;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f267799d;
        emojiStoreV3HomeUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(emojiStoreV3HomeUI, com.tencent.mm.plugin.emoji.ui.EmojiMineUI.class);
        intent.putExtra("from_store", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(emojiStoreV3HomeUI, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI", "enterMine", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreV3HomeUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(emojiStoreV3HomeUI, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI", "enterMine", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        Di.a(44);
        Di.q("stickernavright");
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
