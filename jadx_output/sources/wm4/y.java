package wm4;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f447327k;

    /* renamed from: m, reason: collision with root package name */
    public oa.i f447329m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f447330n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f447331o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f447332p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f447333q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f447334r;

    /* renamed from: s, reason: collision with root package name */
    public int f447335s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f447336t;

    /* renamed from: u, reason: collision with root package name */
    public int f447337u;

    /* renamed from: v, reason: collision with root package name */
    public int f447338v;

    /* renamed from: w, reason: collision with root package name */
    public int f447339w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f447340x;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f447317a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f447318b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f447319c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f447320d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f447321e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f447322f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f447323g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f447324h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f447325i = null;

    /* renamed from: j, reason: collision with root package name */
    public r45.f03 f447326j = null;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f447328l = "";

    public void a(int i17, java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        java.lang.String str2 = "category:%s updateContentRedDot() called with: curNum = [" + i17 + "], msgId = [" + str + "] contentRedDotShowInfo!=null:%s contentRedDotShowInfo!=null:%s ";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(this.f447318b);
        objArr[1] = java.lang.Boolean.valueOf(f03Var != null);
        objArr[2] = java.lang.Boolean.valueOf(f03Var != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryUILogic", str2, objArr);
        this.f447322f = i17;
        this.f447324h = str;
        this.f447325i = jbVar;
        this.f447326j = f03Var;
        android.widget.TextView textView = this.f447332p;
        if (textView != null) {
            if (i17 <= 0) {
                android.view.View view = this.f447334r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (this.f447323g <= 0) {
                textView.setVisibility(8);
                android.view.View view2 = this.f447334r;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        c(this);
    }

    public void b(int i17, java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryUILogic", "updateNumberRedDot() called with: curNum = [" + i17 + "], msgId = [" + str + "]");
        this.f447323g = i17;
        this.f447328l = str;
        this.f447327k = jbVar;
        if (i17 <= 0) {
            android.widget.TextView textView = this.f447332p;
            if (textView != null) {
                textView.setText("");
                this.f447332p.setVisibility(8);
                int i18 = this.f447322f;
                if (i18 > 0) {
                    a(i18, this.f447324h, null, null);
                }
            }
        } else {
            java.lang.String str2 = "" + this.f447323g;
            if (this.f447323g > 99) {
                str2 = "99+";
            }
            android.widget.TextView textView2 = this.f447332p;
            if (textView2 != null) {
                textView2.setText(str2);
                this.f447332p.setVisibility(0);
                android.view.View view = this.f447334r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateNumberRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateNumberRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        c(this);
    }

    public void c(wm4.y yVar) {
        if (yVar.f447331o == null) {
            return;
        }
        android.widget.TextView textView = yVar.f447332p;
        if (textView != null && textView.getVisibility() == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.J0(yVar.f447332p.getText())) {
                yVar.f447331o.setContentDescription(yVar.f447317a + yVar.f447331o.getContext().getResources().getString(com.tencent.mm.R.string.f493393k10));
                return;
            }
            yVar.f447331o.setContentDescription(yVar.f447317a + yVar.f447331o.getContext().getString(com.tencent.mm.R.string.f489714n, yVar.f447332p.getText()) + yVar.f447331o.getContext().getResources().getString(com.tencent.mm.R.string.f493393k10));
            return;
        }
        android.view.View view = yVar.f447334r;
        if (view == null || view.getVisibility() != 0) {
            yVar.f447331o.setContentDescription(yVar.f447317a + yVar.f447331o.getContext().getResources().getString(com.tencent.mm.R.string.f493393k10));
            return;
        }
        android.widget.TextView textView2 = yVar.f447331o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(yVar.f447317a);
        sb6.append(yVar.f447334r.getVisibility() == 0 ? yVar.f447334r.getContext().getString(com.tencent.mm.R.string.f489713m) : "");
        sb6.append(yVar.f447331o.getContext().getResources().getString(com.tencent.mm.R.string.f493393k10));
        textView2.setContentDescription(sb6.toString());
    }

    public java.lang.String toString() {
        return java.lang.String.format("tabType=%s,category=%s,wording=%s;", 0, java.lang.Integer.valueOf(this.f447318b), this.f447317a);
    }
}
