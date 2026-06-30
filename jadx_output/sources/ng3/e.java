package ng3;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public ng3.g f337004a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f337005b;

    public e(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f337005b = new java.util.ArrayList();
    }

    public final void a(ng3.h event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((java.util.ArrayList) this.f337005b).add(event);
    }

    public abstract boolean b(android.view.MotionEvent motionEvent);

    public final void c(java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1.i() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ng3.f r4) {
        /*
            r3 = this;
            java.lang.String r0 = "asyncEvent"
            kotlin.jvm.internal.o.g(r4, r0)
            ng3.g r0 = r3.f337004a
            if (r0 == 0) goto L2f
            mg3.m r0 = (mg3.m) r0
            mg3.e r1 = r0.f326250d
            if (r1 == 0) goto L17
            boolean r1 = r1.i()
            r2 = 1
            if (r1 != r2) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L1b
            goto L2f
        L1b:
            ng3.t r1 = r4.a()
            java.util.Objects.toString(r1)
            mg3.b r1 = r0.f326249c
            if (r1 != 0) goto L27
            goto L2f
        L27:
            mg3.e r0 = r0.f326250d
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            r4.b(r1, r0)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ng3.e.d(ng3.f):void");
    }

    public void e() {
    }
}
