package u4;

/* loaded from: classes13.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f424515b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f424514a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f424516c = new java.util.ArrayList();

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof u4.m1)) {
            return false;
        }
        u4.m1 m1Var = (u4.m1) obj;
        return this.f424515b == m1Var.f424515b && this.f424514a.equals(m1Var.f424514a);
    }

    public int hashCode() {
        return (this.f424515b.hashCode() * 31) + this.f424514a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = (("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f424515b + "\n") + "    values:";
        java.util.Map map = this.f424514a;
        for (java.lang.String str2 : ((java.util.HashMap) map).keySet()) {
            str = str + "    " + str2 + ": " + ((java.util.HashMap) map).get(str2) + "\n";
        }
        return str;
    }
}
