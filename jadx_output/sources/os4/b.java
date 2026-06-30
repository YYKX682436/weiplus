package os4;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f348265d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f348266e;

    public b(androidx.lifecycle.j0 j0Var, java.lang.Object obj, kotlin.jvm.internal.i iVar) {
        this.f348265d = j0Var;
        this.f348266e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f348265d.setValue(this.f348266e);
    }
}
