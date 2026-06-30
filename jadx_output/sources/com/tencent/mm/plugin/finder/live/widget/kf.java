package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kf extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.of f118836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(com.tencent.mm.plugin.finder.live.widget.of ofVar) {
        super(2);
        this.f118836d = ofVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.live.widget.of ofVar = this.f118836d;
        ofVar.f119296t = intValue;
        ofVar.f119297u = intValue2;
        android.widget.TextView textView = ofVar.f119295s;
        if (textView != null) {
            textView.setText(ofVar.z(intValue));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("visibilityDescTv");
        throw null;
    }
}
