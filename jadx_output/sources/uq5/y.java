package uq5;

/* loaded from: classes10.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public long f430267a;

    /* renamed from: b, reason: collision with root package name */
    public uq5.j f430268b = new uq5.j(0, com.tencent.wcdb.core.Database.DictDefaultMatchValue);

    /* renamed from: c, reason: collision with root package name */
    public final long f430269c;

    public y(long j17) {
        this.f430269c = j17;
    }

    public final long a() {
        return this.f430267a;
    }

    public final void b(long j17, long j18) {
        uq5.j jVar = new uq5.j(j17, j18);
        this.f430268b = jVar;
        com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setEffectTime$renderlib_release(this.f430269c, jVar);
    }

    public abstract uq5.k c();

    public final void finalize() {
        com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.destroyEffect(this);
    }
}
