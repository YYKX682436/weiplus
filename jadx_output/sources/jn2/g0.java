package jn2;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.m0 f300616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f300617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(jn2.m0 m0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300616e = m0Var;
        this.f300617f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.g0(this.f300616e, this.f300617f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f300615d;
        jn2.m0 m0Var = this.f300616e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                zl2.r4.f473950a.h3(m0Var.f118183e, true);
                sf2.x xVar = m0Var.I;
                java.util.List list = this.f300617f;
                this.f300615d = 1;
                obj = xVar.l7(list, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            zl2.r4.f473950a.h3(m0Var.f118183e, false);
            com.tencent.mm.plugin.finder.live.widget.e0.t(m0Var, false, 1, null);
            if (booleanValue) {
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongEditPanel", "Reorder songs success");
                m0Var.I.s7(false);
            } else {
                com.tencent.mars.xlog.Log.e("FinderLiveAnchorSingSongEditPanel", "Reorder songs failed");
                db5.t7.m(m0Var.f118183e, "网络错误，请稍后再试");
                m0Var.I.s7(false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorSingSongEditPanel", "Reorder songs exception: " + e17.getMessage());
            zl2.r4.f473950a.h3(m0Var.f118183e, false);
            com.tencent.mm.plugin.finder.live.widget.e0.t(m0Var, false, 1, null);
            db5.t7.m(m0Var.f118183e, "网络错误，请稍后再试");
            m0Var.I.s7(false);
        }
        return jz5.f0.f302826a;
    }
}
