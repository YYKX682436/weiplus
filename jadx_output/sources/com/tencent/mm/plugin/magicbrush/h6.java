package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes5.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f148021a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f148022b;

    public h6(java.lang.String instanceName, java.lang.ref.WeakReference context) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(context, "context");
        this.f148021a = instanceName;
        this.f148022b = context;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.h6)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.h6 h6Var = (com.tencent.mm.plugin.magicbrush.h6) obj;
        return kotlin.jvm.internal.o.b(this.f148021a, h6Var.f148021a) && kotlin.jvm.internal.o.b(this.f148022b, h6Var.f148022b);
    }

    public int hashCode() {
        return (this.f148021a.hashCode() * 31) + this.f148022b.hashCode();
    }

    public java.lang.String toString() {
        return "BizCallbackInfo(instanceName=" + this.f148021a + ", context=" + this.f148022b + ')';
    }
}
