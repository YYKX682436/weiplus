package se2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final se2.e f406847a = new se2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f406848b = kz5.c0.i(20057, 20034, 20032, 20035, 20002);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f406849c = kz5.c0.i(20057, 20034, 20032, 20035, 20002);

    /* renamed from: d, reason: collision with root package name */
    public static final in5.s f406850d = new in5.s() { // from class: com.tencent.mm.plugin.finder.live.comment.BoxCommentConfig$itemConvertFactory$1
        @Override // in5.s
        public in5.r getItemConvert(int type) {
            if (type == 10001) {
                return new zf2.g();
            }
            if (type == 20002) {
                return new zf2.f();
            }
            if (type != 20032) {
                if (type == 20057) {
                    return new zf2.h();
                }
                if (type != 20034) {
                    return type != 20035 ? new zf2.b() : new zf2.e();
                }
            }
            return new zf2.a();
        }
    };

    public final boolean a(lm2.c msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            if (f406848b.contains(java.lang.Integer.valueOf(msg.h()))) {
                return true;
            }
        }
        return false;
    }
}
