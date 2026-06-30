package g10;

@j95.b
/* loaded from: classes7.dex */
public final class v extends i95.w implements c00.i4 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f267552d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f267553e;

    public v() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f267552d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f267553e = jz5.h.b(g10.r.f267546d);
    }

    public static final java.lang.Object wi(g10.v vVar, bw5.s7 s7Var, kotlin.coroutines.Continuation continuation) {
        vVar.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        if (s7Var != null) {
            java.lang.String b17 = s7Var.b();
            if (!(b17 == null || b17.length() == 0)) {
                java.lang.String b18 = s7Var.b();
                com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
                qVar.c("ilinkres_4274070d");
                java.util.LinkedList linkedList = qVar.f217548e;
                if (linkedList != null) {
                    linkedList.add(b18);
                }
                java.util.LinkedList linkedList2 = qVar.f217549f;
                if (linkedList2 != null) {
                    ea5.l wi6 = ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).wi("ilinkres_4274070d");
                    java.util.RandomAccess parameter = wi6 != null ? wi6.getParameter() : null;
                    if (parameter == null) {
                        parameter = kz5.p0.f313996d;
                    }
                    linkedList2.addAll(parameter);
                }
                ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new g10.s(vVar, s7Var, nVar));
                java.lang.Object a17 = nVar.a();
                pz5.a aVar = pz5.a.f359186d;
                return a17;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "updateLatestBizUdrPkg, jumpInfo is invalid");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        java.lang.Object a172 = nVar.a();
        pz5.a aVar2 = pz5.a.f359186d;
        return a172;
    }

    public void Ai(bw5.x7 x7Var) {
        if (x7Var != null && x7Var.e() != null) {
            java.lang.String b17 = x7Var.e().b();
            if (!(b17 == null || b17.length() == 0)) {
                java.lang.String b18 = x7Var.e().b();
                int i17 = x7Var.e().f32836r;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, bizName = " + b18 + ", bizPreloadType = " + i17);
                if (i17 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, bizPreloadType is None");
                    return;
                } else {
                    pm0.v.X(new g10.m(b18, x7Var, i17));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, jumpInfo is invalid");
    }

    public final n10.o Bi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (kotlin.jvm.internal.o.b(str, "MagicEcsNirvanaGift")) {
            return new l10.a();
        }
        if (kotlin.jvm.internal.o.b(str, "MagicEcsShopHome")) {
            return new j10.a();
        }
        if (jc3.u0.f298996a.a(str)) {
            return new n10.o(str);
        }
        return null;
    }

    public java.util.List Di(java.lang.String str) {
        n10.o Bi = Bi(str);
        kz5.p0 p0Var = kz5.p0.f313996d;
        return Bi != null ? kz5.n0.t0(kz5.c0.i(new rd3.k(), new rd3.j(), new sd3.c(), new rd3.e(), new sd3.b(), new vd3.f(), new vd3.d(), new ce3.a(Bi.f334046a), new n10.a(), new md3.l(), new n10.m(), new n10.i(), new md3.t(), new n10.b(), new n10.c(), new n10.n(), new n10.e(), new n10.f(), new n10.j()), p0Var) : p0Var;
    }

    public final boolean Ni(bw5.s7 s7Var) {
        java.lang.Object obj;
        if (s7Var != null) {
            java.lang.String b17 = s7Var.b();
            if (!(b17 == null || b17.length() == 0)) {
                java.lang.String b18 = s7Var.b();
                if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsCloseMbFeatureListCheck", 0) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, close feature list check");
                    return true;
                }
                com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
                kotlin.jvm.internal.o.d(b18);
                com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_4274070d", b18);
                if (Ui == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, resource is null");
                    return false;
                }
                java.util.LinkedList linkedList = Ui.f217606x;
                java.lang.String str = null;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.wechat.aff.udr.u) obj).getKey(), "mbapp_ecs_ext")) {
                            break;
                        }
                    }
                    com.tencent.wechat.aff.udr.u uVar = (com.tencent.wechat.aff.udr.u) obj;
                    if (uVar != null) {
                        str = uVar.getValue();
                    }
                }
                if (str == null || str.length() == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, udr not include feature list info, return false");
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, featureListValue: " + str);
                java.util.Map a17 = d00.b.f225252a.a(str);
                kotlin.jvm.internal.o.f(s7Var.f32834p, "getFeatureList(...)");
                return !new d00.a(r9).a(a17).booleanValue();
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, jumpInfo is invalid");
        return false;
    }

    public void Ri(java.lang.String url) {
        java.lang.Integer h17;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: local url debug use: ".concat(url));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        g10.u uVar = new g10.u(this);
        try {
            android.net.Uri parse = android.net.Uri.parse(url);
            kotlin.jvm.internal.o.f(parse, "parse(...)");
            if (!kotlin.jvm.internal.o.b(parse.getScheme(), "nirvana")) {
                uVar.a("不支持的二维码格式: ".concat(url));
                return;
            }
            java.lang.String host = parse.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode != -703657114) {
                    if (hashCode == 2015743394 && host.equals("fast-debug")) {
                        if (kotlin.jvm.internal.o.b(parse.getQueryParameter("command"), "cancel")) {
                            java.lang.String bizName = parse.getQueryParameter("biz");
                            if (bizName == null || bizName.length() == 0) {
                                uVar.a("二维码缺少 biz 参数");
                                return;
                            }
                            java.lang.String o17 = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(context.getCacheDir(), "nirvana_local_preview"), bizName + ".wspkg").o();
                            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                            if (com.tencent.mm.vfs.w6.j(o17)) {
                                com.tencent.mm.vfs.w6.h(o17);
                            }
                            kotlin.jvm.internal.o.g(bizName, "bizName");
                            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: on clear debug pkg for bizName: ".concat(bizName));
                            ((ku5.t0) ku5.t0.f312615d).g(new g10.p(bizName));
                            return;
                        }
                        java.lang.String queryParameter = parse.getQueryParameter(dm.i4.COL_ID);
                        java.lang.String queryParameter2 = parse.getQueryParameter("server");
                        if (!(queryParameter == null || queryParameter.length() == 0)) {
                            if (!(queryParameter2 == null || queryParameter2.length() == 0)) {
                                java.lang.String decode = android.net.Uri.decode(queryParameter2);
                                ((ku5.t0) ku5.t0.f312615d).g(new k10.b(decode + "/meta/" + queryParameter, uVar, context, decode + "/download/" + queryParameter));
                                return;
                            }
                        }
                        uVar.a("二维码缺少必要参数 (id/server)");
                        return;
                    }
                } else if (host.equals("local-preview")) {
                    java.lang.String queryParameter3 = parse.getQueryParameter("host");
                    java.lang.String queryParameter4 = parse.getQueryParameter("port");
                    int intValue = (queryParameter4 == null || (h17 = r26.h0.h(queryParameter4)) == null) ? 8964 : h17.intValue();
                    if (queryParameter3 == null || queryParameter3.length() == 0) {
                        uVar.a("二维码缺少 host 参数");
                        return;
                    }
                    ((ku5.t0) ku5.t0.f312615d).g(new k10.c("http://" + queryParameter3 + ':' + intValue, uVar, context));
                    return;
                }
            }
            uVar.a("不支持的二维码类型: " + parse.getHost());
        } catch (java.lang.Exception e17) {
            uVar.a("二维码内容解析失败: " + e17.getMessage());
        }
    }
}
