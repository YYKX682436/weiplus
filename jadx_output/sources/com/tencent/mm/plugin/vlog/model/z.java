package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f175793a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f175794b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f175795c;

    /* renamed from: d, reason: collision with root package name */
    public int f175796d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f175797e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175798f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175799g;

    public z(boolean z17, boolean z18, boolean z19, int i17, boolean z27, boolean z28, boolean z29, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        z18 = (i18 & 2) != 0 ? true : z18;
        z19 = (i18 & 4) != 0 ? false : z19;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        z27 = (i18 & 16) != 0 ? false : z27;
        z28 = (i18 & 32) != 0 ? false : z28;
        z29 = (i18 & 64) != 0 ? false : z29;
        this.f175793a = z17;
        this.f175794b = z18;
        this.f175795c = z19;
        this.f175796d = i17;
        this.f175797e = z27;
        this.f175798f = z28;
        this.f175799g = z29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.z)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.z zVar = (com.tencent.mm.plugin.vlog.model.z) obj;
        return this.f175793a == zVar.f175793a && this.f175794b == zVar.f175794b && this.f175795c == zVar.f175795c && this.f175796d == zVar.f175796d && this.f175797e == zVar.f175797e && this.f175798f == zVar.f175798f && this.f175799g == zVar.f175799g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Boolean.hashCode(this.f175793a) * 31) + java.lang.Boolean.hashCode(this.f175794b)) * 31) + java.lang.Boolean.hashCode(this.f175795c)) * 31) + java.lang.Integer.hashCode(this.f175796d)) * 31) + java.lang.Boolean.hashCode(this.f175797e)) * 31) + java.lang.Boolean.hashCode(this.f175798f)) * 31) + java.lang.Boolean.hashCode(this.f175799g);
    }

    public java.lang.String toString() {
        return "ExportResult(success=" + this.f175793a + ", canRetry=" + this.f175794b + ", isCancel=" + this.f175795c + ", result=" + this.f175796d + ", videoSoft=" + this.f175797e + ", audioSoft=" + this.f175798f + ", parallelExport=" + this.f175799g + ')';
    }
}
