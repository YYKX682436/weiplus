package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f141793a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f141794b;

    public v0(java.lang.String id6, java.lang.String text) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(text, "text");
        this.f141793a = id6;
        this.f141794b = text;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.ui.v0)) {
            return false;
        }
        com.tencent.mm.plugin.game.ui.v0 v0Var = (com.tencent.mm.plugin.game.ui.v0) obj;
        return kotlin.jvm.internal.o.b(this.f141793a, v0Var.f141793a) && kotlin.jvm.internal.o.b(this.f141794b, v0Var.f141794b);
    }

    public int hashCode() {
        return (this.f141793a.hashCode() * 31) + this.f141794b.hashCode();
    }

    public java.lang.String toString() {
        return "FeatureItem(id=" + this.f141793a + ", text=" + this.f141794b + ')';
    }
}
