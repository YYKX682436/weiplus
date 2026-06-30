package ur;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView f430272d;

    public d(com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView emojiSearchEditTextView) {
        this.f430272d = emojiSearchEditTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur.g gVar = ur.g.ClearText;
        com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView emojiSearchEditTextView = this.f430272d;
        emojiSearchEditTextView.f64955m = gVar;
        emojiSearchEditTextView.f64951f.setText("");
        emojiSearchEditTextView.f64951f.setHint(emojiSearchEditTextView.f64952g);
        emojiSearchEditTextView.f64950e.setVisibility(8);
        emojiSearchEditTextView.f64955m = ur.g.UserInput;
        emojiSearchEditTextView.getClass();
        yj0.a.h(this, "com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
