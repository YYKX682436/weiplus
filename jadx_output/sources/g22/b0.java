package g22;

/* loaded from: classes.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267797d;

    public b0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f267797d = emojiStoreV3HomeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeUI", "finish");
        this.f267797d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
