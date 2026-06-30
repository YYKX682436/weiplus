package z51;

/* loaded from: classes10.dex */
public final class j implements com.tencent.mm.pluginsdk.ui.tools.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.p f470190d;

    public j(z51.p pVar) {
        this.f470190d = pVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.b4
    public final void k(int i17, int i18) {
        y51.e eVar;
        z51.p pVar = this.f470190d;
        pVar.f("info callback >> what: " + i17 + " extra: " + i18);
        if (i17 != 106 || (eVar = pVar.f470206m) == null) {
            return;
        }
        eVar.a();
    }
}
