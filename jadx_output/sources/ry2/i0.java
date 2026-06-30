package ry2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f401397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ry2.q0 q0Var, java.util.ArrayList arrayList) {
        super(0);
        this.f401396d = q0Var;
        this.f401397e = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String i17;
        android.graphics.Bitmap J2;
        android.graphics.Bitmap J3;
        ry2.q0 q0Var = this.f401396d;
        q0Var.f401458z.clear();
        java.util.ArrayList arrayList = q0Var.f401457y;
        if (arrayList != null) {
            int i18 = 0;
            for (java.lang.Object obj : arrayList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str = (java.lang.String) obj;
                com.tencent.mm.plugin.sight.base.b o17 = ry2.q0.o(q0Var, str);
                boolean z17 = i18 == 0;
                com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic showThumb:" + z17 + " index:" + i18);
                java.util.ArrayList arrayList2 = this.f401397e;
                if (arrayList2 == null || arrayList2.size() <= i18 || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) arrayList2.get(i18))) {
                    java.util.ArrayList arrayList3 = q0Var.A;
                    if (arrayList3.size() > i18 && arrayList3.get(i18) != null) {
                        java.lang.Object obj2 = arrayList3.get(i18);
                        kotlin.jvm.internal.o.d(obj2);
                        if (((r45.c07) ((r45.dd4) obj2).getCustom(6)) != null) {
                            com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic get thumb from cropInfoList");
                            mv2.q qVar = mv2.q.f331618a;
                            java.lang.Object obj3 = arrayList3.get(i18);
                            kotlin.jvm.internal.o.d(obj3);
                            r45.c07 c07Var = (r45.c07) ((r45.dd4) obj3).getCustom(6);
                            kotlin.jvm.internal.o.d(c07Var);
                            i17 = qVar.j(str, c07Var);
                        }
                    }
                    com.tencent.mars.xlog.Log.w("Finder.PostVideoWidget", "initNormalVideoLogic no thumb & no thumbRect");
                    i17 = mv2.q.f331618a.i(str);
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic get thumb from mediaThumbList");
                    i17 = (java.lang.String) arrayList2.get(i18);
                }
                pm0.v.X(new ry2.g0(q0Var));
                if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.D) && o17 != null) {
                    try {
                        r45.fp5 a17 = q0Var.P.a(str, o17.f162382a);
                        if (!android.text.TextUtils.isEmpty(a17.f374528d)) {
                            java.lang.String coverUrl = a17.f374528d;
                            kotlin.jvm.internal.o.f(coverUrl, "coverUrl");
                            q0Var.D = coverUrl;
                            java.lang.String fullCoverUrl = a17.f374529e;
                            kotlin.jvm.internal.o.f(fullCoverUrl, "fullCoverUrl");
                            q0Var.E = fullCoverUrl;
                            q0Var.G = q0Var.G;
                            java.lang.String shareCoverUrl = a17.f374536o;
                            kotlin.jvm.internal.o.f(shareCoverUrl, "shareCoverUrl");
                            q0Var.F = shareCoverUrl;
                            q0Var.L = a17;
                            pm0.v.X(new ry2.h0(q0Var));
                            com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic replace cover quality:" + q0Var.G + " path:" + q0Var.D);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.w("Finder.PostVideoWidget", "initNormalVideoLogic replace cover e:" + th6);
                    }
                }
                if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(q0Var.D) && com.tencent.mm.vfs.w6.j(q0Var.D) && (J3 = com.tencent.mm.sdk.platformtools.x.J(q0Var.D, null)) != null) {
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic use coverUrl");
                    q0Var.C = q0Var.D;
                    pm0.v.X(new ry2.l0(q0Var, J3));
                    z17 = false;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(i17) && (J2 = com.tencent.mm.sdk.platformtools.x.J(i17, null)) != null) {
                    q0Var.f401458z.add(i17);
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic add thumb file, index:" + i18);
                    if (z17) {
                        kotlin.jvm.internal.o.d(i17);
                        q0Var.C = i17;
                        pm0.v.X(new ry2.l0(q0Var, J2));
                    }
                }
                i18 = i19;
            }
        }
        return jz5.f0.f302826a;
    }
}
