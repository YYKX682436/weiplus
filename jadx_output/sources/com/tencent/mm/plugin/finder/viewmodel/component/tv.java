package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class tv {

    /* renamed from: a, reason: collision with root package name */
    public x91.h f136061a;

    public tv(x91.h hVar) {
        this.f136061a = hVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.tv) && kotlin.jvm.internal.o.b(this.f136061a, ((com.tencent.mm.plugin.finder.viewmodel.component.tv) obj).f136061a);
    }

    public int hashCode() {
        x91.h hVar = this.f136061a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceInfo(device=" + this.f136061a + ')';
    }
}
