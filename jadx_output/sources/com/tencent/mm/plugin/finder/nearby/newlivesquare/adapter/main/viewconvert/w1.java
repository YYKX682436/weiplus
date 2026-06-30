package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class w1 extends in5.r implements bq2.a {

    /* renamed from: e, reason: collision with root package name */
    public final sp2.k f121998e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qt2 f121999f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f122000g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122001h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f122002i;

    public w1(sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        this.f121998e = outsideOperator;
    }

    @Override // bq2.a
    public java.util.ArrayList a(java.util.ArrayList collectScene) {
        kotlin.jvm.internal.o.g(collectScene, "collectScene");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f122000g;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122001h;
        return (wxRecyclerView == null || wxRecyclerAdapter == null) ? new java.util.ArrayList() : sp2.n3.f411116a.c(wxRecyclerView, wxRecyclerAdapter, collectScene);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.el9;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r27, in5.c r28, int r29, int r30, boolean r31, java.util.List r32) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w1.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f121999f = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        this.f122002i = false;
    }
}
