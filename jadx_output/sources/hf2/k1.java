package hf2;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f281095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(hf2.p1 p1Var, v65.n nVar) {
        super(3);
        this.f281094d = p1Var;
        this.f281095e = nVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        r45.ei0 restoreData = (r45.ei0) obj3;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.p1 p1Var = this.f281094d;
        p1Var.f281136a.q7("dropBitmap", bitmap, booleanValue, restoreData, true);
        qc0.g1 g1Var = p1Var.f281139d;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).d();
        }
        p1Var.f281139d = null;
        this.f281095e.a(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
