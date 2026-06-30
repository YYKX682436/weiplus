package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes5.dex */
public final class r extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f150961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.mv.ui.shake.t tVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f150961d = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.j7m);
        itemView.setOnClickListener(new com.tencent.mm.plugin.mv.ui.shake.q(tVar, this));
    }
}
