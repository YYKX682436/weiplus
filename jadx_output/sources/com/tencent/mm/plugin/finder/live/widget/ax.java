package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ax extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f117800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(android.content.Context context) {
        super(0);
        this.f117800d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(this.f117800d);
        return java.lang.Integer.valueOf(java.lang.Math.min(b17.x, b17.y));
    }
}
