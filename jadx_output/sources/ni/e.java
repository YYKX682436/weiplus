package ni;

/* loaded from: classes12.dex */
public abstract class e implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f337177d = new java.util.LinkedList();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        ni.d dVar = new ni.d(this, activity.hashCode(), new ni.c());
        dVar.b();
        oj.j.c("matrix.LeakMonitorDefault", "onActivityCreated " + dVar, new java.lang.Object[0]);
        synchronized (this.f337177d) {
            ((java.util.LinkedList) this.f337177d).add(dVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r1.remove();
        r6 = r2.a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r6.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r1 = (oi.e) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r3 = r1.f345565k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r3.f354492a != r2.f337175a) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r3 = (ni.i) r5;
        r4 = r3.f337183i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        ((java.util.LinkedList) r3.f337183i).add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        monitor-exit(r4);
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityDestroyed(android.app.Activity r6) {
        /*
            r5 = this;
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "matrix.LeakMonitorDefault"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onActivityDestroyed "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            oj.j.c(r0, r1, r2)
            java.util.List r0 = r5.f337177d
            monitor-enter(r0)
            java.util.List r1 = r5.f337177d     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L76
        L28:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L74
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L76
            ni.d r2 = (ni.d) r2     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L37
            goto L28
        L37:
            int r3 = r2.f337175a     // Catch: java.lang.Throwable -> L76
            int r4 = r6.intValue()     // Catch: java.lang.Throwable -> L76
            if (r3 != r4) goto L28
            r1.remove()     // Catch: java.lang.Throwable -> L76
            java.util.List r6 = r2.a()     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L76
        L4a:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L74
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L76
            oi.e r1 = (oi.e) r1     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L4a
            pi.a r3 = r1.f345565k     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L4a
            int r3 = r3.f354492a     // Catch: java.lang.Throwable -> L76
            int r4 = r2.f337175a     // Catch: java.lang.Throwable -> L76
            if (r3 != r4) goto L4a
            r3 = r5
            ni.i r3 = (ni.i) r3     // Catch: java.lang.Throwable -> L76
            java.util.List r4 = r3.f337183i     // Catch: java.lang.Throwable -> L76
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L76
            java.util.List r3 = r3.f337183i     // Catch: java.lang.Throwable -> L71
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch: java.lang.Throwable -> L71
            r3.add(r1)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L4a
        L71:
            r6 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L76
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            return
        L76:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.e.onActivityDestroyed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        oj.j.c("matrix.LeakMonitorDefault", "onActivityPaused " + activity.hashCode(), new java.lang.Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        oj.j.c("matrix.LeakMonitorDefault", "onActivityResumed " + activity.hashCode(), new java.lang.Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        oj.j.c("matrix.LeakMonitorDefault", "onActivityStarted " + activity.hashCode(), new java.lang.Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        oj.j.c("matrix.LeakMonitorDefault", "onActivityStopped " + activity.hashCode(), new java.lang.Object[0]);
    }
}
