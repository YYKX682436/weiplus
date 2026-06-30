package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class qn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f199794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(0);
        this.f199794d = hoVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.ui.chatting.component.ho hoVar = this.f199794d;
        hoVar.getClass();
        android.app.Activity g17 = hoVar.f198580d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = new com.tencent.mm.view.recyclerview.WxRecyclerView(g17);
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(hoVar.f198580d.g()));
        wxRecyclerView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        wxRecyclerView.setOverScrollMode(2);
        wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.ui.chatting.component.TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.ui.chatting.component.tn(com.tencent.mm.ui.chatting.component.ho.this);
            }
        }, (java.util.ArrayList) ((jz5.n) hoVar.f199187q).getValue(), false));
        return wxRecyclerView;
    }
}
