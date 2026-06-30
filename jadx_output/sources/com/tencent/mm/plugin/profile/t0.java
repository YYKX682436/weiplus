package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class t0 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.s0 f153617d;

    public t0(com.tencent.mm.plugin.profile.s0 s0Var) {
        this.f153617d = s0Var;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "[-] yuanbao:  chat bot account should not need verification.");
        } else {
            com.tencent.mm.plugin.profile.s0 s0Var = this.f153617d;
            com.tencent.mm.plugin.profile.e0.b(s0Var.f153610f, s0Var.f153605a, s0Var.f153606b, str);
        }
    }
}
