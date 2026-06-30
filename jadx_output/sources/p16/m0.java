package p16;

/* loaded from: classes16.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Stack f351321d = new java.util.Stack();

    /* renamed from: e, reason: collision with root package name */
    public p16.f0 f351322e;

    public m0(p16.g gVar, p16.k0 k0Var) {
        while (gVar instanceof p16.o0) {
            p16.o0 o0Var = (p16.o0) gVar;
            this.f351321d.push(o0Var);
            gVar = o0Var.f351332f;
        }
        this.f351322e = (p16.f0) gVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p16.f0 next() {
        p16.f0 f0Var;
        p16.f0 f0Var2 = this.f351322e;
        if (f0Var2 == null) {
            throw new java.util.NoSuchElementException();
        }
        while (true) {
            java.util.Stack stack = this.f351321d;
            if (stack.isEmpty()) {
                f0Var = null;
                break;
            }
            java.lang.Object obj = ((p16.o0) stack.pop()).f351333g;
            while (obj instanceof p16.o0) {
                p16.o0 o0Var = (p16.o0) obj;
                stack.push(o0Var);
                obj = o0Var.f351332f;
            }
            f0Var = (p16.f0) obj;
            if (!(f0Var.f351281e.length == 0)) {
                break;
            }
        }
        this.f351322e = f0Var;
        return f0Var2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351322e != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
