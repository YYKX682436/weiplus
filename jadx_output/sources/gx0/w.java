package gx0;

/* loaded from: classes5.dex */
public abstract class w extends du0.g {
    public final jz5.g A;
    public final jz5.g B;
    public final gx0.a C;

    /* renamed from: i */
    public final java.util.Map f277085i;

    /* renamed from: m */
    public final jz5.g f277086m;

    /* renamed from: n */
    public final jz5.g f277087n;

    /* renamed from: o */
    public final jz5.g f277088o;

    /* renamed from: p */
    public final jz5.g f277089p;

    /* renamed from: q */
    public final jz5.g f277090q;

    /* renamed from: r */
    public final jz5.g f277091r;

    /* renamed from: s */
    public final jz5.g f277092s;

    /* renamed from: t */
    public final jz5.g f277093t;

    /* renamed from: u */
    public final jz5.g f277094u;

    /* renamed from: v */
    public final jz5.g f277095v;

    /* renamed from: w */
    public final jz5.g f277096w;

    /* renamed from: x */
    public final jz5.g f277097x;

    /* renamed from: y */
    public final jz5.g f277098y;

    /* renamed from: z */
    public final jz5.g f277099z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277085i = kz5.c1.k(new jz5.l(bu0.b.f24481i, java.lang.Integer.valueOf(com.tencent.mm.R.string.bvy)), new jz5.l(bu0.b.f24482m, java.lang.Integer.valueOf(com.tencent.mm.R.string.bvx)), new jz5.l(bu0.b.f24484o, java.lang.Integer.valueOf(com.tencent.mm.R.string.lwv)), new jz5.l(bu0.b.f24485p, java.lang.Integer.valueOf(com.tencent.mm.R.string.m_r)), new jz5.l(bu0.b.f24483n, java.lang.Integer.valueOf(com.tencent.mm.R.string.buk)), new jz5.l(bu0.b.f24477e, java.lang.Integer.valueOf(com.tencent.mm.R.string.mbx)), new jz5.l(bu0.b.f24478f, java.lang.Integer.valueOf(com.tencent.mm.R.string.mby)), new jz5.l(bu0.b.f24479g, java.lang.Integer.valueOf(com.tencent.mm.R.string.mbw)));
        this.f277086m = jz5.h.b(new gx0.j(this));
        this.f277087n = jz5.h.b(new gx0.d(this));
        this.f277088o = jz5.h.b(new gx0.i(this));
        this.f277089p = jz5.h.b(new gx0.c(this));
        this.f277090q = jz5.h.b(new gx0.f(this));
        this.f277091r = jz5.h.b(new gx0.q(this));
        this.f277092s = jz5.h.b(new gx0.k(this));
        this.f277093t = jz5.h.b(new gx0.t(this));
        this.f277094u = jz5.h.b(new gx0.r(this));
        this.f277095v = jz5.h.b(new gx0.v(this));
        this.f277096w = jz5.h.b(new gx0.h(this));
        this.f277097x = jz5.h.b(new gx0.n(this));
        this.f277098y = jz5.h.b(new gx0.m(this));
        this.f277099z = jz5.h.b(new gx0.l(this));
        this.A = jz5.h.b(new gx0.g(this));
        this.B = jz5.h.b(new gx0.u(this));
        this.C = new gx0.a(new gx0.p(this));
    }

    public static /* synthetic */ void V6(gx0.w wVar, fv0.d dVar, com.tencent.maas.moviecomposing.segments.Segment segment, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkIfNeedRegenerateSpeech");
        }
        if ((i17 & 1) != 0) {
            dVar = fv0.d.f266963o;
        }
        wVar.U6(dVar, segment, lVar);
    }

    public void A7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
    }

    public final boolean B7(com.tencent.maas.base.MJID mjid, zw0.b bVar, du0.g gVar) {
        if (Y6().X6()) {
            return false;
        }
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("key_dest_segment_id", mjid));
        boolean z17 = !b7().A4();
        if (gVar instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k) gVar, Y6(), i17, bVar, null, new gx0.o(this, mjid), 8, null);
        } else {
            if (!(gVar instanceof gx0.w8)) {
                return false;
            }
            ((gx0.w8) gVar).N0(Y6(), i17, z17, bVar);
        }
        return true;
    }

    public final void C7(zw0.b entrance) {
        kotlin.jvm.internal.o.g(entrance, "entrance");
        yt0.c.Q5(b7(), Z6(), null, !b7().A4(), entrance, 2, null);
    }

    public boolean D7(com.tencent.maas.base.MJID segmentID, boolean z17, zw0.b entrance, du0.g parentUIC) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        kotlin.jvm.internal.o.g(parentUIC, "parentUIC");
        return false;
    }

    public boolean E7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return false;
    }

    public final void F7(ug.m segmentType) {
        kotlin.jvm.internal.o.g(segmentType, "segmentType");
        java.lang.Integer num = (java.lang.Integer) this.f277085i.get(av0.a.a(segmentType));
        if (num != null) {
            java.lang.String string = j65.q.a(getContext()).getString(num.intValue());
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ym5.a1.f(new gx0.s(this, string));
        }
    }

    public void G7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
    }

    public final boolean H7(com.tencent.maas.base.MJID segmentID, bu0.b materialType, cv0.m option, zw0.b entrance) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(materialType, "materialType");
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        z7(segmentID, materialType, option, entrance, false);
        return true;
    }

    public final void U6(fv0.d scene, com.tencent.maas.moviecomposing.segments.Segment segment, yz5.l regenerateBlock) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(segment, "segment");
        kotlin.jvm.internal.o.g(regenerateBlock, "regenerateBlock");
        java.lang.String b17 = ru0.a.b(segment);
        if (b17 != null && g7(scene, b17)) {
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(getContext());
            i0Var.d(com.tencent.mm.R.string.m_m);
            i0Var.f(com.tencent.mm.R.string.m_o);
            i0Var.f211821b.E = new gx0.e(regenerateBlock, segment);
            i0Var.e(com.tencent.mm.R.string.m_n);
            i0Var.h();
        }
    }

    public ex0.b W6() {
        return null;
    }

    public ex0.c X6() {
        return null;
    }

    public final jv0.g Y6() {
        return (jv0.g) ((jz5.n) this.f277090q).getValue();
    }

    public final kv0.b Z6() {
        return (kv0.b) ((jz5.n) this.f277096w).getValue();
    }

    public final cv0.e a7(bu0.b materialType) {
        cv0.e eVar;
        cv0.e eVar2;
        cv0.e eVar3;
        kotlin.jvm.internal.o.g(materialType, "materialType");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q) b7().v6().f340428b.j();
        boolean z17 = (qVar == null ? false : qVar instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.r) && com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(qVar);
        boolean z18 = (qVar != null ? qVar.getPanelLevel() : null) == zw0.d.f476562g;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "getHandleBoxShowOptionsForSegment: materialType:" + materialType + " isInEditing = " + z17 + ", isFirstPanelShown = " + z18);
        jz5.g gVar = this.f277086m;
        if (z17) {
            du0.o oVar = (du0.o) ((jz5.n) gVar).getValue();
            oVar.getClass();
            cv0.f fVar = (cv0.f) ((java.util.LinkedHashMap) oVar.f243394p).get(materialType);
            return (fVar == null || (eVar3 = fVar.f222536c) == null) ? oVar.f243395q.f222536c : eVar3;
        }
        if (z17 || !z18) {
            du0.o oVar2 = (du0.o) ((jz5.n) gVar).getValue();
            oVar2.getClass();
            cv0.f fVar2 = (cv0.f) ((java.util.LinkedHashMap) oVar2.f243394p).get(materialType);
            return (fVar2 == null || (eVar = fVar2.f222534a) == null) ? oVar2.f243395q.f222534a : eVar;
        }
        du0.o oVar3 = (du0.o) ((jz5.n) gVar).getValue();
        oVar3.getClass();
        cv0.f fVar3 = (cv0.f) ((java.util.LinkedHashMap) oVar3.f243394p).get(materialType);
        return (fVar3 == null || (eVar2 = fVar3.f222535b) == null) ? oVar3.f243395q.f222535b : eVar2;
    }

    public final yt0.c b7() {
        return (yt0.c) ((jz5.n) this.f277092s).getValue();
    }

    public final du0.g c7(bu0.b bVar) {
        if (!b7().A4()) {
            java.lang.Object b76 = b7();
            kotlin.jvm.internal.o.e(b76, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
            return (du0.g) b76;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                return (hw0.n) ((jz5.n) this.f277094u).getValue();
            }
            if (ordinal != 5) {
                java.lang.Object b77 = b7();
                kotlin.jvm.internal.o.e(b77, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                return (du0.g) b77;
            }
        }
        return d7();
    }

    public final ow0.a0 d7() {
        return (ow0.a0) ((jz5.n) this.f277093t).getValue();
    }

    public boolean e7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r3 != 9) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f7(bu0.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "materialType"
            kotlin.jvm.internal.o.g(r3, r0)
            int r3 = r3.ordinal()
            r0 = 1
            if (r3 == r0) goto L57
            r1 = 2
            if (r3 == r1) goto L38
            r1 = 3
            if (r3 == r1) goto L38
            r1 = 5
            if (r3 == r1) goto L57
            r1 = 6
            if (r3 == r1) goto L57
            r1 = 8
            if (r3 == r1) goto L21
            r1 = 9
            if (r3 == r1) goto L57
            goto L7c
        L21:
            jz5.g r3 = r2.f277097x
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            cw0.l0 r3 = (cw0.l0) r3
            if (r3 == 0) goto L32
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f69240i
            cw0.d r3 = (cw0.d) r3
            goto L33
        L32:
            r3 = 0
        L33:
            boolean r0 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(r3)
            goto L7d
        L38:
            jz5.g r3 = r2.f277094u
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            hw0.n r3 = (hw0.n) r3
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f69240i
            boolean r3 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(r3)
            if (r3 != 0) goto L7d
            jv0.g r3 = r2.Y6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f69240i
            boolean r3 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(r3)
            if (r3 == 0) goto L7c
            goto L7d
        L57:
            ow0.a0 r3 = r2.d7()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f69240i
            boolean r3 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(r3)
            if (r3 != 0) goto L7d
            kv0.b r3 = r2.Z6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f69240i
            boolean r3 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(r3)
            if (r3 != 0) goto L7d
            jv0.g r3 = r2.Y6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f69240i
            boolean r3 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(r3)
            if (r3 == 0) goto L7c
            goto L7d
        L7c:
            r0 = 0
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w.f7(bu0.b):boolean");
    }

    public final boolean g7(fv0.d scene, java.lang.String roleID) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = dw0.c.f244083e;
        return (kotlin.jvm.internal.o.b(roleID, dw0.f.a(scene == fv0.d.f266963o ? dw0.c.f244083e : dw0.c.f244084f)) || kotlin.jvm.internal.o.b(roleID, "")) ? false : true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    public final boolean h7(bu0.b materialType) {
        ew0.a aVar;
        uw0.u0 u0Var;
        kotlin.jvm.internal.o.g(materialType, "materialType");
        int ordinal = materialType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                switch (ordinal) {
                    case 5:
                        if (!com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(((uw0.t0) ((jz5.n) this.f277087n).getValue()).f69240i) && !com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(Y6().f69240i)) {
                            return false;
                        }
                        break;
                    case 6:
                        return com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(((uw0.o) ((jz5.n) this.f277089p).getValue()).f69240i);
                    case 7:
                        return com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(((bw0.l) ((jz5.n) this.f277099z).getValue()).f69240i);
                    case 8:
                        ew0.l lVar = (ew0.l) ((jz5.n) this.f277098y).getValue();
                        if (lVar == null || (aVar = (ew0.a) lVar.f69240i) == null || !com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(aVar)) {
                            return false;
                        }
                        break;
                    case 9:
                        uw0.e1 e1Var = (uw0.e1) ((jz5.n) this.A).getValue();
                        if (!((e1Var == null || (u0Var = (uw0.u0) e1Var.f69240i) == null || !com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(u0Var)) ? false : true) && !com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(Y6().f69240i)) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            } else if (!com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(((lw0.l) ((jz5.n) this.f277095v).getValue()).f69240i) && !com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(Y6().f69240i)) {
                return false;
            }
        } else if (!com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(((hw0.z) ((jz5.n) this.f277088o).getValue()).f69240i) && !com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(Y6().f69240i)) {
            return false;
        }
        return true;
    }

    public abstract uw0.o i7();

    public abstract uw0.t0 k7();

    public uw0.e1 l7() {
        return null;
    }

    public abstract hw0.n m7();

    public abstract ow0.a0 n7();

    public abstract jv0.g o7();

    public abstract kv0.b p7();

    public abstract hw0.z q7();

    public abstract du0.o r7();

    public abstract yt0.c s7();

    public abstract bw0.l t7();

    public ew0.l u7() {
        return null;
    }

    public cw0.l0 v7() {
        return null;
    }

    public abstract gx0.hf w7();

    public abstract pv0.y x7();

    public abstract lw0.l y7();

    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean] */
    public final boolean z7(com.tencent.maas.base.MJID mjid, bu0.b bVar, cv0.m mVar, zw0.b bVar2, boolean z17) {
        du0.g gVar;
        du0.g gVar2;
        ex0.c X6;
        com.tencent.maas.base.MJID mjid2;
        du0.g gVar3;
        cw0.l0 l0Var;
        ?? r96;
        ex0.b W6;
        int ordinal = bVar.ordinal();
        gx0.a aVar = this.C;
        switch (ordinal) {
            case 1:
                int ordinal2 = mVar.ordinal();
                if (ordinal2 == 1) {
                    E7(mjid);
                    return true;
                }
                if (ordinal2 == 2) {
                    if (h7(bVar)) {
                        return true;
                    }
                    if (d7().X6()) {
                        d7().N7(mjid, bVar2, mv0.c.f331533e);
                        return true;
                    }
                    C7(bVar2);
                    Z6().k7((hw0.z) ((jz5.n) this.f277088o).getValue(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f349125e), new jz5.l("key_mj_id", mjid), new jz5.l("key_edit_purpose", mv0.c.f331533e)), bVar2, aVar);
                    return true;
                }
                if (ordinal2 == 3) {
                    B7(mjid, bVar2, c7(bVar));
                    return true;
                }
                if (ordinal2 != 4) {
                    return true;
                }
                if (b7().A4()) {
                    gVar = d7();
                } else {
                    java.lang.Object b76 = b7();
                    kotlin.jvm.internal.o.e(b76, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                    gVar = (du0.g) b76;
                }
                D7(mjid, false, bVar2, gVar);
                return true;
            case 2:
                int ordinal3 = mVar.ordinal();
                if (ordinal3 == 1) {
                    E7(mjid);
                    return true;
                }
                if (ordinal3 != 2) {
                    if (ordinal3 != 3) {
                        return true;
                    }
                    B7(mjid, bVar2, c7(bVar));
                    return true;
                }
                jz5.g gVar4 = this.f277094u;
                if (((hw0.n) ((jz5.n) gVar4).getValue()).X6()) {
                    ((hw0.n) ((jz5.n) gVar4).getValue()).p7(mjid, bVar2, mv0.c.f331533e);
                    return true;
                }
                b7().N0((lw0.l) ((jz5.n) this.f277095v).getValue(), kz5.c1.i(new jz5.l("ket_dest_segment", mjid)), !b7().A4(), bVar2);
                return true;
            case 3:
                int ordinal4 = mVar.ordinal();
                if (ordinal4 == 1) {
                    E7(mjid);
                    return true;
                }
                if (ordinal4 != 3) {
                    return true;
                }
                B7(mjid, bVar2, c7(bVar));
                return true;
            case 5:
                int ordinal5 = mVar.ordinal();
                if (ordinal5 == 1) {
                    E7(mjid);
                    return true;
                }
                if (ordinal5 != 2) {
                    if (ordinal5 == 3) {
                        B7(mjid, bVar2, c7(bVar));
                        return true;
                    }
                    if (ordinal5 != 4) {
                        return true;
                    }
                    if (b7().A4()) {
                        gVar2 = d7();
                    } else {
                        java.lang.Object b77 = b7();
                        kotlin.jvm.internal.o.e(b77, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                        gVar2 = (du0.g) b77;
                    }
                    D7(mjid, false, bVar2, gVar2);
                    return true;
                }
                if (h7(bVar)) {
                    return true;
                }
                if (d7().X6() && !z17) {
                    return true;
                }
                if (!d7().X6() && !z17) {
                    yt0.c b78 = b7();
                    ow0.a0 d76 = d7();
                    sw0.f fVar = sw0.f.f413429d;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("KEY_PANEL_ARGS", new ow0.a(fVar, false));
                    yt0.c.Q5(b78, d76, hashMap, false, bVar2, 4, null);
                    return true;
                }
                if (d7().X6() && z17) {
                    ow0.a0.M7(d7(), null, bVar2, 1, null);
                    return true;
                }
                if (d7().X6() || !z17) {
                    return true;
                }
                C7(bVar2);
                Z6().k7((uw0.t0) ((jz5.n) this.f277087n).getValue(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f349125e)), bVar2, aVar);
                return true;
            case 6:
                int ordinal6 = mVar.ordinal();
                if (ordinal6 == 1) {
                    E7(mjid);
                    return true;
                }
                if (ordinal6 != 2) {
                    if (ordinal6 != 4) {
                        return true;
                    }
                    if (b7().A4()) {
                        gVar3 = d7();
                    } else {
                        java.lang.Object b79 = b7();
                        kotlin.jvm.internal.o.e(b79, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                        gVar3 = (du0.g) b79;
                    }
                    D7(mjid, false, bVar2, gVar3);
                    return true;
                }
                if (h7(bVar)) {
                    return true;
                }
                if (d7().X6() && !z17) {
                    return true;
                }
                if (!d7().X6() && !z17) {
                    yt0.c b710 = b7();
                    ow0.a0 d77 = d7();
                    sw0.f fVar2 = sw0.f.f413430e;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("KEY_PANEL_ARGS", new ow0.a(fVar2, false));
                    yt0.c.Q5(b710, d77, hashMap2, false, bVar2, 4, null);
                }
                if (d7().X6() && z17) {
                    ow0.a0.L7(d7(), null, bVar2, 1, null);
                    return true;
                }
                if (d7().X6() || !z17 || (X6 = X6()) == null || (mjid2 = X6.f257168b) == null) {
                    return true;
                }
                C7(bVar2);
                Z6().k7((uw0.o) ((jz5.n) this.f277089p).getValue(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f349125e), new jz5.l("key_belonging_segment_id", mjid2)), bVar2, aVar);
                return true;
            case 7:
                int ordinal7 = mVar.ordinal();
                if (ordinal7 == 1) {
                    e7(mjid);
                    return true;
                }
                if (ordinal7 != 2) {
                    return true;
                }
                b7().N0((bw0.l) ((jz5.n) this.f277099z).getValue(), kz5.c1.i(new jz5.l("key_dest_segment", mjid)), !b7().A4(), bVar2);
                return true;
            case 8:
                if (gx0.b.f276214a[mVar.ordinal()] != 2 || h7(bVar) || (l0Var = (cw0.l0) ((jz5.n) this.f277097x).getValue()) == null) {
                    return true;
                }
                if (l0Var.X6() && !z17) {
                    l0Var.C7(mjid);
                    return true;
                }
                if (!l0Var.X6() && !z17) {
                    b7().N0(l0Var, kz5.c1.i(new jz5.l("NARRATION_SEGMENT_ID", mjid)), !b7().A4(), bVar2);
                    return true;
                }
                if (l0Var.X6() && z17) {
                    cw0.l0.Q7(l0Var, null, mjid, null, 5, null);
                    return true;
                }
                ew0.l lVar = (ew0.l) ((jz5.n) this.f277098y).getValue();
                if (lVar == null || l0Var.X6() || !z17) {
                    return true;
                }
                C7(bVar2);
                Z6().k7(lVar, kz5.c1.i(new jz5.l("key_open_page", ov0.e.f349125e), new jz5.l("KEY_NARRATION_SEGMENT_ID", mjid)), bVar2, aVar);
                return true;
            case 9:
                int ordinal8 = mVar.ordinal();
                if (ordinal8 == 1) {
                    E7(mjid);
                    return true;
                }
                if (ordinal8 == 2 && !h7(bVar) && (!d7().X6() || z17)) {
                    if (d7().X6() || z17) {
                        r96 = 1;
                    } else {
                        yt0.c b711 = b7();
                        ow0.a0 d78 = d7();
                        sw0.f fVar3 = sw0.f.f413432g;
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("KEY_PANEL_ARGS", new ow0.a(fVar3, false));
                        r96 = 1;
                        yt0.c.Q5(b711, d78, hashMap3, false, bVar2, 4, null);
                    }
                    if (d7().X6() && z17) {
                        ow0.a0.K7(d7(), null, bVar2, null, 5, null);
                        return r96;
                    }
                    uw0.e1 e1Var = (uw0.e1) ((jz5.n) this.A).getValue();
                    if (e1Var == null || d7().X6() || !z17 || (W6 = W6()) == null) {
                        return r96;
                    }
                    C7(bVar2);
                    kv0.b Z6 = Z6();
                    jz5.l[] lVarArr = new jz5.l[4];
                    lVarArr[0] = new jz5.l("key_open_page", ov0.e.f349125e);
                    lVarArr[r96] = new jz5.l("key_caption_segment_id", W6.f257168b);
                    lVarArr[2] = new jz5.l("key_caption_language", W6.D());
                    lVarArr[3] = new jz5.l("key_enable_dual_language_edit", java.lang.Boolean.valueOf(W6.E() != null ? r96 : false));
                    Z6.k7(e1Var, kz5.c1.i(lVarArr), bVar2, aVar);
                    return r96;
                }
                break;
        }
        return true;
    }
}
