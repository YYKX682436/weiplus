package ml1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml1.b f327189a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ml1.b bVar, android.os.Looper looper) {
        super(looper);
        this.f327189a = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (1000 == message.what) {
            java.lang.String str = (java.lang.String) message.obj;
            int i17 = message.arg1;
            if (this.f327189a.f327191b != null) {
                qc1.q qVar = (qc1.q) this.f327189a.f327191b;
                com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = qVar.f361487a;
                int i18 = q0Var.f91611p;
                if (q0Var.f91612q == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowKeyboard", "dispatchKBValue(%s), but get NULL inputWidget", qVar.f361488b);
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.n5 uVar = new qc1.u();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("value", com.tencent.mm.plugin.appbrand.utils.s0.d(str));
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, qVar.f361490d.F(i18));
                hashMap.put("cursor", java.lang.Integer.valueOf(i17));
                hashMap.put("inputId", java.lang.Integer.valueOf(i18));
                hashMap.put("keyCode", java.lang.Integer.valueOf(q0Var.f91612q.getLastKeyPressed()));
                uVar.t(hashMap);
                qVar.f361489c.i(uVar, null);
            }
        }
    }
}
