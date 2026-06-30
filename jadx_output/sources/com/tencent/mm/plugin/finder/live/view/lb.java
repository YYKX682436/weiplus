package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.nb f116465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(com.tencent.mm.plugin.finder.live.view.nb nbVar) {
        super(1);
        this.f116465d = nbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        if (textView != null) {
            textView.setTextColor(this.f116465d.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            com.tencent.mm.ui.bk.q0(textView.getPaint());
        }
        return jz5.f0.f302826a;
    }
}
