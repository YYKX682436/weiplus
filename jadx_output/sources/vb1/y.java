package vb1;

/* loaded from: classes7.dex */
public class y extends gb1.h {
    public static final int CTRL_INDEX = 83;
    public static final java.lang.String NAME = "updateCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("canvasId");
    }
}
