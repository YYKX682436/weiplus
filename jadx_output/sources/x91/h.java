package x91;

/* loaded from: classes16.dex */
public class h implements z91.b {

    /* renamed from: a, reason: collision with root package name */
    public final x91.c f452647a;

    /* renamed from: b, reason: collision with root package name */
    public final y91.i0 f452648b;

    /* renamed from: c, reason: collision with root package name */
    public x91.l f452649c;

    /* renamed from: d, reason: collision with root package name */
    public x91.l f452650d;

    /* renamed from: e, reason: collision with root package name */
    public final x91.k f452651e;

    /* renamed from: f, reason: collision with root package name */
    public aa1.c f452652f;

    /* renamed from: g, reason: collision with root package name */
    public aa1.c f452653g;

    /* renamed from: h, reason: collision with root package name */
    public x91.i f452654h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452655i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f452656j;

    public h(x91.c cVar) {
        int i17 = y91.i0.f460281h;
        this.f452648b = y91.h0.f460277a;
        this.f452651e = new x91.k();
        this.f452655i = false;
        this.f452656j = false;
        this.f452647a = cVar;
        if (cVar == null) {
            return;
        }
        java.util.ArrayList arrayList = cVar.f452642j;
        if (arrayList.size() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x91.l lVar = (x91.l) it.next();
            if (!android.text.TextUtils.isEmpty(lVar.f452664a)) {
                if (lVar.f452664a.startsWith("urn:schemas-upnp-org:service:AVTransport")) {
                    this.f452649c = lVar;
                } else if (lVar.f452664a.startsWith("urn:schemas-upnp-org:service:RenderingControl")) {
                    this.f452650d = lVar;
                } else {
                    lVar.f452664a.startsWith("urn:schemas-upnp-org:service:ConnectionManager");
                }
            }
        }
    }

    public final java.lang.String a(x91.l lVar) {
        x91.c cVar = this.f452647a;
        return cVar != null ? y91.z.a(cVar.f452634b, cVar.f452635c, lVar.f452667d) : "";
    }

    public boolean b(aa1.d dVar) {
        java.lang.String str;
        if (this.f452654h == null) {
            return true;
        }
        java.util.Map map = dVar.f2489b;
        if (map != null && !((java.util.HashMap) map).containsKey("LastChange")) {
            return false;
        }
        java.util.Map map2 = dVar.f2489b;
        if (map2 != null) {
            aa1.a aVar = (aa1.a) ((java.util.HashMap) map2).get("LastChange");
            java.util.Objects.requireNonNull(aVar);
            str = aVar.f2481a;
        } else {
            str = null;
        }
        java.util.HashMap a17 = str != null ? new y91.l0().a(str) : null;
        if (a17 == null) {
            return false;
        }
        if ("avtEvent".equals(dVar.f2486c)) {
            aa1.a aVar2 = (aa1.a) a17.get("TransportState");
            if (aVar2 != null) {
                java.lang.String a18 = aVar2.f2482b.a(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL);
                if ("PLAYING".equalsIgnoreCase(a18)) {
                    this.f452654h.e(this);
                } else if ("PAUSED_PLAYBACK".equalsIgnoreCase(a18)) {
                    this.f452654h.b(this);
                } else if ("STOPPED".equalsIgnoreCase(a18)) {
                    this.f452654h.a(this);
                }
            }
            aa1.a aVar3 = (aa1.a) a17.get("CurrentTrackDuration");
            if (aVar3 != null) {
                java.lang.String[] split = aVar3.f2482b.a(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL).split(":");
                if (split.length == 3) {
                    this.f452654h.c(this, (java.lang.Integer.parseInt(split[0]) * 3600) + (java.lang.Integer.parseInt(split[1]) * 60) + java.lang.Integer.parseInt(split[2]));
                }
            }
        } else if ("rdcEvent".equals(dVar.f2486c)) {
            aa1.a aVar4 = (aa1.a) a17.get("Volume");
            if (aVar4 != null) {
                this.f452654h.d(this, java.lang.Integer.parseInt(aVar4.f2482b.a(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL)));
            }
            if (((aa1.a) a17.get("Mute")) != null) {
                this.f452654h.f(this, !"0".equals(r6.f2482b.a(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL)));
            }
        }
        return true;
    }

    public void c(z91.a aVar) {
        x91.l lVar = this.f452649c;
        if (lVar != null) {
            this.f452648b.g(new w91.h(a(lVar), this.f452649c.f452664a), aVar);
        }
    }

    public void d(java.lang.String str, z91.a aVar) {
        x91.l lVar = this.f452649c;
        if (lVar != null) {
            this.f452648b.g(new w91.k(a(lVar), this.f452649c.f452664a, str), aVar);
        }
    }

    public void e(z91.a aVar) {
        x91.l lVar = this.f452649c;
        if (lVar != null) {
            this.f452648b.g(new w91.m(a(lVar), this.f452649c.f452664a), aVar);
        }
    }

    public boolean equals(java.lang.Object obj) {
        x91.c cVar = this.f452647a;
        if (cVar == null && obj == null) {
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof x91.h) {
            return cVar.equals(((x91.h) obj).f452647a);
        }
        return false;
    }

    public void f() {
        if (this.f452655i) {
            return;
        }
        y91.o oVar = y91.n.f460302a;
        x91.d dVar = new x91.d(this);
        oVar.getClass();
        x91.l lVar = this.f452649c;
        if (lVar != null) {
            java.lang.String c17 = oVar.c("/upnp/cb/AVTransport");
            x91.c cVar = this.f452647a;
            w91.n nVar = new w91.n(y91.z.a(cVar.f452634b, cVar.f452635c, lVar.f452668e), c17);
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.g(nVar, new y91.h(oVar, this, dVar));
        }
    }

    public void g() {
        if (this.f452656j) {
            return;
        }
        y91.o oVar = y91.n.f460302a;
        x91.e eVar = new x91.e(this);
        oVar.getClass();
        x91.l lVar = this.f452650d;
        if (lVar != null) {
            java.lang.String c17 = oVar.c("/upnp/cb/RenderControl");
            x91.c cVar = this.f452647a;
            w91.n nVar = new w91.n(y91.z.a(cVar.f452634b, cVar.f452635c, lVar.f452668e), c17);
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.g(nVar, new y91.i(oVar, this, eVar));
        }
    }

    public void h() {
        if (this.f452655i) {
            y91.o oVar = y91.n.f460302a;
            x91.f fVar = new x91.f(this);
            oVar.getClass();
            x91.l lVar = this.f452649c;
            aa1.c cVar = this.f452652f;
            if (lVar == null || cVar == null || cVar.f2484a == null) {
                return;
            }
            x91.c cVar2 = this.f452647a;
            w91.o oVar2 = new w91.o(y91.z.a(cVar2.f452634b, cVar2.f452635c, lVar.f452668e), cVar.f2484a);
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.g(oVar2, new y91.j(oVar, cVar, fVar));
        }
    }

    public void i() {
        if (this.f452656j) {
            y91.o oVar = y91.n.f460302a;
            x91.g gVar = new x91.g(this);
            oVar.getClass();
            x91.l lVar = this.f452650d;
            aa1.c cVar = this.f452653g;
            if (lVar == null || cVar == null || cVar.f2484a == null) {
                return;
            }
            x91.c cVar2 = this.f452647a;
            w91.o oVar2 = new w91.o(y91.z.a(cVar2.f452634b, cVar2.f452635c, lVar.f452668e), cVar.f2484a);
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.g(oVar2, new y91.k(oVar, cVar, gVar));
        }
    }

    public java.lang.String toString() {
        return "MRDevice{mDevice=" + this.f452647a + '}';
    }
}
