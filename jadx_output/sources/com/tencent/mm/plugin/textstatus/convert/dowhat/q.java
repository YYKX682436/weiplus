package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.p f173247e;

    public q(com.tencent.mm.plugin.textstatus.convert.dowhat.u mOnItemClickListener) {
        kotlin.jvm.internal.o.g(mOnItemClickListener, "mOnItemClickListener");
        this.f173247e = new com.tencent.mm.plugin.textstatus.convert.dowhat.p(mOnItemClickListener);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cz6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.e item = (lj4.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqh)).setText(item.f318983d);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.view.WindowManager windowManager = activity.getWindowManager();
        android.content.res.Resources resources = activity.getResources();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.m8m);
        float min = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight()) - resources.getDimension(com.tencent.mm.R.dimen.f480310u7);
        float dimension = resources.getDimension(com.tencent.mm.R.dimen.f480311u8);
        float dimension2 = resources.getDimension(com.tencent.mm.R.dimen.f480309u6);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(activity, (int) ((min + dimension2) / (dimension + dimension2)));
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.convert.dowhat.DoWhatItemGroupConvert$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type == 0 ? new com.tencent.mm.plugin.textstatus.convert.dowhat.o(com.tencent.mm.plugin.textstatus.convert.dowhat.q.this.f173247e) : new com.tencent.mm.plugin.textstatus.convert.dowhat.o(com.tencent.mm.plugin.textstatus.convert.dowhat.q.this.f173247e);
                }
            }, item.f318984e, false));
        }
        ((android.view.ViewGroup) holder.p(com.tencent.mm.R.id.root_view)).setBackground(context.getDrawable(com.tencent.mm.R.drawable.b6i));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
