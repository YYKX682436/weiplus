package e04;

/* loaded from: classes5.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f246029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu5.c f246030e;

    public n1(java.lang.Runnable runnable, wu5.c cVar) {
        this.f246029d = runnable;
        this.f246030e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object valueOf;
        java.lang.Runnable runnable = this.f246029d;
        if (runnable instanceof st5.c) {
            valueOf = "open_" + ((st5.c) runnable).hashCode();
        } else if (runnable instanceof st5.a) {
            valueOf = "preview_" + ((st5.a) runnable).hashCode();
        } else {
            valueOf = java.lang.Integer.valueOf(runnable.hashCode());
        }
        java.util.HashMap hashMap = e04.t1.f246103k;
        java.lang.String obj = valueOf.toString();
        wu5.c futureTask = this.f246030e;
        kotlin.jvm.internal.o.f(futureTask, "$futureTask");
        hashMap.put(obj, new e04.s1(futureTask, runnable));
    }
}
