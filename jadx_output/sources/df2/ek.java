package df2;

/* loaded from: classes3.dex */
public final class ek implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.pk f230067a;

    public ek(df2.pk pkVar) {
        this.f230067a = pkVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        df2.pk pkVar = this.f230067a;
        com.tencent.mars.xlog.Log.i(pkVar.f231073m, "dismiss");
        pkVar.e7();
    }
}
