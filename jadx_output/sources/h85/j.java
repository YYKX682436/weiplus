package h85;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final h85.j f279584d = new h85.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").getLong("wifi_scan_result_update_timestamp", 0L));
    }
}
