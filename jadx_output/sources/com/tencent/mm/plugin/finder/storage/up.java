package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class up extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.up f128149d = new com.tencent.mm.plugin.finder.storage.up();

    public up() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (lu2.m.f321380b) {
            lu2.m.f321380b = false;
            android.view.View view = lu2.m.f321382d;
            if (view != null) {
                android.view.WindowManager windowManager = lu2.m.f321381c;
                if (windowManager != null) {
                    windowManager.removeView(view);
                }
                lu2.m.f321382d = null;
            }
        } else {
            lu2.m.f321380b = true;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.Object systemService = context.getSystemService("window");
            lu2.m.f321381c = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setPadding(10, 10, 10, 10);
            textView.setBackgroundColor(android.graphics.Color.parseColor("#26000000"));
            textView.setText("红点mock");
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478549aj));
            textView.setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479853h2));
            textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            textView.setOnClickListener(new lu2.k(context));
            lu2.m.f321382d = textView;
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 53;
            layoutParams.flags = 8;
            layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
            android.view.WindowManager windowManager2 = lu2.m.f321381c;
            if (windowManager2 != null) {
                windowManager2.addView(lu2.m.f321382d, layoutParams);
            }
        }
        return jz5.f0.f302826a;
    }
}
