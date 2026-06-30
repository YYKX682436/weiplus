package wm5;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm5.e f447347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wm5.e eVar) {
        super(0);
        this.f447347d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wm5.e eVar = this.f447347d;
        long j17 = eVar.f447350c;
        return java.lang.Long.valueOf(j17 > 0 ? eVar.f447349b / j17 : 0L);
    }
}
