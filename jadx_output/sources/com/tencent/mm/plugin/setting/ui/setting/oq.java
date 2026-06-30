package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class oq extends com.tencent.mm.plugin.setting.ui.setting.qq {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f161405b;

    public oq(boolean z17) {
        super("view_exp", null);
        this.f161405b = z17;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.qq
    public void a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        params.put("view_id", "setting_avatar_actionsheet");
        params.put("has_yuanbao_btn", java.lang.Integer.valueOf(this.f161405b ? 1 : 0));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.setting.ui.setting.oq) && this.f161405b == ((com.tencent.mm.plugin.setting.ui.setting.oq) obj).f161405b;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f161405b);
    }

    public java.lang.String toString() {
        return "Expose(hasYuanBaoButton=" + this.f161405b + ')';
    }
}
