package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes3.dex */
public final class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f190949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f190949d = jz5.h.b(new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.b(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.util.ArrayList arrayList = null;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
        if (baseMvvmActivity != null) {
            baseMvvmActivity.setMMTitle("");
            baseMvvmActivity.hideActionbarLine();
            baseMvvmActivity.hideActionBarOperationArea();
            androidx.appcompat.app.b supportActionBar = baseMvvmActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
            ul5.k bounceView = baseMvvmActivity.getBounceView();
            if (bounceView != null) {
                bounceView.setBounceEnabled(false);
            }
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ekx, (android.view.ViewGroup) null);
        em.p2 p2Var = (em.p2) ((jz5.n) this.f190949d).getValue();
        if (p2Var.f254703b == null) {
            p2Var.f254703b = (android.widget.FrameLayout) p2Var.f254702a.findViewById(com.tencent.mm.R.id.gyb);
        }
        p2Var.f254703b.addView(inflate);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_SIMPLE_MSG_ITEM");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get msgInfoStrs count: ");
        sb6.append(stringArrayListExtra != null ? java.lang.Integer.valueOf(stringArrayListExtra.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiShareHeaderUIC", sb6.toString());
        if (stringArrayListExtra != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
            for (java.lang.String str : stringArrayListExtra) {
                u15.a aVar = new u15.a();
                kotlin.jvm.internal.o.d(str);
                aVar.fromXml(str);
                arrayList.add(aVar);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            android.app.Activity context = getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : 1);
            textView.setText(context.getString(com.tencent.mm.R.string.ols, objArr));
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cwk);
        if (textView2 != null) {
            textView2.setOnClickListener(new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.a(arrayList, this));
        }
    }
}
