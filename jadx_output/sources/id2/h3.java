package id2;

/* loaded from: classes2.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f290597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290599f;

    public h3(r45.lo1 lo1Var, id2.u3 u3Var, java.lang.String str) {
        this.f290597d = lo1Var;
        this.f290598e = u3Var;
        this.f290599f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick, title:");
        r45.lo1 lo1Var = this.f290597d;
        sb6.append(lo1Var.getString(1));
        sb6.append(", jumpInfo:");
        sb6.append((com.tencent.mm.protocal.protobuf.FinderJumpInfo) lo1Var.getCustom(0));
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", sb6.toString());
        r45.no1 no1Var = (r45.no1) lo1Var.getCustom(3);
        id2.u3 u3Var = this.f290598e;
        if (no1Var != null) {
            android.content.Intent intent = new android.content.Intent(u3Var.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI.class);
            r45.no1 no1Var2 = (r45.no1) lo1Var.getCustom(3);
            intent.putExtra("service", no1Var2 != null ? no1Var2.toByteArray() : null);
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, lo1Var.getString(1));
            u3Var.getIntent().addFlags(268435456);
            android.app.Activity context = u3Var.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String str2 = this.f290599f;
            int i17 = ((str2.length() > 0) && ll2.e.f319133a.h(str2)) ? 1 : 0;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lo1Var.getCustom(0);
            if (finderJumpInfo != null) {
                com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
                android.app.Activity context2 = u3Var.getContext();
                com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context2 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context2 : null;
                if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
                    str = "";
                }
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b17 = b52.b.b();
                ml2.u1 u1Var = ml2.u1.f328040e;
                a4Var.b(str, b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + lo1Var.getInteger(2) + "\";\"is_reddot\":\"" + i17 + "\"}");
                android.app.Activity context3 = u3Var.getContext();
                if (finderJumpInfo.getJumpinfo_type() == 6) {
                    com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
                    cl0.g gVar = new cl0.g();
                    gVar.o("isFromPersonalCenter", 1);
                    ll2.e.f319133a.k(context3 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context3 : null, "LivePersonalCenterLiveRecordEntryRight", new id2.w2(gVar));
                    sVar.d(kz5.b1.e(new jz5.l("nativeData", gVar)));
                    sVar.f144167d = new id2.z2(u3Var, sVar, context3);
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(context3, finderJumpInfo, sVar);
                } else {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    kotlin.jvm.internal.o.g(context3, "context");
                    xc2.y2 y2Var = xc2.y2.f453343a;
                    xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                    p0Var.f453252n = 0;
                    xc2.y2.i(y2Var, context3, p0Var, 0, null, 8, null);
                }
                if (lo1Var.getInteger(2) == 3) {
                    ll2.e eVar = ll2.e.f319133a;
                    ll2.e.d(eVar, "LivePersonalCenterLiveRecordEntryLeft", false, false, 6, null);
                    ll2.e.d(eVar, "LivePersonalCenterLiveRecordEntryRight", false, false, 6, null);
                }
                if (i17 > 0) {
                    ll2.e eVar2 = ll2.e.f319133a;
                    ll2.b[] bVarArr = ll2.b.f319128d;
                    java.lang.String valueOf = java.lang.String.valueOf(14);
                    ll2.a aVar = ll2.a.f319124e;
                    eVar2.n(valueOf, str2, 2, "");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
