package cr0;

/* loaded from: classes12.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f221602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(long j17, int i17) {
        super(1);
        this.f221602d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = this.f221602d;
        long j18 = j17 - 600000;
        long j19 = ((com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats) obj).f68696i;
        return java.lang.Boolean.valueOf(j18 <= j19 && j19 <= j17);
    }
}
