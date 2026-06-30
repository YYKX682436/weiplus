package com.tencent.mm.plugin.profile.ui.tab.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Landroid/widget/TextView;", "Ljz5/f0;", "m", "Lyz5/l;", "getOnClickExpandBtn", "()Lyz5/l;", "setOnClickExpandBtn", "(Lyz5/l;)V", "onClickExpandBtn", "n", "getOnClickCollapseBtn", "setOnClickCollapseBtn", "onClickCollapseBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ProfileLiveNotifyTextLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f154667d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f154668e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f154669f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f154670g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f154671h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f154672i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l onClickExpandBtn;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.l onClickCollapseBtn;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f154675o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLiveNotifyTextLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489365cb0, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.icj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154667d = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ich);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f154668e = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ick);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById3;
        this.f154669f = mMNeat7extView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ici);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById4;
        this.f154670g = mMNeat7extView2;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.icg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f154671h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.icf);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f154672i = findViewById6;
        this.f154675o = kz5.z.D0(new android.view.View[]{findViewById, findViewById2, mMNeat7extView, mMNeat7extView2, findViewById5, findViewById6});
        findViewById5.setOnClickListener(new as3.i0(this));
        findViewById6.setOnClickListener(new as3.j0(this));
    }

    public static final void a(com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout, android.view.View view) {
        profileLiveNotifyTextLayout.getClass();
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view2 = (android.view.View) parent;
        view2.post(new as3.k0(profileLiveNotifyTextLayout, view, view2));
    }

    public final void b(android.view.View... viewArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (android.view.View view : viewArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            hashSet.add(view);
        }
        for (android.view.View view2 : kz5.q1.g(this.f154675o, hashSet)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final yz5.l getOnClickCollapseBtn() {
        return this.onClickCollapseBtn;
    }

    public final yz5.l getOnClickExpandBtn() {
        return this.onClickExpandBtn;
    }

    public final void setOnClickCollapseBtn(yz5.l lVar) {
        this.onClickCollapseBtn = lVar;
    }

    public final void setOnClickExpandBtn(yz5.l lVar) {
        this.onClickExpandBtn = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLiveNotifyTextLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489365cb0, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.icj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154667d = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ich);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f154668e = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ick);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById3;
        this.f154669f = mMNeat7extView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ici);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById4;
        this.f154670g = mMNeat7extView2;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.icg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f154671h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.icf);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f154672i = findViewById6;
        this.f154675o = kz5.z.D0(new android.view.View[]{findViewById, findViewById2, mMNeat7extView, mMNeat7extView2, findViewById5, findViewById6});
        findViewById5.setOnClickListener(new as3.i0(this));
        findViewById6.setOnClickListener(new as3.j0(this));
    }
}
