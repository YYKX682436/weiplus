package sp2;

/* loaded from: classes2.dex */
public final class l implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.p f411067a;

    public l(sp2.p pVar) {
        this.f411067a = pVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        yz5.a aVar = this.f411067a.f411176h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
