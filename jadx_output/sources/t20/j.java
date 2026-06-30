package t20;

@j95.b
/* loaded from: classes11.dex */
public final class j extends i95.w implements c00.c4, y02.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y02.v0 f414680d;

    public j() {
        y02.v0 a17 = y02.x0.f458634d.a();
        kotlin.jvm.internal.o.d(a17);
        this.f414680d = a17;
    }

    @Override // y02.v0
    public void G(bw5.d5 key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f414680d.G(key, i17);
    }

    @Override // y02.v0
    public void bb(bw5.d5 key, int i17, java.lang.String extra, bw5.e5 sampleRate) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(extra, "extra");
        kotlin.jvm.internal.o.g(sampleRate, "sampleRate");
        this.f414680d.bb(key, i17, extra, sampleRate);
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public long getStrongPointer() {
        return this.f414680d.getStrongPointer();
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public long getWeakPointer() {
        return this.f414680d.getWeakPointer();
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public boolean isProxy() {
        return this.f414680d.isProxy();
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        this.f414680d.notifyFieldUpdated(i17);
    }

    @Override // y02.v0
    public void p1(bw5.d5 key, int i17, java.lang.String extra) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(extra, "extra");
        this.f414680d.p1(key, i17, extra);
    }
}
