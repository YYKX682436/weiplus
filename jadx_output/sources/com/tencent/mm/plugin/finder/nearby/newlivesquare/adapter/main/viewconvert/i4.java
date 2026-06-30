package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class i4 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.q f121727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 f121728e;

    public i4(vp2.q qVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var) {
        this.f121727d = qVar;
        this.f121728e = p4Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        java.lang.Class cls;
        java.lang.String str2;
        so2.j5 j5Var;
        java.lang.String str3;
        int i18;
        java.lang.String num;
        java.lang.String string;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i19 = i17 - a07;
        vp2.q qVar = this.f121727d;
        java.lang.Object obj = qVar.f438951e.get(i19);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var2 = (so2.j5) obj;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var = this.f121728e;
        r45.qt2 qt2Var = p4Var.f121886i;
        java.lang.String str4 = (qt2Var == null || (string = qt2Var.getString(2)) == null) ? "" : string;
        tp2.f fVar = p4Var.f121885h;
        if (fVar != null) {
            java.util.ArrayList arrayList = qVar.f438951e;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("main_page_position", "5");
            bundle.putInt("card_index", i19);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rq2.w wVar = (rq2.w) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rq2.w.class);
            if (wVar != null) {
                bundle.putLong("pull_liveid", wVar.f398910o);
                bundle.putString("pull_commentsence", wVar.f398911p);
            }
            str = "main_page_position";
            cls = rq2.w.class;
            str2 = "pull_liveid";
            j5Var = j5Var2;
            str3 = "pull_commentsence";
            i18 = i19;
            tp2.f.d(fVar, j5Var2, i17, i19, view, arrayList, str4, 0, bundle, this.f121727d, null, 0L, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null);
        } else {
            str = "main_page_position";
            cls = rq2.w.class;
            str2 = "pull_liveid";
            j5Var = j5Var2;
            str3 = "pull_commentsence";
            i18 = i19;
        }
        android.content.Context context2 = view.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null) {
            pf5.z zVar2 = pf5.z.f353948a;
            boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            rq2.w wVar2 = (rq2.w) zVar2.a(appCompatActivity).a(cls);
            if (wVar2 != null) {
                so2.j5 j5Var3 = j5Var;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3 : null;
                if (baseFinderFeed != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt(str2, java.lang.Long.valueOf(wVar2.f398910o));
                    jSONObject.putOpt(str3, wVar2.f398911p);
                    jSONObject.putOpt(str, 5);
                    ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                    long j17 = i18;
                    ml2.x1 x1Var = ml2.x1.f328207n;
                    if (!z17) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    java.lang.String str5 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    j0Var.sj(baseFinderFeed, j17, x1Var, str5, "", "", jSONObject2);
                }
            }
        }
    }
}
