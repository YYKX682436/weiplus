package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public final class g3 extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f199076e = "";

    /* renamed from: f, reason: collision with root package name */
    public static long f199077f;

    static {
        new com.tencent.mm.ui.chatting.component.e3(null);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (com.tencent.mm.storage.z3.O4(this.f198580d.x()) || com.tencent.mm.storage.z3.N4(this.f198580d.x())) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.f3(this));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        f199076e = this.f198580d.x();
        f199077f = c01.id.c() / 1000;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("normsg_last_resume_userinfo");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        M.putString("last_resume_user_string", f199076e);
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("normsg_last_resume_userinfo");
        kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
        M2.putLong("last_resume_user_ts_long", f199077f);
    }
}
