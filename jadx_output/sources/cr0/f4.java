package cr0;

/* loaded from: classes12.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f221626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f221627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(long j17, long j18) {
        super(1);
        this.f221626d = j17;
        this.f221627e = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats) obj).f68696i;
        return java.lang.Boolean.valueOf(this.f221626d <= j17 && j17 <= this.f221627e);
    }
}
