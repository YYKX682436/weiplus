package f22;

/* loaded from: classes13.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f258962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f258963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.widget.dialog.f4 f4Var, yz5.l lVar) {
        super(1);
        this.f258962d = f4Var;
        this.f258963e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f258962d;
        if (f4Var != null) {
            f4Var.hide();
        }
        this.f258963e.invoke(v75Var);
        return jz5.f0.f302826a;
    }
}
