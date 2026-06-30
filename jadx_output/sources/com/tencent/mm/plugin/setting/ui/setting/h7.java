package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f161097a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ov6 f161098b;

    public h7(int i17, r45.ov6 ov6Var) {
        this.f161097a = i17;
        this.f161098b = ov6Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.setting.ui.setting.h7)) {
            return false;
        }
        com.tencent.mm.plugin.setting.ui.setting.h7 h7Var = (com.tencent.mm.plugin.setting.ui.setting.h7) obj;
        return this.f161097a == h7Var.f161097a && kotlin.jvm.internal.o.b(this.f161098b, h7Var.f161098b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f161097a) * 31;
        r45.ov6 ov6Var = this.f161098b;
        return hashCode + (ov6Var == null ? 0 : ov6Var.hashCode());
    }

    public java.lang.String toString() {
        return "UserAuthAppWrapper(itemType=" + this.f161097a + ", userAuthApp=" + this.f161098b + ')';
    }
}
