package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class oa0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(android.view.ViewGroup viewGroup) {
        super(0);
        this.f113730d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f113730d.findViewById(com.tencent.mm.R.id.fmj);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        return textView;
    }
}
