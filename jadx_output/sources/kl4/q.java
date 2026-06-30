package kl4;

/* loaded from: classes11.dex */
public final class q implements ll4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308959a;

    public q(kl4.a0 a0Var) {
        this.f308959a = a0Var;
    }

    public void a(com.tencent.unit_rc.ByteBuffer data, bw5.y1 metaInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(metaInfo, "metaInfo");
        jm4.m0 m0Var = (jm4.m0) this.f308959a.f308877q.lock();
        if (m0Var != null) {
            byte[] byteArray = metaInfo.toByteArray();
            long cppPointer = ((jm4.n0) m0Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_0025.UR_24F6.UR_3AAD(cppPointer, data, byteArray);
        }
    }
}
