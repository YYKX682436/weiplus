package hr3;

/* loaded from: classes11.dex */
public class l1 extends wu5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283739d;

    public l1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, java.lang.String str) {
        this.f283739d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str = this.f283739d;
        qk.o b17 = r01.z.b(str);
        if (b17 != null) {
            if (b17.F0()) {
                return "_EnterpriseChat";
            }
            if (b17.I0()) {
                return "_EnterpriseFatherBiz";
            }
            if (b17.G0()) {
                return "_EnterpriseChildBiz";
            }
        }
        if (com.tencent.mm.storage.z3.R4(str)) {
            return "_chatroom";
        }
        if (com.tencent.mm.storage.z3.H3(str)) {
            return "_bottle";
        }
        if (com.tencent.mm.storage.z3.s4(str)) {
            return "_QQ";
        }
        if (!c01.e2.D(str)) {
            return "";
        }
        return "_" + str;
    }
}
