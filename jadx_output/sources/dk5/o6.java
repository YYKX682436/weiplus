package dk5;

/* loaded from: classes9.dex */
public final class o6 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f234781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f234782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f234783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f234784h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject f234785i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234786m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f234787n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234788o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f234789p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f234790q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234791r;

    public o6(java.util.LinkedList linkedList, com.tencent.mm.pluginsdk.model.app.m mVar, boolean z17, boolean z18, k91.v5 v5Var, com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject, java.lang.String str, int i17, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, dk5.f6 f6Var, int i18, java.lang.String str2) {
        this.f234780d = linkedList;
        this.f234781e = mVar;
        this.f234782f = z17;
        this.f234783g = z18;
        this.f234784h = v5Var;
        this.f234785i = wXMiniProgramObject;
        this.f234786m = str;
        this.f234787n = i17;
        this.f234788o = wXMediaMessage;
        this.f234789p = f6Var;
        this.f234790q = i18;
        this.f234791r = str2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaAppGetShareInfoResponse");
        r45.hc7 hc7Var = (r45.hc7) fVar;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f234788o;
        dk5.y6 y6Var = dk5.y6.f235010a;
        boolean z17 = this.f234783g;
        java.lang.String str2 = this.f234786m;
        com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject = this.f234785i;
        k91.v5 v5Var = this.f234784h;
        boolean z18 = this.f234782f;
        java.lang.String str3 = "field_appId";
        int i19 = this.f234787n;
        com.tencent.mm.pluginsdk.model.app.m mVar = this.f234781e;
        java.util.LinkedList linkedList2 = this.f234780d;
        if (i17 == 0 && i18 == 0 && (linkedList = hc7Var.f376057d) != null) {
            if (linkedList == null) {
                linkedList = new java.util.LinkedList();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "get wxaAppShareInfoList size = %d, toUserList size = %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
            int size = linkedList2.size();
            int i27 = 0;
            while (i27 < size) {
                r45.vc7 vc7Var = i27 < linkedList.size() ? (r45.vc7) linkedList.get(i27) : new r45.vc7();
                java.util.LinkedList linkedList3 = linkedList;
                ot0.q qVar = new ot0.q();
                int i28 = size;
                java.lang.String str4 = mVar.field_appId;
                kotlin.jvm.internal.o.f(str4, str3);
                if (!z18 && z17) {
                    str4 = "";
                }
                qVar.f348646d = str4;
                qVar.f348677k2 = v5Var.field_appId;
                qVar.f348722w = v5Var.field_username;
                qVar.f348726x = v5Var.field_nickname;
                qVar.f348737z2 = wXMiniProgramObject.miniprogramType;
                qVar.H = mVar.field_appName;
                qVar.f348706s = 2;
                qVar.f348693o2 = vc7Var.f388114e;
                qVar.f348689n2 = str2;
                qVar.f348681l2 = wXMiniProgramObject.withShareTicket ? 3 : 2;
                qVar.f348717u2 = i19;
                y6Var.f(qVar, wXMediaMessage);
                k91.v5 v5Var2 = v5Var;
                com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject2 = wXMiniProgramObject;
                java.util.LinkedList linkedList4 = linkedList2;
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = wXMediaMessage;
                int i29 = i19;
                java.lang.String str5 = str2;
                java.lang.String str6 = str3;
                boolean z19 = z18;
                y6Var.b((java.lang.String) linkedList2.get(i27), this.f234784h, qVar, vc7Var, this.f234789p);
                if (i29 != 0) {
                    qVar.f348705r2 = 1;
                }
                com.tencent.mm.pluginsdk.model.app.k0.G(qVar, this.f234788o, (java.lang.String) linkedList4.get(i27), null, this.f234790q, dk5.y6.i(y6Var, this.f234782f, this.f234791r, null, this.f234789p, 4, null));
                i27++;
                linkedList = linkedList3;
                v5Var = v5Var2;
                i19 = i29;
                wXMiniProgramObject = wXMiniProgramObject2;
                str2 = str5;
                str3 = str6;
                z18 = z19;
                linkedList2 = linkedList4;
                size = i28;
                wXMediaMessage = wXMediaMessage2;
            }
        } else {
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage3 = wXMediaMessage;
            java.lang.String str7 = "field_appId";
            java.lang.String str8 = str2;
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str9 = (java.lang.String) it.next();
                java.lang.String str10 = mVar.field_appId;
                java.lang.String str11 = str7;
                kotlin.jvm.internal.o.f(str10, str11);
                if (!z18 && z17) {
                    str10 = "";
                }
                ot0.q qVar2 = new ot0.q();
                qVar2.f348646d = str10;
                qVar2.f348677k2 = v5Var.field_appId;
                qVar2.f348722w = v5Var.field_username;
                qVar2.f348726x = v5Var.field_nickname;
                qVar2.f348737z2 = wXMiniProgramObject.miniprogramType;
                qVar2.H = mVar.field_appName;
                qVar2.f348706s = 2;
                java.lang.String str12 = str8;
                qVar2.f348689n2 = str12;
                qVar2.f348681l2 = wXMiniProgramObject.withShareTicket ? 3 : 2;
                qVar2.f348717u2 = i19;
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage4 = wXMediaMessage3;
                y6Var.f(qVar2, wXMediaMessage4);
                str7 = str11;
                y6Var.b(str9, this.f234784h, qVar2, null, this.f234789p);
                if (i19 != 0) {
                    qVar2.f348705r2 = 1;
                }
                com.tencent.mm.pluginsdk.model.app.k0.G(qVar2, this.f234788o, str9, null, this.f234790q, dk5.y6.i(y6Var, this.f234782f, this.f234791r, null, this.f234789p, 4, null));
                str8 = str12;
                wXMediaMessage3 = wXMediaMessage4;
            }
        }
        return 0;
    }
}
