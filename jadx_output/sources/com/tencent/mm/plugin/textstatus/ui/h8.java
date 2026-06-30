package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f173953a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f173954b;

    public h8(java.lang.String str, java.util.List list) {
        this.f173953a = str;
        this.f173954b = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.textstatus.ui.h8)) {
            return false;
        }
        com.tencent.mm.plugin.textstatus.ui.h8 h8Var = (com.tencent.mm.plugin.textstatus.ui.h8) obj;
        return kotlin.jvm.internal.o.b(this.f173953a, h8Var.f173953a) && kotlin.jvm.internal.o.b(this.f173954b, h8Var.f173954b);
    }

    public int hashCode() {
        java.lang.String str = this.f173953a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List list = this.f173954b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ThirdInfo(sourceId=" + this.f173953a + ", jumpInfos=" + this.f173954b + ')';
    }
}
