package com.tencent.mm.plugin.profile;

/* loaded from: classes8.dex */
public class w0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f154730a;

    public w0(com.tencent.mm.plugin.profile.e0 e0Var) {
        this.f154730a = e0Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.profile.e0 e0Var = this.f154730a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, e0Var.f153432s, java.lang.Boolean.valueOf(z17));
        e0Var.A.dead();
    }
}
