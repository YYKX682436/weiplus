package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f191677a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f191678b;

    /* renamed from: c, reason: collision with root package name */
    public final long f191679c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f191680d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f191681e;

    public h2(android.net.Uri uri, java.lang.String path, long j17, java.lang.String fileTitle, java.lang.String ext) {
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(fileTitle, "fileTitle");
        kotlin.jvm.internal.o.g(ext, "ext");
        this.f191677a = uri;
        this.f191678b = path;
        this.f191679c = j17;
        this.f191680d = fileTitle;
        this.f191681e = ext;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.tools.h2)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.tools.h2 h2Var = (com.tencent.mm.pluginsdk.ui.tools.h2) obj;
        return kotlin.jvm.internal.o.b(this.f191677a, h2Var.f191677a) && kotlin.jvm.internal.o.b(this.f191678b, h2Var.f191678b) && this.f191679c == h2Var.f191679c && kotlin.jvm.internal.o.b(this.f191680d, h2Var.f191680d) && kotlin.jvm.internal.o.b(this.f191681e, h2Var.f191681e);
    }

    public int hashCode() {
        return (((((((this.f191677a.hashCode() * 31) + this.f191678b.hashCode()) * 31) + java.lang.Long.hashCode(this.f191679c)) * 31) + this.f191680d.hashCode()) * 31) + this.f191681e.hashCode();
    }

    public java.lang.String toString() {
        return "ResolvedSelectedFile(uri=" + this.f191677a + ", path=" + this.f191678b + ", size=" + this.f191679c + ", fileTitle=" + this.f191680d + ", ext=" + this.f191681e + ')';
    }
}
