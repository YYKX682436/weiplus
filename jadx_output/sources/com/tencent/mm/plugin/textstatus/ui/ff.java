package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class ff {

    /* renamed from: a, reason: collision with root package name */
    public int f173881a;

    /* renamed from: b, reason: collision with root package name */
    public int f173882b;

    public ff(int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        this.f173881a = i17;
        this.f173882b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.textstatus.ui.ff)) {
            return false;
        }
        com.tencent.mm.plugin.textstatus.ui.ff ffVar = (com.tencent.mm.plugin.textstatus.ui.ff) obj;
        return this.f173881a == ffVar.f173881a && this.f173882b == ffVar.f173882b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f173881a) * 31) + java.lang.Integer.hashCode(this.f173882b);
    }

    public java.lang.String toString() {
        return "RedInfo(showType=" + this.f173881a + ", count=" + this.f173882b + ')';
    }
}
