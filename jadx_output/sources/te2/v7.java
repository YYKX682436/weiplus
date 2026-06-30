package te2;

/* loaded from: classes3.dex */
public final class v7 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418497d;

    public v7(te2.p8 p8Var) {
        this.f418497d = p8Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        te2.p8 p8Var = this.f418497d;
        p8Var.g7().setIconColor(p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.aby));
    }
}
