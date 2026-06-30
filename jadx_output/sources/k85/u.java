package k85;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sensitive.ui.SysPermissionDialogUI f305445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f305446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.sensitive.ui.SysPermissionDialogUI sysPermissionDialogUI, java.lang.String[] strArr) {
        super(1);
        this.f305445d = sysPermissionDialogUI;
        this.f305446e = strArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String[] strArr = this.f305446e;
        com.tencent.mm.sensitive.ui.SysPermissionDialogUI sysPermissionDialogUI = this.f305445d;
        if (booleanValue) {
            sysPermissionDialogUI.getIntent().putExtra("IS_FROM_DELEGATE", true);
            java.util.ArrayList arrayList = sysPermissionDialogUI.f193195e;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j85.h.b(j85.h.f298258a, 151L, java.lang.Long.valueOf(((d85.g0) it.next()).f227193e), null, null, 12, null);
                }
            }
            z2.h.a(sysPermissionDialogUI, strArr, sysPermissionDialogUI.f193197g);
        } else {
            int length = strArr.length;
            int[] iArr = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr[i17] = -1;
            }
            yz5.q qVar = com.tencent.mm.sensitive.ui.SysPermissionDialogUI.f193193h;
            if (qVar != null) {
                qVar.invoke(java.lang.Integer.valueOf(sysPermissionDialogUI.f193197g), strArr, iArr);
            }
            yz5.q qVar2 = com.tencent.mm.sensitive.ui.SysPermissionDialogUI.f193193h;
            if ((qVar2 != null ? qVar2.hashCode() : 0) == sysPermissionDialogUI.f193194d) {
                com.tencent.mm.sensitive.ui.SysPermissionDialogUI.f193193h = null;
            }
            sysPermissionDialogUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
