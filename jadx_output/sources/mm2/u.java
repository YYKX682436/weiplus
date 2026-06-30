package mm2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f329441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f329442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mm2.w wVar, long j17) {
        super(0);
        this.f329441d = wVar;
        this.f329442e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        java.lang.Object obj2;
        mn0.b0 b0Var;
        mm2.w wVar = this.f329441d;
        wVar.getClass();
        long j17 = this.f329442e;
        if (j17 > 0) {
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            tn0.w0 w0Var = dk2.ef.f233378d;
            co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
            if (sVar != null && (b0Var = sVar.R1.f282409a) != null) {
                mn0.c0 listener = wVar.f329507s;
                mn0.y yVar = (mn0.y) b0Var;
                kotlin.jvm.internal.o.g(listener, "listener");
                if (!yVar.f329808g.contains(listener)) {
                    yVar.a(listener);
                }
            }
            mm2.i iVar = wVar.f329500i;
            if (iVar == mm2.i.f329127e || iVar == mm2.i.f329129g) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((mm2.w) wVar.business(mm2.w.class)).f329498g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((mm2.j) next).f329149a == mm2.l.f329203d) {
                        arrayList.add(next);
                    }
                }
                for (java.util.Iterator it6 = arrayList.iterator(); it6.hasNext(); it6 = it6) {
                    mm2.j jVar = (mm2.j) it6.next();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPlayInLivingInMiniMode id:");
                    sb6.append(jVar.f329150b.getString(0));
                    sb6.append(" diff:");
                    r45.ce2 ce2Var = jVar.f329150b;
                    sb6.append(ce2Var.getLong(1) - j17);
                    sb6.append(" state:");
                    sb6.append(jVar.f329149a);
                    sb6.append(" anchorT:");
                    sb6.append(j17);
                    sb6.append(" statT:");
                    sb6.append(ce2Var.getLong(1));
                    com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", sb6.toString());
                }
                java.util.Iterator it7 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    mm2.j jVar2 = (mm2.j) obj;
                    long j18 = jVar2.f329150b.getLong(1);
                    r45.ce2 ce2Var2 = jVar2.f329150b;
                    if (j17 > ce2Var2.getLong(1) && (j18 + ce2Var2.getLong(2)) - j17 > 5000 && jVar2.f329149a == mm2.l.f329203d) {
                        break;
                    }
                }
                mm2.j jVar3 = (mm2.j) obj;
                if (jVar3 != null) {
                    r45.ce2 ce2Var3 = jVar3.f329150b;
                    long j19 = (ce2Var3.getLong(1) + ce2Var3.getLong(2)) - j17;
                    long j27 = ce2Var3.getLong(2) - j19;
                    com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "startPlayLivingAdVideoInMiniMode id:" + ce2Var3.getString(0) + " left" + j19 + "  startPos:" + j27 + " duration:" + ce2Var3.getLong(2));
                    mm2.h hVar = wVar.f329504p;
                    if (hVar != null && hVar.getPlayer().isPlaying()) {
                        com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for playing.");
                    } else {
                        fo0.c cVar = fo0.c.f264798a;
                        if (((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d.f93054o.f93069d) {
                            java.lang.String string = ce2Var3.getString(3);
                            if (string == null) {
                                string = "";
                            }
                            if (string.length() == 0) {
                                com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for url:".concat(string));
                            } else {
                                java.lang.String string2 = ce2Var3.getString(0);
                                wVar.f329502n = string2 != null ? string2 : "";
                                com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "loadLivingVideoInMiniMode start play startPositionMs:" + j27 + " duration:" + ce2Var3.getLong(2) + " url:" + string);
                                if (wVar.f329504p == null) {
                                    mm2.w wVar2 = (mm2.w) wVar.business(mm2.w.class);
                                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                                    wVar2.f329504p = new mm2.h(context);
                                }
                                mm2.h hVar2 = wVar.f329504p;
                                if (hVar2 != null ? hVar2.u(ce2Var3, j27, new mm2.t(wVar, ce2Var3)) : false) {
                                    com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "handleOnMiniVideoViewStart liveAdId:" + ce2Var3.getString(0));
                                    ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                                    tn0.w0 w0Var2 = dk2.ef.f233378d;
                                    co0.s sVar2 = w0Var2 instanceof co0.s ? (co0.s) w0Var2 : null;
                                    if (sVar2 != null) {
                                        sVar2.f1(true);
                                    }
                                    wVar.f329503o.setValue(mm2.f.f329016g);
                                    jVar3.f329149a = mm2.l.f329204e;
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for isBallPlaying is false.");
                        }
                    }
                } else {
                    java.util.Iterator it8 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        java.lang.Object next2 = it8.next();
                        mm2.j jVar4 = (mm2.j) next2;
                        long j28 = jVar4.f329150b.getLong(1) - j17;
                        if (((1000L > j28 ? 1 : (1000L == j28 ? 0 : -1)) <= 0 && (j28 > 5001L ? 1 : (j28 == 5001L ? 0 : -1)) < 0) && jVar4.f329149a == mm2.l.f329203d) {
                            obj2 = next2;
                            break;
                        }
                    }
                    mm2.j jVar5 = (mm2.j) obj2;
                    if (jVar5 != null) {
                        r45.ce2 ce2Var4 = jVar5.f329150b;
                        com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "startPlayAnimationInMiniMode id:" + ce2Var4.getString(0) + " animationDurationMs:" + (ce2Var4.getLong(1) - j17));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
