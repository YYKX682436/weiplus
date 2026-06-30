package mn2;

/* loaded from: classes11.dex */
public class p implements com.tencent.mm.pluginsdk.ui.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f330084b;

    public p(mn2.q qVar, java.lang.String str, com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f330083a = str;
        this.f330084b = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.l1
    public boolean U(java.lang.String str) {
        if (!this.f330083a.equals(str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.n1 n1Var = this.f330084b;
        n1Var.a();
        n1Var.f190903o = null;
        return true;
    }
}
