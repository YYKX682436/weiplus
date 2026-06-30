package k85;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sensitive.ui.SysPermissionDialogUI f305448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305449f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d85.g0 g0Var, com.tencent.mm.sensitive.ui.SysPermissionDialogUI sysPermissionDialogUI, yz5.l lVar) {
        super(1);
        this.f305447d = g0Var;
        this.f305448e = sysPermissionDialogUI;
        this.f305449f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        yz5.l lVar = this.f305449f;
        if (booleanValue) {
            j85.h hVar = j85.h.f298258a;
            d85.g0 g0Var = this.f305447d;
            j85.h.b(hVar, 102L, java.lang.Long.valueOf(g0Var.f227193e), null, null, 12, null);
            com.tencent.mm.sensitive.ui.SysPermissionDialogUI sysPermissionDialogUI = this.f305448e;
            java.util.ArrayList arrayList = sysPermissionDialogUI.f193196f;
            kotlin.jvm.internal.o.d(arrayList);
            arrayList.remove(g0Var);
            java.util.ArrayList arrayList2 = sysPermissionDialogUI.f193196f;
            kotlin.jvm.internal.o.d(arrayList2);
            d85.g0 g0Var2 = (d85.g0) kz5.n0.Z(arrayList2);
            if (g0Var2 != null) {
                sysPermissionDialogUI.T6(g0Var2, lVar);
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return f0Var2;
    }
}
