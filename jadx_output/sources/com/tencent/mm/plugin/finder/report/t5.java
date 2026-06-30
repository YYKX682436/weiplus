package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f125366a;

    /* renamed from: b, reason: collision with root package name */
    public long f125367b;

    /* renamed from: c, reason: collision with root package name */
    public long f125368c;

    /* renamed from: d, reason: collision with root package name */
    public long f125369d;

    /* renamed from: e, reason: collision with root package name */
    public long f125370e;

    /* renamed from: f, reason: collision with root package name */
    public long f125371f;

    public t5(java.lang.String sourceUI) {
        kotlin.jvm.internal.o.g(sourceUI, "sourceUI");
        this.f125366a = sourceUI;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.report.t5) && kotlin.jvm.internal.o.b(this.f125366a, ((com.tencent.mm.plugin.finder.report.t5) obj).f125366a);
    }

    public int hashCode() {
        return this.f125366a.hashCode();
    }

    public java.lang.String toString() {
        return "sourceUI = " + this.f125366a + ", clickEnter = " + this.f125367b + ", onCreate = " + this.f125368c + ", onStart = " + this.f125369d + ", onResume = " + this.f125370e + ", firstFrame = " + this.f125371f;
    }
}
