package fy4;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy4.e f267256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f267257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fy4.e eVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo, java.lang.String str) {
        super(1);
        this.f267256d = eVar;
        this.f267257e = iEmojiInfo;
        this.f267258f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        nw4.n nVar = this.f267256d.f267259d.f183844p0;
        jz5.l lVar = new jz5.l("sourceType", 2);
        jz5.l lVar2 = new jz5.l("type", "emoticon");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("md5", this.f267257e.getMd5());
        jSONObject.put("emojiInfo", this.f267258f);
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, path);
        nVar.N(kz5.c1.l(lVar, lVar2, new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString())));
        return jz5.f0.f302826a;
    }
}
