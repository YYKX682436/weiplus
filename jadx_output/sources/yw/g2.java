package yw;

/* loaded from: classes9.dex */
public final class g2 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466327b;

    public g2(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        this.f466326a = mMActivity;
        this.f466327b = bizShareInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f466327b.getUrl());
        intent.putExtra("hide_option_menu", true);
        j45.l.j(this.f466326a, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
