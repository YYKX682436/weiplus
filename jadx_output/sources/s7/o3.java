package s7;

/* loaded from: classes15.dex */
public enum o3 {
    /* JADX INFO: Fake field, exist only in values array */
    svg,
    /* JADX INFO: Fake field, exist only in values array */
    a,
    /* JADX INFO: Fake field, exist only in values array */
    circle,
    /* JADX INFO: Fake field, exist only in values array */
    clipPath,
    /* JADX INFO: Fake field, exist only in values array */
    defs,
    desc,
    /* JADX INFO: Fake field, exist only in values array */
    ellipse,
    /* JADX INFO: Fake field, exist only in values array */
    g,
    /* JADX INFO: Fake field, exist only in values array */
    image,
    /* JADX INFO: Fake field, exist only in values array */
    line,
    /* JADX INFO: Fake field, exist only in values array */
    linearGradient,
    /* JADX INFO: Fake field, exist only in values array */
    marker,
    /* JADX INFO: Fake field, exist only in values array */
    mask,
    /* JADX INFO: Fake field, exist only in values array */
    path,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    SWITCH,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    title,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    /* JADX INFO: Fake field, exist only in values array */
    view,
    UNSUPPORTED;


    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f403763h = new java.util.HashMap();

    static {
        for (s7.o3 o3Var : values()) {
            if (o3Var == SWITCH) {
                ((java.util.HashMap) f403763h).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, o3Var);
            } else if (o3Var != UNSUPPORTED) {
                ((java.util.HashMap) f403763h).put(o3Var.name(), o3Var);
            }
        }
    }
}
