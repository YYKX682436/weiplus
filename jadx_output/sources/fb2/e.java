package fb2;

/* loaded from: classes2.dex */
public final class e implements fb2.m {
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList list3;
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        r45.lb lbVar;
        r45.v80 v80Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.extension.reddot.jb u07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().u0();
        if (i17 == 4 && i18 == 0) {
            r45.f03 I0 = u07 != null ? u07.I0("FinderEntrance") : null;
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onIntercept] tipsId=");
            sb6.append(u07 != null ? u07.field_tipsId : null);
            sb6.append(" title=[");
            sb6.append(I0 != null ? I0.f373889f : null);
            sb6.append('-');
            sb6.append((I0 == null || (lbVar = I0.f373904x) == null || (v80Var = lbVar.f379284d) == null) ? null : v80Var.f387981d);
            sb6.append("] sync_show_info is null? ");
            sb6.append(((u07 == null || (xs2Var2 = u07.N) == null) ? null : (r45.bz2) xs2Var2.getCustom(23)) == null);
            sb6.append(", respShowInfo is null? ");
            sb6.append(((r45.px2) resp.getCustom(24)) != null);
            com.tencent.mars.xlog.Log.i("Finder.TipBubbleInterceptor", sb6.toString());
            if (((u07 == null || (xs2Var = u07.N) == null) ? null : (r45.bz2) xs2Var.getCustom(23)) != null) {
                r45.bz2 bz2Var = (r45.bz2) u07.N.getCustom(23);
                kotlin.jvm.internal.o.d(bz2Var);
                r45.px2 px2Var = new r45.px2();
                px2Var.set(0, java.lang.Integer.valueOf(bz2Var.f371167d));
                px2Var.set(1, bz2Var.f371168e);
                px2Var.set(3, java.lang.Long.valueOf(bz2Var.f371170g));
                px2Var.set(4, bz2Var.f371171h);
                resp.set(24, px2Var);
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                    org.json.JSONObject json = bz2Var.toJSON();
                    if (json.toString().length() > 4000) {
                        java.lang.String jSONObject = json.toString();
                        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                        kotlin.jvm.internal.o.f(jSONObject.substring(0, 4000), "substring(...)");
                        java.lang.String jSONObject2 = json.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        kotlin.jvm.internal.o.f(jSONObject2.substring(4000), "substring(...)");
                    }
                }
                bs2.n1 R6 = finderStreamTabPreloadCore.R6(4);
                boolean d17 = d(u07, resp);
                if (R6 != null && (b0Var = R6.f23925s) != null && (c3Var = b0Var.f23806b) != null) {
                    java.util.LinkedList list4 = c3Var.getList(1);
                    kotlin.jvm.internal.o.f(list4, "getObject(...)");
                    java.util.Iterator it = list4.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        }
                        if (((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId() == resp.d().getLong(12)) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 >= 0) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("requestId=");
                        r45.kv0 kv0Var = (r45.kv0) resp.d().getCustom(4);
                        sb7.append(kv0Var != null ? java.lang.Long.valueOf(kv0Var.getLong(5)) : null);
                        sb7.append(" index=");
                        sb7.append(i19);
                        sb7.append(" feedId=");
                        sb7.append(pm0.v.u(resp.d().getLong(12)));
                        java.lang.String sb8 = sb7.toString();
                        com.tencent.mars.xlog.Log.e("Finder.TipBubbleInterceptor", "热门预拉取存在一条跟朋友气泡红点一样的feed. " + sb8);
                        pm0.z.b(xy2.b.f458155b, "", false, null, null, false, false, new fb2.b(sb8), 60, null);
                        if (d17 && (list3 = c3Var.getList(1)) != null) {
                        }
                    }
                }
                if (d17 && (list2 = resp.getList(1)) != null) {
                    list2.removeIf(new fb2.c(resp));
                }
            } else {
                resp.set(24, null);
            }
        } else if (i17 == 4) {
            if (d(u07, resp) && (list = resp.getList(1)) != null) {
                list.removeIf(new fb2.d(resp));
            }
            com.tencent.mars.xlog.Log.w("Finder.TipBubbleInterceptor", " pullType(" + i18 + ") invalid.");
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    public final boolean d(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, db2.c3 c3Var) {
        r45.xs2 xs2Var;
        r45.bz2 bz2Var;
        return (jbVar != null && (xs2Var = jbVar.N) != null && (bz2Var = (r45.bz2) xs2Var.getCustom(23)) != null && bz2Var.f371167d == 4) && c3Var.d().getLong(12) == jbVar.N.getLong(3);
    }
}
