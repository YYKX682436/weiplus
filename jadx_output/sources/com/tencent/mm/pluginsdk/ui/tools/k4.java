package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f191749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f191750e;

    public k4(com.tencent.mm.pluginsdk.ui.tools.l4 l4Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f191749d = imageView;
        this.f191750e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.tools.p4.a(this.f191749d, this.f191750e);
    }
}
