package ud2;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426631d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ud2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426633f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ud2.n nVar = new ud2.n(this.f426633f, continuation);
        nVar.f426632e = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ud2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        kotlinx.coroutines.y0 y0Var;
        r45.nw1 liveInfo;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426631d;
        ud2.o oVar = this.f426633f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f426632e;
            com.tencent.mars.xlog.Log.i(oVar.f426636c, "on resume");
            this.f426632e = y0Var2;
            this.f426631d = 1;
            a17 = ud2.o.a(oVar, this);
            if (a17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f426632e;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) a17;
        if (finderObject != null) {
            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
            java.lang.Long l17 = liveInfo2 != null ? new java.lang.Long(liveInfo2.getLong(0)) : null;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = oVar.f426637d;
            if (!kotlin.jvm.internal.o.b(l17, (finderItem == null || (liveInfo = finderItem.getLiveInfo()) == null) ? null : new java.lang.Long(liveInfo.getLong(0)))) {
                oVar.f426637d = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
                ud2.o.b(oVar);
            }
        }
        if (oVar.f426639f.getPlayer() == null) {
            com.tencent.mars.xlog.Log.i(oVar.f426636c, "create new player");
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f426639f;
            int X = nn0.c.X(false);
            nn0.c cVar = new nn0.c(nearbyLivePreviewView.getContext(), (X == 5 || X == 6) ? 2 : 0, false);
            cVar.f(true);
            cVar.J(new rp2.g(nearbyLivePreviewView));
            cVar.K(mn0.d0.f329725x, 18);
            com.tencent.mm.plugin.finder.live.util.n2 n2Var = com.tencent.mm.plugin.finder.live.util.n2.f115640a;
            java.lang.String str = oVar.f426636c;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = oVar.f426637d;
            cVar.F(com.tencent.mm.plugin.finder.live.util.n2.b(n2Var, str, true, finderItem2 != null ? finderItem2.getLiveInfo() : null, null, 0, 0, 56, null));
            cVar.Q(0);
            nearbyLivePreviewView.setPlayer(cVar);
        }
        boolean isPlaying = oVar.f426639f.isPlaying();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!isPlaying) {
            ud2.o.c(oVar);
            return f0Var;
        }
        com.tencent.mars.xlog.Log.e(oVar.f426636c, y0Var + " try start play when playing");
        return f0Var;
    }
}
