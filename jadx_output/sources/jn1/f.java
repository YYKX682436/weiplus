package jn1;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final jn1.f f300492d = new jn1.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof jn1.d)) {
            jn1.d dVar2 = (jn1.d) dVar;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(dVar2.f300490b);
            java.lang.String str = dVar2.f300490b;
            if (n07 == null) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                byte[] s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s(str);
                if (s17 != null) {
                    com.tencent.mm.protobuf.f parseFrom = new r45.tn4().parseFrom(s17);
                    kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModContact");
                    n07 = com.tencent.mm.modelavatar.g.e(str, (r45.tn4) parseFrom, n17);
                }
            }
            if (n07 == null) {
                n07 = new com.tencent.mm.modelavatar.r0();
                n07.f70537i = -1;
                n07.f70529a = str;
                n07.f70530b = 3;
                n07.f70534f = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarImgFlagPPC", "imgFlag is null and create username:" + str + " result:" + com.tencent.mm.modelavatar.d1.Ni().y0(n07));
            }
            state.l("Avatar_ImgFlag", n07);
        }
        return jz5.f0.f302826a;
    }
}
