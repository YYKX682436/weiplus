package oj1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.WxaExposedParams f345753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams) {
        super(1);
        this.f345752d = str;
        this.f345753e = wxaExposedParams;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity it = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.mmSetOnActivityResultCallback(new oj1.b(this.f345752d, it));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, it.getString(com.tencent.mm.R.string.f490254ph));
        intent.putExtra("rawUrl", com.tencent.mm.plugin.appbrand.v9.a(this.f345753e));
        intent.putExtra("forceHideShare", true);
        j45.l.o(it, "webview", ".ui.tools.WebViewUI", intent, cf.b.a(it), true);
        it.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        return jz5.f0.f302826a;
    }
}
