package um2;

/* loaded from: classes3.dex */
public final class j6 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f428848d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f428849e;

    public j6(um2.x5 pluginLayout, java.lang.String tag, gk2.e liveData) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f428848d = tag;
        this.f428849e = new java.lang.ref.WeakReference(pluginLayout);
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var;
        boolean z17;
        um2.x5 x5Var = (um2.x5) this.f428849e.get();
        if (x5Var == null) {
            com.tencent.mars.xlog.Log.i(this.f428848d, "VisitorTimerCallbackImpl onTimerExpired curPluginLayout is empty!");
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = x5Var.f429065q;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = x5Var.f429075t0;
        if (khVar != null && khVar.w0() == 0) {
            if (((mm2.c1) x5Var.c(mm2.c1.class)).f328782b4) {
                com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = x5Var.f429062p;
                if (!(nd0Var != null && nd0Var.w0() == 0)) {
                    return true;
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z18 = ((mm2.e1) x5Var.c(mm2.e1.class)).b7() && ((mm2.c1) x5Var.c(mm2.c1.class)).T1 > 0 && ((om2.l) x5Var.c(om2.l.class)).f346343h;
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (r4Var.f2(x5Var.f19609a)) {
                linkedList.add(new jz5.l(6, null));
            } else if (((mm2.e1) x5Var.c(mm2.e1.class)).t7()) {
                linkedList.add(new jz5.l(3, null));
            } else {
                jz5.l lVar = new jz5.l(2, null);
                jz5.l lVar2 = new jz5.l(3, null);
                jz5.l lVar3 = new jz5.l(4, null);
                linkedList.add(lVar);
                boolean z19 = ((mm2.o4) x5Var.c(mm2.o4.class)).z7() && ((mm2.c1) x5Var.c(mm2.c1.class)).R4;
                boolean z27 = ((mm2.c1) x5Var.c(mm2.c1.class)).T;
                boolean z28 = ((mm2.n0) x5Var.c(mm2.n0.class)).f329273r;
                if (((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) x5Var.c(mm2.g1.class)).f329078s).getValue()).f329586j || z27 || z28 || z19) {
                    linkedList.add(lVar2);
                }
                if (((mm2.c1) x5Var.c(mm2.c1.class)).f328862p3 && ((mm2.c1) x5Var.c(mm2.c1.class)).m7() && (((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) x5Var.c(mm2.g1.class)).f329078s).getValue()).f329586j || r4Var.F0(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r) > 0)) {
                    linkedList.add(lVar3);
                }
                if (z18) {
                    linkedList.add(new jz5.l(7, null));
                    if (linkedList.size() >= 4) {
                        linkedList.remove(lVar);
                    }
                }
                z17 = false;
                khVar.A1(linkedList, z17, z17);
            }
            z17 = false;
            khVar.A1(linkedList, z17, z17);
        }
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = x5Var.H;
        if ((v6Var2 != null && v6Var2.w0() == 0) && (v6Var = x5Var.H) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.u6(v6Var, ((mm2.c1) x5Var.c(mm2.c1.class)).J1));
        }
        if (ag0Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e30 e30Var = ag0Var.B;
            if (e30Var.f365323d.getVisibility() == 0) {
                long j17 = ((mm2.c1) ag0Var.P0(mm2.c1.class)).J1;
                e30Var.getClass();
                e30Var.f365323d.post(new com.tencent.mm.plugin.finder.live.widget.r20(e30Var, j17));
            }
        }
        if (((mm2.c1) x5Var.c(mm2.c1.class)).f328897v2 > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - ((mm2.c1) x5Var.c(mm2.c1.class)).f328897v2;
            if (elapsedRealtime >= km2.n.f309148q && ((mm2.c1) x5Var.c(mm2.c1.class)).a8()) {
                com.tencent.mars.xlog.Log.i(this.f428848d, "visitor join time:" + ((mm2.c1) x5Var.c(mm2.c1.class)).f328897v2 + ",watch live duration:" + elapsedRealtime + '!');
                ((mm2.c1) x5Var.c(mm2.c1.class)).K9(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                long j18 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
                am.ia iaVar = feedUpdateEvent.f54252g;
                iaVar.f6918a = j18;
                iaVar.f6919b = 21;
                feedUpdateEvent.e();
                return true;
            }
        }
        return true;
    }
}
