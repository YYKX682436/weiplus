package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class t10 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f114326a;

    public t10(r45.h32 h32Var) {
        this.f114326a = h32Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, "view_clk")) {
            return kz5.b1.e(new jz5.l("live_reserve_action_type", java.lang.Integer.valueOf(this.f114326a.getInteger(1) == 1 ? 0 : 1)));
        }
        return kz5.q0.f314001d;
    }
}
