package gp2;

/* loaded from: classes10.dex */
public final class v0 extends pf5.k0 implements ws5.e {

    /* renamed from: g, reason: collision with root package name */
    public boolean f274331g;

    /* renamed from: h, reason: collision with root package name */
    public int f274332h;

    /* renamed from: i, reason: collision with root package name */
    public int f274333i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f274328d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f274329e = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f274330f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f274334m = new java.util.HashSet();

    public void N6(final androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (this.f274333i == 0) {
            this.f274331g = false;
            this.f274332h = this.f274328d.size();
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(new gp2.t0(this));
        }
        if (this.f274334m.add(java.lang.Integer.valueOf(activity.hashCode()))) {
            this.f274333i++;
            activity.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler$attach$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy activityCount:");
                    gp2.v0 v0Var = gp2.v0.this;
                    sb6.append(v0Var.f274333i);
                    com.tencent.mars.xlog.Log.i("NearbyLivePlayerViewRecycler", sb6.toString());
                    int i17 = v0Var.f274333i - 1;
                    v0Var.f274333i = i17;
                    java.util.HashSet hashSet = v0Var.f274334m;
                    if (i17 == 0) {
                        hashSet.clear();
                        v0Var.f274331g = true;
                        v0Var.f274330f.post(new gp2.u0(v0Var));
                    }
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = activity;
                    hashSet.remove(java.lang.Integer.valueOf(appCompatActivity.hashCode()));
                    appCompatActivity.mo133getLifecycle().c(this);
                }
            });
        }
    }

    public final com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView O6() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = new com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView(context);
        this.f274329e.add(new java.lang.ref.WeakReference(nearbyLivePreviewView));
        com.tencent.mars.xlog.Log.i("NearbyLivePlayerViewRecycler", "createView view:" + nearbyLivePreviewView);
        return nearbyLivePreviewView;
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f274334m.clear();
        this.f274331g = true;
        this.f274330f.post(new gp2.u0(this));
    }
}
