package g22;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267801d;

    public d0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f267801d = emojiStoreV3HomeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI.f98433v;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f267801d;
        emojiStoreV3HomeUI.getClass();
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, new g22.f0(emojiStoreV3HomeUI));
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
