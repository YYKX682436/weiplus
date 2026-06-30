package hf2;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f281085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(hf2.p1 p1Var, v65.n nVar) {
        super(1);
        this.f281084d = p1Var;
        this.f281085e = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ei0 restoreData = (r45.ei0) obj;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.p1 p1Var = this.f281084d;
        com.tencent.mars.xlog.Log.e(p1Var.f281137b, "dropBitmap operation cancel");
        qc0.g1 g1Var = p1Var.f281139d;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).d();
        }
        p1Var.f281139d = null;
        this.f281085e.a(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
