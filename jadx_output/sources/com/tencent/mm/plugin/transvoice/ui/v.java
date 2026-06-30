package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes14.dex */
public final class v extends wm3.a implements wm3.m {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f175473d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f175474e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f175475f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f175476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f175473d = jz5.h.b(new com.tencent.mm.plugin.transvoice.ui.u(activity));
        this.f175474e = jz5.h.b(new com.tencent.mm.plugin.transvoice.ui.s(activity));
        this.f175475f = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enb;
    }

    @Override // wm3.m
    public boolean i() {
        return !(this.f175476g != null ? r0.canScrollVertically(-1) : true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] strArr;
        java.lang.String[] stringArray;
        java.lang.String[] stringArray2;
        int i17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
        if (baseMvvmActivity != null) {
            baseMvvmActivity.setMMTitle(baseMvvmActivity.getString(com.tencent.mm.R.string.f493850pc4));
            baseMvvmActivity.setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
            baseMvvmActivity.setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
            ul5.k bounceView = baseMvvmActivity.getBounceView();
            if (bounceView != null) {
                bounceView.setBounceEnabled(false);
            }
            if (fp.h.c(23)) {
                int e17 = com.tencent.mm.ui.zk.e(getActivity(), com.tencent.mm.R.dimen.f479704cz);
                baseMvvmActivity.getController().Q0(com.tencent.mm.ui.uk.c(getActivity(), com.tencent.mm.R.raw.icons_outlined_arrow_down, getResources().getColor(com.tencent.mm.R.color.FG_0), getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5), e17, 0.5f * e17));
            }
            baseMvvmActivity.setBackBtn(new com.tencent.mm.plugin.transvoice.ui.t(this));
        }
        if (com.tencent.mm.sdk.platformtools.x9.c()) {
            strArr = com.tencent.mm.sdk.platformtools.l2.f192819b;
            stringArray = getActivity().getResources().getStringArray(com.tencent.mm.R.array.f478009bg);
            stringArray2 = getActivity().getResources().getStringArray(com.tencent.mm.R.array.f478008w);
        } else {
            strArr = com.tencent.mm.sdk.platformtools.l2.f192820c;
            stringArray = getActivity().getResources().getStringArray(com.tencent.mm.R.array.f478032bi);
            stringArray2 = getActivity().getResources().getStringArray(com.tencent.mm.R.array.f478031bh);
        }
        java.util.ArrayList arrayList = this.f175475f;
        if (stringArray == null || stringArray2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectLanguageUIC", "Language arrays are null");
        } else if (strArr.length == stringArray.length && strArr.length == stringArray2.length) {
            int length = strArr.length;
            for (0; i17 < length; i17 + 1) {
                com.tencent.mm.plugin.transvoice.ui.o oVar = new com.tencent.mm.plugin.transvoice.ui.o();
                java.lang.String str = stringArray[i17];
                if (str == null) {
                    str = "";
                }
                oVar.f175448a = str;
                java.lang.String str2 = stringArray2[i17];
                if (str2 == null) {
                    str2 = "";
                }
                oVar.f175449b = str2;
                java.lang.String str3 = strArr[i17];
                if (str3 == null) {
                    str3 = "";
                }
                oVar.f175450c = str3;
                if (com.tencent.mm.sdk.platformtools.m2.k(str3)) {
                    java.lang.String str4 = (java.lang.String) ((jz5.n) this.f175474e).getValue();
                    if (str4 == null) {
                        str4 = "";
                    }
                    oVar.f175448a = str4;
                    oVar.f175449b = "";
                }
                if (oVar.f175448a.length() == 0) {
                    i17 = oVar.f175449b.length() == 0 ? i17 + 1 : 0;
                }
                if (oVar.f175448a.equals(oVar.f175449b)) {
                    oVar.f175449b = "";
                }
                java.lang.String str5 = (java.lang.String) ((jz5.n) this.f175473d).getValue();
                if (str5 != null && str5.equals(oVar.f175448a)) {
                    oVar.f175451d = true;
                } else {
                    oVar.f175451d = false;
                }
                if (i17 == 1) {
                    oVar.f175452e = true;
                }
                if (i17 == strArr.length - 1) {
                    oVar.f175453f = true;
                }
                arrayList.add(new com.tencent.mm.plugin.transvoice.ui.p(this, i17, oVar));
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("languageCodes not paired with languageNames, languageCodes: ");
            java.lang.String arrays = java.util.Arrays.toString(strArr);
            kotlin.jvm.internal.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            sb6.append(", languageNames: ");
            java.lang.String arrays2 = java.util.Arrays.toString(stringArray);
            kotlin.jvm.internal.o.f(arrays2, "toString(...)");
            sb6.append(arrays2);
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectLanguageUIC", sb6.toString());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.u8o);
        this.f175476g = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity(), 1, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f175476g;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.transvoice.ui.SelectLanguageUIC$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type == 1 ? new com.tencent.mm.plugin.transvoice.ui.n(com.tencent.mm.plugin.transvoice.ui.v.this) : new com.tencent.mm.plugin.transvoice.ui.r(com.tencent.mm.plugin.transvoice.ui.v.this);
                }
            }, arrayList, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f175476g;
        if (wxRecyclerView3 == null) {
            return;
        }
        wxRecyclerView3.setClipToPadding(false);
    }
}
