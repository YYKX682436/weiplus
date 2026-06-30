package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes5.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitalk.model.t2 f150136a = new com.tencent.mm.plugin.multitalk.model.t2();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f150137b = "mmkv_multitalk_status_monitor";

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(f150137b);
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final void b() {
        if (a().getInt("mmkv_multitalk_status_notAllowRecovery", 0) == 1) {
            return;
        }
        a().remove("mmkv_multitalk_status");
        a().remove("mmkv_multitalk_status_notAllowRecovery");
        a().remove("mmkv_multitalk_member_list");
    }
}
