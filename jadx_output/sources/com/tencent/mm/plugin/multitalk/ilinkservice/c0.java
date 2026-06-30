package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public long f149518b;

    /* renamed from: c, reason: collision with root package name */
    public long f149519c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f149520d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f149521e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149522f;

    /* renamed from: g, reason: collision with root package name */
    public long f149523g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f149524h;

    /* renamed from: l, reason: collision with root package name */
    public wu5.c f149528l;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f149525i = new java.util.ArrayList(10);

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f149526j = new java.util.ArrayList(10);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f149527k = new java.util.ArrayList(2);

    /* renamed from: m, reason: collision with root package name */
    public final wu5.j f149529m = new com.tencent.mm.plugin.multitalk.ilinkservice.a0(this);

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f149517a = new java.util.ArrayList(10);

    public synchronized java.util.ArrayList a() {
        return (java.util.ArrayList) this.f149517a.clone();
    }

    public com.tencent.mm.plugin.multitalk.ilinkservice.w b(java.lang.String str) {
        java.util.ArrayList arrayList = this.f149517a;
        if (arrayList == null || str == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
            if (wVar != null && wVar.f149842c.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.multitalk.ilinkservice.x c(java.lang.String str) {
        java.util.ArrayList arrayList = this.f149525i;
        if (arrayList == null || str == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.x xVar = (com.tencent.mm.plugin.multitalk.ilinkservice.x) it.next();
            if (xVar != null && xVar.f149851a.equals(str)) {
                return xVar;
            }
        }
        return null;
    }

    public java.lang.String d(int i17) {
        java.util.ArrayList arrayList = this.f149517a;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
            if (wVar != null && i17 == wVar.f149840a) {
                return wVar.f149842c;
            }
        }
        return null;
    }

    public void e() {
        this.f149526j.clear();
        this.f149517a.clear();
        this.f149527k.clear();
        this.f149525i.clear();
        this.f149518b = 0L;
        this.f149519c = 0L;
        this.f149520d = null;
        this.f149521e = null;
        this.f149522f = null;
        synchronized (this.f149527k) {
            this.f149527k.clear();
        }
        wu5.c cVar = this.f149528l;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    public void f(java.lang.String str, java.lang.String str2, int i17) {
        java.util.ArrayList arrayList;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || (arrayList = this.f149525i) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.x xVar = (com.tencent.mm.plugin.multitalk.ilinkservice.x) it.next();
            if (xVar != null && xVar.f149852b.equals(str)) {
                if (!xVar.f149851a.equals(str2) && xVar.f149853c <= i17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkMemberMgr", "add member cache, username:%s, openid old %s new %s", str, xVar.f149851a, str2);
                    xVar.f149851a = str2;
                }
                int i18 = xVar.f149853c;
                if (i18 < i17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkMemberMgr", "member cache, username:%s, reliable old %d new %d", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                    xVar.f149853c = i17;
                    return;
                }
                return;
            }
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.x xVar2 = new com.tencent.mm.plugin.multitalk.ilinkservice.x();
        xVar2.f149852b = str;
        xVar2.f149851a = str2;
        xVar2.f149853c = i17;
        arrayList.add(xVar2);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkMemberMgr", "add member cache, username:%s, openid %s, reliable %d", str, str2, java.lang.Integer.valueOf(i17));
    }

    public void g(int i17, int i18) {
        java.util.ArrayList arrayList = this.f149517a;
        if (arrayList == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
            if (wVar != null && wVar.f149840a == i17) {
                wVar.f149845f = i18;
            }
        }
    }
}
