package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class o8 extends com.tencent.mm.ui.contact.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f207054n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f207055o;

    /* renamed from: p, reason: collision with root package name */
    public android.database.Cursor f207056p;

    /* renamed from: q, reason: collision with root package name */
    public int f207057q;

    /* renamed from: r, reason: collision with root package name */
    public int f207058r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f207059s;

    /* renamed from: t, reason: collision with root package name */
    public final int f207060t;

    /* renamed from: u, reason: collision with root package name */
    public int f207061u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f207062v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f207063w;

    /* renamed from: x, reason: collision with root package name */
    public int f207064x;

    /* renamed from: y, reason: collision with root package name */
    public int f207065y;

    public o8(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, boolean z19, int i17) {
        super(mMBaseSelectContactUI, list, z17, z18);
        this.f207057q = -1;
        this.f207058r = -1;
        this.f207060t = 0;
        this.f207061u = 0;
        this.f207062v = new java.util.HashMap();
        this.f207063w = new java.util.HashMap();
        this.f207064x = 0;
        this.f207065y = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "create!");
        this.f207059s = z19;
        this.f207060t = i17;
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f207056p;
        if (cursor != null) {
            return cursor.getCount() + this.f207061u;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RecentConversationAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.tencent.mm.ui.contact.item.a, com.tencent.mm.ui.contact.item.c0, com.tencent.mm.ui.contact.item.d] */
    @Override // com.tencent.mm.ui.contact.p4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.ui.contact.item.d j(int r9) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.o8.j(int):com.tencent.mm.ui.contact.item.d");
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "finish!");
        t();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        java.util.List d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "resetData");
        t();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f207065y = 0;
        int i17 = this.f207060t;
        if (com.tencent.mm.ui.contact.i5.d(i17, 4)) {
            d17 = com.tencent.mm.ui.contact.k3.c();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(d17)) {
                com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list = this.f206588m;
                l75.e0 e0Var = pp.a.f357364e2;
                this.f207055o = Di.t(d17, 3, list, null, this.f206587i, "");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list2 = this.f206588m;
            l75.e0 e0Var2 = pp.a.f357364e2;
            this.f207054n = Di2.C(3, list2, null, this.f206587i, "");
        } else if (com.tencent.mm.ui.contact.i5.d(i17, 16)) {
            d17 = com.tencent.mm.ui.contact.k3.b();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(d17)) {
                com.tencent.mm.storage.m4 Di3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list3 = this.f206588m;
                l75.e0 e0Var3 = pp.a.f357364e2;
                this.f207055o = Di3.t(d17, 5, list3, null, this.f206587i, "");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di4 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list4 = this.f206588m;
            l75.e0 e0Var4 = pp.a.f357364e2;
            this.f207054n = Di4.C(5, list4, null, this.f206587i, "");
        } else {
            d17 = com.tencent.mm.ui.contact.k3.d();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(d17)) {
                com.tencent.mm.storage.m4 Di5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list5 = this.f206588m;
                l75.e0 e0Var5 = pp.a.f357364e2;
                this.f207055o = Di5.t(d17, 1, list5, null, this.f206587i, "");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list6 = this.f206588m;
            l75.e0 e0Var6 = pp.a.f357364e2;
            this.f207054n = Di6.C(1, list6, null, this.f206587i, "");
        }
        int i18 = this.f207059s ? 2 : 0;
        this.f207061u = 0;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(d17)) {
            int count = this.f207055o.getCount();
            this.f207065y = count;
            if (count > 0) {
                arrayList.add(this.f207055o);
                this.f207057q = 0 + i18;
                this.f207061u++;
            }
        }
        if (this.f207054n.getCount() > 0) {
            this.f207061u++;
            int i19 = this.f207057q;
            if (i19 == -1) {
                this.f207058r = i18 + 0;
            } else {
                this.f207058r = i19 + this.f207065y + 1;
            }
        } else {
            this.f207058r = this.f207076d.O3().getHeaderViewsCount();
        }
        arrayList.add(this.f207054n);
        this.f207056p = new android.database.MergeCursor((android.database.Cursor[]) arrayList.toArray(new android.database.Cursor[0]));
        h();
    }

    public final void t() {
        android.database.Cursor cursor = this.f207054n;
        if (cursor != null) {
            cursor.close();
            this.f207054n = null;
        }
        android.database.Cursor cursor2 = this.f207055o;
        if (cursor2 != null) {
            cursor2.close();
            this.f207055o = null;
        }
        android.database.Cursor cursor3 = this.f207056p;
        if (cursor3 != null) {
            cursor3.close();
            this.f207056p = null;
        }
    }
}
