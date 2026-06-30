package nf2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nf2.w wVar) {
        super(0);
        this.f336715d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf2.w wVar = this.f336715d;
        wVar.f336821z = true;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LYRICS_GESTURE_EDU_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.live.view.ub ubVar = wVar.f291099e;
        if (ubVar != null) {
            ubVar.onPluginAlphaModify(1.0f, 0.3f);
        }
        kotlinx.coroutines.r2 r2Var = wVar.f336820y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        nf2.w wVar2 = this.f336715d;
        wVar2.f336820y = com.tencent.mm.plugin.finder.live.util.y.o(wVar2, null, null, new nf2.e(wVar2, null), 3, null);
        return jz5.f0.f302826a;
    }
}
