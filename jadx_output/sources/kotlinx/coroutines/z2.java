package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class z2 implements kotlinx.coroutines.k2 {
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder = null;
    private volatile /* synthetic */ int _isCompleting;
    private volatile /* synthetic */ java.lang.Object _rootCause;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.h3 f310709d;

    public z2(kotlinx.coroutines.h3 h3Var, boolean z17, java.lang.Throwable th6) {
        this.f310709d = h3Var;
        this._isCompleting = z17 ? 1 : 0;
        this._rootCause = th6;
    }

    @Override // kotlinx.coroutines.k2
    public boolean a() {
        return ((java.lang.Throwable) this._rootCause) == null;
    }

    public final void b(java.lang.Throwable th6) {
        java.lang.Throwable th7 = (java.lang.Throwable) this._rootCause;
        if (th7 == null) {
            this._rootCause = th6;
            return;
        }
        if (th6 == th7) {
            return;
        }
        java.lang.Object obj = this._exceptionsHolder;
        if (obj == null) {
            this._exceptionsHolder = th6;
            return;
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof java.util.ArrayList) {
                ((java.util.ArrayList) obj).add(th6);
                return;
            } else {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th6 == obj) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th6);
        this._exceptionsHolder = arrayList;
    }

    public final java.lang.Throwable c() {
        return (java.lang.Throwable) this._rootCause;
    }

    public final boolean d() {
        return ((java.lang.Throwable) this._rootCause) != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean e() {
        return this._isCompleting;
    }

    @Override // kotlinx.coroutines.k2
    public kotlinx.coroutines.h3 f() {
        return this.f310709d;
    }

    public final boolean g() {
        return this._exceptionsHolder == kotlinx.coroutines.d3.f310165e;
    }

    public final java.util.List h(java.lang.Throwable th6) {
        java.util.ArrayList arrayList;
        java.lang.Object obj = this._exceptionsHolder;
        if (obj == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (obj instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (java.util.ArrayList) obj;
        }
        java.lang.Throwable th7 = (java.lang.Throwable) this._rootCause;
        if (th7 != null) {
            arrayList.add(0, th7);
        }
        if (th6 != null && !kotlin.jvm.internal.o.b(th6, th7)) {
            arrayList.add(th6);
        }
        this._exceptionsHolder = kotlinx.coroutines.d3.f310165e;
        return arrayList;
    }

    public final void i(boolean z17) {
        this._isCompleting = z17 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
    public java.lang.String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((java.lang.Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f310709d + ']';
    }
}
