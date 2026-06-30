package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class uf extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f161610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI f161611e;

    public uf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI, com.tencent.mm.plugin.setting.ui.setting.mf mfVar) {
        this.f161611e = settingsManageAuthUI;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.ov6 getItem(int i17) {
        if (i17 < 0 || i17 >= getCount()) {
            return null;
        }
        return (r45.ov6) this.f161610d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f161610d;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f161610d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.setting.ui.setting.tf tfVar;
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI = this.f161611e;
        if (view == null) {
            view = settingsManageAuthUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.cl7, (android.view.ViewGroup) null);
            tfVar = new com.tencent.mm.plugin.setting.ui.setting.tf(this, null);
            view.setTag(tfVar);
        } else {
            tfVar = (com.tencent.mm.plugin.setting.ui.setting.tf) view.getTag();
        }
        tfVar.f161575a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486866mp2);
        tfVar.f161576b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486869mp5);
        tfVar.f161577c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.moz);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.mou);
        tfVar.f161578d = button;
        button.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.sf(this, i17));
        if (settingsManageAuthUI.f160489i) {
            tfVar.f161578d.setVisibility(0);
        } else {
            tfVar.f161578d.setVisibility(8);
        }
        if (getItem(i17) != null) {
            tfVar.f161575a.setText(getItem(i17).f382561e);
            tfVar.f161576b.setText(getItem(i17).f382565i);
            android.widget.TextView textView = tfVar.f161577c;
            java.util.LinkedList linkedList = getItem(i17).f382563g;
            settingsManageAuthUI.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((r45.pv6) it.next()).f383421e);
                sb6.append(",");
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            textView.setText(sb6.toString());
        }
        return view;
    }
}
