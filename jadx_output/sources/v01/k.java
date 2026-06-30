package v01;

/* loaded from: classes11.dex */
public final class k implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432209a;

    public k(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment) {
        this.f432209a = bizProfileCardFragment;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileCardFragment", "openPublish success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        boolean z18 = false;
        if (jSONObject != null && jSONObject.optBoolean("initSuccess")) {
            z18 = true;
        }
        if (z18) {
            int i17 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
            this.f432209a.A0();
        }
    }
}
