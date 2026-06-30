package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f147771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f147772e;

    public z9(com.tencent.mm.plugin.luckymoney.ui.fa faVar, android.widget.LinearLayout linearLayout) {
        this.f147771d = faVar;
        this.f147772e = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.fa faVar = this.f147771d;
        int h17 = com.tencent.mm.ui.bl.h(faVar.getActivity());
        int a17 = com.tencent.mm.ui.bl.a(faVar.getActivity());
        android.widget.LinearLayout linearLayout = this.f147772e;
        int height = h17 + ((a17 - linearLayout.getHeight()) / 2);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = height;
        }
        linearLayout.setLayoutParams(marginLayoutParams);
        if (linearLayout.getHeight() != 0) {
            float height2 = linearLayout.getHeight() / 2;
            if (linearLayout != null) {
                linearLayout.setOutlineProvider(new zl5.a(true, true, height2));
            }
            if (linearLayout == null) {
                return;
            }
            linearLayout.setClipToOutline(true);
            return;
        }
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14);
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setClipToOutline(true);
    }
}
