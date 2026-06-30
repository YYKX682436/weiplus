package kk5;

/* loaded from: classes.dex */
public final class o0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f308674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final java.util.List T6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            arrayList.add(c01.a2.e(str));
        }
        return arrayList;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.z3(getActivity(), kk5.m0.f308670d);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new kk5.n0(this));
    }
}
