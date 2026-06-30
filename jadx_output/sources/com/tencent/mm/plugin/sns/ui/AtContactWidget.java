package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class AtContactWidget extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f166238p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f166239d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f166240e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f166241f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f166242g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f166243h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.PreviewContactView f166244i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsUploadConfigView f166245m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f166246n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166247o;

    public AtContactWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166246n = new java.util.LinkedList();
        this.f166247o = false;
        d(context);
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f166246n == null) {
            this.f166246n = new java.util.LinkedList();
        }
        this.f166246n.clear();
        com.tencent.mm.plugin.sns.ui.PreviewContactView previewContactView = this.f166244i;
        if (previewContactView != null) {
            previewContactView.setList(this.f166246n);
        }
        f();
        android.widget.TextView textView = this.f166242g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f166243h;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("contentDescription", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f166246n.iterator();
        while (it.hasNext()) {
            sb6.append(c01.e2.l((java.lang.String) it.next()).f2() + ",");
        }
        this.f166240e.setContentDescription(((java.lang.Object) this.f166243h.getText()) + " " + ((java.lang.Object) sb6));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("contentDescription", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToSelectTogether", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f166239d, "com.tencent.mm.ui.contact.SnsSelectConversationUI");
        intent.putExtra("Select_Conv_ui_title", this.f166239d.getString(com.tencent.mm.R.string.jgi));
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(this.f166246n, ","));
        android.app.Activity activity = this.f166239d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(6);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "goToSelectTogether", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToSelectTogether", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void d(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        this.f166239d = (android.app.Activity) context;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(getLayoutResource(), this);
        this.f166240e = inflate;
        this.f166244i = (com.tencent.mm.plugin.sns.ui.PreviewContactView) inflate.findViewById(com.tencent.mm.R.id.a5i);
        this.f166241f = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f166240e.findViewById(com.tencent.mm.R.id.a5j);
        this.f166242g = (android.widget.TextView) this.f166240e.findViewById(com.tencent.mm.R.id.a5l);
        this.f166243h = (android.widget.TextView) this.f166240e.findViewById(com.tencent.mm.R.id.a5m);
        if (com.tencent.mm.plugin.sns.model.j4.a()) {
            this.f166243h.setText(com.tencent.mm.R.string.jgi);
            android.view.View findViewById = this.f166240e.findViewById(com.tencent.mm.R.id.a5n);
            int i17 = (com.tencent.mm.plugin.sns.model.j4.b() || com.tencent.mm.plugin.sns.model.j4.c()) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f166240e.findViewById(com.tencent.mm.R.id.a5n);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f166240e.setOnClickListener(new com.tencent.mm.plugin.sns.ui.v0(this));
        this.f166240e.post(new com.tencent.mm.plugin.sns.ui.w0(this));
        b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public boolean e(int i17, int i18, android.content.Intent intent, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        new java.util.LinkedList();
        java.util.List<java.lang.String> linkedList = (stringExtra == null || stringExtra.equals("")) ? new java.util.LinkedList() : com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
        if (this.f166246n == null) {
            this.f166246n = new java.util.LinkedList();
        }
        this.f166246n.clear();
        for (java.lang.String str : linkedList) {
            if (!this.f166246n.contains(str)) {
                this.f166246n.add(str);
            }
        }
        com.tencent.mm.plugin.sns.ui.PreviewContactView previewContactView = this.f166244i;
        if (previewContactView != null) {
            previewContactView.setList(this.f166246n);
        }
        g(z17);
        android.widget.TextView textView = this.f166243h;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(linkedList.isEmpty() ? com.tencent.mm.R.color.a0c : com.tencent.mm.R.color.f479206su));
        }
        if (this.f166247o) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAtNumTv", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            this.f166246n.size();
            if (!this.f166247o || this.f166242g == null || this.f166246n.size() <= 0) {
                this.f166242g.setVisibility(8);
            } else {
                this.f166242g.setVisibility(0);
                if (this.f166246n.size() < 100) {
                    this.f166242g.setText(this.f166246n.size() + "");
                    this.f166242g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), this.f166246n.size()));
                } else {
                    this.f166242g.setText("");
                    this.f166242g.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAtNumTv", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        }
        f();
        b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return true;
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLayoutWidth", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f166246n.size() > 0) {
            this.f166241f.s(getWithDrawableId(), com.tencent.mm.R.color.aaq);
        } else {
            this.f166241f.s(getWithEmptyDrawableId(), com.tencent.mm.R.color.f479265ui);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLayoutWidth", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void g(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWithTaInfo", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f166246n.size() <= 0 || z17 || !com.tencent.mm.plugin.sns.model.j4.a()) {
            android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.mvt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.mvt);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWithTaInfo", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public java.util.List<java.lang.String> getAtList() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f166246n == null) {
            this.f166246n = new java.util.LinkedList();
        }
        java.util.List<java.lang.String> list = this.f166246n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return list;
    }

    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return com.tencent.mm.R.layout.f488156io;
    }

    public int getWithDrawableId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (com.tencent.mm.plugin.sns.model.j4.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            return com.tencent.mm.R.raw.icon_filled_together;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return com.tencent.mm.R.raw.album_mention_icon_pressed;
    }

    public int getWithEmptyDrawableId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (com.tencent.mm.plugin.sns.model.j4.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            return com.tencent.mm.R.raw.icon_outlined_together;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return com.tencent.mm.R.raw.album_mention_icon_normal;
    }

    public void setShowAtList(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.tencent.mm.plugin.sns.ui.PreviewContactView previewContactView = this.f166244i;
        if (previewContactView != null) {
            previewContactView.setVisibility(z17 ? 0 : 8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void setShowAtNum(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowAtNum", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        this.f166247o = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowAtNum", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void setShowAtTips(boolean z17) {
        android.widget.TextView textView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowAtTips", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f166240e != null && (textView = this.f166243h) != null) {
            textView.setVisibility(z17 ? 0 : 8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowAtTips", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public AtContactWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166246n = new java.util.LinkedList();
        this.f166247o = false;
        d(context);
    }
}
