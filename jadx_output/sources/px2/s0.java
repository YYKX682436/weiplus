package px2;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout) {
        super(0);
        this.f358921d = finderVideoLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", "onMoveOutLockArea");
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = this.f358921d;
        finderVideoLandscapePreviewLayout.f132586y0 = false;
        ow2.h hVar = finderVideoLandscapePreviewLayout.W;
        if (hVar != null) {
            hVar.c(finderVideoLandscapePreviewLayout.f132584x0);
        }
        finderVideoLandscapePreviewLayout.y();
        return jz5.f0.f302826a;
    }
}
