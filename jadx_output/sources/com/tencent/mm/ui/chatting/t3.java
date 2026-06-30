package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class t3 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.w3 f202691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f202693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f202694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f202695h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f202696i;

    public t3(com.tencent.mm.ui.chatting.w3 w3Var, java.lang.String str, android.content.Context context, boolean z17, boolean z18, java.lang.Runnable runnable) {
        this.f202691d = w3Var;
        this.f202692e = str;
        this.f202693f = context;
        this.f202694g = z17;
        this.f202695h = z18;
        this.f202696i = runnable;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        java.util.List list;
        com.tencent.mm.ui.chatting.w3 w3Var = this.f202691d;
        if (w3Var == null || (list = w3Var.f206201a) == null) {
            return false;
        }
        java.lang.String f17 = list.size() > 1 ? dh3.c.f232489a.f(this.f202692e, dh3.d.f232496e) : "";
        java.util.Iterator it = w3Var.f206201a.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.chatting.x3.h(this.f202693f, this.f202692e, (com.tencent.mm.storage.f9) it.next(), w3Var.f206202b, this.f202694g, f17);
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        int i17;
        com.tencent.mm.ui.chatting.w3 w3Var = this.f202691d;
        java.util.List list = w3Var.f206201a;
        if (list != null) {
            long size = list.size();
            long size2 = w3Var.f206201a.size() - com.tencent.mm.ui.chatting.n3.f(w3Var.f206201a);
            com.tencent.mm.ui.chatting.w3 w3Var2 = com.tencent.mm.ui.chatting.x3.f206228a;
            pm0.v.K(null, new yd5.l(5L, size, size2, w3Var2.f206207g, w3Var2.f206208h, w3Var2.f206209i));
        }
        java.util.List<com.tencent.mm.storage.f9> list2 = w3Var.f206201a;
        if (list2 != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (com.tencent.mm.storage.f9 f9Var : list2) {
                if (f9Var.k2()) {
                    java.lang.String j17 = f9Var.j();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    ot0.q v17 = ot0.q.v(j17);
                    if (v17 != null && ((i17 = v17.f348666i) == 51 || i17 == 129)) {
                        zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
                        if (iVar != null) {
                            linkedList.add(new android.util.Pair(iVar.f477411b.getString(0), iVar.f477411b.getString(8)));
                        }
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList, false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList2, true);
            }
        }
        if (this.f202695h) {
            java.lang.Runnable runnable = this.f202696i;
            if (runnable != null) {
                runnable.run();
            }
            java.lang.ref.WeakReference weakReference = w3Var.f206203c;
            if (weakReference != null && weakReference.get() != null) {
                ((ot0.f3) w3Var.f206203c.get()).f2(ot0.e3.trans);
            }
            w3Var.f206201a = null;
            w3Var.f206202b = false;
            w3Var.f206203c = null;
            w3Var.f206204d = null;
            w3Var.f206205e = null;
            w3Var.f206206f = null;
            com.tencent.mm.ui.chatting.x3.a();
        }
        return true;
    }
}
