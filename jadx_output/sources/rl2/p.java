package rl2;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f397206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17) {
        super(1);
        this.f397206d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((dm.s4) obj).field_liveId == this.f397206d);
    }
}
