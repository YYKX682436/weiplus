package kr2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f311315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17) {
        super(1);
        this.f311315d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((kr2.w) obj).f311333a.getLong(0) == this.f311315d);
    }
}
