package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class r3 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.s3 f149758a;

    public r3(com.tencent.mm.plugin.multitalk.ilinkservice.s3 s3Var) {
        this.f149758a = s3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.v07 v07Var = (r45.v07) oVar.f70711b.f70700a;
        com.tencent.mm.plugin.multitalk.ilinkservice.s3 s3Var = this.f149758a;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = s3Var.f149782e.Y;
        java.lang.String str2 = s3Var.f149781d;
        int i19 = v07Var.f387792e;
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = cVar.f149514a;
        v0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onDoScreenSharingSecurityCheck filemd5:%s ret:%d checkRet:%d", str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        ((ku5.t0) ku5.t0.f312615d).A("delayChecking");
        com.tencent.mm.plugin.multitalk.model.c3 c3Var = v0Var.f150173p1;
        if (c3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkManager", "mFileSecurity is null");
            return;
        }
        c3Var.f149902b = java.lang.Boolean.valueOf(i19 == 0);
        c3Var.f149901a = str2;
        androidx.lifecycle.j0 j0Var = v0Var.f150183x1;
        if (j0Var != null) {
            j0Var.postValue(c3Var);
        }
    }
}
