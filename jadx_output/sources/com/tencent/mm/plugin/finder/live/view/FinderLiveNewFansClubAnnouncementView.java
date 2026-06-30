package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "i", "Lyz5/a;", "getShowEditPanel", "()Lyz5/a;", "setShowEditPanel", "(Lyz5/a;)V", "showEditPanel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveNewFansClubAnnouncementView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f116056d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f116057e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f116058f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f116059g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f116060h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a showEditPanel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveNewFansClubAnnouncementView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.diz, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f116056d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.fdi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116057e = findViewById;
        android.view.View view = this.f116056d;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.qp8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f116058f = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById2;
        android.view.View view2 = this.f116056d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.fdh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116059g = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f116056d;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.fsi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f116060h = (android.widget.ImageView) findViewById4;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f116058f;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("showAnnouncementSwitch");
            throw null;
        }
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.live.view.w7(this, context));
        android.view.View view4 = this.f116057e;
        if (view4 != null) {
            view4.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.x7(this));
        } else {
            kotlin.jvm.internal.o.o("announcementContentContainer");
            throw null;
        }
    }

    public final void b(r45.qo qoVar) {
        boolean z17 = true;
        if ((qoVar != null ? qoVar.getString(1) : null) == null) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f116058f;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("showAnnouncementSwitch");
                throw null;
            }
            mMSwitchBtn.setCheck(false);
            android.view.View view = this.f116057e;
            if (view == null) {
                kotlin.jvm.internal.o.o("announcementContentContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f116058f;
        if (mMSwitchBtn2 == null) {
            kotlin.jvm.internal.o.o("showAnnouncementSwitch");
            throw null;
        }
        mMSwitchBtn2.setCheck(true);
        android.view.View view2 = this.f116057e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("announcementContentContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f116059g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("announcementContent");
            throw null;
        }
        java.lang.String string = qoVar.getString(1);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        java.lang.String string2 = qoVar.getString(2);
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.widget.ImageView imageView = this.f116060h;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("announcementContentPic");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f116060h;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("announcementContentPic");
            throw null;
        }
        imageView2.setVisibility(0);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(qoVar.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329965s));
        android.widget.ImageView imageView3 = this.f116060h;
        if (imageView3 != null) {
            b17.c(imageView3);
        } else {
            kotlin.jvm.internal.o.o("announcementContentPic");
            throw null;
        }
    }

    public final yz5.a getShowEditPanel() {
        return this.showEditPanel;
    }

    public final void setShowEditPanel(yz5.a aVar) {
        this.showEditPanel = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveNewFansClubAnnouncementView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        a(context);
    }
}
