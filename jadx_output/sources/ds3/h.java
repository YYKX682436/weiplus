package ds3;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.pluginsdk.ui.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f242919d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f242920e;

    public h(ds3.i iVar) {
        this.f242919d = null;
        try {
            this.f242919d = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Facing.SubCorePwdGroup", e17, "", new java.lang.Object[0]);
        }
        this.f242920e = new jt0.i(15, ds3.h.class);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().d((kv.e0) n1Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        kk.j jVar = this.f242920e;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((jt0.i) jVar).get(str);
        android.graphics.Bitmap bitmap = this.f242919d;
        if (weakReference != null && weakReference.get() != null && !((android.graphics.Bitmap) weakReference.get()).isRecycled() && weakReference.get() == bitmap) {
            return (android.graphics.Bitmap) weakReference.get();
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
        if (a17 == null || a17.isRecycled()) {
            return bitmap;
        }
        ((jt0.i) jVar).j(str, new java.lang.ref.WeakReference(a17));
        return a17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f242919d;
    }
}
