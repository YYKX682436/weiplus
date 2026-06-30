package sf2;

/* loaded from: classes10.dex */
public final class k1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.m1 f407187d;

    public k1(sf2.m1 m1Var) {
        this.f407187d = m1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        java.lang.String str2;
        mm2.j6 j6Var = (mm2.j6) obj;
        boolean z17 = j6Var instanceof mm2.i6;
        rn0.a aVar = rn0.a.f397609a;
        sf2.m1 m1Var = this.f407187d;
        if (z17) {
            m1Var.f407211j = ((mm2.i6) j6Var).f329141a;
            if (!m1Var.f407209h) {
                mm2.j6 j6Var2 = (mm2.j6) ((kotlinx.coroutines.flow.h3) m1Var.f407203b.f329251s).getValue();
                if (j6Var2 instanceof mm2.i6) {
                    m1Var.f407207f = 0L;
                    m1Var.f407208g = 0;
                    java.util.UUID.randomUUID().toString();
                    com.tencent.mm.sdk.platformtools.b4 b4Var = m1Var.f407212k;
                    b4Var.d();
                    b4Var.c(20L, 20L);
                    m1Var.f407209h = true;
                    if (in0.q.f292769b2 == null) {
                        in0.q.f292769b2 = new in0.q(aVar.a());
                    }
                    in0.q qVar = in0.q.f292769b2;
                    kotlin.jvm.internal.o.d(qVar);
                    qVar.P = 1;
                    com.tencent.mars.xlog.Log.i("NormalRoomSEIUploader", "startUpload: uniquePlayId=" + ((mm2.i6) j6Var2).f329141a.f391632i);
                }
            }
        } else {
            boolean z18 = m1Var.f407209h;
            if (z18 && z18) {
                com.tencent.trtc.TRTCCloud tRTCCloud = m1Var.f407202a;
                if (tRTCCloud != null) {
                    r45.fa4 fa4Var = new r45.fa4();
                    hn0.u uVar = hn0.u.f282437e;
                    long j17 = 1024;
                    fa4Var.f374143d = j17;
                    r45.g94 g94Var = new r45.g94();
                    g94Var.f375016d = (-1) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                    r45.z22 z22Var = m1Var.f407211j;
                    if (z22Var == null || (str = z22Var.f391632i) == null) {
                        str = "";
                    }
                    g94Var.f375017e = str;
                    if (z22Var == null || (str2 = z22Var.f391629f) == null) {
                        str2 = "";
                    }
                    g94Var.f375021i = str2;
                    g94Var.f375023n = 0;
                    fa4Var.f374144e = com.tencent.mm.protobuf.g.b(g94Var.toByteArray());
                    r45.fa4 fa4Var2 = new r45.fa4();
                    fa4Var2.f374143d = j17;
                    r45.g94 g94Var2 = new r45.g94();
                    long j18 = m1Var.f407207f + 1;
                    m1Var.f407207f = j18;
                    g94Var2.f375016d = j18;
                    g94Var2.f375017e = "";
                    g94Var2.f375021i = "";
                    g94Var2.f375023n = 0;
                    fa4Var2.f374144e = com.tencent.mm.protobuf.g.b(g94Var2.toByteArray());
                    tRTCCloud.sendSEIMsg(fa4Var.toByteArray(), 1);
                    tRTCCloud.sendSEIMsg(fa4Var2.toByteArray(), 1);
                }
                if (in0.q.f292769b2 == null) {
                    in0.q.f292769b2 = new in0.q(aVar.a());
                }
                in0.q qVar2 = in0.q.f292769b2;
                kotlin.jvm.internal.o.d(qVar2);
                qVar2.P = 0;
                m1Var.f407212k.d();
                m1Var.f407209h = false;
                m1Var.f407203b.getClass();
                m1Var.f407207f = 0L;
                m1Var.f407208g = 0;
            }
            m1Var.f407211j = null;
        }
        return jz5.f0.f302826a;
    }
}
