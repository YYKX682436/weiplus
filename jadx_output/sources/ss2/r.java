package ss2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411981d;

    public r(ss2.a0 a0Var) {
        this.f411981d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        ss2.a0 a0Var = this.f411981d;
        android.os.Bundle bundle = a0Var.A;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle != null ? bundle.getStringArrayList("image_thumb_list") : null;
        a0Var.f411917s.clear();
        java.util.ArrayList arrayList = a0Var.f411916r;
        if (arrayList != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String e17 = (stringArrayList == null || stringArrayList.size() <= i17 || com.tencent.mm.sdk.platformtools.t8.K0(stringArrayList.get(i17))) ? mv2.q.f331618a.e((java.lang.String) obj, null) : stringArrayList.get(i17);
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                java.util.ArrayList arrayList2 = a0Var.f411918t;
                if (arrayList2 != null && (str = (java.lang.String) kz5.n0.a0(arrayList2, i17)) != null) {
                    h0Var.f310123d = mv2.q.f331618a.e(str, null);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                    android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(e17, null);
                    android.graphics.Bitmap J3 = com.tencent.mm.sdk.platformtools.x.J((java.lang.String) h0Var.f310123d, null);
                    if (J2 != null) {
                        com.tencent.mm.sdk.platformtools.u3.h(new ss2.q(a0Var, e17, h0Var, J3, i17, J2));
                    }
                }
                i17 = i18;
            }
        }
    }
}
