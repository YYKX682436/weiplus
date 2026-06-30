package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f131886a;

    /* renamed from: b, reason: collision with root package name */
    public final db5.h4 f131887b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f131888c;

    public dc(boolean z17, db5.h4 h4Var, boolean z18) {
        this.f131886a = z17;
        this.f131887b = h4Var;
        this.f131888c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.dc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.dc dcVar = (com.tencent.mm.plugin.finder.view.dc) obj;
        return this.f131886a == dcVar.f131886a && kotlin.jvm.internal.o.b(this.f131887b, dcVar.f131887b) && this.f131888c == dcVar.f131888c;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f131886a) * 31;
        db5.h4 h4Var = this.f131887b;
        return ((hashCode + (h4Var == null ? 0 : h4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f131888c);
    }

    public java.lang.String toString() {
        return "CustomTopMemuConfig(isShowTopMenuItem=" + this.f131886a + ", topMemuItem=" + this.f131887b + ", wxContactFirst=" + this.f131888c + ')';
    }
}
