package yu0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f465835a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f465836b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f465837c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f465838d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f465839e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f465840f;

    /* renamed from: g, reason: collision with root package name */
    public final dw0.a f465841g;

    public t(com.tencent.maas.base.MJID segmentID, java.lang.String roleID, java.lang.String roleName, java.lang.String originNarrationFilePath, java.util.List captionItems, com.tencent.maas.model.time.MJTime totalDurationIncludingExpandable, dw0.a materialPrefix) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        kotlin.jvm.internal.o.g(roleName, "roleName");
        kotlin.jvm.internal.o.g(originNarrationFilePath, "originNarrationFilePath");
        kotlin.jvm.internal.o.g(captionItems, "captionItems");
        kotlin.jvm.internal.o.g(totalDurationIncludingExpandable, "totalDurationIncludingExpandable");
        kotlin.jvm.internal.o.g(materialPrefix, "materialPrefix");
        this.f465835a = segmentID;
        this.f465836b = roleID;
        this.f465837c = roleName;
        this.f465838d = originNarrationFilePath;
        this.f465839e = captionItems;
        this.f465840f = totalDurationIncludingExpandable;
        this.f465841g = materialPrefix;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.t)) {
            return false;
        }
        yu0.t tVar = (yu0.t) obj;
        return kotlin.jvm.internal.o.b(this.f465835a, tVar.f465835a) && kotlin.jvm.internal.o.b(this.f465836b, tVar.f465836b) && kotlin.jvm.internal.o.b(this.f465837c, tVar.f465837c) && kotlin.jvm.internal.o.b(this.f465838d, tVar.f465838d) && kotlin.jvm.internal.o.b(this.f465839e, tVar.f465839e) && kotlin.jvm.internal.o.b(this.f465840f, tVar.f465840f) && this.f465841g == tVar.f465841g;
    }

    public int hashCode() {
        return (((((((((((this.f465835a.hashCode() * 31) + this.f465836b.hashCode()) * 31) + this.f465837c.hashCode()) * 31) + this.f465838d.hashCode()) * 31) + this.f465839e.hashCode()) * 31) + this.f465840f.hashCode()) * 31) + this.f465841g.hashCode();
    }

    public java.lang.String toString() {
        return "TimbreRequestGroup(segmentID=" + this.f465835a + ", roleID=" + this.f465836b + ", roleName=" + this.f465837c + ", originNarrationFilePath=" + this.f465838d + ", captionItems=" + this.f465839e + ", totalDurationIncludingExpandable=" + this.f465840f + ", materialPrefix=" + this.f465841g + ')';
    }
}
