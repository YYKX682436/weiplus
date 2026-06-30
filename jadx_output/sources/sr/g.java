package sr;

/* loaded from: classes5.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.view.EmojiPanelInputComponent f411393d;

    public g(com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent) {
        this.f411393d = emojiPanelInputComponent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/view/EmojiPanelInputComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = this.f411393d;
        if ("keyboard".equals(emojiPanelInputComponent.f64940i.getTag())) {
            sr.k kVar = emojiPanelInputComponent.f64945q;
            if (kVar != null) {
                kVar.hideVKB();
            }
            emojiPanelInputComponent.f64938g.i();
            emojiPanelInputComponent.setBottomPanelHeight(emojiPanelInputComponent.f64943o);
            if (com.tencent.mm.sdk.platformtools.d2.j(emojiPanelInputComponent.getContext())) {
                int j17 = com.tencent.mm.ui.bk.j(emojiPanelInputComponent.getContext());
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelInputComponent", "is show key board %d, %d, %d", java.lang.Integer.valueOf(emojiPanelInputComponent.f64942n), java.lang.Integer.valueOf(emojiPanelInputComponent.f64941m), java.lang.Integer.valueOf(j17));
                int i17 = emojiPanelInputComponent.f64942n;
                if ((i17 > 0 && i17 < emojiPanelInputComponent.f64941m - j17) || emojiPanelInputComponent.f64944p) {
                    emojiPanelInputComponent.f64944p = false;
                    emojiPanelInputComponent.getInputPanelHelper().e(new sr.j(emojiPanelInputComponent));
                    emojiPanelInputComponent.f64939h.k();
                    emojiPanelInputComponent.f64940i.setImageResource(com.tencent.mm.R.drawable.f481236o2);
                    emojiPanelInputComponent.f64940i.setTag("emoji");
                }
            }
            emojiPanelInputComponent.f64938g.setVisibility(0);
            emojiPanelInputComponent.f64939h.k();
            emojiPanelInputComponent.f64940i.setImageResource(com.tencent.mm.R.drawable.f481236o2);
            emojiPanelInputComponent.f64940i.setTag("emoji");
        } else {
            emojiPanelInputComponent.f64939h.k();
            emojiPanelInputComponent.g();
            sr.k kVar2 = emojiPanelInputComponent.f64945q;
            if (kVar2 != null) {
                kVar2.showVKB();
            }
            emojiPanelInputComponent.f64940i.setImageResource(com.tencent.mm.R.drawable.f481235o1);
            emojiPanelInputComponent.f64940i.setTag("keyboard");
        }
        yj0.a.h(this, "com/tencent/mm/emoji/view/EmojiPanelInputComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
