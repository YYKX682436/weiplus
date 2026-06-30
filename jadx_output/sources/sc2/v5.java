package sc2;

/* loaded from: classes2.dex */
public final class v5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f406308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(r45.wf6 wf6Var) {
        super(1);
        this.f406308d = wf6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.wf6 wf6Var2 = this.f406308d;
        return java.lang.Boolean.valueOf(wf6Var2 != null && wf6Var.getInteger(2) == wf6Var2.getInteger(2));
    }
}
