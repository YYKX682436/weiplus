package qf4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362701a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f362702b;

    public h(java.lang.String label, java.util.List storyInfos) {
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(storyInfos, "storyInfos");
        this.f362701a = label;
        this.f362702b = storyInfos;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (nf4.h hVar : this.f362702b) {
            java.lang.String str = null;
            r45.xe6 xe6Var = hVar.f336854p.y0().f379432h.f382205e.size() > 0 ? (r45.xe6) hVar.f336854p.y0().f379432h.f382205e.get(0) : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\t[date=");
            sb7.append(hVar.field_date);
            sb7.append(" localId=");
            sb7.append((int) hVar.f336854p.systemRowid);
            sb7.append(", storyId=");
            sb7.append(hVar.f336854p.field_storyID);
            sb7.append(", thumb=");
            sb7.append(xe6Var != null ? xe6Var.f390025h : null);
            sb7.append(", video=");
            if (xe6Var != null) {
                str = xe6Var.f390023f;
            }
            sb7.append(str);
            sb7.append("]\n");
            sb6.append(sb7.toString());
        }
        return "[" + this.f362701a + "] \n " + ((java.lang.Object) sb6);
    }
}
