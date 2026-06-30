package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class jf {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f209004a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f209005b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f209006c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNav f209007d;

    public jf(com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav, boolean z17, com.tencent.mm.ui.ef efVar) {
        this.f209007d = multiTalkRoomPopupNav;
        this.f209005b = multiTalkRoomPopupNav.findViewById(com.tencent.mm.R.id.bzg);
        this.f209006c = (android.widget.TextView) multiTalkRoomPopupNav.findViewById(com.tencent.mm.R.id.jx9);
        this.f209004a = (android.widget.LinearLayout) multiTalkRoomPopupNav.findViewById(com.tencent.mm.R.id.czs);
    }

    public static void a(com.tencent.mm.ui.jf jfVar) {
        jfVar.getClass();
        int i17 = com.tencent.mm.ui.MultiTalkRoomPopupNav.B;
        com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav = jfVar.f209007d;
        multiTalkRoomPopupNav.i(false);
        android.widget.LinearLayout linearLayout = jfVar.f209004a;
        if (linearLayout.getVisibility() == 0) {
            multiTalkRoomPopupNav.k(linearLayout, 300L);
        }
    }
}
