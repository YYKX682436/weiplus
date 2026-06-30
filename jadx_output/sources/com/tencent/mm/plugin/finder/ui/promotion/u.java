package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class u extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f129704b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f129705c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f129706d;

    public u(android.content.Context context, android.view.View.OnClickListener backClickListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(backClickListener, "backClickListener");
        this.f129704b = context;
        this.f129705c = backClickListener;
    }

    @Override // hx2.i
    public android.view.View a() {
        if (this.f129706d == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(this.f129704b).inflate(com.tencent.mm.R.layout.dq7, (android.view.ViewGroup) null);
            this.f129706d = inflate;
            android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.bzb) : null;
            if (findViewById != null) {
                findViewById.setOnClickListener(this.f129705c);
            }
        }
        return this.f129706d;
    }
}
