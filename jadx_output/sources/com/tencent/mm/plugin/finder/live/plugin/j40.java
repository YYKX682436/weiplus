package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f113057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var) {
        super(0);
        this.f113057d = z40Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f113057d.f115286i;
        if (viewGroup != null) {
            return (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.kwx);
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
