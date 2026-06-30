package sb2;

/* loaded from: classes2.dex */
public final class k extends tc2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.c
    public void Q6() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        kotlinx.coroutines.y0 y0Var;
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        if (context == null || (baseFinderFeed = gVar.f417148h) == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (finderObject = feedObject.getFinderObject()) == null) {
            return;
        }
        in5.r rVar = gVar.f417150m;
        com.tencent.mm.plugin.finder.convert.zf zfVar = rVar instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) rVar : null;
        if (zfVar == null || (y0Var = gVar.f417147g) == null) {
            return;
        }
        kotlinx.coroutines.l.d(y0Var, null, null, new sb2.j(context, finderObject, zfVar, this, null), 3, null);
    }
}
