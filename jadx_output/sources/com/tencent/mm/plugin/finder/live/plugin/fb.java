package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class fb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(android.view.ViewGroup viewGroup) {
        super(0);
        this.f112533d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f112533d;
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        textView.setTextSize(0, i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479925j4));
        textView.setGravity(17);
        textView.setBackgroundResource(com.tencent.mm.R.drawable.a0j);
        viewGroup.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.eb.f112393d);
        return textView;
    }
}
