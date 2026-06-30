package o00;

/* loaded from: classes9.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o00.w f341885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o00.w wVar) {
        super(0);
        this.f341885d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        o00.t tVar = this.f341885d.f341887b;
        if (tVar != null && (u3Var = ((o00.s) tVar).f341881b) != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
