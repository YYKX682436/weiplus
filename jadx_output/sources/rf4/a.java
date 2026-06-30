package rf4;

/* loaded from: classes4.dex */
public final class a extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395015f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f395016g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494130f1);
        kotlin.jvm.internal.o.g(context, "context");
        this.f395015f = new com.tencent.mm.plugin.story.ui.view.StoryCommentInputView(context, null);
        this.f395016g = new android.view.ViewGroup.LayoutParams(-1, -1);
        C(1);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f395015f.getClass();
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        setContentView(this.f395015f, this.f395016g);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(36);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f395015f.requestFocus();
    }
}
