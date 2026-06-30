package ra3;

/* loaded from: classes5.dex */
public class h implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f393505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ra3.l f393506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.e[] f393507c;

    public h(boolean[] zArr, ra3.l lVar, com.tencent.mm.plugin.lite.ui.e[] eVarArr) {
        this.f393505a = zArr;
        this.f393506b = lVar;
        this.f393507c = eVarArr;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppEmoticonUtil", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        this.f393505a[0] = true;
        java.lang.String md52 = iEmojiInfo.getMd5();
        com.tencent.mm.plugin.lite.jsapi.comms.w1 w1Var = (com.tencent.mm.plugin.lite.jsapi.comms.w1) this.f393506b;
        w1Var.getClass();
        kotlin.jvm.internal.o.g(md52, "md5");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("md5", md52);
        w1Var.f143816a.f143443f.c(jSONObject, false);
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        this.f393507c[0].dismiss();
    }
}
