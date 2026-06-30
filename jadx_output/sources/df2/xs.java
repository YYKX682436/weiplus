package df2;

/* loaded from: classes10.dex */
public final class xs implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231801d;

    public xs(df2.lt ltVar) {
        this.f231801d = ltVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        df2.lt ltVar = this.f231801d;
        ltVar.f230715w = true;
        ltVar.x7();
    }
}
