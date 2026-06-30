package vu4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.h f440332a;

    /* renamed from: b, reason: collision with root package name */
    public final vu4.j f440333b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f440336e;

    /* renamed from: f, reason: collision with root package name */
    public final int f440337f;

    public i(vu4.h actionType, vu4.j packageType, java.lang.String result, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(packageType, "packageType");
        kotlin.jvm.internal.o.g(result, "result");
        this.f440332a = actionType;
        this.f440333b = packageType;
        this.f440334c = result;
        this.f440335d = i17;
        this.f440336e = i18;
        this.f440337f = i19;
    }

    public final void a() {
        int i17 = this.f440337f;
        try {
            uv4.g c17 = uv4.x.f431458a.c(i17, java.lang.Boolean.FALSE);
            int m17 = c17 != null ? ((uv4.b) c17).m() : 1;
            java.lang.String str = this.f440332a.f440331d + ',' + this.f440333b.f440342d + ',' + this.f440334c + ',' + this.f440335d + ',' + this.f440336e + ',' + (i17 != 0 ? i17 != 6 ? i17 != 10 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "emoji_search" : "tag_search" : "web_search") + ',' + m17;
            com.tencent.mars.xlog.Log.i("Report36771Item", "report: " + str);
            jx3.f.INSTANCE.kvStat(36771, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Report36771Item", e17, "report36771 failed", new java.lang.Object[0]);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.i)) {
            return false;
        }
        vu4.i iVar = (vu4.i) obj;
        return this.f440332a == iVar.f440332a && this.f440333b == iVar.f440333b && kotlin.jvm.internal.o.b(this.f440334c, iVar.f440334c) && this.f440335d == iVar.f440335d && this.f440336e == iVar.f440336e && this.f440337f == iVar.f440337f;
    }

    public int hashCode() {
        return (((((((((this.f440332a.hashCode() * 31) + this.f440333b.hashCode()) * 31) + this.f440334c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f440335d)) * 31) + java.lang.Integer.hashCode(this.f440336e)) * 31) + java.lang.Integer.hashCode(this.f440337f);
    }

    public java.lang.String toString() {
        return "Report36771Item(actionType=" + this.f440332a + ", packageType=" + this.f440333b + ", result=" + this.f440334c + ", exptLevel=" + this.f440335d + ", h5Version=" + this.f440336e + ", templateType=" + this.f440337f + ')';
    }
}
