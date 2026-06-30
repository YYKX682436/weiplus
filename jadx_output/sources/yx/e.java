package yx;

/* loaded from: classes5.dex */
public final class e implements com.tencent.mm.pluginsdk.ui.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.SpeechInputLayout f467013b;

    public e(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity, com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout) {
        this.f467012a = cBTBrandLiveActivity;
        this.f467013b = speechInputLayout;
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f467012a.f65278d, "vKBUpdate hideBtnGuide");
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void b(int i17) {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467012a;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "vKBUpdate btnState:" + i17);
        com.tencent.mm.ui.widget.MMEditText mMEditText = cBTBrandLiveActivity.f65281g;
        android.text.Editable text = mMEditText != null ? mMEditText.getText() : null;
        if (text == null || r26.n0.N(text)) {
            this.f467013b.c(i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void c(float f17, float f18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void d() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void e(float f17, float f18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void f() {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467012a;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "callShowVKB");
        cBTBrandLiveActivity.showVKB();
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void onHide() {
        com.tencent.mars.xlog.Log.i(this.f467012a.f65278d, "onHide");
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void onShow() {
        com.tencent.mars.xlog.Log.i(this.f467012a.f65278d, "onShow");
    }
}
