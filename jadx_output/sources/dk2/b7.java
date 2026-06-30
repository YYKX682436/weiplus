package dk2;

/* loaded from: classes3.dex */
public final class b7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.na0 f233241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(ce2.i iVar, java.lang.String str, r45.na0 na0Var) {
        super(1);
        this.f233239d = iVar;
        this.f233240e = str;
        this.f233241f = na0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        rs5.h result = (rs5.h) obj;
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result == rs5.h.f399357e || result == rs5.h.f399358f || result == rs5.h.f399359g || result == rs5.h.f399360h;
        ce2.i iVar = this.f233239d;
        if (z17) {
            yz5.p pVar = dk2.u7.f234199s;
            if (pVar != null) {
                java.lang.String field_rewardProductId = iVar.field_rewardProductId;
                kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
                pVar.invoke(field_rewardProductId, java.lang.Boolean.TRUE);
            }
            dk2.u7.f234199s = null;
            java.util.Map map = dk2.u7.f234187g;
            kotlin.jvm.internal.o.f(map, "<get-customGiftResourceMd5Map>(...)");
            map.put(iVar.field_rewardProductId, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = (com.tencent.mm.plugin.finder.reward.view.MagicRewardView) ((jz5.n) dk2.u7.f234200t).getValue();
            java.lang.String string = this.f233241f.getString(7);
            if (string == null) {
                string = "";
            }
            magicRewardView.setGiftName(string);
            dk2.u7.f234193m.put(iVar.field_rewardProductId, java.lang.Float.valueOf(magicRewardView.d() * 1000));
        }
        dk2.u7 u7Var = dk2.u7.f234181a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", this.f233240e + " fetchCustomGiftMagicRewardResource customGift id:" + iVar.field_rewardProductId + " name:" + iVar.field_name + " success:" + z17 + ", duration:" + dk2.u7.f234193m.get(iVar.field_rewardProductId) + '!');
        return jz5.f0.f302826a;
    }
}
