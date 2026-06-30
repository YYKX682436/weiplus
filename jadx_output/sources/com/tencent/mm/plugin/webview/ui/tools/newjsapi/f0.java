package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.util.ArrayList arrayList) {
        super(1);
        this.f186075d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object item) {
        int intValue;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = item instanceof java.lang.String;
        if (z17) {
            intValue = com.tencent.mm.sdk.platformtools.t8.D1(z17 ? (java.lang.String) item : null, 0);
        } else {
            intValue = item instanceof java.lang.Integer ? ((java.lang.Number) item).intValue() : -1;
        }
        if (intValue != -1) {
            this.f186075d.add(java.lang.Integer.valueOf(intValue));
        }
        return jz5.f0.f302826a;
    }
}
