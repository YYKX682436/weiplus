package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jb0 implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f113077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f113078b;

    public jb0(kotlinx.coroutines.q qVar, android.graphics.Bitmap bitmap) {
        this.f113077a = qVar;
        this.f113078b = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f113077a.resumeWith(kotlin.Result.m521constructorimpl(this.f113078b));
    }
}
