package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class oo extends com.tencent.mm.ui.widget.dialog.g2 {
    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ajy, (android.view.ViewGroup) null, false);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.enx)).setOnClickListener(new com.tencent.mm.plugin.finder.view.no(this));
        return inflate;
    }
}
