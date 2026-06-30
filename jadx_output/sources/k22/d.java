package k22;

/* loaded from: classes12.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k22.g f303478a;

    public d(k22.g gVar) {
        this.f303478a = gVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        k22.g gVar = this.f303478a;
        java.lang.String str = gVar.D;
        gm0.j1.n().f273288b.q(521, gVar);
        gm0.j1.n().f273288b.q(239, gVar);
        gm0.j1.n().f273288b.q(412, gVar);
        yz5.a aVar = gVar.f303501y;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
