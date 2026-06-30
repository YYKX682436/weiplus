package yu3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final yu3.a f465861a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f465862b;

    /* renamed from: c, reason: collision with root package name */
    public final st3.k f465863c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f465864d;

    public b(yu3.a createInfo, boolean z17, st3.k editorConfig, boolean z18) {
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        kotlin.jvm.internal.o.g(editorConfig, "editorConfig");
        this.f465861a = createInfo;
        this.f465862b = z17;
        this.f465863c = editorConfig;
        this.f465864d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu3.b)) {
            return false;
        }
        yu3.b bVar = (yu3.b) obj;
        return kotlin.jvm.internal.o.b(this.f465861a, bVar.f465861a) && this.f465862b == bVar.f465862b && kotlin.jvm.internal.o.b(this.f465863c, bVar.f465863c) && this.f465864d == bVar.f465864d;
    }

    public int hashCode() {
        return (((((this.f465861a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f465862b)) * 31) + this.f465863c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f465864d);
    }

    public java.lang.String toString() {
        return "MusicPickerSetupInfo(createInfo=" + this.f465861a + ", isPhotoToVideo=" + this.f465862b + ", editorConfig=" + this.f465863c + ", disableRecommendMusic=" + this.f465864d + ')';
    }
}
