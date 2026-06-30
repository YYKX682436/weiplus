package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class pd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.pd f174177d = new com.tencent.mm.plugin.textstatus.ui.pd();

    public pd() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        if (activity != null) {
            activity.finish();
        }
        return jz5.f0.f302826a;
    }
}
