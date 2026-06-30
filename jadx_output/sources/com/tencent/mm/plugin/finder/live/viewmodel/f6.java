package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117090d;

    public f6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f117090d = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f117090d.f116940h;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
