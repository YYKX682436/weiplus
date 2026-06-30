package kk5;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f308675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f308676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kk5.q qVar, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308675d = qVar;
        this.f308676e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.p(this.f308675d, this.f308676e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.p pVar = (kk5.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kk5.q qVar = this.f308675d;
        boolean booleanExtra = qVar.getActivity().getIntent().getBooleanExtra("KShowSelectExistChatroom", false);
        wi5.o0 o0Var = wi5.p0.f446333a;
        wi5.n0 n0Var = this.f308676e;
        java.util.List b17 = o0Var.b(n0Var.f446319o, n0Var.f446318n, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Header CREATE_CHATROOM_EXISTING_CHATROOM, ");
        sb6.append(booleanExtra);
        sb6.append(", selected=");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.isEmpty());
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", sb6.toString());
        if (booleanExtra && arrayList.isEmpty() && g95.e.f269801a.a()) {
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = qVar.O6();
            if (O6 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new kk5.o(qVar, null), 2, null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "add Header CREATE_CHATROOM_EXISTING_CHATROOM, selected=" + arrayList.isEmpty());
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = qVar.U6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.s(ri5.j.I.a("fake_user_create_chatroom_select_chatroom", ri5.j.K, 0));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "remove Header CREATE_CHATROOM_EXISTING_CHATROOM");
        }
        return jz5.f0.f302826a;
    }
}
