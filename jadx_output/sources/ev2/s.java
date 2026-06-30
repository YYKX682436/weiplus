package ev2;

/* loaded from: classes10.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.t f256931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ev2.o f256932b;

    public s(ev2.t tVar, ev2.o oVar) {
        this.f256931a = tVar;
        this.f256932b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        ev2.o oVar = this.f256932b;
        ev2.t tVar = this.f256931a;
        if (i17 == 0 && fVar.f70616b == 0) {
            int likeCount = tVar.f256934d.getLikeCount();
            jv2.c cVar = tVar.f256934d;
            boolean z17 = cVar.u0().getLikeFlag() != 1 ? 0 : 1;
            boolean z18 = tVar.f256935e;
            if (z18) {
                cVar.u0().setLikeCount(cVar.getLikeCount() + (!z17));
            } else {
                cVar.u0().setLikeCount(cVar.getLikeCount() + (z17 != 0 ? -1 : 0));
            }
            cVar.u0().setLikeFlag(z18 ? 1 : 0);
            com.tencent.mars.xlog.Log.i("Finder.LikeCommentAction", "CgiFinderLikeFeed end likeFlag: " + cVar.u0().getLikeFlag() + " likeCount " + cVar.getLikeCount() + ' ' + z17 + ' ' + likeCount);
            ev2.n.f256921f.c(tVar);
            fp0.u uVar = fp0.u.f265290f;
            ev2.p pVar = (ev2.p) oVar;
            pVar.getClass();
            ev2.q qVar = pVar.f256927a;
            qVar.f256929g = false;
            qVar.b(uVar);
        } else if (i17 == 4) {
            pm0.v.X(new ev2.r(tVar));
            fp0.u uVar2 = fp0.u.f265291g;
            ev2.p pVar2 = (ev2.p) oVar;
            pVar2.getClass();
            ev2.q qVar2 = pVar2.f256927a;
            qVar2.f256929g = false;
            qVar2.b(uVar2);
        } else {
            fp0.u uVar3 = fp0.u.f265291g;
            ev2.p pVar3 = (ev2.p) oVar;
            pVar3.getClass();
            ev2.q qVar3 = pVar3.f256927a;
            qVar3.f256929g = true;
            qVar3.b(uVar3);
        }
        return jz5.f0.f302826a;
    }
}
