package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class zr extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f171707o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f171708p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI f171709q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI, android.content.Context context) {
        super(context, new com.tencent.mm.plugin.sns.storage.q2());
        this.f171709q = snsTagPartlyUI;
        this.f171708p = false;
        this.f171707o = context;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        com.tencent.mm.plugin.sns.storage.q2 q2Var = (com.tencent.mm.plugin.sns.storage.q2) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        if (q2Var == null) {
            q2Var = new com.tencent.mm.plugin.sns.storage.q2();
        }
        q2Var.convertFrom(cursor);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        return q2Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.yr yrVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        if (view == null) {
            yrVar = new com.tencent.mm.plugin.sns.ui.yr(this);
            view2 = android.view.View.inflate(this.f171707o, com.tencent.mm.R.layout.c8w, null);
            yrVar.f171642a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nwz);
            yrVar.f171643b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nbp);
            yrVar.f171644c = (android.widget.Button) view2.findViewById(com.tencent.mm.R.id.crz);
            view2.setTag(yrVar);
        } else {
            view2 = view;
            yrVar = (com.tencent.mm.plugin.sns.ui.yr) view.getTag();
        }
        if (p(i17)) {
            yrVar.f171642a.setText(com.tencent.mm.R.string.f493305jo4);
            yrVar.f171643b.setVisibility(8);
            yrVar.f171644c.setVisibility(8);
        } else {
            com.tencent.mm.plugin.sns.storage.q2 q2Var = (com.tencent.mm.plugin.sns.storage.q2) getItem(i17);
            yrVar.f171642a.setText(q2Var.field_tagName + "");
            yrVar.f171643b.setVisibility(0);
            yrVar.f171643b.setText(" (" + q2Var.field_count + ") ");
            yrVar.f171644c.setVisibility(this.f171708p ? 0 : 8);
            android.widget.Button button = yrVar.f171644c;
            int i18 = com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.f167453h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
            android.view.View.OnClickListener onClickListener = this.f171709q.f167457g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
            button.setOnClickListener(onClickListener);
            yrVar.f171644c.setTag(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public int m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVirtualCount", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVirtualCount", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        return 1;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        c();
        q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        s(com.tencent.mm.plugin.sns.model.l4.Lj().J0());
        notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
    }
}
