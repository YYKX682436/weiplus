package vz5;

/* loaded from: classes14.dex */
public final class j extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayDeque f441794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz5.l f441795g;

    public j(vz5.l lVar) {
        this.f441795g = lVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f441794f = arrayDeque;
        if (lVar.f441797a.isDirectory()) {
            arrayDeque.push(c(lVar.f441797a));
        } else if (lVar.f441797a.isFile()) {
            arrayDeque.push(new vz5.h(this, lVar.f441797a));
        } else {
            this.f313962d = 2;
        }
    }

    @Override // kz5.c
    public void b() {
        java.io.File file;
        java.io.File a17;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.f441794f;
            vz5.k kVar = (vz5.k) arrayDeque.peek();
            if (kVar == null) {
                file = null;
                break;
            }
            a17 = kVar.a();
            if (a17 == null) {
                arrayDeque.pop();
            } else if (kotlin.jvm.internal.o.b(a17, kVar.f441796a) || !a17.isDirectory() || arrayDeque.size() >= this.f441795g.f441799c) {
                break;
            } else {
                arrayDeque.push(c(a17));
            }
        }
        file = a17;
        if (file == null) {
            this.f313962d = 2;
        } else {
            this.f313963e = file;
            this.f313962d = 1;
        }
    }

    public final vz5.f c(java.io.File file) {
        int ordinal = this.f441795g.f441798b.ordinal();
        if (ordinal == 0) {
            return new vz5.i(this, file);
        }
        if (ordinal == 1) {
            return new vz5.g(this, file);
        }
        throw new jz5.j();
    }
}
