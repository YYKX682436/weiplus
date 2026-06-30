package pb;

/* loaded from: classes7.dex */
public final class a implements pb.b {

    /* renamed from: b, reason: collision with root package name */
    public com.luggage.trace.ProfileInfo f353111b;

    /* renamed from: a, reason: collision with root package name */
    public final com.luggage.trace.TracerJni f353110a = new com.luggage.trace.TracerJni();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f353112c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f353113d = new java.util.ArrayList();

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
        java.util.ArrayList arrayList = this.f353113d;
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        arrayList.add(new com.luggage.trace.MemoryUsages(tracerJni != null ? tracerJni.getJsHeapSizeUsed() : 0L, j18, d17));
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f353112c.add(new com.luggage.trace.ScreenShotInfo(data, d17));
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.traceBegin(category, name);
        }
    }

    @Override // pb.b
    public void d(long j17, long j18) {
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.initTraceBinding(j17, j18);
        }
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        this.f353111b = tracerJni != null ? tracerJni.profileStop() : null;
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.traceFrame(category, name, d17, d18);
        }
    }

    @Override // pb.b
    public void g() {
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.traceEnd();
        }
    }

    @Override // pb.b
    public com.luggage.trace.ProfileInfo h() {
        com.luggage.trace.ProfileInfo profileInfo = this.f353111b;
        kotlin.jvm.internal.o.d(profileInfo);
        double startTime = profileInfo.getStartTime();
        com.luggage.trace.ProfileInfo profileInfo2 = this.f353111b;
        kotlin.jvm.internal.o.d(profileInfo2);
        double endTime = profileInfo2.getEndTime();
        com.luggage.trace.ProfileInfo profileInfo3 = this.f353111b;
        kotlin.jvm.internal.o.d(profileInfo3);
        java.util.ArrayList<com.luggage.trace.Frame> frameList = profileInfo3.getFrameList();
        com.luggage.trace.ProfileInfo profileInfo4 = this.f353111b;
        kotlin.jvm.internal.o.d(profileInfo4);
        return new com.luggage.trace.ProfileInfo(startTime, endTime, frameList, profileInfo4.getEventList(), this.f353112c, this.f353113d);
    }

    @Override // pb.b
    public void i() {
        this.f353111b = null;
        this.f353112c.clear();
        this.f353113d.clear();
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.profileStart();
        }
    }

    @Override // pb.b
    public void init() {
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.init();
        }
    }

    @Override // pb.b
    /* renamed from: isTracing */
    public boolean getF45816a() {
        return true;
    }

    @Override // pb.b
    public void j(int i17) {
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.traceEnd2(i17);
        }
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            return tracerJni.traceBegin2(category, name);
        }
        return -1;
    }

    @Override // pb.b
    public void release() {
        com.luggage.trace.TracerJni tracerJni = this.f353110a;
        if (tracerJni != null) {
            tracerJni.release();
        }
    }
}
