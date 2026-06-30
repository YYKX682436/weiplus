package ni3;

/* loaded from: classes10.dex */
public final class x0 implements ek4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.a1 f337754a;

    public x0(ni3.a1 a1Var) {
        this.f337754a = a1Var;
    }

    @Override // ek4.a
    public void a(java.lang.String mediaId, int i17, dn.o task, dn.h hVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        if (i17 != 0) {
            return;
        }
        boolean z17 = hVar instanceof dn.c;
        ni3.a1 a1Var = this.f337754a;
        if (!z17) {
            if (!(hVar instanceof dn.b)) {
                com.tencent.mars.xlog.Log.e("FinderStreamVideoLoadStrategyMonitor", "onComplete invalid task appear mediaId:".concat(mediaId));
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a1Var.f337533i;
            java.util.ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (kotlin.jvm.internal.o.b(((ni3.v0) obj).f337747b, mediaId)) {
                        break;
                    }
                }
            }
            ni3.v0 v0Var = (ni3.v0) obj;
            if (v0Var == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOnlinePlayTaskComplete ");
            cs2.l lVar = task instanceof cs2.l ? (cs2.l) task : null;
            sb6.append(a1Var.e(lVar != null ? lVar.f222078e2 : -999, v0Var.f337746a));
            sb6.append(" stage:");
            sb6.append(v0Var.f337748c.f222095l2);
            com.tencent.mars.xlog.Log.w("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = a1Var.f337533i;
        java.util.ListIterator listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator2.previous();
                if (kotlin.jvm.internal.o.b(((ni3.v0) obj2).f337747b, mediaId)) {
                    break;
                }
            }
        }
        ni3.v0 v0Var2 = (ni3.v0) obj2;
        if (v0Var2 != null && (task instanceof cs2.p)) {
            cs2.p pVar = (cs2.p) task;
            cs2.n nVar = pVar.f222095l2;
            cs2.n nVar2 = cs2.n.f222080e;
            so2.j5 j5Var = v0Var2.f337746a;
            if (nVar == nVar2) {
                ni3.p0 f17 = a1Var.f(j5Var.getItemId());
                ni3.s0 s0Var = f17 != null ? f17.f337676g : null;
                if (s0Var != null) {
                    s0Var.f337732b = true;
                }
            } else if (nVar == cs2.n.f222081f) {
                ni3.p0 f18 = a1Var.f(j5Var.getItemId());
                ni3.s0 s0Var2 = f18 != null ? f18.f337677h : null;
                if (s0Var2 != null) {
                    s0Var2.f337732b = true;
                }
            }
            com.tencent.mars.xlog.Log.w("FinderStreamVideoLoadStrategyMonitor", "onPreloadComplete " + a1Var.e(pVar.f222094k2, j5Var) + " stage:" + v0Var2.f337748c.f222095l2);
        }
    }

    @Override // ek4.a
    public void b(java.lang.String mediaId, int i17, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (i17 == 0 || i17 == -21007 || i17 == -21008) {
            boolean z17 = hVar instanceof dn.c;
            java.lang.Object obj = null;
            ni3.a1 a1Var = this.f337754a;
            if (z17) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a1Var.f337533i;
                java.util.ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    java.lang.Object previous = listIterator.previous();
                    if (kotlin.jvm.internal.o.b(((ni3.v0) previous).f337747b, mediaId)) {
                        obj = previous;
                        break;
                    }
                }
                ni3.v0 v0Var = (ni3.v0) obj;
                if (v0Var == null) {
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreloadStop ");
                cs2.p pVar = v0Var.f337748c;
                sb6.append(a1Var.e(pVar.f222094k2, v0Var.f337746a));
                sb6.append(" stage:");
                sb6.append(pVar.f222095l2);
                com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
                return;
            }
            if (!(hVar instanceof dn.b)) {
                com.tencent.mars.xlog.Log.e("FinderStreamVideoLoadStrategyMonitor", "onStop invalid task appear mediaId:".concat(mediaId));
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = a1Var.f337533i;
            java.util.ListIterator listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                java.lang.Object previous2 = listIterator2.previous();
                if (kotlin.jvm.internal.o.b(((ni3.v0) previous2).f337747b, mediaId)) {
                    obj = previous2;
                    break;
                }
            }
            ni3.v0 v0Var2 = (ni3.v0) obj;
            if (v0Var2 == null) {
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onOnlinePlayTaskStop ");
            cs2.p pVar2 = v0Var2.f337748c;
            sb7.append(a1Var.e(pVar2.f222094k2, v0Var2.f337746a));
            sb7.append(" stage:");
            sb7.append(pVar2.f222095l2);
            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb7.toString());
        }
    }

    @Override // ek4.a
    public void c(java.lang.String mediaId, int i17, dn.o oVar) {
        so2.j5 j5Var;
        ni3.s0 s0Var;
        so2.j5 j5Var2;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (i17 != 0) {
            return;
        }
        boolean z17 = oVar instanceof cs2.p;
        java.lang.String str = null;
        ni3.a1 a1Var = this.f337754a;
        if (!z17) {
            if (!(oVar instanceof cs2.l)) {
                com.tencent.mars.xlog.Log.e("FinderStreamVideoLoadStrategyMonitor", "onStart invalid task appear mediaId:".concat(mediaId));
                return;
            }
            cs2.l lVar = (cs2.l) oVar;
            a1Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOnlinePlayTaskStart ");
            int i18 = lVar.f222078e2;
            ni3.p0 f17 = a1Var.f(lVar.f222077d2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (f17 != null && (j5Var = f17.f337670a) != null) {
                str = hc2.b0.d(j5Var, i18);
            }
            sb7.append(str);
            sb7.append(lVar.X1);
            sb6.append(sb7.toString());
            sb6.append('}');
            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
            return;
        }
        cs2.p pVar = (cs2.p) oVar;
        a1Var.getClass();
        ni3.p0 f18 = a1Var.f(pVar.f222089f2);
        if (f18 != null) {
            int i19 = pVar.f222094k2;
            ni3.o0 o0Var = f18.f337671b;
            o0Var.f337650d = i19;
            so2.j5 j5Var3 = f18.f337670a;
            o0Var.a(hc2.b0.h(j5Var3, false, 1, null));
            o0Var.f337652f = pVar.f222088e2.g();
            ni3.r0 r0Var = f18.f337672c;
            r0Var.getClass();
            java.lang.String str2 = pVar.f222092i2;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            r0Var.f337719a = str2;
            ni3.r0 r0Var2 = f18.f337672c;
            java.lang.String field_fullpath = pVar.field_fullpath;
            kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
            r0Var2.getClass();
            r0Var2.f337720b = field_fullpath;
            cs2.n nVar = pVar.f222095l2;
            if (nVar == cs2.n.f222080e) {
                ni3.s0 s0Var2 = f18.f337676g;
                s0Var2.f337731a = true;
                long j17 = pVar.f241805x;
                ni3.t0 t0Var = s0Var2.f337734d;
                t0Var.f337736a = j17;
                t0Var.f337737b = pVar.V1;
            } else if (nVar == cs2.n.f222081f && (s0Var = f18.f337677h) != null) {
                s0Var.f337731a = true;
                long j18 = pVar.f241805x;
                ni3.t0 t0Var2 = s0Var.f337734d;
                t0Var2.f337736a = j18;
                t0Var2.f337737b = pVar.V1;
            }
            a1Var.f337533i.add(new ni3.v0(j5Var3, mediaId, pVar));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onPreloadStart ");
            int i27 = pVar.f222094k2;
            ni3.p0 f19 = a1Var.f(pVar.f222089f2);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            if (f19 != null && (j5Var2 = f19.f337670a) != null) {
                str = hc2.b0.d(j5Var2, i27);
            }
            sb9.append(str);
            sb9.append(pVar.k());
            sb8.append(sb9.toString());
            sb8.append(" stage:");
            sb8.append(pVar.f222095l2);
            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb8.toString());
        }
    }

    @Override // ek4.a
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }
}
