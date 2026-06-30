package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameLibraryCategoriesView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140893d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f140894e;

    /* renamed from: f, reason: collision with root package name */
    public int f140895f;

    /* renamed from: g, reason: collision with root package name */
    public int f140896g;

    /* renamed from: h, reason: collision with root package name */
    public int f140897h;

    public GameLibraryCategoriesView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140893d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.ui.c4)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.c4 c4Var = (com.tencent.mm.plugin.game.ui.c4) view.getTag();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(c4Var.f141078d);
        android.content.Context context = this.f140893d;
        if (K0) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameCategoryUI.class);
            intent.putExtra("extra_type", 1);
            intent.putExtra("extra_category_id", c4Var.f141075a);
            intent.putExtra("extra_category_name", c4Var.f141077c);
            intent.putExtra("game_report_from_scene", c4Var.f141075a + 100);
            android.content.Context context2 = this.f140893d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        } else {
            r53.f.u(context, c4Var.f141078d);
            i17 = 7;
        }
        com.tencent.mm.game.report.l.c(this.f140893d, 11, c4Var.f141075a + 100, c4Var.f141079e, i17, this.f140895f, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140894e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gms);
        android.content.Context context = this.f140893d;
        int width = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
        int i17 = (width * 100) / 750;
        this.f140896g = i17;
        int i18 = (width - (i17 * 6)) / 14;
        this.f140897h = i18;
        this.f140894e.setPadding(i18, i65.a.b(context, 12), this.f140897h, i65.a.b(context, 12));
    }

    public void setData(java.util.LinkedList<com.tencent.mm.plugin.game.ui.c4> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLibraryCategoriesView", "No categories");
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f140894e.removeAllViews();
        java.util.Iterator<com.tencent.mm.plugin.game.ui.c4> it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.ui.c4 next = it.next();
            android.content.Context context = this.f140893d;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            linearLayout.setOrientation(1);
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.MATRIX;
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            n11.a b17 = n11.a.b();
            java.lang.String str = next.f141076b;
            o11.f fVar = new o11.f();
            fVar.f342079c = true;
            b17.h(str, imageView, fVar.a());
            int i17 = this.f140896g;
            linearLayout.addView(imageView, i17, i17);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(next.f141077c);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
            textView.setSingleLine(true);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView.setGravity(17);
            textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            textView.setPadding(0, i65.a.b(context, 6), 0, 0);
            linearLayout.addView(textView);
            linearLayout.setTag(next);
            linearLayout.setOnClickListener(this);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            int i18 = this.f140897h;
            layoutParams.setMargins(i18, 0, i18, 0);
            this.f140894e.addView(linearLayout, layoutParams);
        }
    }

    public void setSourceScene(int i17) {
        this.f140895f = i17;
    }
}
