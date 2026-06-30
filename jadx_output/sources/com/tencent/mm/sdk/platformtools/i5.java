package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public class i5 extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.l5 f192738a;

    public i5(com.tencent.mm.sdk.platformtools.l5 l5Var, com.tencent.mm.sdk.platformtools.g5 g5Var) {
        this.f192738a = l5Var;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i17, java.lang.String str) {
        java.util.ArrayList arrayList;
        synchronized (this.f192738a.f192837d) {
            arrayList = new java.util.ArrayList(this.f192738a.f192837d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStatusWatcher", "onCallStateChanged state: %d", java.lang.Integer.valueOf(i17));
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.sdk.platformtools.h5) it.next()).a(i17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.sdk.platformtools.j5.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((ll3.n0) ((com.tencent.mm.sdk.platformtools.j5) ((fs.n) qVar.get()))).b(i17);
            }
        }
        super.onCallStateChanged(i17, str);
    }
}
