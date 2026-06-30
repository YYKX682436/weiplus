package com.tencent.mm.plugin.luckymoney.appbrand.ui;

/* loaded from: classes9.dex */
public abstract class WxaLuckyMoneyBaseUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public mb3.c f145001d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f145002e = 4095;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f145003f = new android.util.SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class[][] f145004g = {new java.lang.Class[]{pb3.b.class, com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI.class}, new java.lang.Class[]{ob3.c.class, com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.class}, new java.lang.Class[]{nb3.b.class, com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI.class}, new java.lang.Class[]{ob3.b.class, com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI.class}};

    public void T6(java.lang.Class cls, android.content.Intent intent, mb3.d dVar) {
        if (getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            runOnUiThread(new mb3.a(this, cls, intent, dVar));
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.Class<?> cls2 = null;
        for (java.lang.Class<?>[] clsArr : this.f145004g) {
            if (clsArr[0] == cls) {
                cls2 = clsArr[1];
            }
        }
        if (cls2 == null) {
            throw new java.lang.IllegalStateException("proceed to ui = [" + cls.getName() + "], but Target is null");
        }
        intent.setClass(getContext(), cls2);
        if (dVar != null) {
            int i17 = this.f145002e;
            this.f145002e = i17 + 1;
            startActivityForResult(intent, i17);
            this.f145003f.put(i17, dVar);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI", "proceed", "(Ljava/lang/Class;Landroid/content/Intent;Lcom/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyUIRouter$OnBackListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI", "proceed", "(Ljava/lang/Class;Landroid/content/Intent;Lcom/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyUIRouter$OnBackListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        mb3.d dVar = (mb3.d) this.f145003f.get(i17);
        if (dVar == null) {
            super.onActivityResult(i17, i18, intent);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.HjLuckyMoneyBaseUI", "damon warns you, requestCode == [%d], I used it, and skip. check your code if needed!!!!", java.lang.Integer.valueOf(i17));
            dVar.a(i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mb3.c cVar = new mb3.c(this);
        this.f145001d = cVar;
        android.content.res.Resources resources = cVar.f147036a.getResources();
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(resources.getColor(com.tencent.mm.R.color.f479342wx));
        int color = resources.getColor(com.tencent.mm.R.color.f479343wy);
        int color2 = resources.getColor(com.tencent.mm.R.color.f479349x3);
        int color3 = resources.getColor(com.tencent.mm.R.color.f479349x3);
        int color4 = resources.getColor(com.tencent.mm.R.color.f479355x9);
        if (cVar.f147036a.getSupportActionBar() != null) {
            cVar.f147036a.getSupportActionBar().w(colorDrawable);
            android.view.View j17 = cVar.f147036a.getSupportActionBar().j();
            if (j17 != null) {
                android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.d0v);
                if (findViewById != null && color != 0) {
                    findViewById.setBackgroundColor(color);
                }
                android.widget.TextView textView = (android.widget.TextView) j17.findViewById(android.R.id.text1);
                if (textView != null && color2 != 0) {
                    textView.setTextColor(color2);
                }
                android.widget.TextView textView2 = (android.widget.TextView) j17.findViewById(android.R.id.text2);
                if (textView2 != null && color3 != 0) {
                    textView2.setTextColor(color3);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) j17.findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
                if (imageView != null) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.alp);
                }
            }
            if (color4 != 0) {
                android.view.Window window = cVar.f147036a.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(color4);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f145001d = null;
        this.f145003f.clear();
        super.onDestroy();
    }
}
