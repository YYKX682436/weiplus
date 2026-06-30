package ro5;

/* loaded from: classes14.dex */
public final class n implements ro5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f398265a;

    public n(ro5.b0 b0Var) {
        this.f398265a = b0Var;
    }

    public void a(int i17, int i18, int i19, int i27, boolean z17) {
        if (i18 == 0 || i19 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController", "updateMemberSize, new size is zero");
            return;
        }
        ro5.b0 b0Var = this.f398265a;
        ro5.j jVar = b0Var.f398144a;
        if (jVar != null) {
            jVar.d(i17, i18, i19, i27, z17, false);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController", "textureManager is null");
            b0Var.f398159p.put(i17, new ro5.e(i17, i18, i19, i27, z17));
        }
    }
}
