package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f173286e;

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489570d06;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.plugin.textstatus.convert.topic.d item = (com.tencent.mm.plugin.textstatus.convert.topic.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f173265e;
        boolean z18 = false;
        if (kotlin.jvm.internal.o.b(str, "arrow@name")) {
            ((android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.ii7)).setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.hk9);
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.f(this, item));
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.ooa);
        if (textView != null) {
            textView.setText(e17);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.ooa);
        if (textView2 != null) {
            mj4.h hVar = item.f173267g;
            if (hVar != null && !((mj4.k) hVar).z()) {
                z18 = true;
            }
            android.content.Context context = holder.f293121e;
            if (z18) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478719fa));
            } else {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.hke);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        imageView.setTag("status_avatar_" + str);
        ((android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.ii7)).setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.g(holder, item, imageView));
        if (1 == bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusProfileShowDebugInfo())) {
            if ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && (linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.ii7)) != null) {
                linearLayout.setOnLongClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.h(item, holder));
            }
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
