package nf2;

/* loaded from: classes10.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336758d;

    public j(nf2.w wVar) {
        this.f336758d = wVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nf2.d1 d1Var;
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView;
        int intValue = ((java.lang.Number) obj).intValue();
        nf2.w wVar = this.f336758d;
        if (wVar.f336813r && (d1Var = wVar.f336808m) != null && (finderLiveNormalRoomLyricsRenderView = d1Var.f336698s) != null) {
            finderLiveNormalRoomLyricsRenderView.f111595i = intValue;
        }
        return jz5.f0.f302826a;
    }
}
