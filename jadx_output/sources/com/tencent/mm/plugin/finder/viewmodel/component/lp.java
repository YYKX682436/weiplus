package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class lp implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f135075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135076b;

    public lp(android.widget.ProgressBar progressBar, java.lang.String str) {
        this.f135075a = progressBar;
        this.f135076b = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.kp(this.f135075a, (android.graphics.Bitmap) obj, this.f135076b));
    }
}
