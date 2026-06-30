package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f202932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f202933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f202934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(yz5.l lVar, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.ui.chatting.view.e2 e2Var) {
        super(0);
        this.f202932d = lVar;
        this.f202933e = recyclerView;
        this.f202934f = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f202932d;
        if (lVar != null) {
            lVar.invoke(com.tencent.mm.ui.chatting.view.a.f202871f);
        }
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f202934f;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f202933e;
        recyclerView.post(new com.tencent.mm.ui.chatting.view.g2(recyclerView, e2Var));
        return jz5.f0.f302826a;
    }
}
