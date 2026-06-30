package tt2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tt2.e1 e1Var) {
        super(1);
        this.f421989d = e1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h52 it = (r45.h52) obj;
        kotlin.jvm.internal.o.g(it, "it");
        tt2.e1 e1Var = this.f421989d;
        st2.h1 h1Var = e1Var.f421891v;
        if (h1Var != null) {
            st2.h1.P(h1Var, null, 0, true, false, 8, null);
        }
        android.content.Context context = e1Var.f421880h;
        db5.t7.i(context, context.getString(com.tencent.mm.R.string.lqw), com.tencent.mm.R.raw.icons_outlined_done);
        return jz5.f0.f302826a;
    }
}
