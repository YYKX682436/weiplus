package zh1;

/* loaded from: classes8.dex */
public final class e1 extends zh1.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j17, bi1.g openMaterialScene, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.v0 v0Var, zh1.c1 launchAppBrandExecutor) {
        super(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, launchAppBrandExecutor);
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        kotlin.jvm.internal.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
    }

    @Override // zh1.z0
    public void o(zh1.y0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        type.toString();
        java.util.List appBrandOpenMaterialDetailModels = this.f472949g.f86252g;
        kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        if (!appBrandOpenMaterialDetailModels.isEmpty()) {
            android.content.Context context = this.f472947e;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488012ee, (android.view.ViewGroup) null);
            int color = context.getResources().getColor(com.tencent.mm.R.color.a0c);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jrg);
            if (imageView != null) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_mini_program, color));
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jrh);
            if (textView != null) {
                textView.setTextColor(color);
            }
            inflate.setOnClickListener(new zh1.d1(this));
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f472948f;
            k0Var.o(inflate);
            this.f472952m.d();
            if (k0Var.i()) {
                zh1.w.b(k0Var, context);
            }
        }
    }
}
