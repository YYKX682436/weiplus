package v24;

/* loaded from: classes15.dex */
public class g0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.tg f432921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v24.q f432922b;

    public g0(com.tencent.mm.plugin.setting.ui.setting.tg tgVar, v24.q qVar) {
        this.f432921a = tgVar;
        this.f432922b = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        com.tencent.mm.plugin.setting.ui.setting.tg tgVar = this.f432921a;
        if (tgVar != null) {
            tgVar.a(this.f432922b.R);
        }
    }
}
