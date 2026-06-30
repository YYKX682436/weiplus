package zk5;

/* loaded from: classes14.dex */
public class c implements com.tencent.mm.pluginsdk.ui.websearch.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.websearch.WebSearchVoiceUI f473549a;

    public c(com.tencent.mm.ui.websearch.WebSearchVoiceUI webSearchVoiceUI) {
        this.f473549a = webSearchVoiceUI;
    }

    public void a() {
        com.tencent.mm.ui.websearch.WebSearchVoiceUI webSearchVoiceUI = this.f473549a;
        webSearchVoiceUI.setResult(0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15178, 4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", webSearchVoiceUI.f211226f, webSearchVoiceUI.f211227g, java.lang.Integer.valueOf(webSearchVoiceUI.f211228h), java.lang.Integer.valueOf(webSearchVoiceUI.f211229i));
        webSearchVoiceUI.finish();
    }
}
