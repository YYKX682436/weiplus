package eg4;

/* loaded from: classes4.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f252678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252677d = addFriendVerifyRecordUI;
        this.f252678e = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg4.b1(this.f252677d, this.f252678e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        eg4.b1 b1Var = (eg4.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI = this.f252677d;
        java.util.ArrayList arrayList = this.f252678e;
        int i17 = com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI.f172162p;
        addFriendVerifyRecordUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "updateUI: total items = " + arrayList.size() + ", hasFetchedAll = " + addFriendVerifyRecordUI.f172166g);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) addFriendVerifyRecordUI.f172163d).getValue();
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView2 != null ? wxRecyclerView2.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.E0(arrayList);
            wxRecyclerAdapter.notifyDataSetChanged();
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "updateUI: notifyDataSetChanged called, final item count = " + arrayList.size());
        }
        if (!addFriendVerifyRecordUI.f172166g && !addFriendVerifyRecordUI.f172167h && (wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) addFriendVerifyRecordUI.f172163d).getValue()) != null) {
            wxRecyclerView.post(new eg4.d1(addFriendVerifyRecordUI));
        }
        return jz5.f0.f302826a;
    }
}
