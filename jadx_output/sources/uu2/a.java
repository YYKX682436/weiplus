package uu2;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f431267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f431268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        super(1);
        this.f431267d = i17;
        this.f431268e = videoTransPara;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cl0.d it = (cl0.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject jSONObject = it.f42846a;
        if (jSONObject.optInt("count", -1) == this.f431267d) {
            int optInt = jSONObject.optInt("width", 0);
            int optInt2 = jSONObject.optInt("height", 0);
            int optInt3 = jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, 0);
            if (optInt > 0 && optInt2 > 0 && optInt3 > 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderVideoEditorConfig", "change width:" + optInt + " height:" + optInt2 + " fps:" + optInt3);
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f431268e;
                videoTransPara.f71191d = optInt;
                videoTransPara.f71192e = optInt2;
                videoTransPara.f71193f = optInt3;
            }
        }
        return jz5.f0.f302826a;
    }
}
