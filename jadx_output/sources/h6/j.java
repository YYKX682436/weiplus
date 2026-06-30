package h6;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f279125a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f279126b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f279127c;

    public j(boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        z19 = (i17 & 4) != 0 ? true : z19;
        this.f279125a = z17;
        this.f279126b = z18;
        this.f279127c = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6.j)) {
            return false;
        }
        h6.j jVar = (h6.j) obj;
        return this.f279125a == jVar.f279125a && this.f279126b == jVar.f279126b && this.f279127c == jVar.f279127c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z17 = this.f279125a;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = i17 * 31;
        boolean z18 = this.f279126b;
        int i19 = z18;
        if (z18 != 0) {
            i19 = 1;
        }
        int i27 = (i18 + i19) * 31;
        boolean z19 = this.f279127c;
        return i27 + (z19 ? 1 : z19 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "ImageLoaderOptions(addLastModifiedToFileCacheKey=" + this.f279125a + ", launchInterceptorChainOnMainThread=" + this.f279126b + ", networkObserverEnabled=" + this.f279127c + ')';
    }
}
