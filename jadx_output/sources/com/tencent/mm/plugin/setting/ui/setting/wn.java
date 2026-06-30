package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public class wn extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI f161716d;

    public wn(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI, com.tencent.mm.plugin.setting.ui.setting.mn mnVar) {
        this.f161716d = settingsTrustFriendUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI = this.f161716d;
        int size = ((java.util.ArrayList) settingsTrustFriendUI.f160734d).size();
        if (settingsTrustFriendUI.f160739i) {
            return size;
        }
        if (size == 0) {
            return 1;
        }
        if (size > 0 && size < com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.f160733n) {
            return size + 2;
        }
        if (size >= com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.f160733n) {
            return size + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (getItemViewType(i17) == 0) {
            return ((java.util.ArrayList) this.f161716d.f160734d).get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI = this.f161716d;
        int size = ((java.util.ArrayList) settingsTrustFriendUI.f160734d).size();
        if (settingsTrustFriendUI.f160739i || i17 < size) {
            return 0;
        }
        if (size == 0) {
            return 1;
        }
        if (size >= com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.f160733n) {
            return 2;
        }
        if (i17 == size) {
            return 1;
        }
        return i17 == size + 1 ? 2 : -1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.setting.ui.setting.vn vnVar;
        com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI = this.f161716d;
        if (view == null) {
            view = settingsTrustFriendUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.cmd, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ojr);
            android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ojs);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ojw);
            vnVar = new com.tencent.mm.plugin.setting.ui.setting.vn(this, null);
            vnVar.f161673a = imageView;
            vnVar.f161674b = imageView2;
            vnVar.f161675c = textView;
            view.setTag(vnVar);
        } else {
            vnVar = (com.tencent.mm.plugin.setting.ui.setting.vn) view.getTag();
        }
        if (getItemViewType(i17) == 0) {
            java.lang.String str = (java.lang.String) ((java.util.ArrayList) settingsTrustFriendUI.f160734d).get(i17);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            vnVar.f161673a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(vnVar.f161673a, str, null);
            android.widget.TextView textView2 = vnVar.f161675c;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String g27 = n17.g2();
            float textSize = vnVar.f161675c.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(settingsTrustFriendUI, g27, textSize));
            if (settingsTrustFriendUI.f160739i) {
                vnVar.f161674b.setVisibility(0);
            } else {
                vnVar.f161674b.setVisibility(8);
            }
        } else {
            vnVar.f161675c.setVisibility(4);
            vnVar.f161674b.setVisibility(8);
            vnVar.f161673a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            if (getItemViewType(i17) == 1) {
                vnVar.f161673a.setImageResource(com.tencent.mm.R.drawable.f480953g8);
            } else if (getItemViewType(i17) == 2) {
                vnVar.f161673a.setImageResource(com.tencent.mm.R.drawable.f480954g9);
            }
        }
        vnVar.f161673a.setTag(com.tencent.mm.R.id.mnv, java.lang.Integer.valueOf(getItemViewType(i17)));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
