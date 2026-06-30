package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class m7 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f204564b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f204565c;

    public m7(android.view.View view, java.lang.Boolean bool) {
        super.create(view);
        this.f204564b = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.f5h);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f5g);
        this.f204565c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f5e);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_finder_icon, i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478526a7)));
        bool.booleanValue();
    }
}
