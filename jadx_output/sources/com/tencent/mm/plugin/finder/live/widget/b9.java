package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f117852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f117853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f117854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(android.widget.TextView textView, android.view.View view, int i17) {
        super(1);
        this.f117852d = textView;
        this.f117853e = view;
        this.f117854f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View view = this.f117853e;
        int color = view.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9);
        android.widget.TextView textView = this.f117852d;
        textView.setTextColor(color);
        if (this.f117854f == 2) {
            ne2.c cVar = ne2.c.f336527a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView.setText(cVar.a(context, intValue, 2));
        } else {
            ne2.c cVar2 = ne2.c.f336527a;
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            textView.setText(cVar2.a(context2, intValue, 1));
        }
        return jz5.f0.f302826a;
    }
}
