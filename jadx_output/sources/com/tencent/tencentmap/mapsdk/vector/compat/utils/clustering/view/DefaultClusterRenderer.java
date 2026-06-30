package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view;

/* loaded from: classes13.dex */
public class DefaultClusterRenderer<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f215466a = true;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f215467b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f215468c = new android.view.animation.DecelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.map.TencentMap f215469d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.IconGenerator f215470e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<T> f215471f;

    /* renamed from: g, reason: collision with root package name */
    public final float f215472g;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.ShapeDrawable f215474i;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerCache<T> f215477l;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> f215479n;

    /* renamed from: r, reason: collision with root package name */
    public float f215483r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.ViewModifier f215484s;
    public double sideLength;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener<T> f215485t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> f215486u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterInfoWindowAdapter<T> f215487v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemClickListener<T> f215488w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> f215489x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterItemInfoWindowAdapter<T> f215490y;

    /* renamed from: h, reason: collision with root package name */
    public int[] f215473h = {10, 20, 50, 100, 200, 500, 1000};

    /* renamed from: j, reason: collision with root package name */
    public java.util.Set<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition> f215475j = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public android.util.SparseArray<com.tencent.mapsdk.raster.model.BitmapDescriptor> f215476k = new android.util.SparseArray<>();

    /* renamed from: m, reason: collision with root package name */
    public int f215478m = 4;

    /* renamed from: o, reason: collision with root package name */
    public boolean f215480o = true;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map<com.tencent.mapsdk.raster.model.Marker, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> f215481p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public java.util.Map<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>, com.tencent.mapsdk.raster.model.Marker> f215482q = new java.util.HashMap();

    /* loaded from: classes13.dex */
    public class AnimationTask extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition f215497a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.mapsdk.raster.model.Marker f215498b;

        /* renamed from: c, reason: collision with root package name */
        public final com.tencent.mapsdk.raster.model.LatLng f215499c;

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mapsdk.raster.model.LatLng f215500d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f215501e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager f215502f;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (this.f215501e) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215482q.remove((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.get(this.f215498b));
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.remove(this.f215498b);
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.remove(this.f215498b);
                this.f215502f.a(this.f215498b);
            }
            this.f215497a.f215520b = this.f215500d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            double animatedFraction = valueAnimator.getAnimatedFraction();
            double latitude = ((this.f215500d.getLatitude() - this.f215499c.getLatitude()) * animatedFraction) + this.f215499c.getLatitude();
            double longitude = this.f215500d.getLongitude() - this.f215499c.getLongitude();
            if (java.lang.Math.abs(longitude) > 180.0d) {
                longitude -= java.lang.Math.signum(longitude) * 360.0d;
            }
            this.f215498b.setPosition(new com.tencent.mapsdk.raster.model.LatLng(latitude, (longitude * animatedFraction) + this.f215499c.getLongitude()));
        }

        public void perform() {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215468c);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        public void removeOnAnimationComplete(com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager markerManager) {
            this.f215502f = markerManager;
            this.f215501e = true;
        }

        public AnimationTask(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition, com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
            this.f215497a = markerWithPosition;
            this.f215498b = markerWithPosition.f215519a;
            this.f215499c = latLng;
            this.f215500d = latLng2;
        }
    }

    /* loaded from: classes13.dex */
    public class CreateMarkerTask {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> f215504a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.Set<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition> f215505b;

        /* renamed from: c, reason: collision with root package name */
        public final com.tencent.mapsdk.raster.model.LatLng f215506c;

        public CreateMarkerTask(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster, java.util.Set<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition> set, com.tencent.mapsdk.raster.model.LatLng latLng) {
            this.f215504a = cluster;
            this.f215505b = set;
            this.f215506c = latLng;
        }

        public final void a(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.MarkerModifier markerModifier) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition;
            if (!com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(this.f215504a)) {
                for (T t17 : this.f215504a.getItems()) {
                    com.tencent.mapsdk.raster.model.Marker marker = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.get((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerCache) t17);
                    if (marker == null) {
                        com.tencent.mapsdk.raster.model.MarkerOptions anchor = new com.tencent.mapsdk.raster.model.MarkerOptions().position(t17.getPosition()).anchor(0.5f, 0.5f);
                        com.tencent.mapsdk.raster.model.LatLng latLng = this.f215506c;
                        if (latLng != null) {
                            anchor.position(latLng);
                        }
                        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.onBeforeClusterItemRendered(t17, anchor);
                        marker = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215471f.getMarkerCollection().a(anchor);
                        markerWithPosition = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition(marker);
                        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.put(t17, marker);
                        com.tencent.mapsdk.raster.model.LatLng latLng2 = this.f215506c;
                        if (latLng2 != null) {
                            markerModifier.animate(markerWithPosition, latLng2, t17.getPosition());
                        }
                    } else {
                        markerWithPosition = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition(marker);
                    }
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.onClusterItemRendered(t17, marker);
                    this.f215505b.add(markerWithPosition);
                }
                return;
            }
            com.tencent.mapsdk.raster.model.MarkerOptions markerOptions = new com.tencent.mapsdk.raster.model.MarkerOptions();
            com.tencent.mapsdk.raster.model.LatLng latLng3 = this.f215506c;
            if (latLng3 == null) {
                latLng3 = this.f215504a.getPosition();
            }
            com.tencent.mapsdk.raster.model.MarkerOptions anchor2 = markerOptions.position(latLng3).anchor(0.5f, 0.5f);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.onBeforeClusterRendered(this.f215504a, anchor2);
            com.tencent.mapsdk.raster.model.Marker a17 = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215471f.getClusterMarkerCollection().a(anchor2);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.put(a17, this.f215504a);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215482q.put(this.f215504a, a17);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition2 = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition(a17);
            com.tencent.mapsdk.raster.model.LatLng latLng4 = this.f215506c;
            if (latLng4 != null) {
                markerModifier.animate(markerWithPosition2, latLng4, this.f215504a.getPosition());
            }
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.onClusterRendered(this.f215504a, a17);
            this.f215505b.add(markerWithPosition2);
        }
    }

    /* loaded from: classes13.dex */
    public static class MarkerCache<T> {

        /* renamed from: a, reason: collision with root package name */
        public java.util.Map<T, com.tencent.mapsdk.raster.model.Marker> f215508a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.Map<com.tencent.mapsdk.raster.model.Marker, T> f215509b;

        public MarkerCache() {
            this.f215508a = new java.util.HashMap();
            this.f215509b = new java.util.HashMap();
        }

        public com.tencent.mapsdk.raster.model.Marker get(T t17) {
            return this.f215508a.get(t17);
        }

        public void put(T t17, com.tencent.mapsdk.raster.model.Marker marker) {
            this.f215508a.put(t17, marker);
            this.f215509b.put(marker, t17);
        }

        public void remove(com.tencent.mapsdk.raster.model.Marker marker) {
            T t17 = this.f215509b.get(marker);
            this.f215509b.remove(marker);
            this.f215508a.remove(t17);
        }

        public T get(com.tencent.mapsdk.raster.model.Marker marker) {
            return this.f215509b.get(marker);
        }
    }

    /* loaded from: classes13.dex */
    public class MarkerModifier extends android.os.Handler implements android.os.MessageQueue.IdleHandler {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.concurrent.locks.Lock f215510a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.concurrent.locks.Condition f215511b;

        /* renamed from: c, reason: collision with root package name */
        public java.util.Queue<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.CreateMarkerTask> f215512c;

        /* renamed from: d, reason: collision with root package name */
        public java.util.Queue<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.CreateMarkerTask> f215513d;

        /* renamed from: e, reason: collision with root package name */
        public java.util.Queue<com.tencent.mapsdk.raster.model.Marker> f215514e;

        /* renamed from: f, reason: collision with root package name */
        public java.util.Queue<com.tencent.mapsdk.raster.model.Marker> f215515f;

        /* renamed from: g, reason: collision with root package name */
        public java.util.Queue<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.AnimationTask> f215516g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f215517h;

        public final void a() {
            try {
                if (!this.f215515f.isEmpty()) {
                    a(this.f215515f.poll());
                } else if (!this.f215516g.isEmpty()) {
                    this.f215516g.poll().perform();
                } else if (!this.f215513d.isEmpty()) {
                    this.f215513d.poll().a(this);
                } else if (!this.f215512c.isEmpty()) {
                    this.f215512c.poll().a(this);
                } else if (!this.f215514e.isEmpty()) {
                    a(this.f215514e.poll());
                }
            } catch (java.lang.NullPointerException unused) {
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215467b) {
                    cancel();
                }
            }
        }

        public void add(boolean z17, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.f215510a.lock();
            sendEmptyMessage(0);
            if (z17) {
                this.f215513d.add(createMarkerTask);
            } else {
                this.f215512c.add(createMarkerTask);
            }
            this.f215510a.unlock();
        }

        public void animate(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition, com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
            this.f215510a.lock();
            this.f215516g.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.AnimationTask(markerWithPosition, latLng, latLng2));
            this.f215510a.unlock();
        }

        public void animateThenRemove(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition, com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
            this.f215510a.lock();
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.AnimationTask animationTask = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215471f.getMarkerManager());
            this.f215516g.add(animationTask);
            this.f215510a.unlock();
        }

        public void cancel() {
            this.f215513d.clear();
            this.f215516g.clear();
            this.f215512c.clear();
            this.f215515f.clear();
            this.f215514e.clear();
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (!this.f215517h) {
                android.os.Looper.myQueue().addIdleHandler(this);
                this.f215517h = true;
            }
            removeMessages(0);
            this.f215510a.lock();
            try {
                int max = java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(this.f215515f.size(), this.f215516g.size()), this.f215514e.size()), java.lang.Math.max(this.f215512c.size(), this.f215513d.size()));
                for (int i17 = 0; i17 < max; i17++) {
                    a();
                }
                if (isBusy()) {
                    sendEmptyMessageDelayed(0, 100L);
                } else {
                    this.f215517h = false;
                    android.os.Looper.myQueue().removeIdleHandler(this);
                    this.f215511b.signalAll();
                }
            } finally {
                this.f215510a.unlock();
            }
        }

        public boolean isBusy() {
            boolean z17;
            try {
                this.f215510a.lock();
                if (this.f215512c.isEmpty() && this.f215513d.isEmpty() && this.f215515f.isEmpty() && this.f215514e.isEmpty()) {
                    if (this.f215516g.isEmpty()) {
                        z17 = false;
                        return z17;
                    }
                }
                z17 = true;
                return z17;
            } finally {
                this.f215510a.unlock();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z17, com.tencent.mapsdk.raster.model.Marker marker) {
            this.f215510a.lock();
            sendEmptyMessage(0);
            if (z17) {
                this.f215515f.add(marker);
            } else {
                this.f215514e.add(marker);
            }
            this.f215510a.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.f215510a.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.f215511b.await();
                        }
                    } catch (java.lang.InterruptedException e17) {
                        throw new java.lang.RuntimeException(e17);
                    }
                } finally {
                    this.f215510a.unlock();
                }
            }
        }

        public MarkerModifier() {
            super(android.os.Looper.getMainLooper());
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.f215510a = reentrantLock;
            this.f215511b = reentrantLock.newCondition();
            this.f215512c = new java.util.LinkedList();
            this.f215513d = new java.util.LinkedList();
            this.f215514e = new java.util.LinkedList();
            this.f215515f = new java.util.LinkedList();
            this.f215516g = new java.util.LinkedList();
        }

        public final void a(com.tencent.mapsdk.raster.model.Marker marker) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215482q.remove((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.get(marker));
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.remove(marker);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.remove(marker);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215471f.getMarkerManager().a(marker);
        }
    }

    /* loaded from: classes13.dex */
    public static class MarkerWithPosition {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.mapsdk.raster.model.Marker f215519a;

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.mapsdk.raster.model.LatLng f215520b;

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition) {
                return this.f215519a.equals(((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition) obj).f215519a);
            }
            return false;
        }

        public int hashCode() {
            return this.f215519a.hashCode();
        }

        public MarkerWithPosition(com.tencent.mapsdk.raster.model.Marker marker) {
            this.f215519a = marker;
            this.f215520b = marker.getPosition();
        }
    }

    /* loaded from: classes13.dex */
    public class RenderTask implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> f215521a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.Runnable f215522b;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.map.Projection f215523c;

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i f215524d;

        /* renamed from: e, reason: collision with root package name */
        public float f215525e;

        /* renamed from: f, reason: collision with root package name */
        public double f215526f;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            java.util.ArrayList arrayList;
            com.tencent.mapsdk.raster.model.Marker marker;
            if (this.f215521a.equals(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215479n) && !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215480o) {
                this.f215522b.run();
                return;
            }
            if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215480o) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215480o = false;
            }
            java.util.ArrayList arrayList2 = null;
            java.lang.Object[] objArr = 0;
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerModifier markerModifier = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerModifier();
            float f17 = this.f215525e;
            boolean z17 = f17 > com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215483r;
            float f18 = f17 - com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215483r;
            java.util.Set<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition> set = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215475j;
            com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds = this.f215523c.getVisibleRegion().getLatLngBounds();
            if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215479n == null || !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215466a) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster : com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215479n) {
                    if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(cluster) && latLngBounds.contains(cluster.getPosition())) {
                        arrayList.add(this.f215524d.a(cluster.getPosition()));
                    }
                }
            }
            java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
            for (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster2 : this.f215521a) {
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215479n == null || !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215479n.contains(cluster2) || !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(cluster2) || (marker = (com.tencent.mapsdk.raster.model.Marker) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215482q.get(cluster2)) == null) {
                    boolean contains = latLngBounds.contains(cluster2.getPosition());
                    if (z17 && contains && com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215466a) {
                        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h b17 = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.b(arrayList, this.f215524d.a(cluster2.getPosition()), this.f215526f);
                        if (b17 != null) {
                            markerModifier.add(true, new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.CreateMarkerTask(cluster2, newSetFromMap, this.f215524d.a(b17)));
                        } else {
                            markerModifier.add(true, new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.CreateMarkerTask(cluster2, newSetFromMap, null));
                        }
                    } else {
                        markerModifier.add(contains, new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.CreateMarkerTask(cluster2, newSetFromMap, null));
                    }
                } else {
                    newSetFromMap.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition(marker));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(newSetFromMap);
            if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215466a) {
                arrayList2 = new java.util.ArrayList();
                for (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster3 : this.f215521a) {
                    if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(cluster3) && latLngBounds.contains(cluster3.getPosition())) {
                        arrayList2.add(this.f215524d.a(cluster3.getPosition()));
                    }
                }
            }
            for (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition : set) {
                boolean contains2 = latLngBounds.contains(markerWithPosition.f215520b);
                if (z17 || f18 <= -3.0f || !contains2 || !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215466a) {
                    markerModifier.remove(contains2, markerWithPosition.f215519a);
                } else {
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h b18 = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.b(arrayList2, this.f215524d.a(markerWithPosition.f215520b), this.f215526f);
                    if (b18 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.f215520b, this.f215524d.a(b18));
                    } else {
                        markerModifier.remove(true, markerWithPosition.f215519a);
                    }
                }
            }
            markerModifier.waitUntilFree();
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215475j = newSetFromMap;
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215479n = this.f215521a;
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215483r = f17;
            this.f215522b.run();
        }

        public void setCallback(java.lang.Runnable runnable) {
            this.f215522b = runnable;
        }

        public void setMapZoom(float f17) {
            this.f215525e = f17;
            this.f215524d = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i(java.lang.Math.pow(2.0d, java.lang.Math.min(f17, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215483r) - 1.0f) * 256.0d);
        }

        public void setProjection(com.tencent.tencentmap.mapsdk.map.Projection projection) {
            this.f215523c = projection;
        }

        public RenderTask(java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> set, double d17) {
            this.f215521a = set;
            this.f215526f = d17;
        }
    }

    /* loaded from: classes13.dex */
    public class ViewModifier extends android.os.Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f215528a;

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.RenderTask f215529b;

        public ViewModifier() {
            this.f215528a = false;
            this.f215529b = null;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.tencent.tencentmap.mapsdk.map.Projection projection;
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.f215528a = false;
                if (this.f215529b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f215528a || this.f215529b == null || (projection = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215469d.getProjection()) == null) {
                return;
            }
            synchronized (this) {
                renderTask = this.f215529b;
                this.f215529b = null;
                this.f215528a = true;
            }
            renderTask.setCallback(new java.lang.Runnable() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.ViewModifier.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.ViewModifier.this.sendEmptyMessage(1);
                }
            });
            renderTask.setProjection(projection);
            try {
                renderTask.setMapZoom(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215469d.getCameraPosition().getZoom());
                new java.lang.Thread(renderTask).start();
            } catch (java.lang.NullPointerException unused) {
                boolean unused2 = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.f215467b;
            }
        }

        public void queue(java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> set) {
            synchronized (this) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer defaultClusterRenderer = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this;
                this.f215529b = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.RenderTask(set, defaultClusterRenderer.sideLength);
            }
            sendEmptyMessage(0);
        }
    }

    public DefaultClusterRenderer(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<T> clusterManager) {
        this.f215477l = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerCache<>();
        this.f215484s = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.ViewModifier();
        this.f215469d = tencentMap;
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f215472g = f17;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.IconGenerator iconGenerator = new com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.IconGenerator(context);
        this.f215470e = iconGenerator;
        iconGenerator.setContentView(a(context));
        iconGenerator.setTextAppearance(android.R.style.TextAppearance, -1118482, 16.0f, 1);
        iconGenerator.setBackground(d());
        this.f215471f = clusterManager;
        if ((clusterManager.getAlgorithm() instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator ? ((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator) clusterManager.getAlgorithm()).getAlgorithm() : clusterManager.getAlgorithm()) instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm) {
            this.sideLength = (((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm) r5).getMaxDistanceAtZoom() + 0.5d) * f17;
        } else {
            this.sideLength = f17 * 35.0f;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void cancel() {
        f215467b = true;
        onRemove();
    }

    public int getBucket(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster) {
        int size = cluster.getSize();
        int[] iArr = this.f215473h;
        if (iArr == null) {
            return size;
        }
        int i17 = 0;
        if (size <= iArr[0]) {
            return size;
        }
        while (true) {
            int[] iArr2 = this.f215473h;
            if (i17 >= iArr2.length - 1) {
                return iArr2[iArr2.length - 1];
            }
            int i18 = i17 + 1;
            if (size < iArr2[i18]) {
                return iArr2[i17];
            }
            i17 = i18;
        }
    }

    public int[] getBuckets() {
        return this.f215473h;
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> getCluster(com.tencent.mapsdk.raster.model.Marker marker) {
        return this.f215481p.get(marker);
    }

    public T getClusterItem(com.tencent.mapsdk.raster.model.Marker marker) {
        return this.f215477l.get(marker);
    }

    public java.lang.String getClusterText(int i17) {
        int[] iArr = this.f215473h;
        if (iArr != null && i17 >= iArr[0]) {
            return java.lang.String.valueOf(i17) + "+";
        }
        return java.lang.String.valueOf(i17);
    }

    public int getColor(int i17) {
        float min = 300.0f - java.lang.Math.min(i17, 300.0f);
        return android.graphics.Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public com.tencent.mapsdk.raster.model.Marker getMarker(T t17) {
        return this.f215477l.get((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.MarkerCache<T>) t17);
    }

    public int getMinClusterSize() {
        return this.f215478m;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void onAdd() {
        this.f215471f.getMarkerCollection().a(new com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
            public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem clusterItem = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.get(marker);
                return (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215488w == null || clusterItem == null || !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215488w.onClusterItemClick(clusterItem)) ? false : true;
            }
        });
        this.f215471f.getMarkerCollection().a(new com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
            public void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker) {
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215489x != null) {
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215489x.onClusterItemInfoWindowClick((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.get(marker));
                }
            }
        });
        this.f215471f.getMarkerCollection().a(new com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
            public android.view.View getInfoWindow(com.tencent.mapsdk.raster.model.Marker marker) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem clusterItem = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215477l.get(marker);
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215490y == null || clusterItem == null) {
                    return null;
                }
                return com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215490y.getInfoWindow(clusterItem);
            }

            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
            public void onInfoWindowDettached(com.tencent.mapsdk.raster.model.Marker marker, android.view.View view) {
            }
        });
        this.f215471f.getClusterMarkerCollection().a(new com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.4
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
            public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.get(marker);
                return (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215485t == null || cluster == null || !com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215485t.onClusterClick(cluster)) ? false : true;
            }
        });
        this.f215471f.getClusterMarkerCollection().a(new com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.5
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
            public void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker) {
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215486u != null) {
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215486u.onClusterInfoWindowClick((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.get(marker));
                }
            }
        });
        this.f215471f.getClusterMarkerCollection().a(new com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.6
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
            public android.view.View getInfoWindow(com.tencent.mapsdk.raster.model.Marker marker) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215481p.get(marker);
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215487v == null || cluster == null) {
                    return null;
                }
                return com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.this.f215487v.getInfoWindow(cluster);
            }

            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
            public void onInfoWindowDettached(com.tencent.mapsdk.raster.model.Marker marker, android.view.View view) {
            }
        });
    }

    public void onBeforeClusterItemRendered(T t17, com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
    }

    public void onBeforeClusterRendered(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster, com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
        int bucket = getBucket(cluster);
        com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor = this.f215476k.get(bucket);
        if (bitmapDescriptor == null) {
            this.f215474i.getPaint().setColor(getColor(bucket));
            bitmapDescriptor = com.tencent.mapsdk.raster.model.BitmapDescriptorFactory.fromBitmap(this.f215470e.makeIcon(getClusterText(bucket)));
            this.f215476k.put(bucket, bitmapDescriptor);
        }
        markerOptions.icon(bitmapDescriptor);
    }

    public void onClusterItemRendered(T t17, com.tencent.mapsdk.raster.model.Marker marker) {
    }

    public void onClusterRendered(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster, com.tencent.mapsdk.raster.model.Marker marker) {
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void onClustersChanged(java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> set) {
        this.f215484s.queue(set);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void onRemove() {
        this.f215471f.getMarkerCollection().a((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener) null);
        this.f215471f.getClusterMarkerCollection().a((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener) null);
    }

    public void setBuckets(int[] iArr) {
        this.f215473h = iArr;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterInfoWindowAdapter clusterInfoWindowAdapter) {
        this.f215487v = clusterInfoWindowAdapter;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void setItemInfoWindowAdapter(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterItemInfoWindowAdapter clusterItemInfoWindowAdapter) {
        this.f215490y = clusterItemInfoWindowAdapter;
    }

    public void setMinClusterSize(int i17) {
        this.f215478m = i17;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<T> clusterManager = this.f215471f;
        if (clusterManager != null) {
            this.f215480o = true;
            clusterManager.cluster();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.f215485t = onClusterClickListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f215486u = onClusterInfoWindowClickListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f215488w = onClusterItemClickListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f215489x = onClusterItemInfoWindowClickListener;
    }

    public boolean shouldRenderAsCluster(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster) {
        return cluster.getSize() > this.f215478m;
    }

    public final android.graphics.drawable.LayerDrawable d() {
        this.f215474i = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{shapeDrawable, this.f215474i});
        int i17 = (int) (this.f215472g * 3.0f);
        layerDrawable.setLayerInset(1, i17, i17, i17, i17);
        return layerDrawable;
    }

    public com.tencent.mapsdk.raster.model.Marker getMarker(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster) {
        return this.f215482q.get(cluster);
    }

    public static com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h b(java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h> list, com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar, double d17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar2 = null;
        if (list != null && !list.isEmpty()) {
            double d18 = d17 * d17;
            for (com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar3 : list) {
                double a17 = a(hVar3, hVar);
                if (a17 < d18) {
                    hVar2 = hVar3;
                    d18 = a17;
                }
            }
        }
        return hVar2;
    }

    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.a.l a(android.content.Context context) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.l lVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.l(context);
        lVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        lVar.setId(com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.IconGenerator.SQUARE_TEXT_VIEW_ID);
        int i17 = (int) (this.f215472g * 12.0f);
        lVar.setPadding(i17, i17, i17, i17);
        return lVar;
    }

    public static double a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar, com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar2) {
        double d17 = hVar.f215397a - hVar2.f215397a;
        double d18 = hVar.f215398b - hVar2.f215398b;
        return (d17 * d17) + (d18 * d18);
    }
}
