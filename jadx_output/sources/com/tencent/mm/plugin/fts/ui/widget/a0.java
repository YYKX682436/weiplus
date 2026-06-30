package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f138242a;

    /* renamed from: b, reason: collision with root package name */
    public final z13.f f138243b;

    public a0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f138242a = context;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f138243b = (z13.f) a17;
    }
}
