package hn;

@j95.b
/* loaded from: classes4.dex */
public final class s extends i95.w implements vg3.k3, com.tencent.mm.ui.da {
    public void Ai(android.content.Context context, vg3.i3 param, vg3.h3 h3Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(param, "param");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomOpenService", "context is not MMActivity");
            return;
        }
        r45.lz lzVar = new r45.lz();
        lzVar.f379993d = param.f436712d;
        lzVar.f379996g = param.f436715g;
        lzVar.f379994e = param.f436713e;
        lzVar.f379995f = param.f436714f;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1023;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappbindchatroom";
        lVar.f70664a = lzVar;
        lVar.f70665b = new r45.mz();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        pm0.v.X(new hn.j(h0Var, context));
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new hn.n(param, mMFragmentActivity, context, h3Var, h0Var, this));
    }

    public void Bi(android.content.Context context, vg3.i3 param) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(param, "param");
        r45.pz pzVar = new r45.pz();
        pzVar.f383485d = param.f436712d;
        pzVar.f383488g = param.f436715g;
        pzVar.f383486e = param.f436713e;
        pzVar.f383487f = param.f436714f;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1969;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappjoinchatroom";
        lVar.f70664a = pzVar;
        lVar.f70665b = new r45.qz();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        pm0.v.X(new hn.o(h0Var, context));
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new hn.q(h0Var, context));
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    public void wi(android.content.Context context, vg3.i3 param, vg3.j3 j3Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(param, "param");
        r45.ca caVar = new r45.ca();
        caVar.f371388d = param.f436712d;
        caVar.f371389e = param.f436718m;
        caVar.f371390f = param.f436720o;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6892;
        lVar.f70666c = "/cgi-bin/micromsg-bin/appunbindchatroom";
        lVar.f70664a = caVar;
        lVar.f70665b = new r45.da();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        pm0.v.X(new hn.g(h0Var, context));
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new hn.i(h0Var, param, context, j3Var));
    }
}
