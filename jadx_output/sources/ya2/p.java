package ya2;

/* loaded from: classes.dex */
public final class p implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f460518d;

    public p(yz5.l lVar) {
        this.f460518d = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        yz5.l lVar = this.f460518d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
