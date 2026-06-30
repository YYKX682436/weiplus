package uc5;

/* loaded from: classes10.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final in5.r f426542e;

    public q(in5.r delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f426542e = delegate;
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return this.f426542e.c(recyclerView);
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f426542e.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uc5.l0 item = (uc5.l0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        in5.r rVar = this.f426542e;
        uc5.d dVar = ((uc5.h0) item).f426494d;
        kotlin.jvm.internal.o.e(dVar, "null cannot be cast to non-null type Item of com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryContentRowConvert");
        rVar.h(holder, dVar, i17, i18, z17, list);
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        this.f426542e.j(recyclerView);
    }
}
