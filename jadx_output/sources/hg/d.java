package hg;

/* loaded from: classes7.dex */
public class d implements com.tencent.mm.plugin.appbrand.widget.input.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg.h f281286a;

    public d(hg.h hVar) {
        this.f281286a = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.o3
    public void a(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        hg.h hVar = this.f281286a;
        com.tencent.mars.xlog.Log.i("WebViewExtendTextAreaClient", "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", valueOf, java.lang.Boolean.valueOf(hVar.f281307k));
        hVar.a(false);
    }
}
