package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f197212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FinderIconViewTipPreference f197213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f197214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f197215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f197216h;

    public b6(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, int i17, com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference, boolean z17, boolean z18) {
        this.f197216h = findMoreFriendsUI;
        this.f197212d = i17;
        this.f197213e = finderIconViewTipPreference;
        this.f197214f = z17;
        this.f197215g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = this.f197212d;
        java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f197216h;
        findMoreFriendsUI.getClass();
        int Di = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Di() % 2;
        java.lang.String str = Di != 0 ? Di != 1 ? "" : "天天向上黄河" : "天天向上黄河之水天上来奔来天天向上";
        f03Var.f373889f = str.substring(0, findMoreFriendsUI.O1.nextInt(str.length()));
        findMoreFriendsUI.getClass();
        f03Var.f373890g = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Di() != 4 ? "http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0" : "";
        findMoreFriendsUI.getClass();
        f03Var.f373888e = 178;
        java.util.LinkedList linkedList = f03Var.f373896p;
        findMoreFriendsUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int Di2 = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Di();
        if (Di2 == 5) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else if (Di2 == 6) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else if (Di2 == 7) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else if (Di2 == 8) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        }
        linkedList.addAll(arrayList);
        this.f197216h.z0(f03Var, this.f197213e, this.f197214f, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0(), this.f197215g, null);
    }
}
