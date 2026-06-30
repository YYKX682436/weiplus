package ru0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f399662a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399663b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399664c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f399665d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f399666e;

    public e(com.tencent.maas.base.MJID segmentID, java.lang.String roleID, java.lang.String roleName, com.tencent.mm.vfs.r6 r6Var, java.util.Map textDurationMap) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        kotlin.jvm.internal.o.g(roleName, "roleName");
        kotlin.jvm.internal.o.g(textDurationMap, "textDurationMap");
        this.f399662a = segmentID;
        this.f399663b = roleID;
        this.f399664c = roleName;
        this.f399665d = r6Var;
        this.f399666e = textDurationMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.e)) {
            return false;
        }
        ru0.e eVar = (ru0.e) obj;
        return kotlin.jvm.internal.o.b(this.f399662a, eVar.f399662a) && kotlin.jvm.internal.o.b(this.f399663b, eVar.f399663b) && kotlin.jvm.internal.o.b(this.f399664c, eVar.f399664c) && kotlin.jvm.internal.o.b(this.f399665d, eVar.f399665d) && kotlin.jvm.internal.o.b(this.f399666e, eVar.f399666e);
    }

    public int hashCode() {
        int hashCode = ((((this.f399662a.hashCode() * 31) + this.f399663b.hashCode()) * 31) + this.f399664c.hashCode()) * 31;
        com.tencent.mm.vfs.r6 r6Var = this.f399665d;
        return ((hashCode + (r6Var == null ? 0 : r6Var.hashCode())) * 31) + this.f399666e.hashCode();
    }

    public java.lang.String toString() {
        return "RoleResult(segmentID=" + this.f399662a + ", roleID=" + this.f399663b + ", roleName=" + this.f399664c + ", roleFile=" + this.f399665d + ", textDurationMap=" + this.f399666e + ')';
    }

    public /* synthetic */ e(com.tencent.maas.base.MJID mjid, java.lang.String str, java.lang.String str2, com.tencent.mm.vfs.r6 r6Var, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this(mjid, str, str2, r6Var, (i17 & 16) != 0 ? kz5.q0.f314001d : map);
    }
}
