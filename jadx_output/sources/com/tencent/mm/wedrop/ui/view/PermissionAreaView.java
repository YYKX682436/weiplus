package com.tencent.mm.wedrop.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/wedrop/ui/view/PermissionAreaView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Liq5/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-wedrop_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PermissionAreaView extends com.tencent.mm.mvvm.MvvmView<iq5.a> {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f214291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionAreaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f214291f = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        g(linearLayout, getViewModel());
        return linearLayout;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        iq5.a aVar = (iq5.a) pVar;
        iq5.a aVar2 = (iq5.a) pVar2;
        if (aVar2 == null || kotlin.jvm.internal.o.b(aVar, aVar2)) {
            return;
        }
        android.view.View contentView = getContentView();
        android.widget.LinearLayout linearLayout = contentView instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) contentView : null;
        if (linearLayout != null) {
            ((java.util.ArrayList) this.f214291f).clear();
            linearLayout.removeAllViews();
            g(linearLayout, aVar2);
        }
    }

    public final void g(android.widget.LinearLayout parent, iq5.a aVar) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (aVar != null) {
            java.util.List<iq5.d> list = aVar.f293803e;
            boolean z17 = true;
            if (!list.isEmpty()) {
                java.lang.String str = aVar.f293802d;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                }
                if (!z17) {
                    android.widget.TextView textView = new android.widget.TextView(getContext());
                    textView.setText(str);
                    textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.ahg));
                    textView.setTextSize(14.0f);
                    textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    textView.setPadding(0, 0, 0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl));
                    parent.addView(textView);
                }
                h(parent);
                for (iq5.d dVar : list) {
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.wedrop.ui.view.PermissionLineView permissionLineView = new com.tencent.mm.wedrop.ui.view.PermissionLineView(context, null);
                    permissionLineView.setViewModel(dVar);
                    permissionLineView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                    parent.addView(permissionLineView);
                    ((java.util.ArrayList) this.f214291f).add(permissionLineView);
                    h(parent);
                }
            }
        }
    }

    public final void h(android.widget.LinearLayout parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 1));
        view.setBackgroundColor(getContext().getColor(com.tencent.mm.R.color.f479313vt));
        parent.addView(view);
    }
}
