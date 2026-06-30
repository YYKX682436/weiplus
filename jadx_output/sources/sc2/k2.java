package sc2;

/* loaded from: classes2.dex */
public final class k2 extends sc2.d6 {
    public static final java.lang.Object D = new java.lang.Object();
    public final java.lang.String C = "FeedDynamicCarouseCardJumperObserver";

    @Override // ad2.h
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        java.lang.String str;
        java.lang.Object obj;
        r45.bg0 bg0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.A(holder, jumpView, infoEx);
        sc2.q8 q8Var = infoEx.f453233J;
        int i17 = q8Var != null ? q8Var.f406179c : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoFinish: jumperState=");
        sb6.append(i17);
        sb6.append(", jumpId=");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        sb6.append(finderJumpInfo.getJump_id());
        sb6.append(", feedId=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
        sb6.append(pm0.v.u(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0L));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.C;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        int i18 = 2;
        if (i17 == 2 || (baseFinderFeed = infoEx.f453244f) == null || (str = infoEx.f453247i) == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(i18) == 24) {
                break;
            } else {
                i18 = 2;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (bg0Var = (r45.bg0) wf6Var.getCustom(32)) == null) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("tryFinishExpand: finish_change=");
        sb8.append(bg0Var.getInteger(3));
        sb8.append(", jumpId=");
        sb8.append(finderJumpInfo.getJump_id());
        sb8.append(", feedId=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = infoEx.f453244f;
        sb8.append(pm0.v.u(baseFinderFeed3 != null ? baseFinderFeed3.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(str2, sb8.toString());
        if (bg0Var.getInteger(3) > 0) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
            com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(D);
            }
            I(baseFinderFeed, holder, jumpView, infoEx, str, M(infoEx), true);
            G(jumpView, P(infoEx), M(infoEx));
            Y(holder, jumpView, "tryFinishExpand");
            xc2.z2 z2Var = this.f3151o;
            xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
            if (bVar == null || infoEx.f453261w != 0 || bVar.f453069m <= 0) {
                return;
            }
            infoEx.f453261w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f453069m) / 1000);
        }
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        java.lang.String str;
        java.lang.Object obj;
        r45.bg0 bg0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
        sc2.q8 q8Var = infoEx.f453233J;
        int i17 = q8Var != null ? q8Var.f406179c : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRealShow: jumperState=");
        sb6.append(i17);
        sb6.append(", jumpId=");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        sb6.append(finderJumpInfo.getJump_id());
        sb6.append(", feedId=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.C;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (i17 != 2) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
            if (baseFinderFeed2 == null || (str = infoEx.f453247i) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).getInteger(2) == 24) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null && (bg0Var = (r45.bg0) wf6Var.getCustom(32)) != null) {
                long integer = bg0Var.getInteger(2) * 1000;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("tryDelayExpand: delayExpandMs=");
                sb8.append(integer);
                sb8.append(", jumpId=");
                sb8.append(finderJumpInfo.getJump_id());
                sb8.append(", feedId=");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = infoEx.f453244f;
                sb8.append(pm0.v.u(baseFinderFeed3 != null ? baseFinderFeed3.getItemId() : 0L));
                com.tencent.mars.xlog.Log.i(str2, sb8.toString());
                if (integer > 0) {
                    android.content.Context context = holder.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
                    com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() + integer;
                    java.lang.Object obj2 = D;
                    if (n3Var != null) {
                        n3Var.removeCallbacksAndMessages(obj2);
                    }
                    if (n3Var != null) {
                        n3Var.postAtTime(new sc2.j2(this, baseFinderFeed2, holder, jumpView, infoEx, str), obj2, uptimeMillis);
                    }
                }
            }
        }
        xc2.z2 z2Var = this.f3151o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || infoEx.f453260v != 0 || bVar.f453069m <= 0) {
            return;
        }
        infoEx.f453260v = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f453069m) / 1000);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.C;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        r45.i55 P = P(infoEx);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(P != null ? P.getString(1) : null)) {
            r45.i55 M = M(infoEx);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(M != null ? M.getString(1) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // sc2.d6, ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.Object obj = holder.f293125i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        android.content.Context context = holder.f293121e;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (j5Var != null) {
            long itemId = j5Var.getItemId();
            if (finderJumpInfo.getBusiness_type() == 2) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
                if (finderDescPanelUIC != null) {
                    finderDescPanelUIC.d7(itemId, 128);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeType: ");
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
        sb6.append(native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null);
        com.tencent.mars.xlog.Log.i(this.C, sb6.toString());
        com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = finderJumpInfo.getNative_info();
        boolean z17 = false;
        if (native_info2 != null && native_info2.getNative_type() == 14) {
            z17 = true;
        }
        if (z17) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            so2.o2.f410517f.a().g(this.f3145f, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, so2.h2.f410389i);
        }
        sc2.q8 q8Var = infoEx.f453233J;
        if ((q8Var != null ? q8Var.f406179c : 1) == 2) {
            I(feed, holder, jumpView, infoEx, source, M(infoEx), false);
        } else {
            J(feed, holder, jumpView, infoEx, P(infoEx), source);
        }
    }

    @Override // ad2.h
    public void u(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.u(z17, holder, jumpView, infoEx);
        if (z17) {
            if (((java.lang.Number) ae2.in.f3688a.u().r()).intValue() == 1) {
                com.tencent.mm.protocal.protobuf.NativeInfo native_info = infoEx.f453234a.getNative_info();
                if (!(native_info != null && native_info.getNative_type() == 14) || (baseFinderFeed = infoEx.f453244f) == null) {
                    return;
                }
                so2.k2 k2Var = so2.o2.f410517f;
                so2.o2 a17 = k2Var.a();
                so2.o2 a18 = k2Var.a();
                long id6 = baseFinderFeed.getFeedObject().getId();
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                a17.h(0, a18.c(id6, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n), null, null, jumpView);
            }
        }
    }
}
