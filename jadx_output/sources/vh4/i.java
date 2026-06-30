package vh4;

/* loaded from: classes.dex */
public final class i implements uh4.d {

    /* renamed from: d, reason: collision with root package name */
    public static final vh4.i f437082d = new vh4.i();

    @Override // uh4.d
    public boolean b(long j17, long j18) {
        return j18 - j17 > 3600000;
    }

    @Override // uh4.d
    public boolean c(long j17, long j18) {
        long j19 = com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
        return j18 / j19 != j17 / j19;
    }
}
