package v24;

/* loaded from: classes9.dex */
public class w implements com.tencent.mm.plugin.setting.ui.setting.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.o1 f432960a;

    public w(wd0.o1 o1Var) {
        this.f432960a = o1Var;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.tg
    public void a(boolean z17) {
        wd0.o1 o1Var = this.f432960a;
        if (z17) {
            o1Var.onSuccess();
        } else {
            o1Var.a();
        }
    }
}
