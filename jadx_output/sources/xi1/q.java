package xi1;

/* loaded from: classes7.dex */
public abstract class q implements xi1.g {

    /* renamed from: d, reason: collision with root package name */
    public final xi1.g f454713d;

    /* renamed from: e, reason: collision with root package name */
    public final xi1.s f454714e;

    public q(xi1.g base, xi1.s windowViewImplScope) {
        kotlin.jvm.internal.o.g(base, "base");
        kotlin.jvm.internal.o.g(windowViewImplScope, "windowViewImplScope");
        this.f454713d = base;
        this.f454714e = windowViewImplScope;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xi1.g other = (xi1.g) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof xi1.q)) {
            return -1;
        }
        xi1.q qVar = (xi1.q) other;
        if (kotlin.jvm.internal.o.b(qVar.f454714e, this.f454714e)) {
            return this.f454713d.compareTo(qVar.f454713d);
        }
        return -1;
    }

    @Override // xi1.g, xi1.s
    public xi1.m createFullscreenHandler(xi1.k kVar) {
        xi1.m createFullscreenHandler = this.f454714e.createFullscreenHandler(kVar);
        if (createFullscreenHandler != null) {
            return createFullscreenHandler;
        }
        xi1.m createFullscreenHandler2 = this.f454713d.createFullscreenHandler(kVar);
        kotlin.jvm.internal.o.f(createFullscreenHandler2, "createFullscreenHandler(...)");
        return createFullscreenHandler2;
    }

    @Override // xi1.s
    public boolean forceLightMode() {
        return this.f454714e.forceLightMode();
    }

    @Override // xi1.g
    public android.content.Context getContext() {
        android.content.Context context = this.f454713d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // xi1.g
    public xi1.e getNavigationBar() {
        return this.f454713d.getNavigationBar();
    }

    @Override // xi1.g, xi1.s
    public xi1.p getOrientationHandler() {
        xi1.p orientationHandler = this.f454714e.getOrientationHandler();
        if (orientationHandler != null) {
            return orientationHandler;
        }
        xi1.p orientationHandler2 = this.f454713d.getOrientationHandler();
        kotlin.jvm.internal.o.f(orientationHandler2, "getOrientationHandler(...)");
        return orientationHandler2;
    }

    @Override // xi1.g
    public android.graphics.Rect getSafeAreaInsets() {
        return this.f454713d.getSafeAreaInsets();
    }

    @Override // xi1.s
    public float getScale() {
        return this.f454714e.getScale();
    }

    @Override // xi1.s
    public xi1.f getStatusBar() {
        return this.f454714e.getStatusBar();
    }

    @Override // xi1.g, xi1.s
    public android.util.DisplayMetrics getVDisplayMetrics() {
        android.util.DisplayMetrics vDisplayMetrics = this.f454714e.getVDisplayMetrics();
        kotlin.jvm.internal.o.f(vDisplayMetrics, "getVDisplayMetrics(...)");
        return vDisplayMetrics;
    }

    @Override // xi1.g
    public boolean isInMultiWindowMode() {
        return this.f454713d.isInMultiWindowMode();
    }

    @Override // xi1.s
    public boolean isLargeScreenWindow() {
        return this.f454714e.isLargeScreenWindow();
    }

    @Override // xi1.g
    public boolean q5() {
        return this.f454713d.q5();
    }

    @Override // xi1.g, xi1.s
    public void setSoftOrientation(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f454714e.setSoftOrientation(name);
    }

    @Override // xi1.g
    public void setWindowDescription(xi1.d description) {
        kotlin.jvm.internal.o.g(description, "description");
        this.f454713d.setWindowDescription(description);
    }

    @Override // xi1.g, xi1.s
    public boolean shouldInLargeScreenCompatMode() {
        return this.f454714e.shouldInLargeScreenCompatMode();
    }
}
