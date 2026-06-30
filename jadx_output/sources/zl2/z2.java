package zl2;

/* loaded from: classes3.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f474047d;

    public z2(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.z2(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new zl2.z2((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f474047d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.f437820f;
            this.f474047d = 1;
            obj = sVar.a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "playClickApplaudSound path isNullOrEmpty");
            return f0Var;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "playClickApplaudSound file not exist:".concat(str));
            return f0Var;
        }
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            java.lang.Integer num = new java.lang.Integer(-10001);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "stopLocalSoundEffect");
            java.lang.Integer valueOf = java.lang.Integer.valueOf(num.intValue());
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                w0Var.T().getAudioEffectManager().stopPlayMusic(intValue);
                w0Var.T().getAudioEffectManager().setMusicObserver(intValue, null);
            }
        }
        tn0.w0 w0Var2 = dk2.ef.f233378d;
        if (w0Var2 != null) {
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            w0Var2.l0(-10001, o17, null);
        }
        return f0Var;
    }
}
