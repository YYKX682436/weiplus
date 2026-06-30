package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes14.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v f175443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.p f175444e;

    public m(com.tencent.mm.plugin.transvoice.ui.v vVar, com.tencent.mm.plugin.transvoice.ui.p pVar) {
        this.f175443d = vVar;
        this.f175444e = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/SelectLanguageUIC$DefaultLanguageItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.transvoice.ui.v vVar = this.f175443d;
        java.util.Iterator it = vVar.f175475f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.transvoice.ui.p) it.next()).f175456e.f175451d = false;
        }
        com.tencent.mm.plugin.transvoice.ui.p pVar = this.f175444e;
        pVar.f175456e.f175451d = true;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = vVar.f175476g;
        if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
        if (baseMvvmActivity != null) {
            android.content.Intent intent = baseMvvmActivity.getIntent();
            intent.putExtra("intent_key_language_code", pVar.f175456e.f175450c);
            intent.putExtra("intent_key_language_name", pVar.f175456e.f175448a);
            baseMvvmActivity.setResult(-1, intent);
            baseMvvmActivity.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/SelectLanguageUIC$DefaultLanguageItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
