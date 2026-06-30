package mm3;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f329612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI f329613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
        super(1);
        this.f329612d = u3Var;
        this.f329613e = musicMvFreeMakerPreviewUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        pm0.v.X(new mm3.b0(this.f329612d, this.f329613e));
        return jz5.f0.f302826a;
    }
}
