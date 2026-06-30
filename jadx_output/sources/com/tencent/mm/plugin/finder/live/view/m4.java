package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.n4 f116472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.finder.live.view.n4 n4Var) {
        super(1);
        this.f116472d = n4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.view.n4 n4Var = this.f116472d;
        n4Var.f116511x = intValue;
        android.widget.TextView textView = n4Var.f116504q;
        if (textView == null) {
            kotlin.jvm.internal.o.o("selectedLevelDesc");
            throw null;
        }
        textView.setText(intValue + "级及以上");
        return jz5.f0.f302826a;
    }
}
