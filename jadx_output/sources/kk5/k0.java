package kk5;

/* loaded from: classes9.dex */
public final class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.o0 f308664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f308665e;

    public k0(kk5.o0 o0Var, java.util.LinkedList linkedList) {
        this.f308664d = o0Var;
        this.f308665e = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kk5.o0 o0Var = this.f308664d;
        o0Var.getClass();
        java.util.LinkedList linkedList = this.f308665e;
        iz5.a.g(null, linkedList.size() > 0);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int size = linkedList.size();
        for (int i18 = 0; i18 < size; i18++) {
            linkedList2.add(3);
        }
        new r35.e4(o0Var.getActivity(), kk5.l0.f308667a).f(linkedList, linkedList2, null);
    }
}
