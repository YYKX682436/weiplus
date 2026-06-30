package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wxmm.IConfCallBack f149573a;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ilinkservice.v4 f149575c = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f149574b = new android.util.SparseArray(5);

    public f0() {
        this.f149573a = null;
        this.f149573a = new com.tencent.mm.plugin.multitalk.ilinkservice.d0(this);
    }

    public com.tencent.wxmm.IConfCallBack a(boolean z17) {
        com.tencent.wxmm.IConfCallBack iConfCallBack;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: trigger validate callback %b", java.lang.Boolean.valueOf(z17));
        synchronized (this) {
            if (z17) {
                this.f149574b.clear();
            }
            iConfCallBack = this.f149573a;
        }
        return iConfCallBack;
    }

    public void b(int i17, com.tencent.mm.plugin.multitalk.ilinkservice.e0 e0Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: registering event id: %d", java.lang.Integer.valueOf(i17));
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f149574b.get(i17);
            if (hashSet == null) {
                z17 = true;
                hashSet = new java.util.HashSet(1);
            } else {
                z17 = false;
            }
            hashSet.add(e0Var);
            if (z17) {
                this.f149574b.append(i17, hashSet);
            }
        }
    }

    public void c(int i17, com.tencent.mm.plugin.multitalk.ilinkservice.e0 e0Var) {
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f149574b.get(i17);
            if (hashSet != null) {
                hashSet.remove(e0Var);
            }
        }
    }
}
