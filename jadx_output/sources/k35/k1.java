package k35;

/* loaded from: classes15.dex */
public abstract class k1 extends java.lang.ThreadLocal implements k35.l1 {
    public k1(k35.d0 d0Var) {
        k35.m1.f303913a.add(this);
    }

    @Override // k35.l1
    public void reset() {
        set(initialValue());
    }
}
