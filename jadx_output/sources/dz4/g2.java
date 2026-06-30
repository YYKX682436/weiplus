package dz4;

/* loaded from: classes12.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f245254a;

    /* renamed from: b, reason: collision with root package name */
    public final ih0.p f245255b;

    /* renamed from: c, reason: collision with root package name */
    public final dz4.i f245256c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245257d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f245258e;

    public g2(android.app.Activity activity, ih0.p holder, dz4.i reqData, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(reqData, "reqData");
        this.f245254a = activity;
        this.f245255b = holder;
        this.f245256c = reqData;
        this.f245257d = str;
        this.f245258e = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.g2)) {
            return false;
        }
        dz4.g2 g2Var = (dz4.g2) obj;
        return kotlin.jvm.internal.o.b(this.f245254a, g2Var.f245254a) && kotlin.jvm.internal.o.b(this.f245255b, g2Var.f245255b) && kotlin.jvm.internal.o.b(this.f245256c, g2Var.f245256c) && kotlin.jvm.internal.o.b(this.f245257d, g2Var.f245257d) && kotlin.jvm.internal.o.b(this.f245258e, g2Var.f245258e);
    }

    public int hashCode() {
        int hashCode = ((((this.f245254a.hashCode() * 31) + this.f245255b.hashCode()) * 31) + this.f245256c.hashCode()) * 31;
        java.lang.String str = this.f245257d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f245258e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WeNoteForwardContext(activity=" + this.f245254a + ", holder=" + this.f245255b + ", reqData=" + this.f245256c + ", targetUserName=" + this.f245257d + ", customText=" + this.f245258e + ')';
    }
}
