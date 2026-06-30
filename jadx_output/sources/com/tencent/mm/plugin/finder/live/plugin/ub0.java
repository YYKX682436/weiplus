package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ub0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f114547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f114548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, boolean z17) {
        super(0);
        this.f114547d = dc0Var;
        this.f114548e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f114547d;
        android.view.ViewGroup viewGroup = dc0Var.f112259i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r3d);
        android.view.ViewGroup viewGroup2 = dc0Var.f112259i;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.r3e);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.content.Context context = dc0Var.f112254d;
        android.widget.ImageView imageView = dc0Var.f112265r;
        if (this.f114548e) {
            if (imageView == null) {
                kotlin.jvm.internal.o.o("btnIconView");
                throw null;
            }
            imageView.setVisibility(0);
            textView.setText(context.getString(com.tencent.mm.R.string.m5o));
            java.lang.String str = dc0Var.f112263p;
            if (str == null) {
                str = dc0Var.f112262o;
            }
            textView2.setText(str);
        } else {
            if (imageView == null) {
                kotlin.jvm.internal.o.o("btnIconView");
                throw null;
            }
            imageView.setVisibility(8);
            textView.setText(context.getString(com.tencent.mm.R.string.m5n));
            textView2.setText(dc0Var.f112262o);
        }
        return jz5.f0.f302826a;
    }
}
