package h41;

/* loaded from: classes11.dex */
public final class y0 implements com.tencent.wechat.aff.ovc.m {

    /* renamed from: e, reason: collision with root package name */
    public static int f278891e;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.l f278894a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.open_voice_control.card.SelectContactCard f278895b;

    /* renamed from: c, reason: collision with root package name */
    public long f278896c;

    /* renamed from: d, reason: collision with root package name */
    public int f278897d;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f278898g = kotlinx.coroutines.z0.b();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.open_voice_control.card.SelectContactCard f278899h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f278900i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f278901j;

    /* renamed from: k, reason: collision with root package name */
    public static final s.l f278893k = new s.l(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f278892f = new java.util.HashMap();

    public static final f41.n a(h41.y0 y0Var, java.lang.String str) {
        y0Var.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1618365534) {
            if (hashCode != -1515372213) {
                if (hashCode == -624136624 && str.equals("send_message")) {
                    return f41.n.f259497d;
                }
            } else if (str.equals("voice_call")) {
                return f41.n.f259498e;
            }
        } else if (str.equals("video_call")) {
            return f41.n.f259499f;
        }
        return f41.n.f259497d;
    }
}
