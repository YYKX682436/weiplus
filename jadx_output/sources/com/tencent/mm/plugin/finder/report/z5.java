package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class z5 extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f125492d;

    public z5(int i17) {
        this.f125492d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.report.z5) && this.f125492d == ((com.tencent.mm.plugin.finder.report.z5) obj).f125492d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f125492d);
    }

    public java.lang.String toString() {
        return "PlayEvent(initPos=" + this.f125492d + ')';
    }
}
