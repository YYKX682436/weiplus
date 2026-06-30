package vi1;

/* loaded from: classes7.dex */
public final class m1 implements vi1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vi1.y1 f437408a;

    public m1(vi1.y1 y1Var) {
        this.f437408a = y1Var;
    }

    public void b(int i17, boolean z17) {
        vi1.y1 y1Var = this.f437408a;
        if (i17 != 1) {
            if (i17 == 2) {
                y1Var.C.invoke();
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                y1Var.D.invoke();
                return;
            }
        }
        y1Var.B.invoke(java.lang.Boolean.valueOf(y1Var.f437302f.a()));
        vi1.l0 l0Var = y1Var.f437508z;
        java.util.ArrayList arrayList = l0Var != null ? l0Var.f437398e : null;
        kotlin.jvm.internal.o.d(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next();
            if (phoneItem.f87407o) {
                y1Var.H.invoke(phoneItem);
                return;
            }
        }
    }
}
