package nd1;

/* loaded from: classes7.dex */
public class s0 extends nd1.e0 {
    public static final int CTRL_INDEX = 453;
    public static final java.lang.String NAME = "setBackgroundColor";

    public s0() {
        super(ni1.h.class);
    }

    @Override // nd1.e0
    public void C(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        try {
            ((ni1.h) obj).h(ni1.g.IGNORE, ik1.w.l(jSONObject.optString("backgroundColor", "")));
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception unused) {
            yVar.a(i17, o("fail:invalid color"));
        }
    }
}
