package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class tx {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f136063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136064b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136065c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f136066d;

    public tx(java.lang.String str, boolean z17, boolean z18, java.lang.String face_verify_url) {
        kotlin.jvm.internal.o.g(face_verify_url, "face_verify_url");
        this.f136063a = str;
        this.f136064b = z17;
        this.f136065c = z18;
        this.f136066d = face_verify_url;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.tx)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.tx txVar = (com.tencent.mm.plugin.finder.viewmodel.component.tx) obj;
        return kotlin.jvm.internal.o.b(this.f136063a, txVar.f136063a) && this.f136064b == txVar.f136064b && this.f136065c == txVar.f136065c && kotlin.jvm.internal.o.b(this.f136066d, txVar.f136066d);
    }

    public int hashCode() {
        java.lang.String str = this.f136063a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f136064b)) * 31) + java.lang.Boolean.hashCode(this.f136065c)) * 31) + this.f136066d.hashCode();
    }

    public java.lang.String toString() {
        return "{isSuccess=" + this.f136064b + " need_face_verify=" + this.f136065c + " face_verify_url=" + this.f136066d + " username=" + this.f136063a + '}';
    }
}
