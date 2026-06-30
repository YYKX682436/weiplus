package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lurgen/ur_E2DE/URS_88DA;", "", "()V", "UR_001E", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_AB8A", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class URS_88DA {
    public static final urgen.ur_E2DE.URS_88DA INSTANCE = new urgen.ur_E2DE.URS_88DA();

    private URS_88DA() {
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_001E() {
        ((r10.k) ((pq.p) i95.n0.c(pq.p.class))).getClass();
        java.util.List<y10.a> i17 = kz5.c0.i(new a20.a("weixin://ecs/common/profile"), new b20.e("weixin://ecs/gift/chattingEntranceShowSheet"), new b20.h("weixin://ecs/gift/giveGift"), new b20.f("weixin://ecs/gift/detail"), new x00.b("weixin://ecs/gift/sendThanks"), new b20.g("weixin://ecs/gift/mpactivity"), new x10.a("weixin://ecs/gift/finderLotteryCompleteRecord"), new x10.b("weixin://ecs/gift/givePreviewCover"), new x10.c("weixin://ecs/gift/givePreviewCoverV2"), new x10.d("weixin://ecs/gift/revealBlindGift"), new c20.g("weixin://ecs/live/openLiveRoom"), new c20.f("weixin://ecs/live/openGoodsManage"), new a20.b("weixin://ecs/gift/finderJump"), new z10.a("weixin://ecs/brs/openArticle"), new b20.j("weixin://ecs/gift/mpActivityGiftPack"), new b20.i("weixin://ecs/gift/givePreviewPOI"), new c20.e("weixin://ecs/live/selectPendingProduct"), new c20.b("weixin://ecs/live/displayPendingProduct"));
        int d17 = kz5.b1.d(kz5.d0.q(i17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 >= 16 ? d17 : 16);
        for (y10.a aVar : i17) {
            linkedHashMap.put(aVar.f414550a, aVar.f414551b);
        }
        return y02.s1.f458627g.a(linkedHashMap);
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_AB8A() {
        ((r10.k) ((pq.p) i95.n0.c(pq.p.class))).getClass();
        java.util.List<t10.c> i17 = kz5.c0.i(new e20.h("wxa"), new u10.a("h5"), new v10.b("liteapp"), new w10.d("mbapp"));
        int d17 = kz5.b1.d(kz5.d0.q(i17, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (t10.c cVar : i17) {
            linkedHashMap.put(cVar.f414550a, cVar.f414551b);
        }
        return y02.s1.f458627g.a(linkedHashMap);
    }
}
