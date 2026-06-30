package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voiceprint.ui.x f176282d = new com.tencent.mm.plugin.voiceprint.ui.x();

    public x() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.res.Resources resources = it.getResources();
        java.lang.String string = resources != null ? resources.getString(com.tencent.mm.R.string.j0x) : null;
        return string == null ? "" : string;
    }
}
