package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class n5 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f188998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f188999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f189000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189002h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.s5 f189003i;

    public n5(com.tencent.mm.pluginsdk.model.app.s5 s5Var, com.tencent.mm.pluginsdk.model.app.d dVar, com.tencent.mm.storage.f9 f9Var, long j17, java.lang.String str, java.lang.String str2) {
        this.f189003i = s5Var;
        this.f188998d = dVar;
        this.f188999e = f9Var;
        this.f189000f = j17;
        this.f189001g = str;
        this.f189002h = str2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(m1Var.getType());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[3] = str == null ? "" : str;
        objArr[4] = java.lang.Long.valueOf(this.f188998d.field_msgInfoId);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneAppMsg", "sendFileUploadMsgCallback type:%d errType:%d errCode:%d errMsg:%s msgId:%s", objArr);
        r45.yy5 yy5Var = (r45.yy5) oVar.f70710a.f70684a;
        if (yy5Var != null) {
            java.lang.String str2 = yy5Var.f391501e;
            com.tencent.mm.storage.f9 f9Var = this.f188999e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
            sb6.append('_');
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getCreateTime()) : null);
            if (com.tencent.mm.sdk.platformtools.t8.D0(str2, sb6.toString())) {
                if (i17 == 0 && i18 == 0) {
                    r45.zy5 zy5Var = (r45.zy5) oVar.f70711b.f70700a;
                    if (zy5Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SceneAppMsg", "FileUploadToken:%s NewMsgId:%s msgId:%s", zy5Var.f392476d, java.lang.Long.valueOf(zy5Var.f392477e), yy5Var.f391501e);
                        com.tencent.mm.pluginsdk.model.app.d dVar = this.f188998d;
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
                        if (Li.getMsgId() == 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SceneAppMsg", "sendFileUploadMsgCallback msg:%s no exist!", yy5Var.f391501e);
                            return 0;
                        }
                        ot0.q v17 = ot0.q.v(Li.j());
                        rt0.b bVar = new rt0.b();
                        java.lang.String str3 = zy5Var.f392476d;
                        kotlin.jvm.internal.o.g(str3, "<set-?>");
                        bVar.f399373c = str3;
                        bVar.f399372b = zy5Var.f392477e;
                        v17.f(bVar);
                        Li.d1(ot0.q.u(v17, null, null));
                        Li.r1(2);
                        Li.o1(zy5Var.f392477e);
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
                        ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(v17, Li, 1));
                        this.f189003i.e(this.f188998d, Li, this.f189000f, this.f189001g, this.f189002h);
                    }
                } else {
                    com.tencent.mm.pluginsdk.model.app.k0.N(this.f188998d.systemRowid, bu.a.c(i18, i17, str, m1Var.getType()));
                }
            }
        }
        return 0;
    }
}
