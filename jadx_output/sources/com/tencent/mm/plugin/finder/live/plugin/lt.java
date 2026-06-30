package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.rt f113436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(com.tencent.mm.plugin.finder.live.plugin.rt rtVar) {
        super(0);
        this.f113436d = rtVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View e17 = this.f113436d.e();
        if (e17 != null) {
            return (android.widget.CheckBox) e17.findViewById(com.tencent.mm.R.id.btf);
        }
        return null;
    }
}
