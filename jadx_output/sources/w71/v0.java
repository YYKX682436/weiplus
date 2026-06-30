package w71;

/* loaded from: classes11.dex */
public abstract class v0 extends com.tencent.unit_rc.BaseObject implements w71.t0 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j20 f443458d = new bw5.j20();

    @Override // w71.t0
    public void Jg(bw5.j20 openParams) {
        kotlin.jvm.internal.o.g(openParams, "openParams");
        this.f443458d = openParams;
        notifyFieldUpdated(0);
    }

    @Override // w71.t0
    public bw5.j20 Pa() {
        return this.f443458d;
    }
}
