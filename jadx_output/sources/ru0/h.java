package ru0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f399675a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399676b;

    public h(com.tencent.mm.vfs.r6 subtitleFolder, java.lang.String hexKey) {
        kotlin.jvm.internal.o.g(subtitleFolder, "subtitleFolder");
        kotlin.jvm.internal.o.g(hexKey, "hexKey");
        this.f399675a = subtitleFolder;
        this.f399676b = hexKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.h)) {
            return false;
        }
        ru0.h hVar = (ru0.h) obj;
        return kotlin.jvm.internal.o.b(this.f399675a, hVar.f399675a) && kotlin.jvm.internal.o.b(this.f399676b, hVar.f399676b);
    }

    public int hashCode() {
        return (this.f399675a.hashCode() * 31) + this.f399676b.hashCode();
    }

    public java.lang.String toString() {
        return "SubtitleUniqueHexKey(subtitleFolder=" + this.f399675a + ", hexKey=" + this.f399676b + ')';
    }
}
