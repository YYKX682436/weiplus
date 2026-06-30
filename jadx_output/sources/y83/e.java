package y83;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI f459983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
        super(0);
        this.f459983d = kidsWatchLoginCardChooseUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f459983d;
        kidsWatchLoginCardChooseUI.finish();
        x83.g gVar = x83.g.f452568a;
        x83.c cVar = x83.c.f452553f;
        java.lang.String str = kidsWatchLoginCardChooseUI.f143112d;
        if (str != null) {
            gVar.a(cVar, str, x83.e.f452562e, x83.d.f452558g, kidsWatchLoginCardChooseUI.f143116h, 0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("loginUrl");
        throw null;
    }
}
