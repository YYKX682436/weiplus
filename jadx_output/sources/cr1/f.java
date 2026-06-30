package cr1;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.pluginsdk.ui.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f221840b;

    public f(java.lang.String str, com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f221839a = str;
        this.f221840b = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.l1
    public final boolean U(java.lang.String str) {
        if (!kotlin.jvm.internal.o.b(this.f221839a, str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.n1 n1Var = this.f221840b;
        n1Var.a();
        n1Var.f190903o = null;
        return true;
    }
}
