package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class xp extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161768d;

    public xp(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161768d = unfamiliarContactDetailUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f161768d.f160779t.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (k3Var instanceof com.tencent.mm.plugin.setting.ui.setting.bq) {
            com.tencent.mm.plugin.setting.ui.setting.bq bqVar = (com.tencent.mm.plugin.setting.ui.setting.bq) k3Var;
            bqVar.f160888i.setTag(java.lang.Integer.valueOf(i17));
            bqVar.f160890n.setTag(java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161768d;
            com.tencent.mm.plugin.setting.ui.setting.yp ypVar = (com.tencent.mm.plugin.setting.ui.setting.yp) unfamiliarContactDetailUI.f160779t.get(i17);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) bqVar.f160883d.getContentView(), ypVar.f161800c.d1(), null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = unfamiliarContactDetailUI.getContext();
            java.lang.String str = ypVar.f161799b;
            android.widget.TextView textView = bqVar.f160884e;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            bqVar.f160887h.setVisibility(ypVar.f161800c.x2() ? 0 : 8);
            java.lang.String d17 = ypVar.f161800c.d1();
            if (p94.w0.f() != null && unfamiliarContactDetailUI.f160783x.size() == 0) {
                unfamiliarContactDetailUI.f160783x.addAll(((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).L0(5L));
            }
            bqVar.f160886g.setVisibility(unfamiliarContactDetailUI.f160783x.contains(d17) ? 0 : 8);
            boolean containsKey = unfamiliarContactDetailUI.f160778s.containsKey(java.lang.Integer.valueOf(i17));
            android.widget.TextView textView2 = bqVar.f160885f;
            if (containsKey) {
                textView2.setVisibility(0);
                textView2.setText((java.lang.CharSequence) unfamiliarContactDetailUI.f160778s.get(java.lang.Integer.valueOf(i17)));
            } else {
                textView2.setVisibility(8);
            }
            boolean z17 = unfamiliarContactDetailUI.f160785z;
            android.widget.LinearLayout linearLayout = bqVar.f160888i;
            android.widget.LinearLayout linearLayout2 = bqVar.f160891o;
            if (!z17) {
                linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) unfamiliarContactDetailUI.getResources().getDimension(com.tencent.mm.R.dimen.f479876hp), linearLayout2.getPaddingBottom());
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), 0, linearLayout2.getPaddingBottom());
            boolean contains = unfamiliarContactDetailUI.f160780u.contains(java.lang.Integer.valueOf(i17));
            android.widget.CheckBox checkBox = bqVar.f160889m;
            if (contains) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
            }
            linearLayout.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.setting.ui.setting.bq(this.f161768d, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.d2j, viewGroup, false));
    }

    public com.tencent.mm.plugin.setting.ui.setting.yp x(int i17) {
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161768d;
        return unfamiliarContactDetailUI.f160779t.size() > i17 ? (com.tencent.mm.plugin.setting.ui.setting.yp) unfamiliarContactDetailUI.f160779t.get(i17) : new com.tencent.mm.plugin.setting.ui.setting.yp(unfamiliarContactDetailUI, new com.tencent.mm.storage.z3());
    }
}
