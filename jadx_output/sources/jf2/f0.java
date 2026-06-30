package jf2;

/* loaded from: classes3.dex */
public final class f0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f299370d;

    public f0(jf2.k0 k0Var) {
        this.f299370d = k0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.LinkedList list;
        r45.a84 a84Var = (r45.a84) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("coAuthorInfo updated: contactCount=");
        sb6.append((a84Var == null || (list = a84Var.getList(1)) == null) ? null : new java.lang.Integer(list.size()));
        sb6.append(", refresh fold state");
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", sb6.toString());
        this.f299370d.a7("coAuthorInfoChange", true);
        return jz5.f0.f302826a;
    }
}
