package pf1;

/* loaded from: classes7.dex */
public final class c0 extends gb1.h {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "updateHTMLVConsoleView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("htmlId");
    }
}
