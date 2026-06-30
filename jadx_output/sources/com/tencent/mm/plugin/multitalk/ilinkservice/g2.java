package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q70 f149589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.h2 f149590e;

    public g2(com.tencent.mm.plugin.multitalk.ilinkservice.h2 h2Var, r45.q70 q70Var) {
        this.f149590e = h2Var;
        this.f149589d = q70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149590e.f149598a;
        com.tencent.mm.plugin.multitalk.ilinkservice.v vVar = i4Var.f149629i;
        long j17 = i4Var.f149633l1;
        vVar.getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u27();
        lVar.f70665b = new r45.v27();
        r45.q70 q70Var = this.f149589d;
        lVar.f70667d = q70Var.f383721f;
        lVar.f70666c = q70Var.f383722g;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        boolean z17 = q70Var.f383723h;
        lVar.f70673j = z17;
        if (z17) {
            lVar.f70674k = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((r45.u27) a17.f70710a.f70684a).f386972d = q70Var.f383720e;
        ((h80.i) xVar).wi(a17, new com.tencent.mm.plugin.multitalk.ilinkservice.f2(this));
    }
}
