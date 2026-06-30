package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f134781d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f134782e;

    /* renamed from: f, reason: collision with root package name */
    public final int f134783f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134784g;

    /* renamed from: h, reason: collision with root package name */
    public int f134785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.s f134786i;

    public j(com.tencent.mm.plugin.finder.viewmodel.component.s sVar, android.content.Context context, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f134786i = sVar;
        this.f134781d = context;
        this.f134782e = new java.util.ArrayList();
        int i27 = (((com.tencent.mm.ui.bh.a(context).f197135a - (i18 * 2)) - (i17 * 2)) - (i19 * 2)) / 3;
        this.f134783f = i27;
        this.f134784g = (i27 * 4) / 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f134782e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.lang.String sb6;
        com.tencent.mm.plugin.finder.viewmodel.component.l holder = (com.tencent.mm.plugin.finder.viewmodel.component.l) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((java.util.ArrayList) this.f134782e).get(i17);
        android.widget.TextView textView = holder.f135000e;
        if (textView != null) {
            textView.setText(com.tencent.mm.plugin.finder.assist.w2.g(2, finderObject.getLikeCount()));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f135001f;
        if (weImageView != null) {
            android.content.Context context = this.f134781d;
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_little_like, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc != null && (media = objectDesc.getMedia()) != null && media.size() > 0) {
            java.lang.String coverUrl = media.get(0).getCoverUrl();
            if (coverUrl == null || coverUrl.length() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(media.get(0).getThumbUrl());
                java.lang.String thumb_url_token = media.get(0).getThumb_url_token();
                sb7.append(thumb_url_token != null ? thumb_url_token : "");
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(media.get(0).getCoverUrl());
                java.lang.String cover_url_token = media.get(0).getCover_url_token();
                sb8.append(cover_url_token != null ? cover_url_token : "");
                sb6 = sb8.toString();
            }
            android.widget.ImageView imageView = holder.f134999d;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(sb6, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329966t));
                b17.f447874e = null;
                b17.c(imageView);
            }
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.i(finderObject, this, holder, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ade, parent, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.RelativeLayout) inflate).getLayoutParams();
        layoutParams.width = this.f134783f;
        int i18 = this.f134784g;
        layoutParams.height = i18;
        com.tencent.mm.plugin.finder.viewmodel.component.l lVar = new com.tencent.mm.plugin.finder.viewmodel.component.l(this.f134786i, inflate);
        android.widget.ImageView imageView = lVar.f134999d;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        return lVar;
    }
}
