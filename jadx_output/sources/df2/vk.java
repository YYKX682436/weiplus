package df2;

/* loaded from: classes3.dex */
public final class vk implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f231614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.pl f231615e;

    public vk(kotlin.jvm.internal.c0 c0Var, df2.pl plVar) {
        this.f231614d = c0Var;
        this.f231615e = plVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel;
        if (this.f231614d.f310112d || (liveBottomSheetPanel = this.f231615e.f231090p) == null) {
            return;
        }
        liveBottomSheetPanel.f();
    }
}
