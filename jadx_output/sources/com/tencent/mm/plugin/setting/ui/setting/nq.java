package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class nq extends com.tencent.mm.plugin.setting.ui.setting.qq {

    /* renamed from: b, reason: collision with root package name */
    public final int f161371b;

    public nq(int i17) {
        super("enter_edit_avatar_page", null);
        this.f161371b = i17;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.qq
    public void a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        params.put("crt_pic_from", java.lang.Integer.valueOf(this.f161371b));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.setting.ui.setting.nq) && this.f161371b == ((com.tencent.mm.plugin.setting.ui.setting.nq) obj).f161371b;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f161371b);
    }

    public java.lang.String toString() {
        return "Crop(source=" + this.f161371b + ')';
    }
}
