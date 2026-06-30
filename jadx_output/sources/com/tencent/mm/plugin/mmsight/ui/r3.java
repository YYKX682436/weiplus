package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class r3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightSettingsUI f149414d;

    public r3(com.tencent.mm.plugin.mmsight.ui.SightSettingsUI sightSettingsUI) {
        this.f149414d = sightSettingsUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f149414d.h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f149414d.h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        android.widget.TextView textView = new android.widget.TextView(this.f149414d);
        com.tencent.mm.plugin.mmsight.ui.t3 t3Var = (com.tencent.mm.plugin.mmsight.ui.t3) getItem(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(t3Var.f149424a);
        sb6.append("->:");
        int intValue = ((java.lang.Integer) t3Var.f149428e.f.get(t3Var.f149427d, 0)).intValue();
        int i18 = 0;
        while (true) {
            int[] iArr = t3Var.f149426c;
            int length = iArr.length;
            java.lang.String[] strArr = t3Var.f149425b;
            if (i18 >= length) {
                str = strArr[0];
                break;
            }
            if (intValue == iArr[i18] && i18 < strArr.length) {
                str = strArr[i18];
                break;
            }
            i18++;
        }
        sb6.append(str);
        textView.setText(sb6.toString());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setHeight(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50));
        if (i17 % 2 == 1) {
            textView.setBackgroundColor(android.graphics.Color.parseColor("#e2efda"));
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.q3(this, t3Var));
        return textView;
    }
}
