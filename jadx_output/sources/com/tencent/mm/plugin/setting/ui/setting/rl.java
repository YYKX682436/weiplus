package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class rl extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f161514d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161515e;

    /* renamed from: f, reason: collision with root package name */
    public final int f161516f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161518h;

    public rl(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161518h = settingsSearchAuthUI;
        this.f161515e = 0;
        this.f161516f = 0;
        this.f161517g = 0;
        int B = i65.a.B(settingsSearchAuthUI.getContext());
        android.content.res.Resources resources = settingsSearchAuthUI.getContext().getResources();
        int dimensionPixelSize = (B - (resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) * 2)) - resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        this.f161515e = dimensionPixelSize;
        int i17 = dimensionPixelSize / 2;
        this.f161516f = i17;
        int i18 = dimensionPixelSize / 2;
        this.f161517g = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(dimensionPixelSize));
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.ov6 getItem(int i17) {
        if (i17 < 0 || i17 >= getCount()) {
            return null;
        }
        return (r45.ov6) this.f161514d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f161514d;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f161514d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.setting.ui.setting.ql qlVar;
        if (view == null) {
            view = this.f161518h.getLayoutInflater().inflate(com.tencent.mm.R.layout.bpc, (android.view.ViewGroup) null);
            qlVar = new com.tencent.mm.plugin.setting.ui.setting.ql(this, null);
            view.setTag(qlVar);
        } else {
            qlVar = (com.tencent.mm.plugin.setting.ui.setting.ql) view.getTag();
        }
        qlVar.f161481b = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.f486866mp2);
        qlVar.f161482c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486869mp5);
        qlVar.f161480a = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.f486865mp1);
        r45.ov6 item = getItem(i17);
        if (item != null) {
            qlVar.f161481b.b(item.f382561e);
            qlVar.f161482c.setText(item.f382565i);
            android.widget.RelativeLayout relativeLayout = qlVar.f161480a;
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.String str = item.f382561e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String str2 = item.f382565i;
            objArr[1] = str2 != null ? str2 : "";
            relativeLayout.setContentDescription(java.lang.String.format("%s,%s", objArr));
        }
        k14.k0.a(qlVar.f161481b, qlVar.f161482c, this.f161515e, this.f161516f, this.f161517g, true);
        return view;
    }
}
