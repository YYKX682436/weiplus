package nr2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339198d;

    /* renamed from: e, reason: collision with root package name */
    public int f339199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f339201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f339202h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nr2.l lVar, so2.q6 q6Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339200f = lVar;
        this.f339201g = q6Var;
        this.f339202h = finderRefreshLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.h(this.f339200f, this.f339201g, this.f339202h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object O6;
        java.lang.Object obj2;
        java.lang.Throwable m524exceptionOrNullimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339199e;
        nr2.l lVar = this.f339200f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f339199e = 1;
            O6 = nr2.l.O6(lVar, this.f339201g, this);
            if (O6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f339198d;
                kotlin.ResultKt.throwOnFailure(obj);
                O6 = obj2;
                m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(O6);
                if (m524exceptionOrNullimpl != null && (m524exceptionOrNullimpl instanceof rm0.j)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request CgiFinderGetTopicFeed fail, errType=");
                    rm0.j jVar = (rm0.j) m524exceptionOrNullimpl;
                    sb6.append(jVar.f397424e);
                    sb6.append(" errCode=");
                    sb6.append(jVar.f397425f);
                    sb6.append(" fail:");
                    sb6.append(jVar.f397426g);
                    com.tencent.mars.xlog.Log.e("Finder.FinderCoursePreviewItemUIC", sb6.toString());
                }
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            O6 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(O6)) {
            r45.oa1 oa1Var = (r45.oa1) O6;
            lVar.f339258n = oa1Var.getByteString(2);
            lVar.f339254g = oa1Var.getInteger(11) == 1;
            com.tencent.mars.xlog.Log.i("Finder.FinderCoursePreviewItemUIC", "request CgiFinderGetCollectionList success, data: " + oa1Var.getList(1).size() + ", lastBuffer: " + lVar.f339258n + ", continueFlage: " + lVar.f339254g);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = oa1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                arrayList.add(new com.tencent.mm.plugin.finder.playlist.z1(h90Var.a(finderObject, 64)));
            }
            lVar.f339252e.addAll(arrayList);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            nr2.g gVar = new nr2.g(lVar, this.f339202h, null);
            this.f339198d = O6;
            this.f339199e = 2;
            if (kotlinx.coroutines.l.g(g3Var, gVar, this) == aVar) {
                return aVar;
            }
            obj2 = O6;
            O6 = obj2;
        }
        m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(O6);
        if (m524exceptionOrNullimpl != null) {
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("request CgiFinderGetTopicFeed fail, errType=");
            rm0.j jVar2 = (rm0.j) m524exceptionOrNullimpl;
            sb62.append(jVar2.f397424e);
            sb62.append(" errCode=");
            sb62.append(jVar2.f397425f);
            sb62.append(" fail:");
            sb62.append(jVar2.f397426g);
            com.tencent.mars.xlog.Log.e("Finder.FinderCoursePreviewItemUIC", sb62.toString());
        }
        return jz5.f0.f302826a;
    }
}
