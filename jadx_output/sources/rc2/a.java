package rc2;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc2.f f393927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rc2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f393927d = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rc2.a(this.f393927d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rc2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.cn2 cn2Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rc2.f fVar = this.f393927d;
        in5.s0 s0Var = fVar.f393941d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (baseFinderFeed == null) {
            return f0Var;
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = s0Var != null ? (com.tencent.mm.plugin.finder.view.FinderMediaLayout) s0Var.p(com.tencent.mm.R.id.fs6) : null;
        if (finderMediaLayout == null) {
            return f0Var;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
        java.util.LinkedList list = (feedObject2 == null || (feedObject = feedObject2.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (cn2Var = (r45.cn2) object_extend.getCustom(52)) == null) ? null : cn2Var.getList(1);
        fVar.V6();
        if ((list != null ? list.size() : 0) > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drawBlockBoxesForBulletComment: block_boxes_bulletcomment size = ");
            sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
            com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", sb6.toString());
            android.graphics.Rect T6 = fVar.T6(finderMediaLayout);
            if (list != null) {
                java.util.ArrayList<r45.jl6> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (((r45.jl6) obj2).getList(0).size() >= 4) {
                        arrayList.add(obj2);
                    }
                }
                for (r45.jl6 jl6Var : arrayList) {
                    kotlin.jvm.internal.o.d(jl6Var);
                    android.graphics.Rect O6 = rc2.f.O6(fVar, jl6Var, T6);
                    fVar.U6(O6, "block_boxes_bulletcomment");
                    in5.s0 s0Var2 = fVar.f393941d;
                    rc2.f.P6(fVar, s0Var2 != null ? s0Var2.itemView : null, O6);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "drawBlockBoxesForBulletComment: finished drawing " + ((java.util.ArrayList) fVar.f393942e).size() + " rectangles");
        } else {
            com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "drawBlockBoxesForBulletComment: block_boxes_bulletcomment is empty or null");
        }
        return f0Var;
    }
}
