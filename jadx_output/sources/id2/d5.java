package id2;

/* loaded from: classes3.dex */
public final class d5 implements jl2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290539d;

    public d5(id2.f5 f5Var) {
        this.f290539d = f5Var;
    }

    @Override // jl2.b
    public void b0(int i17, long j17, yz5.q callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(v65.m.b(this.f290539d.getActivity()), null, null, new id2.c5(this.f290539d, j17, callback, null), 3, null);
    }

    @Override // jl2.b
    public void n(il2.a verifyData) {
        kotlin.jvm.internal.o.g(verifyData, "verifyData");
        android.content.Intent intent = new android.content.Intent();
        id2.f5 f5Var = this.f290539d;
        f5Var.f290572i = true;
        java.util.HashMap hashMap = f5Var.f290571h;
        int i17 = verifyData.f292033a + 194735;
        hashMap.put(java.lang.Integer.valueOf(i17), verifyData);
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", verifyData.f292035c);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(f5Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, i17);
    }
}
