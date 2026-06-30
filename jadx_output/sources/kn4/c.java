package kn4;

/* loaded from: classes12.dex */
public abstract class c implements kn4.w {

    /* renamed from: a, reason: collision with root package name */
    public long f309675a = android.net.TrafficStats.getMobileRxBytes();

    /* renamed from: b, reason: collision with root package name */
    public long f309676b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f309677c;

    public c() {
        long mobileTxBytes = android.net.TrafficStats.getMobileTxBytes();
        this.f309676b = mobileTxBytes;
        this.f309677c = (this.f309675a == -1 || mobileTxBytes == -1) ? false : true;
    }
}
