package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class na0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(android.view.ViewGroup viewGroup) {
        super(0);
        this.f113605d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f113605d.findViewById(com.tencent.mm.R.id.fmi);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        return textView;
    }
}
