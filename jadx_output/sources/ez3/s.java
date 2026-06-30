package ez3;

/* loaded from: classes12.dex */
public class s implements gm0.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f257918d;

    public s() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f257918d = hashMap;
        hashMap.put(-1720818490, new ez3.q(this));
        hashMap.put(-499163268, new ez3.r(this));
    }

    @Override // gm0.e2
    public java.util.HashMap U5() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context, "context");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Bi(new com.tencent.mm.plugin.scanner.model.u0(context));
        com.tencent.mm.plugin.scanner.m1.Ai().Ri();
        return this.f257918d;
    }
}
