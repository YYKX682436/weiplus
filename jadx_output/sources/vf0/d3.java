package vf0;

/* loaded from: classes12.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f436140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f436141b;

    /* renamed from: c, reason: collision with root package name */
    public dn.h f436142c;

    /* renamed from: d, reason: collision with root package name */
    public dn.h f436143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436144e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f436145f;

    public d3(boolean z17, int i17, dn.h hVar, dn.h hVar2, java.lang.String uploadThumbPath, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        hVar = (i18 & 4) != 0 ? null : hVar;
        hVar2 = (i18 & 8) != 0 ? null : hVar2;
        uploadThumbPath = (i18 & 16) != 0 ? "" : uploadThumbPath;
        z18 = (i18 & 32) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(uploadThumbPath, "uploadThumbPath");
        this.f436140a = z17;
        this.f436141b = i17;
        this.f436142c = hVar;
        this.f436143d = hVar2;
        this.f436144e = uploadThumbPath;
        this.f436145f = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.d3)) {
            return false;
        }
        vf0.d3 d3Var = (vf0.d3) obj;
        return this.f436140a == d3Var.f436140a && this.f436141b == d3Var.f436141b && kotlin.jvm.internal.o.b(this.f436142c, d3Var.f436142c) && kotlin.jvm.internal.o.b(this.f436143d, d3Var.f436143d) && kotlin.jvm.internal.o.b(this.f436144e, d3Var.f436144e) && this.f436145f == d3Var.f436145f;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f436140a) * 31) + java.lang.Integer.hashCode(this.f436141b)) * 31;
        dn.h hVar = this.f436142c;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        dn.h hVar2 = this.f436143d;
        return ((((hashCode2 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31) + this.f436144e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f436145f);
    }

    public java.lang.String toString() {
        return "VideoSendInnerCrossParams(needDeleteImportPath=" + this.f436140a + ", filecrc=" + this.f436141b + ", thumbVideoCdnTaskInfo=" + this.f436142c + ", originVideoCdnTaskInfo=" + this.f436143d + ", uploadThumbPath=" + this.f436144e + ", hasTempThumbFile=" + this.f436145f + ')';
    }
}
