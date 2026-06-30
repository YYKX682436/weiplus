package ir4;

/* loaded from: classes11.dex */
public final class j implements com.tencent.mm.pluginsdk.ui.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f294272b;

    public j(java.lang.String str, com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f294271a = str;
        this.f294272b = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.l1
    public final boolean U(java.lang.String str) {
        if (!kotlin.jvm.internal.o.b(this.f294271a, str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.n1 n1Var = this.f294272b;
        n1Var.a();
        n1Var.f190903o = null;
        return true;
    }
}
