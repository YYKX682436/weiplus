package te2;

/* loaded from: classes3.dex */
public final class wa implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418515a;

    public wa(te2.hc hcVar) {
        this.f418515a = hcVar;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.q65 q65Var;
        te2.hc hcVar = this.f418515a;
        r45.h32 h32Var = hcVar.f418068J;
        boolean z18 = false;
        if (h32Var != null && (q65Var = (r45.q65) h32Var.getCustom(10)) != null && q65Var.getBoolean(0)) {
            z18 = true;
        }
        java.lang.String string = z18 ? hcVar.getActivity().getString(com.tencent.mm.R.string.e0k) : hcVar.getActivity().getString(com.tencent.mm.R.string.e0j);
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(hcVar.getActivity(), string);
    }
}
