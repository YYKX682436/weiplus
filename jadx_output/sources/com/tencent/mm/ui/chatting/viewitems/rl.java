package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class rl implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f205461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ue4.z f205462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ot0.q f205463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.g0 f205464i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wl f205465m;

    public rl(com.tencent.mm.ui.chatting.viewitems.wl wlVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, boolean z17, ue4.z zVar, ot0.q qVar, com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        this.f205465m = wlVar;
        this.f205459d = dVar;
        this.f205460e = f9Var;
        this.f205461f = z17;
        this.f205462g = zVar;
        this.f205463h = qVar;
        this.f205464i = g0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.String str;
        ue4.z zVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i18 == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.wl wlVar = this.f205465m;
        wlVar.f205951t.getFirstVisiblePosition();
        wlVar.f205951t.getLastVisiblePosition();
        j30.n nVar = (j30.n) i95.n0.c(j30.n.class);
        yb5.d dVar = this.f205459d;
        java.util.Set wi6 = ((i30.f) nVar).wi(dVar.g());
        com.tencent.mm.storage.f9 f9Var = this.f205460e;
        if (!wi6.contains(java.lang.String.valueOf(f9Var.getMsgId()))) {
            boolean z17 = this.f205461f;
            ot0.q qVar = this.f205463h;
            if (z17 || (zVar = this.f205462g) == null || com.tencent.mm.sdk.platformtools.t8.K0(zVar.f426933b)) {
                str = null;
            } else {
                if (wlVar.d0(qVar.D0, zVar.f426935d)) {
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                    return;
                }
                str = zVar.f426933b;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHardDeviceMsg", "onScroll: report iconId:%s, position:%s", str, java.lang.Integer.valueOf(this.f205464i.getAdapterPosition()));
                jx3.f.INSTANCE.d(13168, 43, 0, java.lang.Integer.valueOf(java.lang.Integer.parseInt(qVar.f348703r0)), str);
                ((i30.f) ((j30.n) i95.n0.c(j30.n.class))).wi(dVar.g()).add(java.lang.String.valueOf(f9Var.getMsgId()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
