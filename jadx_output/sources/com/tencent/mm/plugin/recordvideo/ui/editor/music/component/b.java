package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public abstract class b extends fv3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f156167f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f156168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status) {
        super(status, null, 2, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f156167f = parent;
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f156168g = context;
    }

    public final android.view.View n(int i17) {
        return this.f156167f.findViewById(i17);
    }
}
