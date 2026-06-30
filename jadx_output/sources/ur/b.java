package ur;

/* loaded from: classes14.dex */
public class b implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView f430270d;

    public b(com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView emojiSearchEditTextView) {
        this.f430270d = emojiSearchEditTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView emojiSearchEditTextView = this.f430270d;
        java.lang.String totalQuery = emojiSearchEditTextView.getTotalQuery();
        java.lang.String str = emojiSearchEditTextView.f64954i;
        if (totalQuery == str || totalQuery.equals(str)) {
            return;
        }
        emojiSearchEditTextView.f64954i = totalQuery;
        if (totalQuery.length() > 0) {
            emojiSearchEditTextView.f64950e.setVisibility(0);
        } else {
            emojiSearchEditTextView.f64950e.setVisibility(8);
        }
        if (emojiSearchEditTextView.getInEditTextQuery().length() == 0) {
            emojiSearchEditTextView.f64951f.setHint(emojiSearchEditTextView.f64952g);
        }
    }
}
