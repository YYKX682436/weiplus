package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.u1 f115724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f115725e;

    public v1(com.tencent.mm.plugin.finder.live.util.u1 u1Var, android.widget.TextView textView) {
        this.f115724d = u1Var;
        this.f115725e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f115725e;
        textView.getPaint().setShader(this.f115724d.a(textView.getWidth(), textView.getHeight()));
        textView.invalidate();
    }
}
