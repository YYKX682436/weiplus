package ga3;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f269852a;

    /* renamed from: b, reason: collision with root package name */
    public final long f269853b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f269854c;

    public f(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorderHelper", "LiteAppRecorderHelper create appId:%s, appUuid:%d", str, java.lang.Long.valueOf(j17));
        this.f269852a = str;
        this.f269853b = j17;
    }

    public java.lang.String a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorderHelper", "LiteAppRecorderHelper stopRecord");
        return this.f269853b != ga3.v.g().f269884j ? ga3.v.g().i(this.f269854c, "recorder has been stopped", false) : ga3.v.g().k();
    }
}
