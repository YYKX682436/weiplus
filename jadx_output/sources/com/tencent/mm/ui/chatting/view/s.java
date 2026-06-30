package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f203080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f203081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f203082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f203083g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.l lVar, boolean z17, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.ui.chatting.view.r rVar) {
        super(0);
        this.f203080d = lVar;
        this.f203081e = z17;
        this.f203082f = recyclerView;
        this.f203083g = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f203080d;
        if (lVar != null) {
            lVar.invoke(com.tencent.mm.ui.chatting.view.f.f202928d);
        }
        if (this.f203081e) {
            com.tencent.mm.ui.chatting.view.v.c(this.f203082f, this.f203083g);
        }
        return jz5.f0.f302826a;
    }
}
