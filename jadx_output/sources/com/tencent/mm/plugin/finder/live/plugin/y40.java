package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f115154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var) {
        super(0);
        this.f115154d = z40Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f115154d.f115286i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.kwz);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        return textView;
    }
}
