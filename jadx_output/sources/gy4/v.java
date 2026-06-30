package gy4;

/* loaded from: classes5.dex */
public final class v extends wm3.n {

    /* renamed from: e, reason: collision with root package name */
    public final ct.j3 f277633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277633e = (ct.j3) i95.n0.c(ct.j3.class);
    }

    @Override // wm3.n
    public j75.a T6() {
        gy4.d dVar = new gy4.d();
        java.lang.String stringExtra = getIntent().getStringExtra("key_yuanbao_webview_scene");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dVar.f277590e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_yuanbao_webview_host");
        if (stringExtra2 == null) {
            throw new java.lang.IllegalArgumentException("host is required");
        }
        dVar.f277591f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_yuanbao_webview_session_id");
        if (stringExtra3 == null) {
            throw new java.lang.IllegalArgumentException("sessionId is required");
        }
        dVar.f277592g = stringExtra3;
        dVar.f277593h = getIntent().getBooleanExtra("key_yuanbao_webview_old_protocol", false);
        return dVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        qg5.z2 z2Var = (qg5.z2) this.f277633e;
        z2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[setHalfScreenWebViewOpen] value: true");
        z2Var.f363275q = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        qg5.z2 z2Var = (qg5.z2) this.f277633e;
        z2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[setHalfScreenWebViewOpen] value: false");
        z2Var.f363275q = false;
    }
}
