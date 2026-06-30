package com.tencent.mm.wedrop.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/wedrop/ui/view/PermissionLineView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Liq5/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-wedrop_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PermissionLineView extends com.tencent.mm.mvvm.MvvmView<iq5.d> {

    /* renamed from: f, reason: collision with root package name */
    public em.g4 f214292f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f214293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionLineView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eqr, (android.view.ViewGroup) null);
        this.f214292f = new em.g4(inflate);
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        iq5.d dVar = (iq5.d) pVar2;
        if (dVar != null) {
            em.g4 g4Var = this.f214292f;
            if (g4Var == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (g4Var.f254356b == null) {
                g4Var.f254356b = (android.widget.TextView) g4Var.f254355a.findViewById(com.tencent.mm.R.id.u_i);
            }
            g4Var.f254356b.setText(java.lang.String.valueOf(dVar.f293806d));
            em.g4 g4Var2 = this.f214292f;
            if (g4Var2 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (g4Var2.f254359e == null) {
                g4Var2.f254359e = (android.widget.TextView) g4Var2.f254355a.findViewById(com.tencent.mm.R.id.u_k);
            }
            g4Var2.f254359e.setText(dVar.f293807e);
            em.g4 g4Var3 = this.f214292f;
            if (g4Var3 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var3.a().setText(dVar.f293808f);
            g();
        }
    }

    public final boolean g() {
        yz5.a aVar;
        iq5.d viewModel = getViewModel();
        boolean booleanValue = (viewModel == null || (aVar = viewModel.f293809g) == null) ? false : ((java.lang.Boolean) aVar.invoke()).booleanValue();
        this.f214293g = booleanValue;
        if (booleanValue) {
            em.g4 g4Var = this.f214292f;
            if (g4Var == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var.a().setVisibility(8);
            em.g4 g4Var2 = this.f214292f;
            if (g4Var2 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var2.b().setText(getContext().getString(com.tencent.mm.R.string.nto));
            em.g4 g4Var3 = this.f214292f;
            if (g4Var3 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var3.b().setTextColor(getContext().getColor(com.tencent.mm.R.color.Brand_100));
            em.g4 g4Var4 = this.f214292f;
            if (g4Var4 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var4.f254355a.setOnClickListener(iq5.b.f293804d);
        } else {
            em.g4 g4Var5 = this.f214292f;
            if (g4Var5 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var5.a().setVisibility(0);
            em.g4 g4Var6 = this.f214292f;
            if (g4Var6 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var6.b().setText(getContext().getString(com.tencent.mm.R.string.ntp));
            em.g4 g4Var7 = this.f214292f;
            if (g4Var7 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var7.b().setTextColor(getContext().getColor(com.tencent.mm.R.color.Orange_100));
            em.g4 g4Var8 = this.f214292f;
            if (g4Var8 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            g4Var8.f254355a.setOnClickListener(new iq5.c(this));
        }
        return this.f214293g;
    }
}
