package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class s0 {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.internal.t0[] f310524a;

    public final void a(kotlinx.coroutines.internal.t0 t0Var) {
        kotlinx.coroutines.z1 z1Var = (kotlinx.coroutines.z1) t0Var;
        z1Var.j(this);
        kotlinx.coroutines.internal.t0[] t0VarArr = this.f310524a;
        if (t0VarArr == null) {
            t0VarArr = new kotlinx.coroutines.internal.t0[4];
            this.f310524a = t0VarArr;
        } else if (this._size >= t0VarArr.length) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(t0VarArr, this._size * 2);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            t0VarArr = (kotlinx.coroutines.internal.t0[]) copyOf;
            this.f310524a = t0VarArr;
        }
        int i17 = this._size;
        this._size = i17 + 1;
        t0VarArr[i17] = z1Var;
        z1Var.f310708e = i17;
        e(i17);
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final kotlinx.coroutines.internal.t0 c(int i17) {
        kotlinx.coroutines.internal.t0[] t0VarArr = this.f310524a;
        kotlin.jvm.internal.o.d(t0VarArr);
        this._size--;
        if (i17 < this._size) {
            f(i17, this._size);
            int i18 = (i17 - 1) / 2;
            if (i17 > 0) {
                kotlinx.coroutines.internal.t0 t0Var = t0VarArr[i17];
                kotlin.jvm.internal.o.d(t0Var);
                kotlinx.coroutines.internal.t0 t0Var2 = t0VarArr[i18];
                kotlin.jvm.internal.o.d(t0Var2);
                if (((java.lang.Comparable) t0Var).compareTo(t0Var2) < 0) {
                    f(i17, i18);
                    e(i18);
                }
            }
            while (true) {
                int i19 = (i17 * 2) + 1;
                if (i19 >= this._size) {
                    break;
                }
                kotlinx.coroutines.internal.t0[] t0VarArr2 = this.f310524a;
                kotlin.jvm.internal.o.d(t0VarArr2);
                int i27 = i19 + 1;
                if (i27 < this._size) {
                    kotlinx.coroutines.internal.t0 t0Var3 = t0VarArr2[i27];
                    kotlin.jvm.internal.o.d(t0Var3);
                    kotlinx.coroutines.internal.t0 t0Var4 = t0VarArr2[i19];
                    kotlin.jvm.internal.o.d(t0Var4);
                    if (((java.lang.Comparable) t0Var3).compareTo(t0Var4) < 0) {
                        i19 = i27;
                    }
                }
                kotlinx.coroutines.internal.t0 t0Var5 = t0VarArr2[i17];
                kotlin.jvm.internal.o.d(t0Var5);
                kotlinx.coroutines.internal.t0 t0Var6 = t0VarArr2[i19];
                kotlin.jvm.internal.o.d(t0Var6);
                if (((java.lang.Comparable) t0Var5).compareTo(t0Var6) <= 0) {
                    break;
                }
                f(i17, i19);
                i17 = i19;
            }
        }
        kotlinx.coroutines.internal.t0 t0Var7 = t0VarArr[this._size];
        kotlin.jvm.internal.o.d(t0Var7);
        kotlinx.coroutines.z1 z1Var = (kotlinx.coroutines.z1) t0Var7;
        z1Var.j(null);
        z1Var.f310708e = -1;
        t0VarArr[this._size] = null;
        return t0Var7;
    }

    public final kotlinx.coroutines.internal.t0 d() {
        kotlinx.coroutines.internal.t0 c17;
        synchronized (this) {
            c17 = this._size > 0 ? c(0) : null;
        }
        return c17;
    }

    public final void e(int i17) {
        while (i17 > 0) {
            kotlinx.coroutines.internal.t0[] t0VarArr = this.f310524a;
            kotlin.jvm.internal.o.d(t0VarArr);
            int i18 = (i17 - 1) / 2;
            kotlinx.coroutines.internal.t0 t0Var = t0VarArr[i18];
            kotlin.jvm.internal.o.d(t0Var);
            kotlinx.coroutines.internal.t0 t0Var2 = t0VarArr[i17];
            kotlin.jvm.internal.o.d(t0Var2);
            if (((java.lang.Comparable) t0Var).compareTo(t0Var2) <= 0) {
                return;
            }
            f(i17, i18);
            i17 = i18;
        }
    }

    public final void f(int i17, int i18) {
        kotlinx.coroutines.internal.t0[] t0VarArr = this.f310524a;
        kotlin.jvm.internal.o.d(t0VarArr);
        kotlinx.coroutines.internal.t0 t0Var = t0VarArr[i18];
        kotlin.jvm.internal.o.d(t0Var);
        kotlinx.coroutines.internal.t0 t0Var2 = t0VarArr[i17];
        kotlin.jvm.internal.o.d(t0Var2);
        t0VarArr[i17] = t0Var;
        t0VarArr[i18] = t0Var2;
        ((kotlinx.coroutines.z1) t0Var).f310708e = i17;
        ((kotlinx.coroutines.z1) t0Var2).f310708e = i18;
    }
}
