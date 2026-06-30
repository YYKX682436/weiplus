package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f131696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f131697e;

    public b6(kotlinx.coroutines.q qVar, android.widget.TextView textView) {
        this.f131696d = qVar;
        this.f131697e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f131696d.resumeWith(kotlin.Result.m521constructorimpl(this.f131697e));
    }
}
