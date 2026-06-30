package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class a0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f191499d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.e0 f191500e = com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191501f;

    public a0(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191501f = appChooserUI;
        appChooserUI.f191332d = appChooserUI.getPackageManager();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.pluginsdk.ui.otherway.x getItem(int i17) {
        java.util.List list = this.f191499d;
        if (list == null) {
            return null;
        }
        return (com.tencent.mm.pluginsdk.ui.otherway.x) list.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f191499d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return getItem(i17).f191032h ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.pluginsdk.ui.tools.b0 b0Var;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar;
        android.content.pm.ResolveInfo resolveInfo;
        com.tencent.mm.pluginsdk.ui.otherway.x item = getItem(i17);
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191501f;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(appChooserUI.getContext()).inflate(item.f191032h ? com.tencent.mm.R.layout.f488125hu : com.tencent.mm.R.layout.f488124ht, (android.view.ViewGroup) null);
            b0Var = new com.tencent.mm.pluginsdk.ui.tools.b0(appChooserUI, view);
            view.setTag(b0Var);
        } else {
            b0Var = (com.tencent.mm.pluginsdk.ui.tools.b0) view.getTag();
        }
        if (item.f191030f == null) {
            new com.tencent.mm.pluginsdk.ui.tools.c0(appChooserUI).execute(item);
        }
        b0Var.f191519a.setImageDrawable(item.f191030f);
        java.lang.CharSequence charSequence = item.f191029e;
        if (appChooserUI.E && (resolveInfo = item.f191028d) != null && resolveInfo.activityInfo.packageName.equals(appChooserUI.F)) {
            charSequence = android.text.TextUtils.concat(charSequence, appChooserUI.getString(com.tencent.mm.R.string.f490365sy));
            if (appChooserUI.A == null) {
                appChooserUI.A = item;
            }
        }
        b0Var.f191520b.setText(charSequence);
        boolean z17 = item.f191032h;
        android.widget.RadioButton radioButton = b0Var.f191523e;
        android.widget.TextView textView = b0Var.f191522d;
        if ((!z17 || item.f191033i || (z17 && item.f191035n && appChooserUI.H >= appChooserUI.I)) && !item.f191034m) {
            textView.setVisibility(8);
            radioButton.setVisibility(0);
            radioButton.setChecked(item.a(appChooserUI.A));
        } else {
            textView.setVisibility(0);
            radioButton.setVisibility(8);
            textView.setOnClickListener(appChooserUI.V);
            com.tencent.mm.pluginsdk.ui.tools.e0 e0Var = this.f191500e;
            if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL) {
                if (item.f191034m) {
                    textView.setText(com.tencent.mm.R.string.f490499wt);
                } else {
                    textView.setText(com.tencent.mm.R.string.f490375t8);
                }
                textView.setEnabled(true);
            } else if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADING) {
                textView.setText(com.tencent.mm.R.string.f490380td);
                textView.setEnabled(false);
            } else if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADED) {
                if (item.f191034m) {
                    textView.setText(com.tencent.mm.R.string.f490577yz);
                } else {
                    textView.setText(com.tencent.mm.R.string.f490576yy);
                }
                textView.setEnabled(true);
            }
        }
        boolean z18 = item.f191032h;
        android.widget.TextView textView2 = b0Var.f191521c;
        if (z18) {
            if (appChooserUI.f191351y == 4) {
                textView2.setText(com.tencent.mm.R.string.hok);
            } else {
                java.lang.String str = appChooserUI.f191347u;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                textView2.setText(str);
            }
            textView2.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(appChooserUI.f191347u) ? 8 : 0);
        } else {
            textView2.setVisibility(8);
        }
        if (appChooserUI.f191351y != 6 && (xVar = appChooserUI.A) != null && xVar.equals(item)) {
            radioButton.setChecked(true);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
