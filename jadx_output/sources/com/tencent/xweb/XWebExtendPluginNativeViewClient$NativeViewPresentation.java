package com.tencent.xweb;

/* loaded from: classes7.dex */
class XWebExtendPluginNativeViewClient$NativeViewPresentation extends android.app.Presentation {
    private final com.tencent.xweb.j2 mClient;
    private android.widget.FrameLayout mContentView;
    private boolean mStartFocused;
    final /* synthetic */ com.tencent.xweb.j2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XWebExtendPluginNativeViewClient$NativeViewPresentation(com.tencent.xweb.j2 j2Var, android.content.Context context, android.view.Display display, boolean z17, com.tencent.xweb.j2 j2Var2) {
        super(context, display);
        this.this$0 = j2Var;
        this.mStartFocused = false;
        getWindow().setFlags(8, 8);
        this.mStartFocused = z17;
        this.mClient = j2Var2;
    }

    public void detach() {
        android.widget.FrameLayout frameLayout = this.this$0.f220321a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.this$0.f220321a = new android.widget.FrameLayout(getContext());
        android.widget.FrameLayout frameLayout = this.mContentView;
        if (frameLayout != null) {
            if (this.mStartFocused) {
                frameLayout.requestFocus();
            }
            this.this$0.f220321a.addView(this.mContentView);
        }
        setContentView(this.this$0.f220321a);
        this.this$0.getClass();
    }
}
