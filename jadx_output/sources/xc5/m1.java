package xc5;

/* loaded from: classes12.dex */
public final class m1 extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // mf3.m
    public mf3.n O0(android.content.Context context, mf3.p apiCenter, mf3.u type) {
        mf3.x xVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            rf3.u uVar = new rf3.u(apiCenter);
            arrayList.add(uVar);
            apiCenter.d(rf3.q.class, uVar);
            xc5.h0 h0Var = new xc5.h0(apiCenter);
            arrayList.add(h0Var);
            apiCenter.d(rf3.h.class, h0Var);
            eg3.g gVar = new eg3.g(apiCenter);
            arrayList.add(gVar);
            apiCenter.d(eg3.b.class, gVar);
            xVar = new mf3.x(apiCenter, arrayList);
        } else {
            if (ordinal == 2) {
                xc5.v2 v2Var = new xc5.v2(apiCenter);
                apiCenter.d(xc5.u2.class, v2Var);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(v2Var);
                apiCenter.d(fg3.p.class, v2Var);
                fg3.o oVar = new fg3.o(apiCenter);
                arrayList2.add(oVar);
                apiCenter.d(fg3.h.class, oVar);
                xc5.s2 s2Var = new xc5.s2(apiCenter);
                arrayList2.add(s2Var);
                apiCenter.d(fg3.a.class, s2Var);
                return new mf3.x(apiCenter, arrayList2);
            }
            if (ordinal != 3) {
                return new mf3.h(apiCenter);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            uf3.g gVar2 = new uf3.g(apiCenter);
            arrayList3.add(gVar2);
            apiCenter.d(uf3.c.class, gVar2);
            xc5.y0 y0Var = new xc5.y0(apiCenter);
            arrayList3.add(y0Var);
            apiCenter.d(uf3.a.class, y0Var);
            wh5.k0 k0Var = new wh5.k0(apiCenter);
            arrayList3.add(k0Var);
            apiCenter.d(vh5.p.class, k0Var);
            xVar = new mf3.x(apiCenter, arrayList3);
        }
        return xVar;
    }
}
