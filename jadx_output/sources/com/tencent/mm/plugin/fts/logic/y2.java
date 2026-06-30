package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public long f137744a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f137745b;

    /* renamed from: c, reason: collision with root package name */
    public long f137746c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137747d;

    /* renamed from: e, reason: collision with root package name */
    public int f137748e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137749f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137750g;

    public y2(com.tencent.mm.plugin.fts.logic.e3 e3Var, com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$1 fTS5SearchServiceNotifyLogic$1) {
    }

    public void a() {
        if ("gh_3dfda90e39d6".equals(this.f137745b)) {
            this.f137748e = 57;
            java.lang.String str = this.f137747d;
            this.f137749f = str;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                h45.v a17 = h45.v.a(this.f137749f);
                this.f137750g = a17.f278954a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (a17.f278955b == 0) {
                    sb6.append(a17.f278958e);
                    sb6.append(" ");
                    sb6.append(a17.f278956c);
                    sb6.append(" ");
                } else {
                    sb6.append(a17.f278957d);
                    sb6.append(" ");
                    if (!a17.f278960g) {
                        sb6.append(a17.f278958e);
                        sb6.append(" ");
                        sb6.append(a17.f278959f);
                        sb6.append(" ");
                    }
                    sb6.append(a17.f278962i);
                    sb6.append(" ");
                    sb6.append(a17.f278963j);
                    sb6.append(" ");
                    sb6.append(a17.f278964k);
                    sb6.append(" ");
                    java.util.List list = a17.f278965l;
                    if (list != null) {
                        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                        while (it.hasNext()) {
                            h45.u uVar = (h45.u) it.next();
                            uVar.getClass();
                            sb6.append(uVar.f278952b);
                            sb6.append(" ");
                        }
                    }
                }
                this.f137749f = sb6.toString();
            }
        } else {
            this.f137745b = "notifymessage";
            this.f137748e = 56;
            java.lang.String str2 = this.f137747d;
            this.f137749f = str2;
            this.f137750g = com.tencent.mm.plugin.fts.logic.d3.a(str2).f137498a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f137749f)) {
                com.tencent.mm.plugin.fts.logic.d3 a18 = com.tencent.mm.plugin.fts.logic.d3.a(this.f137749f);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(a18.f137499b);
                sb7.append(" ");
                java.util.List list2 = a18.f137500c;
                if (list2 != null) {
                    java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
                    while (it6.hasNext()) {
                        sb7.append(((com.tencent.mm.plugin.fts.logic.c3) it6.next()).f137482a);
                        sb7.append(" ");
                    }
                }
                this.f137749f = sb7.toString();
            }
        }
        this.f137747d = null;
    }
}
