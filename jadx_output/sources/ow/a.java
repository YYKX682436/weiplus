package ow;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ow.a f349239d = new ow.a();

    @Override // java.lang.Runnable
    public final void run() {
        if (zv.q.f476079a.g()) {
            dw.f.f244070a.a();
            com.tencent.mm.storage.f9 c17 = ow.n.f349259a.c();
            if (c17 != null) {
                com.tencent.mm.sdk.platformtools.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.getMsgId()).apply();
            }
        }
    }
}
