package s75;

/* loaded from: classes11.dex */
public class b implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f404630d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Future f404631e;

    public b(java.lang.String str) {
        this.f404630d = str;
        this.f404631e = null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        try {
            java.util.concurrent.Future future = this.f404631e;
            return future != null ? (java.lang.String) future.get() : this.f404630d;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public java.lang.String toString() {
        java.lang.String str;
        try {
            java.util.concurrent.Future future = this.f404631e;
            str = future != null ? (java.lang.String) future.get() : this.f404630d;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            str = null;
        }
        return java.lang.String.valueOf(str);
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        try {
            java.util.concurrent.Future future = this.f404631e;
            return future != null ? (java.lang.String) future.get() : this.f404630d;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    public b(java.util.concurrent.Future future) {
        this.f404630d = null;
        this.f404631e = future;
    }
}
