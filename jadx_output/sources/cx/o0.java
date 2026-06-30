package cx;

/* loaded from: classes16.dex */
public final class o0 implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx.w0 f224449a;

    public o0(cx.w0 w0Var) {
        this.f224449a = w0Var;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        return new cx.i0(optJSONObject != null ? optJSONObject.optInt("left", -1) : -1, optJSONObject != null ? optJSONObject.optInt("top", -1) : -1, optJSONObject != null ? optJSONObject.optInt("width", -1) : -1, optJSONObject != null ? optJSONObject.optInt("height", -1) : -1, data.optInt("hide"));
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (f(view)) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            com.tencent.mm.flutter.plugin.proto.o builder = com.tencent.mm.flutter.plugin.proto.p.f68051g.toBuilder();
            java.lang.Object obj2 = view.f410944a;
            if (obj2 instanceof com.tencent.mm.flutter.plugin.proto.l) {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
                int i17 = ((com.tencent.mm.flutter.plugin.proto.l) obj2).f67997e;
                builder.f68027d |= 1;
                builder.f68028e = i17;
                builder.onChanged();
                h0Var.f310123d = "removeFrameSet";
            }
            this.f224449a.f224479x.n((java.lang.String) h0Var.f310123d, builder.build().toByteArray(), new cx.l0(callback, this, h0Var));
        }
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        cx.i0 viewAttribute = (cx.i0) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (f(view)) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            com.tencent.mm.flutter.plugin.proto.j0 builder = com.tencent.mm.flutter.plugin.proto.k0.f67989i.toBuilder();
            java.lang.Object obj3 = view.f410944a;
            if (obj3 instanceof com.tencent.mm.flutter.plugin.proto.l) {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
                int i17 = ((com.tencent.mm.flutter.plugin.proto.l) obj3).f67997e;
                builder.f67984d |= 1;
                builder.f67985e = i17;
                builder.onChanged();
                com.tencent.mm.flutter.plugin.proto.m0 i18 = com.tencent.mm.flutter.plugin.proto.n0.i();
                i18.h(mz5.b.c(viewAttribute.f224411a, new int[0]));
                i18.i(mz5.b.c(viewAttribute.f224412b, new int[0]));
                i18.j(mz5.b.c(viewAttribute.f224413c, new int[0]));
                i18.g(mz5.b.c(viewAttribute.f224414d, new int[0]));
                com.tencent.mm.flutter.plugin.proto.n0 build = i18.build();
                com.google.protobuf.t9 t9Var = builder.f67988h;
                if (t9Var == null) {
                    builder.f67987g = build;
                    builder.onChanged();
                } else {
                    t9Var.i(build);
                }
                int i19 = builder.f67984d | 4;
                builder.f67984d = i19;
                boolean z17 = viewAttribute.f224415e > 0;
                builder.f67984d = i19 | 2;
                builder.f67986f = z17;
                builder.onChanged();
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", ((java.lang.String) h0Var.f310123d) + " viewId:" + builder.f67985e + ",left:" + i18.f68015e + "top:" + i18.f68016f + "height:" + i18.f68018h + "width:" + i18.f68017g);
                h0Var.f310123d = "updateFrameSet";
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrandBaseBiz", "view.message is not a MagicSclBizApi.MBApiInsertFrameSet.Builder");
            }
            this.f224449a.f224479x.n((java.lang.String) h0Var.f310123d, builder.build().toByteArray(), new cx.m0(callback, this, h0Var));
        }
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        sp0.d view = (sp0.d) obj;
        kotlin.jvm.internal.o.g(view, "view");
        return new cx.n0();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        cx.i0 viewAttribute = (cx.i0) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (f(view)) {
            cx.w0 w0Var = this.f224449a;
            view.f410945b = new java.lang.ref.WeakReference(w0Var.f224479x);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            java.lang.Object obj3 = view.f410944a;
            if (!(obj3 instanceof com.tencent.mm.flutter.plugin.proto.l)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrandBaseBiz", "apiName invalid");
                return;
            }
            com.tencent.mm.flutter.plugin.proto.m0 i17 = com.tencent.mm.flutter.plugin.proto.n0.i();
            i17.h(viewAttribute.f224411a);
            i17.i(viewAttribute.f224412b);
            i17.j(viewAttribute.f224413c);
            i17.g(viewAttribute.f224414d);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
            com.tencent.mm.flutter.plugin.proto.l lVar = (com.tencent.mm.flutter.plugin.proto.l) obj3;
            com.tencent.mm.flutter.plugin.proto.n0 build = i17.build();
            com.google.protobuf.t9 t9Var = lVar.f68001i;
            if (t9Var == null) {
                lVar.f68000h = build;
                lVar.onChanged();
            } else {
                t9Var.i(build);
            }
            int i18 = lVar.f67996d | 8;
            lVar.f67996d = i18;
            boolean z17 = viewAttribute.f224415e > 0;
            lVar.f67996d = i18 | 16;
            lVar.f68002m = z17;
            lVar.onChanged();
            com.tencent.mm.flutter.plugin.proto.m build2 = lVar.build();
            h0Var.f310123d = "insertFrameSet";
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", ((java.lang.String) h0Var.f310123d) + " viewId:" + lVar.f67997e + ",left:" + lVar.e().f68022e + "top:" + lVar.e().f68023f + "height:" + lVar.e().f68025h + "width:" + lVar.e().f68024g);
            w0Var.f224479x.n((java.lang.String) h0Var.f310123d, build2.toByteArray(), new cx.k0(callback, this, h0Var));
        }
    }

    public final boolean f(sp0.d view) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object obj = view.f410944a;
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.l)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", "is not MBApiInsertFrameSet,no need to transfer flutter");
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
        com.tencent.mm.flutter.plugin.proto.l lVar = (com.tencent.mm.flutter.plugin.proto.l) obj;
        java.lang.Object obj2 = lVar.f67999g;
        if (obj2 instanceof java.lang.String) {
            str = (java.lang.String) obj2;
        } else {
            com.google.protobuf.y yVar = (com.google.protobuf.y) obj2;
            str = yVar.r();
            if (yVar.l()) {
                lVar.f67999g = str;
            }
        }
        return kotlin.jvm.internal.o.b(str, "popup");
    }

    public final lc3.z g(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (i17 == 0) {
            return lc3.x.f317934a;
        }
        return new lc3.z(4, "fail:internal errorflutterErrCode: " + i17 + ", flutterErrCode:" + errMsg);
    }
}
