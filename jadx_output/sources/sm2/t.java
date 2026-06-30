package sm2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f409703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f409704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f409705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f409706h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409707i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f409708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409709n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sm2.o4 o4Var, boolean z17, int i17, r45.l01 l01Var, boolean z18, java.lang.String str, int i18, java.lang.String str2) {
        super(0);
        this.f409702d = o4Var;
        this.f409703e = z17;
        this.f409704f = i17;
        this.f409705g = l01Var;
        this.f409706h = z18;
        this.f409707i = str;
        this.f409708m = i18;
        this.f409709n = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.StringBuilder] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        ?? r57;
        ?? r58;
        sm2.o4 o4Var = this.f409702d;
        java.lang.String str = o4Var.f409610f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLive success:");
        boolean z17 = this.f409703e;
        sb6.append(z17);
        sb6.append(", errCode:");
        int i17 = this.f409704f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.l01 l01Var = this.f409705g;
        if (z17) {
            mm2.y6 y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) o4Var.f19609a.a(mm2.g1.class)).f329078s).getValue();
            if (y6Var.f329592p) {
                java.lang.String str2 = y6Var.f329593q;
                if (!(str2 == null || str2.length() == 0) && y6Var.f329581e == 2) {
                    java.util.ArrayList arrayList = y6Var.f329583g;
                    if (arrayList.size() == 1 && kotlin.jvm.internal.o.b(kz5.n0.X(arrayList), y6Var.f329593q)) {
                        r58 = 1;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_START_ONLY_FROM_CHATROOM_VISIBLE_INT_SYNC, java.lang.Integer.valueOf((int) r58));
                        com.tencent.mars.xlog.Log.i(y6Var.f329578b, "Tag LiveStartOnlyFromChatRoomVisible:" + r58);
                    }
                }
                r58 = 0;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_START_ONLY_FROM_CHATROOM_VISIBLE_INT_SYNC, java.lang.Integer.valueOf((int) r58));
                com.tencent.mars.xlog.Log.i(y6Var.f329578b, "Tag LiveStartOnlyFromChatRoomVisible:" + r58);
            }
            ya2.g gVar = ya2.h.f460484a;
            ya2.b2 b17 = gVar.b(((mm2.c1) o4Var.f19609a.a(mm2.c1.class)).f328852o);
            if (b17 != null) {
                b17.field_liveRoomImg = ((mm2.c1) o4Var.f19609a.a(mm2.c1.class)).w7();
                gVar.k(b17);
            }
            sm2.s sVar = new sm2.s(o4Var);
            java.util.LinkedList list = l01Var.getList(7);
            if (list != null) {
                r57 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    java.lang.String str3 = (java.lang.String) obj;
                    if (!(str3 == null || str3.length() == 0)) {
                        r57.add(obj);
                    }
                }
            } else {
                r57 = kz5.p0.f313996d;
            }
            int size = r57.size();
            java.lang.String str4 = o4Var.f409610f;
            if (size < 2) {
                com.tencent.mars.xlog.Log.i(str4, "runCoLiveAvatarMerger: skip, count=" + r57.size());
                sVar.invoke();
            } else {
                com.tencent.mars.xlog.Log.i(str4, "runCoLiveAvatarMerger: start, count=" + r57.size() + ", objectId=" + ((mm2.e1) o4Var.c(mm2.e1.class)).f328983m);
                re2.w wVar = new re2.w(((mm2.e1) o4Var.c(mm2.e1.class)).f328983m, r57);
                sm2.g4 g4Var = new sm2.g4(o4Var, sVar);
                sm2.h4 h4Var = new sm2.h4(o4Var, sVar);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("run: objectId=");
                long j17 = wVar.f394495a;
                sb7.append(j17);
                sb7.append(", avatarCount=");
                java.util.List list2 = wVar.f394496b;
                sb7.append(list2.size());
                com.tencent.mars.xlog.Log.i("Finder.CoLiveAvatarMerger", sb7.toString());
                if (list2.size() < 2) {
                    com.tencent.mars.xlog.Log.w("Finder.CoLiveAvatarMerger", "run: avatarUrls too few (" + list2.size() + "), skip merge");
                    wVar.b(g4Var, "");
                } else {
                    re2.u uVar = new re2.u(wVar, g4Var, h4Var);
                    re2.v vVar = new re2.v(wVar, h4Var);
                    byte[] bytes = (j17 + kz5.n0.g0(wVar.f394496b, "|", null, null, 0, null, null, 62, null)).getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    java.lang.String str5 = com.tencent.mm.plugin.finder.assist.e9.f102141j + "colive_merged_" + kk.k.g(bytes) + ".png";
                    com.tencent.mars.xlog.Log.i("Finder.CoLiveAvatarMerger", "doMerge: outputPath=" + str5);
                    kotlinx.coroutines.l.d(wVar.f394499e, null, null, new re2.l(wVar, str5, uVar, vVar, null), 3, null);
                }
            }
            o4Var.M(1);
        } else if (this.f409706h) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_USERNAME", android.text.TextUtils.isEmpty(((mm2.c1) o4Var.c(mm2.c1.class)).f328852o) ? ((mm2.c1) o4Var.c(mm2.c1.class)).f328852o : ((mm2.c1) o4Var.c(mm2.c1.class)).f328852o);
            bundle.putString("PARAM_FINDER_LIVE_FACE_VERIFY_URL", this.f409707i);
            r45.qp1 qp1Var = (r45.qp1) l01Var.getCustom(3);
            if (qp1Var != null) {
                bundle.putByteArray("PARAM_FINDER_LIVE_ERROR_PAGE", qp1Var.toByteArray());
            }
            fm2.a aVar = o4Var.f19595c;
            if (aVar != null) {
                aVar.statusChange(qo0.b.Q2, bundle);
            }
            com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.f102576v.f102540b, null, false, false, 14, null);
            o4Var.M(4);
        } else {
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            java.lang.String str6 = com.tencent.mm.plugin.finder.assist.t8.f102575u.f102540b;
            r45.l84 l84Var = new r45.l84();
            l84Var.set(1, java.lang.Integer.valueOf(i17));
            l84Var.set(2, this.f409709n);
            com.tencent.mm.plugin.finder.assist.p8.c(p8Var, str6, hc2.b.a(l84Var), false, true, 4, null);
            this.f409702d.z(this.f409708m, this.f409704f, this.f409709n, this.f409705g, null);
            o4Var.M(2);
        }
        return jz5.f0.f302826a;
    }
}
