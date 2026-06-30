package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;", "Landroid/widget/RelativeLayout;", "", "curGiftId", "Ljz5/f0;", "setNormalContent", "setBatchContent", "desc", "setUnLockContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveGiftPreviewView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f115938d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f115939e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f115940f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f115941g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f115942h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f115943i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f115944m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f115945n;

    /* renamed from: o, reason: collision with root package name */
    public int f115946o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f115947p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115938d = "FinderLiveGiftPreviewView@" + hashCode();
        this.f115947p = "";
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.asc, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f115939e = inflate;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f3p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById;
        this.f115940f = mMPAGView;
        mMPAGView.a(new com.tencent.mm.plugin.finder.live.view.o5(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f3r);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f115942h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f3q);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f115941g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f0m);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f115943i = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kye);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f115944m = (android.widget.TextView) findViewById5;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView finderLiveGiftPreviewView, ce2.i iVar) {
        r45.na0 D0;
        r45.xi6 xi6Var;
        finderLiveGiftPreviewView.f115939e.setBackgroundResource(com.tencent.mm.R.drawable.a3s);
        java.lang.String string = finderLiveGiftPreviewView.getContext().getString(com.tencent.mm.R.string.djc);
        android.widget.TextView textView = finderLiveGiftPreviewView.f115941g;
        textView.setText(string);
        textView.setTextSize(1, 14.0f);
        boolean z17 = iVar != null && iVar.a1();
        android.widget.TextView textView2 = finderLiveGiftPreviewView.f115944m;
        if (z17) {
            if ((iVar == null || (xi6Var = iVar.field_switchSkinInfo) == null || !xi6Var.getBoolean(4)) ? false : true) {
                finderLiveGiftPreviewView.b(40, 40, 8);
                android.view.View view = finderLiveGiftPreviewView.f115943i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.yi6 Q0 = iVar.Q0();
                textView2.setText(java.lang.String.valueOf((int) (Q0 != null ? Q0.getFloat(5) : 0.0f)));
                return;
            }
        }
        if (!((iVar == null || (D0 = iVar.D0()) == null || !D0.getBoolean(10)) ? false : true)) {
            android.view.View view2 = finderLiveGiftPreviewView.f115943i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        finderLiveGiftPreviewView.b(40, 40, 8);
        android.view.View view3 = finderLiveGiftPreviewView.f115943i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setText(java.lang.String.valueOf((int) iVar.P0()));
    }

    private final void setBatchContent(java.lang.String str) {
        b(64, 64, 0);
        this.f115942h.setVisibility(8);
        ce2.i e17 = dk2.u7.f234181a.e(str);
        if (e17 != null) {
            this.f115939e.setBackgroundResource(com.tencent.mm.R.drawable.a3r);
            java.lang.String string = e17.z0().size() == 0 ? getContext().getString(com.tencent.mm.R.string.dj_) : getContext().getString(com.tencent.mm.R.string.djb);
            android.widget.TextView textView = this.f115941g;
            textView.setText(string);
            textView.setTextSize(1, 10.0f);
            setClickable(false);
            setEnabled(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r1 != 2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setNormalContent(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 64
            r1 = 0
            r9.b(r0, r0, r1)
            android.widget.TextView r0 = r9.f115942h
            r2 = 8
            r0.setVisibility(r2)
            dk2.u7 r0 = dk2.u7.f234181a
            ce2.i r10 = r0.e(r10)
            r0 = 1
            r9.setClickable(r0)
            r9.setEnabled(r0)
            if (r10 != 0) goto L20
            a(r9, r10)
            return
        L20:
            int r2 = r10.field_flag
            r3 = 8192(0x2000, float:1.148E-41)
            boolean r2 = pm0.v.z(r2, r3)
            java.lang.Class<mm2.n2> r3 = mm2.n2.class
            if (r2 == 0) goto L41
            dk2.ef r2 = dk2.ef.f233372a
            androidx.lifecycle.c1 r2 = r2.i(r3)
            mm2.n2 r2 = (mm2.n2) r2
            if (r2 == 0) goto L3c
            boolean r2 = r2.f329281i
            if (r2 != 0) goto L3c
            r2 = r0
            goto L3d
        L3c:
            r2 = r1
        L3d:
            if (r2 == 0) goto L41
            r2 = r0
            goto L42
        L41:
            r2 = r1
        L42:
            r4 = 1094713344(0x41400000, float:12.0)
            r5 = 2131763559(0x7f102167, float:1.9158227E38)
            r6 = 2131233164(0x7f08098c, float:1.8082458E38)
            android.view.View r7 = r9.f115939e
            android.widget.TextView r8 = r9.f115941g
            if (r2 == 0) goto L62
            r7.setBackgroundResource(r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r10 = r10.getString(r5)
            r8.setText(r10)
            r8.setTextSize(r0, r4)
            return
        L62:
            boolean r2 = r10.W0()
            if (r2 == 0) goto L7d
            dk2.ef r2 = dk2.ef.f233372a
            androidx.lifecycle.c1 r2 = r2.i(r3)
            mm2.n2 r2 = (mm2.n2) r2
            if (r2 == 0) goto L78
            boolean r2 = r2.f329278f
            if (r2 != 0) goto L78
            r2 = r0
            goto L79
        L78:
            r2 = r1
        L79:
            if (r2 == 0) goto L7d
            r2 = r0
            goto L7e
        L7d:
            r2 = r1
        L7e:
            if (r2 == 0) goto L92
            r7.setBackgroundResource(r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r10 = r10.getString(r5)
            r8.setText(r10)
            r8.setTextSize(r0, r4)
            return
        L92:
            boolean r2 = r10.T0()
            if (r2 == 0) goto Ld9
            r45.mb r2 = r10.v0()
            if (r2 == 0) goto La2
            int r1 = r2.getInteger(r1)
        La2:
            r2 = 1096810496(0x41600000, float:14.0)
            r3 = 2131233216(0x7f0809c0, float:1.8082563E38)
            if (r1 == 0) goto Lc4
            if (r1 == r0) goto Laf
            r4 = 2
            if (r1 == r4) goto Lc4
            goto Ld9
        Laf:
            r7.setBackgroundResource(r3)
            android.content.Context r10 = r9.getContext()
            r1 = 2131780897(0x7f106521, float:1.9193392E38)
            java.lang.String r10 = r10.getString(r1)
            r8.setText(r10)
            r8.setTextSize(r0, r2)
            return
        Lc4:
            r7.setBackgroundResource(r3)
            android.content.Context r10 = r9.getContext()
            r1 = 2131780902(0x7f106526, float:1.9193402E38)
            java.lang.String r10 = r10.getString(r1)
            r8.setText(r10)
            r8.setTextSize(r0, r2)
            return
        Ld9:
            a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView.setNormalContent(java.lang.String):void");
    }

    public final void b(int i17, int i18, int i19) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f115940f.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = i65.a.b(getContext(), i17);
            marginLayoutParams.height = i65.a.b(getContext(), i18);
            marginLayoutParams.topMargin = i65.a.b(getContext(), i19);
        }
    }

    public final void c(java.lang.String curGiftId, int i17) {
        java.lang.String L0;
        kotlin.jvm.internal.o.g(curGiftId, "curGiftId");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f115945n;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f115940f;
        mMPAGView.setAlpha(1.0f);
        this.f115946o = i17;
        this.f115947p = curGiftId;
        ce2.i e17 = dk2.u7.f234181a.e(curGiftId);
        boolean z17 = e17 != null ? e17.field_use_rfx_pag : false;
        int i18 = this.f115946o;
        if (i18 == 1) {
            setBatchContent(curGiftId);
        } else {
            if (i18 == 2) {
                java.lang.String str = e17 != null ? e17.field_description : null;
                if (!(str == null || str.length() == 0)) {
                    java.lang.String str2 = e17 != null ? e17.field_description : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    setUnLockContent(str2);
                }
            }
            setNormalContent(curGiftId);
        }
        mMPAGView.setRepeatCount(-1);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(z17);
        rj.j.a(nn2.d.f338671a.c(), (e17 == null || (L0 = e17.L0()) == null) ? "" : L0, this.f115940f, null, 4, null);
    }

    public final void setUnLockContent(java.lang.String desc) {
        kotlin.jvm.internal.o.g(desc, "desc");
        b(32, 32, 4);
        android.widget.TextView textView = this.f115942h;
        textView.setVisibility(0);
        textView.setText(desc);
        this.f115939e.setBackgroundResource(com.tencent.mm.R.drawable.a3s);
        textView.setTextSize(1, 12.0f);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.djc);
        android.widget.TextView textView2 = this.f115941g;
        textView2.setText(string);
        textView2.setTextSize(1, 14.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftPreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
