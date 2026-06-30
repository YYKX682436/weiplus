package ji4;

/* loaded from: classes11.dex */
public class r implements com.tencent.mm.pluginsdk.ui.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f299946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f299947b;

    public r(ji4.s sVar, java.lang.String str, com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f299946a = str;
        this.f299947b = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.l1
    public boolean U(java.lang.String str) {
        if (!this.f299946a.equals(str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.n1 n1Var = this.f299947b;
        n1Var.a();
        n1Var.f190903o = null;
        return true;
    }
}
