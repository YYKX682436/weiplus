package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xz extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.zz f115136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(com.tencent.mm.plugin.finder.live.plugin.zz zzVar, java.lang.Class cls) {
        super(cls);
        this.f115136b = zzVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.protobuf.g gVar;
        r45.a22 result = (r45.a22) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPollingSuccess multistream sequence: ");
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = this.f115136b;
        sb6.append(zzVar.f115394s);
        sb6.append(" op: ");
        sb6.append(result.getInteger(1));
        sb6.append(" resSeq: ");
        sb6.append(result.getLong(0));
        com.tencent.mars.xlog.Log.i("MultiStreamPlugin", sb6.toString());
        dk2.tb tbVar = dk2.ef.f233392k;
        r45.e22 e22Var = new r45.e22();
        e22Var.set(0, java.lang.Long.valueOf(zzVar.f115394s));
        tbVar.h(13, e22Var);
        if (result.getInteger(1) == 0) {
            zzVar.f115394s = result.getLong(0);
            r45.ma4 ma4Var = (r45.ma4) result.getCustom(2);
            if (ma4Var == null || (gVar = ma4Var.f380300m) == null) {
                return;
            }
            com.tencent.mm.protobuf.f parseFrom = new r45.na4().parseFrom(gVar.f192156a);
            r45.na4 na4Var = parseFrom instanceof r45.na4 ? (r45.na4) parseFrom : null;
            if (na4Var != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update multistream list: ");
                java.util.LinkedList channel_params_desc = na4Var.f381198g;
                sb7.append(channel_params_desc);
                com.tencent.mars.xlog.Log.i("MultiStreamPlugin", sb7.toString());
                kotlin.jvm.internal.o.f(channel_params_desc, "channel_params_desc");
                com.tencent.mm.plugin.finder.live.plugin.zz.t1(zzVar, channel_params_desc);
            }
        }
    }
}
