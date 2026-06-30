package ot0;

@j95.b
/* loaded from: classes12.dex */
public final class g3 extends i95.w implements com.tencent.mm.app.w2 {
    public android.database.Cursor Ai() {
        android.database.Cursor N0;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            N0 = ot0.c3.l().c("getMessageStatsByType", new yz5.a() { // from class: com.tencent.mm.storage.g9$$o7
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.N0(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p7
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return com.tencent.mm.storage.g9.this.f193989r.B("SELECT type,sum(1),sum(length(CAST(content AS BLOB))) as contentSize,sum(length(hex(lvbuffer))/2),sum(length(hex(reserved))/2) FROM message GROUP BY type ORDER BY contentSize DESC", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            l75.k0 k0Var = cj6.f193989r;
            N0 = Pb ? ot0.z2.f348822a.N0(k0Var, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE) : k0Var.B("SELECT type,sum(1),sum(length(CAST(content AS BLOB))) as contentSize,sum(length(hex(lvbuffer))/2),sum(length(hex(reserved))/2) FROM message GROUP BY type ORDER BY contentSize DESC", null);
        }
        kotlin.jvm.internal.o.f(N0, "getMessageStatsByType(...)");
        return N0;
    }

    public android.database.Cursor Bi() {
        android.database.Cursor e07;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            e07 = ot0.c3.l().c("getVideoImgPaths", new yz5.a() { // from class: com.tencent.mm.storage.g9$$y5
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.e0(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, 43);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a6
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return com.tencent.mm.storage.g9.this.f193989r.B("SELECT imgPath FROM message WHERE type=43", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            l75.k0 k0Var = cj6.f193989r;
            e07 = Pb ? ot0.z2.f348822a.e0(k0Var, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, 43) : k0Var.B("SELECT imgPath FROM message WHERE type=43", null);
        }
        kotlin.jvm.internal.o.f(e07, "getVideoImgPaths(...)");
        return e07;
    }

    public android.database.Cursor Di() {
        android.database.Cursor e07;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            e07 = ot0.c3.l().c("getVoiceImgPaths", new yz5.a() { // from class: com.tencent.mm.storage.g9$$v
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.e0(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, 34);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return com.tencent.mm.storage.g9.this.f193989r.B("SELECT imgPath FROM message WHERE type=34", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            l75.k0 k0Var = cj6.f193989r;
            e07 = Pb ? ot0.z2.f348822a.e0(k0Var, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, 34) : k0Var.B("SELECT imgPath FROM message WHERE type=34", null);
        }
        kotlin.jvm.internal.o.f(e07, "getVoiceImgPaths(...)");
        return e07;
    }

    public boolean Ni(final java.lang.String msgId, final int i17) {
        kotlin.jvm.internal.o.g(msgId, "msgId");
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            return ot0.c3.l().a("isMsgExistByIdAndType", new yz5.a() { // from class: com.tencent.mm.storage.g9$$y0
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(ot0.z2.f348822a.p1(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, msgId, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$z0
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                    g9Var.getClass();
                    android.database.Cursor B = g9Var.f193989r.B("SELECT msgid FROM message WHERE type=? AND msgid=?", new java.lang.String[]{java.lang.String.valueOf(i17), msgId});
                    try {
                        return java.lang.Boolean.valueOf(B.getCount() > 0);
                    } finally {
                        B.close();
                    }
                }
            });
        }
        boolean Pb = cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        l75.k0 k0Var = cj6.f193989r;
        if (Pb) {
            return ot0.z2.f348822a.p1(k0Var, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, msgId, i17);
        }
        android.database.Cursor B = k0Var.B("SELECT msgid FROM message WHERE type=? AND msgid=?", new java.lang.String[]{java.lang.String.valueOf(i17), msgId});
        try {
            boolean z17 = B.getCount() > 0;
            B.close();
            return z17;
        } catch (java.lang.Throwable th6) {
            B.close();
            throw th6;
        }
    }

    public android.database.Cursor wi(final java.util.List types) {
        android.database.Cursor B;
        kotlin.jvm.internal.o.g(types, "types");
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            B = ot0.c3.l().c("getImgPathsByTypes", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z6
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.f0(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, types);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a7
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                    g9Var.getClass();
                    return g9Var.f193989r.B("SELECT imgPath FROM message WHERE type IN (" + android.text.TextUtils.join(",", types) + ")", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            l75.k0 k0Var = cj6.f193989r;
            if (Pb) {
                B = ot0.z2.f348822a.f0(k0Var, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, types);
            } else {
                B = k0Var.B("SELECT imgPath FROM message WHERE type IN (" + android.text.TextUtils.join(",", types) + ")", null);
            }
        }
        kotlin.jvm.internal.o.f(B, "getImgPathsByTypes(...)");
        return B;
    }
}
