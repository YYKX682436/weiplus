package wd2;

/* loaded from: classes3.dex */
public final class e implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd2.g f444829a;

    public e(wd2.g gVar) {
        this.f444829a = gVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        yz5.a aVar = this.f444829a.f444852s;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
