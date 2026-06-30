package zk2;

/* loaded from: classes2.dex */
public final class c extends bz2.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f473431g;

    /* renamed from: h, reason: collision with root package name */
    public final int f473432h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.a initTask, kotlinx.coroutines.r2 r2Var, androidx.lifecycle.y yVar, int i17, int i18) {
        super(initTask, r2Var, yVar);
        kotlin.jvm.internal.o.g(initTask, "initTask");
        this.f473431g = i17;
        this.f473432h = i18;
    }

    @Override // ay1.l
    public by1.d a() {
        return new zk2.b(this.f473431g, this.f473432h);
    }
}
