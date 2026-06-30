package ra3;

/* loaded from: classes5.dex */
public class f extends qk.v9 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: b, reason: collision with root package name */
    public final ra3.k f393494b;

    public f(ra3.k kVar) {
        this.f393494b = kVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        com.tencent.mm.plugin.lite.ui.e eVar;
        ra3.k kVar = this.f393494b;
        if (kVar != null) {
            if (z17) {
                ((ra3.i) kVar).f393516a[0].dismiss();
                return;
            }
            ra3.i iVar = (ra3.i) kVar;
            if (iVar.f393517b[0] || (eVar = iVar.f393516a[0]) == null) {
                return;
            }
            eVar.show();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f364351a.a(iEmojiInfo);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
        this.f364351a.onHide();
    }
}
