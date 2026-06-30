package com.tencent.mm.plugin.game.ui;

/* loaded from: classes11.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f141416a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f141417b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f141418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141419d;

    public i2(java.lang.String id6, java.lang.String title, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        this.f141416a = id6;
        this.f141417b = title;
        this.f141418c = str;
        this.f141419d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.ui.i2)) {
            return false;
        }
        com.tencent.mm.plugin.game.ui.i2 i2Var = (com.tencent.mm.plugin.game.ui.i2) obj;
        return kotlin.jvm.internal.o.b(this.f141416a, i2Var.f141416a) && kotlin.jvm.internal.o.b(this.f141417b, i2Var.f141417b) && kotlin.jvm.internal.o.b(this.f141418c, i2Var.f141418c) && this.f141419d == i2Var.f141419d;
    }

    public int hashCode() {
        int hashCode = ((this.f141416a.hashCode() * 31) + this.f141417b.hashCode()) * 31;
        java.lang.String str = this.f141418c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f141419d);
    }

    public java.lang.String toString() {
        return "SwitchItem(id=" + this.f141416a + ", title=" + this.f141417b + ", subtitle=" + this.f141418c + ", checked=" + this.f141419d + ')';
    }
}
