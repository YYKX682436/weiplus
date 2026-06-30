package df2;

/* loaded from: classes10.dex */
public final class lr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(df2.lt ltVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230693d = ltVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.lr(this.f230693d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.lr lrVar = (df2.lr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lrVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.lt ltVar = this.f230693d;
        synchronized (ltVar.f230713u) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) ltVar.business(mm2.c1.class)).f328808g3;
            if (finderJumpInfo != null) {
                int size = ltVar.f230717y.size() == 0 ? 0 : (ltVar.f230712t % ltVar.f230717y.size()) + 1;
                if2.d0 d0Var = ltVar.K;
                if (d0Var != null) {
                    d0Var.d(0);
                }
                kotlinx.coroutines.r2 r2Var = ltVar.B;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                ltVar.f230717y.add(size, new dk2.h(finderJumpInfo));
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                ltVar.u7();
                java.lang.String str = df2.lt.W;
                com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "[checkInsertNotifyBanner] index = " + size);
                if (size == 0) {
                    pm0.v.V(ltVar.f230715w ? 2000L : 5000L, new df2.kr(ltVar));
                }
                ltVar.x7();
            }
            ((mm2.c1) ltVar.business(mm2.c1.class)).f328808g3 = null;
        }
        return jz5.f0.f302826a;
    }
}
