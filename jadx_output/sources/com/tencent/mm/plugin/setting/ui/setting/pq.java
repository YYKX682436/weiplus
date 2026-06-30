package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class pq extends com.tencent.mm.plugin.setting.ui.setting.qq {

    /* renamed from: b, reason: collision with root package name */
    public final int f161456b;

    public pq(int i17) {
        super("set_avatar_finish", null);
        this.f161456b = i17;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.qq
    public void a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        params.put("crt_pic_from", java.lang.Integer.valueOf(this.f161456b));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.setting.ui.setting.pq) && this.f161456b == ((com.tencent.mm.plugin.setting.ui.setting.pq) obj).f161456b;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f161456b);
    }

    public java.lang.String toString() {
        return "SetAvatar(source=" + this.f161456b + ')';
    }
}
