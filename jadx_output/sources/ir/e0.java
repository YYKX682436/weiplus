package ir;

/* loaded from: classes15.dex */
public final class e0 extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f293831b;

    public e0(int i17) {
        super(8);
        this.f293831b = i17;
    }

    @Override // ir.u0
    public boolean a(java.lang.Object obj) {
        if (equals(obj) && (obj instanceof ir.e0)) {
            if (this.f293831b == ((ir.e0) obj).f293831b) {
                return true;
            }
        }
        return false;
    }
}
