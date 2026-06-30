package z83;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI f470732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI kidsWatchRegSuccessUI) {
        super(0);
        this.f470732d = kidsWatchRegSuccessUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        a93.a aVar = a93.a.f2429a;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI kidsWatchRegSuccessUI = this.f470732d;
        androidx.appcompat.app.AppCompatActivity context = kidsWatchRegSuccessUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str = kidsWatchRegSuccessUI.f143177d;
        if (str != null) {
            aVar.a(context, str, false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("loginUrl");
        throw null;
    }
}
