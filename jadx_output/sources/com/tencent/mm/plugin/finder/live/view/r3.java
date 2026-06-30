package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes4.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.r3 f116627d = new com.tencent.mm.plugin.finder.live.view.r3();

    public r3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        return paint;
    }
}
