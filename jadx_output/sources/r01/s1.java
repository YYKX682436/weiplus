package r01;

@j95.b
/* loaded from: classes9.dex */
public class s1 extends i95.w implements r01.x2, vg3.s3 {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.storage.v f368238d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.storage.w f368239e;

    public com.tencent.mm.storage.w Ai() {
        if (this.f368239e == null) {
            synchronized (this) {
                this.f368239e = new com.tencent.mm.storage.w(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di());
            }
        }
        return this.f368239e;
    }

    public com.tencent.mm.storage.v Bi(xg3.m0 m0Var) {
        if (this.f368238d == null) {
            synchronized (this) {
                if (this.f368238d == null) {
                    if (m0Var == null) {
                        m0Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                    }
                    this.f368238d = new com.tencent.mm.storage.v(m0Var);
                }
            }
        }
        return this.f368238d;
    }

    public void Di(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var) {
        if (l4Var == null || f9Var == null || f9Var.t0() == -1 || !l4Var.d2(8388608)) {
            return;
        }
        s01.h z07 = r01.q3.Ui().z0(f9Var.t0());
        java.lang.String y07 = l4Var.y0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.u0())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizConversationStorage", "BizChatUserId is null:%s %s", z07.field_bizChatServId, z07.field_chatName);
            return;
        }
        s01.a0 y08 = r01.q3.Vi().y0(f9Var.u0());
        java.lang.String str = y08 != null ? y08.field_userName : null;
        boolean equals = f9Var.u0().equals(r01.q3.Vi().z0(f9Var.Q0()));
        if (y08 != null && equals) {
            l4Var.o1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490472w1) + ":" + y07);
        } else if (y08 != null && !com.tencent.mm.sdk.platformtools.t8.K0(y08.field_userName)) {
            l4Var.o1(y08.field_userName + ":" + y07);
        }
        if (z07.y0()) {
            return;
        }
        if (!equals && str != null && str.length() > 0 && !str.equals(z07.field_chatName)) {
            z07.field_chatName = str;
            r01.q3.Ui().P0(z07);
            return;
        }
        s01.a0 y09 = r01.q3.Vi().y0(z07.field_bizChatServId);
        java.lang.String str2 = y09 != null ? y09.field_userName : null;
        if (str2 == null || str2.length() <= 0 || str2.equals(z07.field_chatName)) {
            return;
        }
        z07.field_chatName = str2;
        r01.q3.Ui().P0(z07);
    }

    public java.lang.String wi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("brandicon/");
        return sb6.toString();
    }
}
