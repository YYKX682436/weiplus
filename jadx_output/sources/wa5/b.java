package wa5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f444309a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f444310b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f444311c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f444312d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f444313e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f444314f;

    public b(boolean z17, boolean z18, java.util.List exitTransitionCoordinator, java.lang.ref.WeakReference weakReference, java.util.List animHelperViews, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        exitTransitionCoordinator = (i17 & 4) != 0 ? new java.util.ArrayList() : exitTransitionCoordinator;
        weakReference = (i17 & 8) != 0 ? null : weakReference;
        animHelperViews = (i17 & 16) != 0 ? new java.util.ArrayList() : animHelperViews;
        z19 = (i17 & 32) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(exitTransitionCoordinator, "exitTransitionCoordinator");
        kotlin.jvm.internal.o.g(animHelperViews, "animHelperViews");
        this.f444309a = z17;
        this.f444310b = z18;
        this.f444311c = exitTransitionCoordinator;
        this.f444312d = weakReference;
        this.f444313e = animHelperViews;
        this.f444314f = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa5.b)) {
            return false;
        }
        wa5.b bVar = (wa5.b) obj;
        return this.f444309a == bVar.f444309a && this.f444310b == bVar.f444310b && kotlin.jvm.internal.o.b(this.f444311c, bVar.f444311c) && kotlin.jvm.internal.o.b(this.f444312d, bVar.f444312d) && kotlin.jvm.internal.o.b(this.f444313e, bVar.f444313e) && this.f444314f == bVar.f444314f;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Boolean.hashCode(this.f444309a) * 31) + java.lang.Boolean.hashCode(this.f444310b)) * 31) + this.f444311c.hashCode()) * 31;
        java.lang.ref.WeakReference weakReference = this.f444312d;
        return ((((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.f444313e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f444314f);
    }

    public java.lang.String toString() {
        return "ActivityTransitionState(hasSetObserver=" + this.f444309a + ", isCreateByTransition=" + this.f444310b + ", exitTransitionCoordinator=" + this.f444311c + ", exitSharedElementCallback=" + this.f444312d + ", animHelperViews=" + this.f444313e + ", hasEndTransition=" + this.f444314f + ')';
    }
}
