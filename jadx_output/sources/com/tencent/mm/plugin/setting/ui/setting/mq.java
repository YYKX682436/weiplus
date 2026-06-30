package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class mq extends com.tencent.mm.plugin.setting.ui.setting.qq {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.kq f161340b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(com.tencent.mm.plugin.setting.ui.setting.kq btn) {
        super("view_clk", null);
        kotlin.jvm.internal.o.g(btn, "btn");
        this.f161340b = btn;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.qq
    public void a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        params.put("view_id", "setting_avatar_actionsheet");
        params.put("clk_actionsheet_btn", java.lang.Integer.valueOf(this.f161340b.f161257d));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.setting.ui.setting.mq) && this.f161340b == ((com.tencent.mm.plugin.setting.ui.setting.mq) obj).f161340b;
    }

    public int hashCode() {
        return this.f161340b.hashCode();
    }

    public java.lang.String toString() {
        return "Click(btn=" + this.f161340b + ')';
    }
}
