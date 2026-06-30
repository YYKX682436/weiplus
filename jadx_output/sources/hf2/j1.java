package hf2;

/* loaded from: classes10.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f281091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(hf2.p1 p1Var, v65.n nVar) {
        super(2);
        this.f281090d = p1Var;
        this.f281091e = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ei0 restoreData = (r45.ei0) obj2;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.p1 p1Var = this.f281090d;
        com.tencent.mars.xlog.Log.e(p1Var.f281137b, "dropBitmap onError: " + ((java.lang.Exception) obj) + ",restoreData:" + restoreData.hashCode());
        qc0.g1 g1Var = p1Var.f281139d;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).d();
        }
        p1Var.f281139d = null;
        this.f281091e.a(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
