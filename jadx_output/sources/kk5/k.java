package kk5;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f308663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kk5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308663d = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.k(this.f308663d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.k kVar = (kk5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3("fake_user_create_chatroom_choose_open_im");
        ti5.c cVar = ti5.d.f419663i;
        kk5.q qVar = this.f308663d;
        androidx.appcompat.app.AppCompatActivity activity = qVar.getActivity();
        ri5.h hVar = ri5.j.I;
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        int i17 = ri5.j.N;
        arrayList.add(cVar.b(activity, hVar.a(d17, i17, 3), z3Var, i17, new ti5.d(null, null, 0, 0, 4, 0, null, false, 239, null)));
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = qVar.U6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.n(arrayList, true);
        }
        return jz5.f0.f302826a;
    }
}
