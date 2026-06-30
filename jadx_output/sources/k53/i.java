package k53;

/* loaded from: classes8.dex */
public class i implements i53.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304364a;

    public i(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
        this.f304364a = gameVideoPreviewUI;
    }

    @Override // i53.q
    public void a(java.util.LinkedList linkedList, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.L0(linkedList) ? 0 : linkedList.size());
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "data size:%d, hasNext:%b", objArr);
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304364a;
        if (gameVideoPreviewUI.isFinishing() || gameVideoPreviewUI.isDestroyed()) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            k53.c0 c0Var = gameVideoPreviewUI.f140116f;
            c0Var.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                c0Var.f304346d.addAll(linkedList);
                com.tencent.mm.sdk.platformtools.u3.i(new k53.t(c0Var), 1000L);
            }
        }
        gameVideoPreviewUI.f140127t = z17;
    }
}
