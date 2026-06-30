package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes.dex */
public final class m1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124621a;

    public m1(r45.h32 h32Var) {
        this.f124621a = h32Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, "view_clk")) {
            return kz5.b1.e(new jz5.l("live_reserve_action_type", java.lang.Integer.valueOf(this.f124621a.getInteger(1) == 1 ? 0 : 1)));
        }
        return kz5.q0.f314001d;
    }
}
