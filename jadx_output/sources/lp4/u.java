package lp4;

/* loaded from: classes10.dex */
public final class u extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final r95.b f320427f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.timelineedit.TimelineEditor f320428g;

    /* renamed from: h, reason: collision with root package name */
    public rm5.v f320429h;

    /* renamed from: i, reason: collision with root package name */
    public final int f320430i;

    /* renamed from: m, reason: collision with root package name */
    public final int f320431m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f320432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ju3.d0 status, r95.b config) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(config, "config");
        this.f320427f = config;
        this.f320428g = new com.tencent.mm.timelineedit.TimelineEditor();
        this.f320430i = 44100;
        this.f320431m = 1;
        this.f320432n = new java.util.ArrayList();
    }

    public final void A(rm5.v vVar) {
        this.f320429h = vVar;
        if (vVar != null) {
            vVar.f397583k = new sm5.b(new l55.b(this.f320430i, this.f320431m));
        }
        rm5.v vVar2 = this.f320429h;
        if (vVar2 == null) {
            return;
        }
        vVar2.f397590r = new com.tencent.tav.codec.DefaultMediaFactory(null, new ko4.e(false, false, 3, null));
    }

    public final rm5.v B(boolean z17) {
        java.util.ArrayList arrayList;
        r95.b bVar = this.f320427f;
        s95.d0 d0Var = (s95.d0) bVar.a();
        d0Var.f405033p = !z17;
        d0Var.onChanged();
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f320428g;
        timelineEditor.getClass();
        rm5.v vVar = this.f320429h;
        if (vVar != null && (arrayList = vVar.f397584l) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rm5.j jVar = (rm5.j) it.next();
                if (jVar.f397500b != 3) {
                    jVar.f(z17 ? 0.0f : 1.0f);
                }
            }
        }
        return this.f320429h;
    }

    public final void C() {
        java.util.ArrayList arrayList;
        for (lp4.q qVar : this.f320432n) {
            rm5.v vVar = this.f320429h;
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout = (com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout) qVar;
            if (vVar != null) {
                timelineEditorPlatformVideoPluginLayout.getClass();
                java.util.ArrayList arrayList2 = vVar.f397584l;
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        rm5.j jVar = (rm5.j) it.next();
                        java.util.ArrayList<bv3.d> arrayList3 = (java.util.ArrayList) timelineEditorPlatformVideoPluginLayout.f176087x.get(jVar.f397499a);
                        if (arrayList3 != null) {
                            for (bv3.d dVar : arrayList3) {
                                long j17 = jVar.f397502d;
                                long j18 = jVar.f397503e;
                                dVar.f24731a.c(j17);
                                dVar.f24732b.c(j18);
                            }
                        }
                    }
                }
            }
            cp4.r rVar = (cp4.r) timelineEditorPlatformVideoPluginLayout.j(cp4.r.class);
            if (rVar != null) {
                java.util.List list = rVar.f221067r;
                ((java.util.ArrayList) list.get(0)).clear();
                if (vVar != null && (arrayList = vVar.f397584l) != null) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        rm5.j jVar2 = (rm5.j) it6.next();
                        bv3.a aVar = new bv3.a(jVar2.f397499a, jVar2.f397504f, jVar2.f397505g, jVar2.f397506h);
                        ((java.util.ArrayList) list.get(0)).add(aVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.EditorCaptionPlugin", "update script:" + aVar);
                    }
                }
                if (rVar.f221071v) {
                    rVar.E(0);
                    rVar.G(0);
                }
            }
        }
    }

    public final rm5.v D(java.util.List list) {
        java.util.ArrayList arrayList;
        jz5.o oVar;
        java.lang.Object obj;
        rm5.j jVar;
        java.util.ArrayList arrayList2;
        java.lang.Object obj2;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jz5.o oVar2 = (jz5.o) it.next();
                java.lang.String str = (java.lang.String) oVar2.f302841d;
                long longValue = ((java.lang.Number) oVar2.f302842e).longValue();
                long longValue2 = ((java.lang.Number) oVar2.f302843f).longValue();
                rm5.v vVar = this.f320429h;
                if (vVar == null || (arrayList2 = vVar.f397584l) == null) {
                    jVar = null;
                } else {
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (kotlin.jvm.internal.o.b(str, ((rm5.j) obj2).f397499a)) {
                            break;
                        }
                    }
                    jVar = (rm5.j) obj2;
                }
                jz5.f0 f0Var = jz5.f0.f302826a;
                if (jVar == null) {
                    r95.f o17 = this.f320428g.o(str, 2);
                    if (o17 != null) {
                        o17.f(new r95.e(longValue, longValue2));
                        o17.g(new r95.e(0L, ((s95.m0) o17.a()).f405121n));
                        s95.m0 m0Var = (s95.m0) o17.a();
                        m0Var.f405125r = 3.0f;
                        m0Var.onChanged();
                        A(this.f320428g.l(o17));
                    } else {
                        f0Var = null;
                    }
                } else {
                    jVar.c(longValue);
                    jVar.b(longValue2);
                    A(this.f320428g.u(r95.a.c(jVar)));
                }
                arrayList3.add(f0Var);
            }
        }
        rm5.v vVar2 = this.f320429h;
        if (vVar2 != null && (arrayList = vVar2.f397584l) != null) {
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                rm5.j jVar2 = (rm5.j) it7.next();
                if (jVar2.f397500b == 3) {
                    java.lang.String str2 = jVar2.f397499a;
                    if (r26.n0.D(str2, "tts", false, 2, null)) {
                        if (list != null) {
                            java.util.Iterator it8 = list.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it8.next();
                                if (kotlin.jvm.internal.o.b(((jz5.o) obj).f302841d, str2)) {
                                    break;
                                }
                            }
                            oVar = (jz5.o) obj;
                        } else {
                            oVar = null;
                        }
                        if (oVar == null) {
                            com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f320428g;
                            r95.f c17 = r95.a.c(jVar2);
                            timelineEditor.getClass();
                            A((rm5.v) timelineEditor.s(new q95.k(timelineEditor, c17), new q95.l(timelineEditor)));
                        }
                    }
                }
            }
        }
        return this.f320429h;
    }

    @Override // yt3.r2
    public void reset() {
        this.f320428g = new com.tencent.mm.timelineedit.TimelineEditor();
    }

    public final rm5.v z() {
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f320428g;
        timelineEditor.getClass();
        rm5.v vVar = (rm5.v) timelineEditor.s(new q95.g(timelineEditor), new q95.h(timelineEditor));
        if (vVar != null) {
            vVar.f397590r = new com.tencent.tav.codec.DefaultMediaFactory(null, new ko4.e(false, false, 3, null));
        }
        if (vVar != null) {
            vVar.f397583k = new sm5.b(new l55.b(this.f320430i, this.f320431m));
        }
        return vVar;
    }
}
