package yr3;

/* loaded from: classes11.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final int f464928d;

    /* renamed from: e, reason: collision with root package name */
    public yr3.f f464929e;

    /* renamed from: f, reason: collision with root package name */
    public final int f464930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yr3.o f464931g;

    public m(yr3.o oVar, int i17, sr3.g config) {
        int i18;
        kotlin.jvm.internal.o.g(config, "config");
        this.f464931g = oVar;
        this.f464928d = i17;
        int ordinal = config.g().ordinal();
        if (ordinal == 0) {
            i18 = 0;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i18 = 5;
        }
        this.f464930f = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem item, int i17) {
        r45.s5 s5Var;
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        r45.o5 o5Var;
        r45.o5 o5Var2;
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher;
        r45.s5 s5Var2;
        r45.p5 p5Var2;
        r45.l5 l5Var;
        r45.o5 o5Var3;
        r45.o5 o5Var4;
        r45.o5 o5Var5;
        kotlin.jvm.internal.o.g(item, "item");
        if (this.f464929e == null) {
            com.tencent.mars.xlog.Log.e("FeatureMsgUtil", "context item select failed, null dataTag");
            return;
        }
        int itemId = item.getItemId();
        gr3.b bVar = gr3.b.f274847a;
        java.lang.String str = null;
        r5 = null;
        java.lang.String str2 = null;
        r5 = null;
        java.lang.String str3 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        yr3.o oVar = this.f464931g;
        if (itemId != 100) {
            if (itemId == 122) {
                yr3.f fVar = this.f464929e;
                if (fVar != null && (o5Var3 = fVar.f464803b) != null) {
                    str3 = o5Var3.Z;
                }
                ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).Bi(oVar.f464961d, str3 != null ? str3 : "", 2);
                gr3.b.d(bVar, this.f464929e, 104L, this.f464928d, this.f464930f, 0, 16, null);
            } else if (itemId == 172) {
                yr3.f fVar2 = this.f464929e;
                if ((fVar2 != null ? fVar2.f464803b : null) == null) {
                    com.tencent.mars.xlog.Log.e("FeatureMsgUtil", "dataTag is null, return");
                    return;
                }
                kotlin.jvm.internal.o.d(fVar2);
                int i18 = fVar2.f464803b.f381934x0;
                wr3.p0[] p0VarArr = wr3.p0.f448866d;
                if (i18 == 2) {
                    android.content.Context context = oVar.f464961d;
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = context.getString(com.tencent.mm.R.string.nam);
                    e4Var.c();
                    return;
                }
                yr3.f fVar3 = this.f464929e;
                kotlin.jvm.internal.o.d(fVar3);
                int i27 = fVar3.f464803b.f381934x0;
                wr3.p0[] p0VarArr2 = wr3.p0.f448866d;
                if (i27 == 1) {
                    android.content.Context context2 = oVar.f464961d;
                    int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                    e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.nan);
                    e4Var2.c();
                    return;
                }
                yr3.f fVar4 = this.f464929e;
                kotlin.jvm.internal.o.d(fVar4);
                int i29 = fVar4.f464803b.f381937y0;
                wr3.q0[] q0VarArr = wr3.q0.f448869d;
                if (i29 == 1) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modify showApp, path is:");
                    yr3.f fVar5 = this.f464929e;
                    sb6.append((fVar5 == null || (o5Var5 = fVar5.f464803b) == null) ? null : o5Var5.f381925p1);
                    com.tencent.mars.xlog.Log.i("FeatureMsgUtil", sb6.toString());
                    yr3.f fVar6 = this.f464929e;
                    if (fVar6 != null && (o5Var4 = fVar6.f464803b) != null) {
                        str2 = o5Var4.f381925p1;
                    }
                    ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).Bi(oVar.f464961d, str2 != null ? str2 : "", 3);
                } else {
                    yr3.f fVar7 = this.f464929e;
                    kotlin.jvm.internal.o.d(fVar7);
                    int i37 = fVar7.f464803b.f381937y0;
                    wr3.q0[] q0VarArr2 = wr3.q0.f448869d;
                    if (i37 == 2) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("modify jumpWxa, path is:");
                        yr3.f fVar8 = this.f464929e;
                        kotlin.jvm.internal.o.d(fVar8);
                        sb7.append(fVar8.f464803b.f381919l1);
                        com.tencent.mars.xlog.Log.i("FeatureMsgUtil", sb7.toString());
                        yr3.f fVar9 = this.f464929e;
                        kotlin.jvm.internal.o.d(fVar9);
                        ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Ni(new yr3.l(oVar, this, fVar9.f464805d == sr3.a.f411829e ? ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Bi() : ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Di()));
                    } else {
                        com.tencent.mars.xlog.Log.e("FeatureMsgUtil", "invalid modify type");
                    }
                }
            }
        } else {
            yr3.f fVar10 = this.f464929e;
            int i38 = 0;
            if ((fVar10 != null ? fVar10.f464804c : null) != wr3.n0.f448842f) {
                if ((fVar10 != null ? fVar10.f464804c : null) != wr3.n0.f448845i) {
                    if ((fVar10 != null ? fVar10.f464804c : null) != wr3.n0.f448846m) {
                        if ((fVar10 != null ? fVar10.f464804c : null) == wr3.n0.f448844h) {
                            com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "sending item delete");
                            android.content.Context context3 = oVar.f464961d;
                            oVar.getClass();
                            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context3);
                            u1Var.u(context3.getString(com.tencent.mm.R.string.nau));
                            u1Var.m(com.tencent.mm.R.string.azi);
                            u1Var.k(context3.getResources().getColor(com.tencent.mm.R.color.f478832g7));
                            u1Var.l(yr3.n.f464953a);
                            u1Var.q(false);
                        } else {
                            if ((fVar10 != null ? fVar10.f464804c : null) == wr3.n0.f448843g) {
                                com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "failed item delete");
                                com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
                                yr3.f fVar11 = this.f464929e;
                                if (fVar11 != null && (s5Var2 = fVar11.f464802a) != null && (p5Var2 = s5Var2.f385514i) != null && (l5Var = p5Var2.f382753d) != null) {
                                    i38 = l5Var.f379138d;
                                }
                                sVar.wi(i38);
                                java.lang.ref.WeakReference weakReference = yr3.w.f465060b;
                                if (weakReference != null && (bizProfileDataFetcher = (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher) weakReference.get()) != null) {
                                    bizProfileDataFetcher.j();
                                }
                            } else {
                                com.tencent.mars.xlog.Log.w("FeatureMsgUtil", "unknown item delete");
                            }
                        }
                        gr3.b.d(bVar, this.f464929e, 103L, this.f464928d, this.f464930f, 0, 16, null);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "success item delete");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(oVar.f464961d, 1, true);
            k0Var.f211872n = new yr3.h(oVar);
            k0Var.f211881s = new yr3.k(oVar, this);
            yr3.f fVar12 = this.f464929e;
            int i39 = (fVar12 == null || (o5Var2 = fVar12.f464803b) == null) ? -1 : o5Var2.f381916g;
            java.lang.String str4 = (fVar12 == null || (o5Var = fVar12.f464803b) == null) ? null : o5Var.f381913d;
            if (str4 == null) {
                if (i39 != -1) {
                    if (fVar12 != null && (s5Var = fVar12.f464802a) != null && (p5Var = s5Var.f385514i) != null && (linkedList = p5Var.f382754e) != null) {
                        java.util.Iterator it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if ((((r45.o5) obj).f381916g == i39) != false) {
                                    break;
                                }
                            }
                        }
                        r45.o5 o5Var6 = (r45.o5) obj;
                        if (o5Var6 != null) {
                            str = o5Var6.f381913d;
                        }
                    }
                    if (str == null) {
                        str4 = oVar.f464961d.getString(com.tencent.mm.R.string.f490945na3);
                        kotlin.jvm.internal.o.f(str4, "getString(...)");
                    } else {
                        str4 = str;
                    }
                } else {
                    str4 = oVar.f464961d.getString(com.tencent.mm.R.string.f490945na3);
                    kotlin.jvm.internal.o.d(str4);
                }
            }
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\r\n]+");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(str4).replaceAll(" ");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            if (replaceAll.length() > 12) {
                java.lang.String substring = replaceAll.substring(0, 12);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                replaceAll = substring.concat("...");
            }
            java.lang.String string = oVar.f464961d.getString(com.tencent.mm.R.string.f490944na2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{replaceAll}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            k0Var.q(format, 17);
            k0Var.v();
            gr3.b.d(bVar, this.f464929e, 103L, this.f464928d, this.f464930f, 0, 16, null);
        }
        item.getItemId();
        oVar.getClass();
        oVar.getClass();
    }
}
