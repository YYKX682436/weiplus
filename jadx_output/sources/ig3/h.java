package ig3;

/* loaded from: classes3.dex */
public final class h implements ig3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig3.i f291427d;

    public h(ig3.i iVar) {
        this.f291427d = iVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        ig3.i iVar = this.f291427d;
        iVar.d("onGetVideoSize, width: " + i17 + ", height:" + i18, new java.lang.Object[0]);
        ig3.d dVar = iVar.f291430c;
        if (dVar != null) {
            dVar.C(iVar.f291429b, i17, i18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        ig3.i iVar = this.f291427d;
        com.tencent.mars.xlog.Log.e("MediaGallery.TPVideoStateController", iVar.c("throwError {" + i17 + ", " + i18 + '}'), java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        iVar.i(ig3.c.f291422m);
    }

    @Override // ig3.b, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        ig3.i iVar = this.f291427d;
        iVar.d("tryStart again, video is prepared", new java.lang.Object[0]);
        iVar.g();
    }
}
