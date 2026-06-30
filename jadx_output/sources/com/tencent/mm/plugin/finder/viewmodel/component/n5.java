package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.n5 f135259d = new com.tencent.mm.plugin.finder.viewmodel.component.n5();

    public n5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127691f5).getValue()).r()).intValue();
        if (intValue <= 0) {
            intValue = 2;
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
