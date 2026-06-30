package vb1;

/* loaded from: classes7.dex */
public class w extends gb1.f {
    public static final int CTRL_INDEX = 68;
    public static final java.lang.String NAME = "removeCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("canvasId");
    }
}
