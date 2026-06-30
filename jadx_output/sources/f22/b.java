package f22;

/* loaded from: classes13.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f258960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f22.a f258961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, f22.a aVar) {
        super(1);
        this.f258960d = context;
        this.f258961e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        if (v75Var != null) {
            boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
            boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(v75Var.f387967g);
            f22.a aVar = this.f258961e;
            boolean z18 = z17 && n17 && !aVar.f364043w;
            android.content.Context context = this.f258960d;
            if (z18) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", v75Var.f387967g);
                boolean b17 = kotlin.jvm.internal.o.b(v75Var.f387967g, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(14, 2, b17 ? 33 : 32, intent);
                intent.putExtra("KEY_FINDER_SELF_FLAG", b17);
                if (aVar.f364046z || aVar.f364045y) {
                    intent.putExtra("key_enter_profile_tab", 10);
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("emoticonEnterScene", java.lang.Integer.valueOf(aVar.f364155a));
                linkedHashMap.put("needJumpToSingleEmoji", java.lang.Boolean.valueOf(aVar.f364045y));
                linkedHashMap.put("sdkRequestID", aVar.c());
                linkedHashMap.put("enterHasRedDot", java.lang.Integer.valueOf(aVar.A));
                intent.putExtra("key_biz_passthrough_info", new cl0.g(linkedHashMap).toString());
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.w(context, intent);
            } else {
                qk.w wVar = new qk.w(v75Var);
                java.lang.String str = aVar.f364028h;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                wVar.f364052g = str;
                wVar.f364155a = aVar.f364155a;
                java.lang.String str2 = aVar.f364029i;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                wVar.f364053h = str2;
                java.lang.String str3 = aVar.f364037q;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                wVar.f364054i = str3;
                java.lang.String str4 = aVar.f364038r;
                kotlin.jvm.internal.o.g(str4, "<set-?>");
                wVar.f364055j = str4;
                java.lang.String str5 = aVar.f364039s;
                kotlin.jvm.internal.o.g(str5, "<set-?>");
                wVar.f364056k = str5;
                java.lang.String str6 = aVar.f364040t;
                kotlin.jvm.internal.o.g(str6, "<set-?>");
                wVar.f364057l = str6;
                java.lang.String str7 = aVar.f364037q;
                kotlin.jvm.internal.o.g(str7, "<set-?>");
                wVar.f364054i = str7;
                wVar.f364060o = aVar.f364045y;
                wVar.f364156b = aVar.f364156b;
                com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                if (p6Var == null) {
                    com.tencent.mars.xlog.Log.e("StoreEmoticonDesignerProfileJumpLogic", "unable to get emoticon liteapp feature service");
                } else {
                    ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, wVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
