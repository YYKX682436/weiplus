package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class e4 extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.d4 f151819b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f151820c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f151821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(android.content.Context context, com.tencent.mm.plugin.mv.ui.view.d4 d4Var) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f151819b = d4Var;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c5b, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.oqc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.ovk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f151820c = findViewById2;
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.jge);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f151821d = findViewById3;
        getContentView().setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.c4(this));
    }

    public final void a() {
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
