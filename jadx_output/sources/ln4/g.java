package ln4;

@j95.b
/* loaded from: classes4.dex */
public class g extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final pn4.q1 f319908d = pn4.o1.f357164a;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f319909e = new com.tencent.mm.sdk.platformtools.i6(5, "ProcessTranslatedMessage", 1, android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final pn4.n1 f319910f = new ln4.f(this);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f319911g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        pn4.n1 n1Var = this.f319910f;
        pn4.q1 q1Var = this.f319908d;
        if (n1Var == null) {
            q1Var.getClass();
            return;
        }
        java.util.ArrayList arrayList = q1Var.f357199c;
        if (arrayList.contains(n1Var)) {
            return;
        }
        arrayList.add(n1Var);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        pn4.n1 n1Var = this.f319910f;
        pn4.q1 q1Var = this.f319908d;
        if (n1Var != null) {
            java.util.ArrayList arrayList = q1Var.f357199c;
            if (arrayList.contains(n1Var)) {
                arrayList.remove(n1Var);
            }
        } else {
            q1Var.getClass();
        }
        pn4.e2[] e2VarArr = q1Var.f357198b;
        if (e2VarArr != null) {
            for (pn4.e2 e2Var : e2VarArr) {
                if (e2Var != null) {
                    c01.d9.e().q(631, e2Var);
                    if (e2Var.f357096f != null) {
                        e2Var.f357099i.d();
                        c01.d9.e().d(e2Var.f357096f);
                    }
                    e2Var.f357096f = null;
                    e2Var.f357095e = false;
                    e2Var.f357094d = null;
                }
            }
        }
        q1Var.f357201e.clear();
        ((java.util.LinkedList) q1Var.f357200d).clear();
        q1Var.f357199c.clear();
        q1Var.f357197a = 0;
    }
}
