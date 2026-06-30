package rd3;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd3.e f394240d;

    public d(rd3.e eVar) {
        this.f394240d = eVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        rd3.e eVar = this.f394240d;
        eVar.s().invoke(eVar.h(1, "cancel"));
    }
}
