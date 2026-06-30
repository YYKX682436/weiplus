package s33;

/* loaded from: classes9.dex */
public class b0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s33.d0 f402477d;

    public b0(s33.d0 d0Var) {
        this.f402477d = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ye I;
        int type = m1Var.getType();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((type == 697) && (m1Var instanceof z12.b)) {
            z12.b bVar = (z12.b) m1Var;
            if (i17 == 0 && i18 == 0 && (I = ((z12.h) bVar).I()) != null) {
                java.util.LinkedList linkedList = I.f391008g;
                if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    return;
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = ((r45.ri0) it.next()).f384886d;
                    s33.d0 d0Var = this.f402477d;
                    d0Var.getClass();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        java.util.List list = (java.util.List) ((java.util.HashMap) d0Var.f402484a).get(str2);
                        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                            continue;
                        } else {
                            java.util.Iterator it6 = list.iterator();
                            if (it6.hasNext()) {
                                android.support.v4.media.f.a(it6.next());
                                throw null;
                            }
                        }
                    }
                }
            }
        }
    }
}
