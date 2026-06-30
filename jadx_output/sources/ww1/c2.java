package ww1;

/* loaded from: classes9.dex */
public final class c2 implements vg3.z4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f450165a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f450166b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.d2 f450167c;

    public c2(ww1.d2 d2Var) {
        this.f450167c = d2Var;
    }

    @Override // vg3.z4
    public void a() {
        ww1.d2 d2Var = this.f450167c;
        com.tencent.mars.xlog.Log.i(d2Var.f450171h, "flushNotifyAllMsg");
        if (!ww1.d2.q(d2Var)) {
            com.tencent.mars.xlog.Log.i(d2Var.f450171h, "enable byp notify false");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f450166b;
        arrayList.addAll(list);
        ((java.util.ArrayList) list).clear();
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i(d2Var.f450171h, "lastClone is empty");
        } else if (ct1.c.f222220g != null) {
            com.tencent.mars.xlog.Log.i(d2Var.f450171h, "notifyOther");
            new com.tencent.mm.sdk.platformtools.n3(ct1.c.f222220g.getLooper()).post(new ww1.a2(arrayList));
        }
    }

    @Override // vg3.z4
    public void b(com.tencent.mm.storage.f9 f9Var, r45.j4 j4Var) {
        ww1.d2 d2Var = this.f450167c;
        com.tencent.mars.xlog.Log.i(d2Var.f450171h, "[notifyNewMsg] msg=" + f9Var + " addMsg=" + j4Var);
        mm.w.e("PayMsg");
        if (!ww1.d2.q(d2Var)) {
            com.tencent.mars.xlog.Log.i(d2Var.f450171h, "enable byp notify false");
            return;
        }
        if (ct1.c.f222220g == null) {
            com.tencent.mars.xlog.Log.i(d2Var.f450171h, "notify is null");
            return;
        }
        boolean z17 = false;
        if (f9Var != null && f9Var.A0() == 0) {
            if (f9Var != null && f9Var.P0() == 4) {
                z17 = true;
            }
            if (!z17) {
                if (this.f450165a) {
                    com.tencent.mars.xlog.Log.i(d2Var.f450171h, "add to newmsg list");
                    ((java.util.ArrayList) this.f450166b).add(f9Var);
                    return;
                } else {
                    this.f450165a = true;
                    com.tencent.mars.xlog.Log.i(d2Var.f450171h, "notifyFirst");
                    new com.tencent.mm.sdk.platformtools.n3(ct1.c.f222220g.getLooper()).post(new ww1.b2(f9Var));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(d2Var.f450171h, "not new msg, ignore");
        mm.w.f("notNewMsg");
    }
}
