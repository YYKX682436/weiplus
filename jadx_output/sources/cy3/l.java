package cy3;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f224789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f224790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f224791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.MMAnimateView f224792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f224793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f224794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f224796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.y1 f224797o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ vx3.i f224798p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f224799q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f224800r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f224801s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224802t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f224803u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224804v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f224805w;

    public l(yz5.l lVar, kotlin.jvm.internal.h0 h0Var, boolean z17, com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView, kotlin.jvm.internal.c0 c0Var, android.view.View view, android.content.Context context, android.view.View view2, com.tencent.mm.plugin.ringtone.uic.y1 y1Var, vx3.i iVar, kotlin.jvm.internal.c0 c0Var2, long j17, int i17, java.lang.String str, boolean z18, java.lang.String str2, boolean z19) {
        this.f224789d = lVar;
        this.f224790e = h0Var;
        this.f224791f = z17;
        this.f224792g = mMAnimateView;
        this.f224793h = c0Var;
        this.f224794i = view;
        this.f224795m = context;
        this.f224796n = view2;
        this.f224797o = y1Var;
        this.f224798p = iVar;
        this.f224799q = c0Var2;
        this.f224800r = j17;
        this.f224801s = i17;
        this.f224802t = str;
        this.f224803u = z18;
        this.f224804v = str2;
        this.f224805w = z19;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f224789d;
        if (lVar != null) {
            lVar.invoke(this.f224790e.f310123d);
        }
        if (!this.f224791f) {
            yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f224792g;
        mMAnimateView.y();
        kotlin.jvm.internal.c0 c0Var = this.f224793h;
        boolean z18 = c0Var.f310112d;
        android.view.View view2 = this.f224796n;
        android.content.Context context = this.f224795m;
        android.view.View view3 = this.f224794i;
        if (z18) {
            str = "(Landroid/view/View;)V";
            z17 = false;
            view3.setBackground(context.getDrawable(com.tencent.mm.R.drawable.axo));
            mMAnimateView.setVisibility(8);
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            view3.setBackground(context.getDrawable(com.tencent.mm.R.drawable.axn));
            mMAnimateView.setVisibility(0);
            if (view2 == null) {
                str = "(Landroid/view/View;)V";
                z17 = false;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                str = "(Landroid/view/View;)V";
                z17 = false;
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mMAnimateView.x();
        }
        com.tencent.mm.plugin.ringtone.uic.y1 y1Var = this.f224797o;
        vx3.i iVar = this.f224798p;
        if (y1Var != null) {
            y1Var.a(iVar, 0L, !c0Var.f310112d);
        }
        c0Var.f310112d = !c0Var.f310112d;
        java.lang.String d17 = iVar.d();
        long c17 = iVar.c();
        boolean z19 = this.f224799q.f310112d;
        boolean z27 = y1Var != null ? y1Var.f158549b.f367386s : z17;
        long j17 = this.f224800r;
        int i17 = this.f224801s;
        java.lang.String str2 = this.f224802t;
        wx3.a.d(d17, c17, j17, 3L, i17, (r35 & 32) != 0 ? "" : str2, (r35 & 64) != 0 ? false : false, (r35 & 128) != 0 ? false : z19, (r35 & 256) != 0 ? "" : str2, (r35 & 512) != 0 ? false : this.f224803u, (r35 & 1024) != 0 ? false : z27, (r35 & 2048) != 0 ? "" : this.f224804v, (r35 & 4096) != 0 ? false : this.f224805w);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "android/view/View$OnClickListener", "onClick", str);
    }
}
