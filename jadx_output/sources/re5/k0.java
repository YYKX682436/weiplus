package re5;

/* loaded from: classes12.dex */
public final class k0 extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // mf3.m
    public mf3.n O0(android.content.Context context, mf3.p apiCenter, mf3.u type) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        kotlin.jvm.internal.o.g(type, "type");
        if (re5.j0.f394580a[type.ordinal()] != 1) {
            return new mf3.h(apiCenter);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        re5.h0 h0Var = new re5.h0(apiCenter);
        arrayList.add(h0Var);
        apiCenter.d(fg3.p.class, h0Var);
        re5.d0 d0Var = new re5.d0(apiCenter);
        arrayList.add(d0Var);
        apiCenter.d(fg3.h.class, d0Var);
        return new mf3.x(apiCenter, arrayList);
    }
}
