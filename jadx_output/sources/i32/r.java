package i32;

/* loaded from: classes13.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static i32.r f288137b;

    /* renamed from: a, reason: collision with root package name */
    public long f288138a;

    public r() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        long j17 = 0;
        if (sharedPreferences != null) {
            j17 = sharedPreferences.getLong("local_message_seq", 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "lasted seq id is %d", java.lang.Long.valueOf(j17));
        }
        this.f288138a = j17;
    }
}
