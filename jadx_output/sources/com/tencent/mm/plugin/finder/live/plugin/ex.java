package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ex extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fx f112472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(com.tencent.mm.plugin.finder.live.plugin.fx fxVar) {
        super(0);
        this.f112472d = fxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f112472d.f112602i.findViewById(com.tencent.mm.R.id.f9_);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        return textView;
    }
}
