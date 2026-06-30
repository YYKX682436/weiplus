package dl2;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(dl2.f0 f0Var) {
        super(0);
        this.f235185d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dl2.f0 f0Var = this.f235185d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) f0Var.f235197a.findViewById(com.tencent.mm.R.id.fjz);
        liveBottomSheetPanel.setOnVisibilityListener(new dl2.z(f0Var));
        liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(f0Var.f235197a.getContext()).y);
        return liveBottomSheetPanel;
    }
}
