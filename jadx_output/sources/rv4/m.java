package rv4;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f400521a;

    public m(int i17, org.json.JSONObject config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f400521a = config.optLong("minTimestamp");
    }
}
