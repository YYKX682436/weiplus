package dp1;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.k f242130d;

    public f(dp1.l lVar, dp1.k kVar) {
        this.f242130d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.expand(this.f242130d.f242145p, 50, 50, 50, 50);
    }
}
