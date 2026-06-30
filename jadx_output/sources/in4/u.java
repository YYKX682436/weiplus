package in4;

/* loaded from: classes8.dex */
public class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog f292994d;

    public u(com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog) {
        this.f292994d = topStoryCommentFloatDialog;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.f175255t;
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f292994d;
        topStoryCommentFloatDialog.f();
        topStoryCommentFloatDialog.g();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
