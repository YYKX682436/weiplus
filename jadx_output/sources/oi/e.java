package oi;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345556b;

    /* renamed from: c, reason: collision with root package name */
    public pi.e f345557c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345558d;

    /* renamed from: e, reason: collision with root package name */
    public final oi.d f345559e;

    /* renamed from: f, reason: collision with root package name */
    public oi.b f345560f;

    /* renamed from: g, reason: collision with root package name */
    public final long f345561g;

    /* renamed from: h, reason: collision with root package name */
    public final long f345562h;

    /* renamed from: i, reason: collision with root package name */
    public final long f345563i;

    /* renamed from: j, reason: collision with root package name */
    public final long f345564j;

    /* renamed from: k, reason: collision with root package name */
    public final pi.a f345565k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f345566l;

    public e(oi.d dVar, int i17, java.lang.String str, long j17, long j18) {
        this.f345555a = "";
        this.f345558d = 0L;
        this.f345555a = str;
        this.f345556b = i17;
        this.f345561g = j17;
        this.f345562h = j18;
        this.f345559e = dVar;
        this.f345563i = 0L;
        this.f345564j = 0L;
    }

    public java.lang.String a() {
        pi.e eVar = this.f345557c;
        return eVar == null ? "" : eVar.f354498a;
    }

    public java.lang.String b() {
        oi.h hVar = oi.h.f345567e;
        synchronized (hVar.f345569b) {
            int indexOf = ((java.util.LinkedList) hVar.f345569b).indexOf(this);
            if (-1 == indexOf) {
                return "res already released, can not get native stack";
            }
            oi.e eVar = (oi.e) ((java.util.LinkedList) hVar.f345569b).get(indexOf);
            if (eVar == null) {
                return "";
            }
            long j17 = eVar.f345558d;
            return j17 != 0 ? com.tencent.matrix.openglleak.hook.OpenGLHook.dumpNativeStack(j17) : "";
        }
    }

    public boolean c() {
        boolean z17;
        oi.h hVar = oi.h.f345567e;
        synchronized (hVar.f345571d) {
            z17 = !((java.util.ArrayList) hVar.f345571d).contains(java.lang.Long.valueOf(this.f345561g));
        }
        return z17;
    }

    public boolean d() {
        boolean z17;
        oi.h hVar = oi.h.f345567e;
        synchronized (hVar.f345570c) {
            long j17 = this.f345563i;
            long j18 = this.f345564j;
            z17 = true;
            if (j18 != 0 && j17 != 0) {
                java.util.Iterator it = hVar.f345570c.iterator();
                boolean z18 = false;
                boolean z19 = false;
                while (it.hasNext()) {
                    long longValue = ((java.lang.Long) it.next()).longValue();
                    if (longValue == j18) {
                        z18 = true;
                    }
                    if (longValue == j17) {
                        z19 = true;
                    }
                }
                if (!z18 || !z19) {
                    if (!z18) {
                        z18 = !com.tencent.matrix.openglleak.hook.OpenGLHook.isEglSurfaceAlive(j18);
                    }
                    if (!z19) {
                        z19 = !com.tencent.matrix.openglleak.hook.OpenGLHook.isEglSurfaceAlive(j17);
                    }
                    if (z18) {
                        ((java.util.LinkedList) hVar.f345570c).add(java.lang.Long.valueOf(j18));
                    }
                    if (z19) {
                        ((java.util.LinkedList) hVar.f345570c).add(java.lang.Long.valueOf(j17));
                    }
                    if (!z18 || !z19) {
                        z17 = false;
                    }
                }
            }
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r6 == r9.f345562h) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r3 != r9.f345559e) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r8.f345561g == r9.f345561g) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof oi.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oi.e r9 = (oi.e) r9
            int r1 = r9.f345556b
            int r3 = r8.f345556b
            if (r3 != r1) goto L35
            oi.d r1 = oi.d.EGL_CONTEXT
            oi.d r3 = r8.f345559e
            if (r3 == r1) goto L28
            r4 = 0
            long r6 = r8.f345562h
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L21
            goto L28
        L21:
            long r4 = r9.f345562h
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L30
        L28:
            long r4 = r8.f345561g
            long r6 = r9.f345561g
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L35
        L30:
            oi.d r9 = r9.f345559e
            if (r3 != r9) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.e.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r5 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r7.f345556b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            oi.d r1 = oi.d.EGL_CONTEXT
            oi.d r2 = r7.f345559e
            if (r2 == r1) goto L1a
            r3 = 0
            long r5 = r7.f345562h
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L1c
        L1a:
            long r5 = r7.f345561g
        L1c:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3 = 1
            r0[r3] = r1
            r1 = 2
            r0[r1] = r2
            int r0 = java.util.Objects.hash(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.e.hashCode():int");
    }

    public java.lang.String toString() {
        return "OpenGLInfo{id=" + this.f345556b + ", activityName=" + this.f345565k + ", type='" + this.f345559e.toString() + "', threadId='" + this.f345555a + "', eglContextNativeHandle='" + this.f345561g + "', eglContextGroup='" + this.f345562h + "', eglContextReleased='" + c() + "', eglSurfaceReleased='" + d() + "', javaStack='" + a() + "', nativeStack='" + b() + "', nativeStackPtr=" + this.f345558d + ", memoryInfo=" + this.f345560f + '}';
    }

    public e(oi.d dVar, int i17, java.lang.String str, long j17, long j18, long j19, long j27, pi.e eVar, long j28, pi.a aVar, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        this.f345555a = "";
        this.f345558d = 0L;
        this.f345555a = str;
        this.f345557c = eVar;
        this.f345558d = j28;
        this.f345559e = dVar;
        this.f345565k = aVar;
        this.f345566l = atomicInteger;
        this.f345556b = i17;
        this.f345561g = j17;
        this.f345562h = j18;
        this.f345563i = j19;
        this.f345564j = j27;
    }
}
