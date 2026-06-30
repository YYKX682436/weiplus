package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.t7 f209881a = new com.tencent.mm.ui.t7();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f209882b = jz5.h.b(com.tencent.mm.ui.q7.f209545d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f209883c = jz5.h.b(com.tencent.mm.ui.p7.f209495d);

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f209882b).getValue()).booleanValue() || ((java.lang.Boolean) ((jz5.n) f209883c).getValue()).booleanValue();
    }

    public final android.view.View b(android.content.Context context, com.tencent.mm.ui.MainTabUI mainTabUI) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.doj, (android.view.ViewGroup) null);
        inflate.setOnClickListener(new com.tencent.mm.ui.r7(context, mainTabUI));
        inflate.setOnLongClickListener(new com.tencent.mm.ui.s7(context));
        return inflate;
    }
}
