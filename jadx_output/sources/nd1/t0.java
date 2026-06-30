package nd1;

/* loaded from: classes7.dex */
public class t0 extends nd1.e0 {
    public static final int CTRL_INDEX = 454;
    public static final java.lang.String NAME = "setBackgroundTextStyle";

    public t0() {
        super(ni1.h.class);
    }

    @Override // nd1.e0
    public void C(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        ((ni1.h) obj).a(jSONObject.optString("textStyle", "IGNORE".toLowerCase()));
        yVar.a(i17, o("ok"));
    }
}
