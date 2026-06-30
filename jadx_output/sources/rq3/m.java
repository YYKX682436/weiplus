package rq3;

/* loaded from: classes5.dex */
public final class m extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f398933f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f398933f = com.tencent.mm.vfs.q7.c("c2c_preload");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // jm0.g
    public void S6() {
    }

    public final java.lang.String T6(int i17) {
        java.lang.String str = this.f398933f;
        if (i17 == 1) {
            return str + "/image/";
        }
        if (i17 == 2) {
            return str + "/imageOrigin/";
        }
        if (i17 == 3) {
            return str + "/video/";
        }
        if (i17 != 4) {
            return "";
        }
        return str + "/file/";
    }
}
