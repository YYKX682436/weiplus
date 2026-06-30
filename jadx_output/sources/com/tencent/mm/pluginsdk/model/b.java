package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.pm.ResolveInfo f189195a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f189196b;

    public b(android.content.pm.ResolveInfo info, android.content.Intent targetIntent) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(targetIntent, "targetIntent");
        this.f189195a = info;
        this.f189196b = targetIntent;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.model.b)) {
            return false;
        }
        com.tencent.mm.pluginsdk.model.b bVar = (com.tencent.mm.pluginsdk.model.b) obj;
        return kotlin.jvm.internal.o.b(this.f189195a, bVar.f189195a) && kotlin.jvm.internal.o.b(this.f189196b, bVar.f189196b);
    }

    public int hashCode() {
        return (this.f189195a.hashCode() * 31) + this.f189196b.hashCode();
    }

    public java.lang.String toString() {
        return "AppIntentInfo(info=" + this.f189195a + ", targetIntent=" + this.f189196b + ')';
    }
}
