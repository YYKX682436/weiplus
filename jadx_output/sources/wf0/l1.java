package wf0;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445518a;

    /* renamed from: b, reason: collision with root package name */
    public final bm5.f0 f445519b;

    public l1(java.lang.String str, bm5.f0 f0Var) {
        this.f445518a = str;
        this.f445519b = f0Var;
        if (ya.b.ORIGIN.endsWith(str)) {
            this.f445519b = bm5.f0.f22570r;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof wf0.l1)) {
            return false;
        }
        wf0.l1 l1Var = (wf0.l1) obj;
        return android.text.TextUtils.equals(this.f445518a, l1Var.f445518a) && this.f445519b.f22578d == l1Var.f445519b.f22578d;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f445519b.f22578d), this.f445518a);
    }

    public java.lang.String toString() {
        return this.f445518a + "_" + this.f445519b.f22578d;
    }
}
