package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class b6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zq1.i0 f185972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(zq1.i0 i0Var) {
        super(1);
        this.f185972d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            if (((java.lang.CharSequence) obj).length() > 0) {
                this.f185972d.f474993k.add(obj);
            }
        }
        return jz5.f0.f302826a;
    }
}
