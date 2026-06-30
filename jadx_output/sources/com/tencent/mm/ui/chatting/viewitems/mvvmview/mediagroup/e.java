package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e f204782d = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.045f, 0.0f, 0.12f, 0.05f, 0.15f, 0.49f);
        path.cubicTo(0.1925f, 0.85f, 0.235f, 0.92f, 1.0f, 1.0f);
        return new android.view.animation.PathInterpolator(path);
    }
}
