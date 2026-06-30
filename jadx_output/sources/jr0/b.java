package jr0;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f301322d;

    public b(jr0.c cVar, org.json.JSONObject jSONObject) {
        this.f301322d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AnrReportListener", "[happen] %s", this.f301322d.toString());
    }
}
