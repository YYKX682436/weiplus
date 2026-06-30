package com.tencent.mm.plugin.profile;

/* loaded from: classes8.dex */
public class k1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153512a;

    public k1(com.tencent.mm.plugin.profile.e0 e0Var) {
        this.f153512a = e0Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, this.f153512a.f153432s, java.lang.Boolean.valueOf(z17));
    }
}
