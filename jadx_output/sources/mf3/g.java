package mf3;

/* loaded from: classes12.dex */
public final class g extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
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
            rf3.p pVar = new rf3.p(apiCenter);
            arrayList.add(pVar);
            apiCenter.d(rf3.h.class, pVar);
            eg3.g gVar = new eg3.g(apiCenter);
            arrayList.add(gVar);
            apiCenter.d(eg3.b.class, gVar);
            xVar = new mf3.x(apiCenter, arrayList);
        } else {
            if (ordinal != 2) {
                return new mf3.h(apiCenter);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            fg3.v vVar = new fg3.v(apiCenter);
            arrayList2.add(vVar);
            apiCenter.d(fg3.p.class, vVar);
            fg3.o oVar = new fg3.o(apiCenter);
            arrayList2.add(oVar);
            apiCenter.d(fg3.h.class, oVar);
            fg3.g gVar2 = new fg3.g(apiCenter);
            arrayList2.add(gVar2);
            apiCenter.d(fg3.a.class, gVar2);
            xVar = new mf3.x(apiCenter, arrayList2);
        }
        return xVar;
    }
}
