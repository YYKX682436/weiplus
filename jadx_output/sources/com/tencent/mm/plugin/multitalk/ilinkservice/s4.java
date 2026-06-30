package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149783a;

    /* renamed from: b, reason: collision with root package name */
    public int f149784b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f149785c = 0;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f149786d = null;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f149787e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f149788f = false;

    public s4(com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149783a = null;
        this.f149783a = c0Var;
    }

    public void a() {
        if (zj3.j.g()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "release");
        try {
            synchronized (this) {
                if (this.f149788f) {
                    this.f149788f = false;
                    wu5.c cVar = this.f149786d;
                    if (cVar != null) {
                        cVar.cancel(false);
                        this.f149786d = null;
                    }
                    wu5.c cVar2 = this.f149787e;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                        this.f149787e = null;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "release error:" + e17.toString());
        }
    }

    public boolean b() {
        if (zj3.j.g()) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "startPlay");
        try {
            synchronized (this) {
                if (this.f149788f) {
                    return false;
                }
                this.f149788f = true;
                wu5.c cVar = this.f149786d;
                if (cVar != null) {
                    cVar.cancel(false);
                    this.f149786d = null;
                }
                this.f149786d = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.multitalk.ilinkservice.o4(this), 0L, 10L);
                wu5.c cVar2 = this.f149787e;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                    this.f149787e = null;
                }
                this.f149787e = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.multitalk.ilinkservice.r4(this), 0L, 10L);
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "startPlay error:" + e17.toString());
            return false;
        }
    }
}
