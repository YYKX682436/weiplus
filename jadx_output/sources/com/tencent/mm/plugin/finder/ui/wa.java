package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class wa extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Editable f129982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(android.text.Editable editable) {
        super(3);
        this.f129982d = editable;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String nickname = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f129982d.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo)), intValue, intValue2, 17);
        return jz5.f0.f302826a;
    }
}
