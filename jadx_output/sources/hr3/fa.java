package hr3;

/* loaded from: classes11.dex */
public class fa implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283549a;

    public fa(hr3.va vaVar) {
        this.f283549a = vaVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "OpenLiteApp fail");
        this.f283549a.e();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "OpenLiteApp success");
    }
}
