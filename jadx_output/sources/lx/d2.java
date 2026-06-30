package lx;

/* loaded from: classes.dex */
public final class d2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f321722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context, lx.i2 i2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321721e = context;
        this.f321722f = i2Var;
        this.f321723g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.d2(this.f321721e, this.f321722f, this.f321723g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.d2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Di;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321720d;
        yz5.l lVar = this.f321723g;
        lx.i2 i2Var = this.f321722f;
        try {
        } catch (java.lang.Exception e17) {
            lx.i2.a(i2Var);
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera: exception", e17);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            lx.c2 c2Var = new lx.c2(lVar, e17, null);
            this.f321720d = 3;
            if (kotlinx.coroutines.l.g(g3Var, c2Var, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider e18 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.e();
            e18.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout");
            e18.M.putBoolean("key_forbit_edit_inset_layout", true);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_CONFIG", e18);
            intent.putExtra("KEY_PARAMS_TO_WHERE", 0);
            intent.putExtra("key_params_pageid", "MediaTabCaptureUI");
            java.util.ArrayList d17 = kz5.c0.d(new jz5.l(new java.lang.Integer(2), intent));
            e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
            android.content.Context context = this.f321721e;
            kotlin.jvm.internal.o.f(context, "$context");
            this.f321720d = 1;
            Di = ((o23.i) b1Var).Di((androidx.activity.ComponentActivity) context, 1, d17, 0, this);
            if (Di == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Di = obj;
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310570c;
        lx.b2 b2Var = new lx.b2((qc0.m1) Di, i2Var, lVar, null);
        this.f321720d = 2;
        if (kotlinx.coroutines.l.g(p0Var2, b2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
