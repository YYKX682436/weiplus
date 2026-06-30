package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class e0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f173273e = kotlinx.coroutines.z0.b();

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f173274f;

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dhc;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        nj4.h item = (nj4.h) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onBindViewHolder " + i17);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.qdp);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        java.util.ArrayList arrayList = item.f337937d;
        if (adapter != null && (adapter instanceof tj4.e)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder ");
            tj4.e eVar = (tj4.e) adapter;
            sb6.append(eVar.f419828e);
            sb6.append(' ');
            sb6.append(eVar.f419830g);
            sb6.append(' ');
            sb6.append(eVar.f419829f);
            sb6.append(' ');
            sb6.append(arrayList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", sb6.toString());
            eVar.f419827d = arrayList;
            if (eVar.f419828e) {
                if (eVar.f419829f) {
                    eVar.notifyItemRemoved(arrayList.size());
                    eVar.f419829f = false;
                }
                eVar.notifyItemInserted(1);
                eVar.f419828e = false;
                return;
            }
            if (eVar.f419830g) {
                eVar.notifyItemRemoved(1);
                eVar.notifyItemInserted(1);
                eVar.f419830g = false;
                return;
            }
        }
        android.content.Context context = holder.f293121e;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.Q(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onBindViewHolder >> all to notify");
        tj4.e eVar2 = new tj4.e(arrayList);
        eVar2.f419831h = new com.tencent.mm.plugin.textstatus.convert.topic.d0(this, holder, eVar2);
        recyclerView.setAdapter(eVar2);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.textstatus.ui.ac) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class)).f173731i = eVar2;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onCreateViewHolder");
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onDetachedFromRecyclerView");
        kotlinx.coroutines.r2 r2Var = this.f173274f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
