package in2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f292839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(in2.s sVar, in2.a1 a1Var) {
        super(2);
        this.f292838d = sVar;
        this.f292839e = a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.j0 j0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        dk2.yg musicItem = (dk2.yg) obj2;
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328370p1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "7");
        jSONObject.put("music_name", musicItem.f234393a);
        jSONObject.put("clear_hot_value", musicItem.f234394b);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        in2.s sVar = this.f292838d;
        java.lang.Integer num = (java.lang.Integer) ((mm2.m6) sVar.H.a(mm2.m6.class)).f329241f.f234052a.getValue();
        if (num == null) {
            num = -1;
        }
        int intValue2 = num.intValue();
        in2.a1 a1Var = this.f292839e;
        com.tencent.mars.xlog.Log.i(a1Var.f292796f, "itemClickListener curPlayPos:" + intValue2 + " newPos:" + intValue + " singSongName:" + musicItem.f234393a);
        sf2.x xVar = sVar.I;
        xVar.getClass();
        dk2.s sVar2 = ((mm2.m6) xVar.business(mm2.m6.class)).f329241f;
        sVar2.getClass();
        try {
            dk2.yg c18 = sVar2.c();
            java.util.ArrayList arrayList = sVar2.f234053b;
            java.lang.Object obj3 = arrayList.get(intValue);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            dk2.yg ygVar = (dk2.yg) obj3;
            boolean b17 = kotlin.jvm.internal.o.b(ygVar.f234393a, musicItem.f234393a);
            androidx.lifecycle.j0 j0Var2 = sVar2.f234052a;
            if (b17) {
                ygVar.f234395c = 4;
                ygVar.f234394b = 0L;
                if (c18 != null) {
                    c18.f234395c = 3;
                }
                if (c18 != null) {
                    c18.f234398f = true;
                }
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", ygVar.f234393a + ", MUSIC_PLAY}");
                j0Var2.postValue(java.lang.Integer.valueOf(intValue));
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "playsongItem item:" + musicItem + " songList size:" + arrayList.size() + ", pos:" + intValue + ", newsongItem:" + ygVar + ", curPlayPos:" + j0Var2);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicData playsongItem");
        }
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) xVar.R6(com.tencent.mm.plugin.finder.live.plugin.h8.class);
        if (h8Var != null && (j0Var = h8Var.f112785q) != null) {
            ((te2.p1) j0Var).y();
        }
        xl2.d.a(xl2.d.f455115a, xVar.O6(), musicItem.f234393a, 1, ((mm2.e1) xVar.business(mm2.e1.class)).f328983m, ((mm2.e1) xVar.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.c1) xVar.business(mm2.c1.class)).f328852o, null, 64, null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "playMusic " + musicItem + ", forcePlay:true, stack:" + new com.tencent.mm.sdk.platformtools.z3());
        a1Var.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
