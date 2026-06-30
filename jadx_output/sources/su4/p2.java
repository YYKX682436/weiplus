package su4;

/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.ww5 f413037a;

    public static r45.ww5 a() {
        if (f413037a == null) {
            java.lang.String str = "key_pb_history_list" + c01.z1.r();
            f413037a = new r45.ww5();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("fts_history_search_sp", 0).getString(str, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                try {
                    f413037a.parseFrom(android.util.Base64.decode(string.getBytes(), 0));
                } catch (java.io.IOException unused) {
                }
            }
        }
        return f413037a;
    }
}
