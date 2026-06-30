package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(com.tencent.mm.plugin.finder.profile.uic.ob obVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123892e = obVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.k7(this.f123892e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.k7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f123891d;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123892e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.r13 r13Var = new r45.r13();
            r13Var.f384417d = obVar.getUsername();
            db2.t4 t4Var = db2.t4.f228171a;
            r45.kv0 b17 = t4Var.b(9037, obVar.getContextObj());
            r13Var.f384418e = b17;
            r45.qt2 contextObj = obVar.getContextObj();
            b17.set(1, java.lang.Integer.valueOf(contextObj != null ? contextObj.getInteger(7) : 0));
            long j17 = 0;
            if (t4Var.q()) {
                j17 = obVar.getIntent().getLongExtra("finder_from_feed_id", 0L);
                str = obVar.getIntent().getStringExtra("finder_from_feed_dup_flag");
            } else {
                str = null;
            }
            r45.kv0 kv0Var = r13Var.f384418e;
            r45.qt2 contextObj2 = obVar.getContextObj();
            r45.kv0 kv0Var2 = r13Var.f384418e;
            t4Var.h(kv0Var, contextObj2, kz5.b0.c(new jz5.o(new java.lang.Integer(kv0Var2 != null ? kv0Var2.getInteger(1) : 0), new java.lang.Long(j17), str)));
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "doSceneForUserInfo param, username: " + r13Var.f384417d);
            com.tencent.mm.modelbase.i b18 = r13Var.b();
            this.f123891d = 1;
            obj = rm0.h.b(b18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.protobuf.f resp = ((com.tencent.mm.modelbase.f) obj).f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        obVar.H7((r45.s13) resp, true);
        return jz5.f0.f302826a;
    }
}
