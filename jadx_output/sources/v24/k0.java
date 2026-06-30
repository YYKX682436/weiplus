package v24;

/* loaded from: classes15.dex */
public class k0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.tg f432933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v24.q f432934b;

    public k0(com.tencent.mm.plugin.setting.ui.setting.tg tgVar, v24.q qVar) {
        this.f432933a = tgVar;
        this.f432934b = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        this.f432933a.a(this.f432934b.R);
    }
}
