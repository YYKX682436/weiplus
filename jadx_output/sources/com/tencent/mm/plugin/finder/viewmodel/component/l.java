package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f134999d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f135000e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f135001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.viewmodel.component.s sVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) itemView;
        roundCornerRelativeLayout.setRadius(roundCornerRelativeLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
        this.f134999d = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.f487295o70);
        this.f135000e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.i1g);
        this.f135001f = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.hi9);
    }
}
