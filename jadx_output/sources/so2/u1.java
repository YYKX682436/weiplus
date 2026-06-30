package so2;

/* loaded from: classes2.dex */
public class u1 extends com.tencent.mm.plugin.finder.model.BaseFinderFeed {

    /* renamed from: d, reason: collision with root package name */
    public boolean f410630d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410631e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410632f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f410633g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f410634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        this.f410633g = jz5.h.b(so2.t1.f410605d);
        this.f410634h = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed
    public void T0() {
        super.T0();
        this.f410632f = false;
    }

    public final boolean f2() {
        r45.gl2 gl2Var;
        if (!(j2() && hc2.o0.g(getFeedObject().getFeedObject()))) {
            return false;
        }
        if (getFeedObject().isLongVideo()) {
            return true;
        }
        r45.dm2 object_extend = getFeedObject().getFeedObject().getObject_extend();
        return (object_extend == null || (gl2Var = (r45.gl2) object_extend.getCustom(56)) == null || !gl2Var.getBoolean(0)) ? false : true;
    }

    public final boolean g2() {
        if (!(j2() && hc2.o0.g(getFeedObject().getFeedObject()))) {
            return false;
        }
        if (getFeedObject().isLongVideo()) {
            return true;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127748i5.r()).intValue();
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        return intValue == 1;
    }

    public final boolean h2(boolean z17) {
        if (g2()) {
            return z17 || gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i2() {
        /*
            r5 = this;
            boolean r0 = r5.j2()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L26
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            jz5.g r3 = hc2.o0.f280336a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.o.g(r0, r3)
            int r0 = r0.getPermissionFlag()
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L26
            r0 = r2
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 != 0) goto L2a
            return r1
        L2a:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.getFeedObject()
            boolean r0 = r0.isLongVideo()
            if (r0 == 0) goto L35
            return r2
        L35:
            java.lang.Class<cq.k> r0 = cq.k.class
            i95.m r3 = i95.n0.c(r0)
            java.lang.String r4 = "getService(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            cq.k r3 = (cq.k) r3
            com.tencent.mm.plugin.finder.storage.t70 r3 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r3 = com.tencent.mm.plugin.finder.storage.t70.f127748i5
            java.lang.Object r3 = r3.r()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            i95.m r0 = i95.n0.c(r0)
            kotlin.jvm.internal.o.f(r0, r4)
            cq.k r0 = (cq.k) r0
            if (r3 != r2) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.u1.i2():boolean");
    }

    public final boolean j2() {
        boolean z17;
        boolean z18;
        if (getIsPreview() || !getFeedObject().isPostFinish()) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127751i8).getValue()).r()).intValue() != 1) {
            if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (!z18) {
                return false;
            }
        }
        return !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
    }

    public final java.util.List k2(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = data.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.List list = this.f410634h;
            if (!hasNext) {
                ((java.util.ArrayList) list).addAll(arrayList);
                com.tencent.mars.xlog.Log.i("FinderFeedVideo", "mergeBulletList: bullet list size = " + ((java.util.ArrayList) list).size() + ", increase size = " + arrayList.size());
                return arrayList;
            }
            bb2.o oVar = (bb2.o) it.next();
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            int i17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((bb2.o) it6.next()).a() == oVar.a()) {
                    break;
                }
                i17++;
            }
            if (i17 >= 0) {
                oVar.a();
            } else {
                arrayList.add(oVar);
            }
        }
    }

    public final void l2(long j17) {
        java.util.List list = this.f410634h;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((bb2.o) it.next()).a() == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 > -1) {
            ((java.util.ArrayList) list).remove(i17);
        }
    }
}
