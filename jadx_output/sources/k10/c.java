package k10;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k10.a f303168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303169f;

    public c(java.lang.String str, k10.a aVar, android.content.Context context) {
        this.f303167d = str;
        this.f303168e = aVar;
        this.f303169f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2 = this.f303167d;
        k10.a aVar = this.f303168e;
        try {
            k10.d dVar = k10.d.f303170a;
            org.json.JSONObject b17 = k10.d.b(dVar, str2 + "/meta");
            java.lang.String optString = b17.optString("bizName", "");
            int optInt = b17.optInt("version", 0);
            org.json.JSONObject optJSONObject = b17.optJSONObject("ecsExt");
            if (optJSONObject == null || (str = optJSONObject.toString()) == null) {
                str = "{}";
            }
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() == 0) {
                ((g10.u) aVar).a("/meta 返回的 bizName 为空");
                return;
            }
            com.tencent.mm.vfs.r6 a17 = k10.d.a(dVar, this.f303169f, str2 + "/wspkg", optString);
            double d17 = (double) 1024;
            kotlin.jvm.internal.o.f(java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((((double) com.tencent.mm.vfs.w6.k(a17.o())) / d17) / d17)}, 1)), "format(...)");
            a17.o();
            ((g10.u) aVar).b(a17, optString, optInt, str);
        } catch (java.lang.Exception e17) {
            ((g10.u) aVar).a("Local Preview 失败: " + e17.getMessage() + "\n请确认手机和电脑在同一局域网，且 nirvana preview --local 服务正在运行");
        }
    }
}
