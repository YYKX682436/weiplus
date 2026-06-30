package sy;

/* loaded from: classes5.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413786a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f413787b;

    /* renamed from: c, reason: collision with root package name */
    public long f413788c;

    /* renamed from: d, reason: collision with root package name */
    public long f413789d;

    /* renamed from: e, reason: collision with root package name */
    public long f413790e;

    public c0(java.lang.String str) {
        this.f413786a = str;
    }

    public void a() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        java.lang.String str = this.f413786a;
        objArr[0] = str;
        objArr[1] = this.f413787b ? "true" : "false";
        objArr[2] = java.lang.Long.valueOf(this.f413788c);
        objArr[3] = java.lang.Long.valueOf(this.f413789d);
        objArr[4] = java.lang.Long.valueOf(this.f413790e);
        com.tencent.mars.xlog.Log.i("PluginMsgReporter", "report %s isMute:%s, recvMsgCount:%d, unreadMsgCount:%d, time:%d", objArr);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("plugin_type", str);
        hashMap.put("mute_type", java.lang.Integer.valueOf(this.f413787b ? 1 : 0));
        hashMap.put("receive_msg_cnt", java.lang.Long.valueOf(this.f413788c));
        hashMap.put("unread_msg_cnt", java.lang.Long.valueOf(this.f413789d));
        hashMap.put("out_background_ts", java.lang.Long.valueOf(this.f413790e));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("app_out_background", hashMap, 35186);
    }
}
