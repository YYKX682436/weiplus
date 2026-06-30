package ze;

/* loaded from: classes7.dex */
public abstract class m extends com.tencent.mm.plugin.appbrand.l5 {

    /* renamed from: r, reason: collision with root package name */
    public xi1.p f471740r;

    @Override // xi1.s
    public boolean forceLightMode() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.l5, xi1.g, xi1.s
    public xi1.p getOrientationHandler() {
        if (this.f471740r == null) {
            this.f471740r = new zi1.b(this);
        }
        return this.f471740r;
    }
}
