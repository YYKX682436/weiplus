package ox;

/* loaded from: classes7.dex */
public final class l implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk.p f349493a;

    public l(tk.p pVar) {
        this.f349493a = pVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MircoMsg.BizPublishImageExternalService", "hookPublishCallback, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17 && jSONObject == null) {
            return;
        }
        this.f349493a.a(z17, err_msg, jSONObject);
    }
}
