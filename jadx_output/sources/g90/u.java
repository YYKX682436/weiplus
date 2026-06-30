package g90;

@j95.b
/* loaded from: classes12.dex */
public final class u extends i95.w implements h90.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f269762d = "MicroMsg.DeviceFileExtInfoFeatureService";

    public int Ai(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var != null && f9Var.getMsgId() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            lf3.d dVar = lf3.d.f318314a;
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(msgId, Q0, i17);
            if (b17 != null) {
                java.lang.Boolean saved = b17.f430027f;
                kotlin.jvm.internal.o.f(saved, "saved");
                if (saved.booleanValue()) {
                    return 4;
                }
                java.lang.Boolean deleted = b17.f430025d;
                kotlin.jvm.internal.o.f(deleted, "deleted");
                return (deleted.booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(b17.f430024c)) ? 2 : 3;
            }
        }
        return 1;
    }

    public int Bi(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var != null && f9Var.getMsgId() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            lf3.d dVar = lf3.d.f318314a;
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(msgId, Q0, i17);
            if (b17 != null) {
                java.lang.Boolean deleted = b17.f430025d;
                kotlin.jvm.internal.o.f(deleted, "deleted");
                return (deleted.booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(b17.f430024c)) ? 2 : 3;
            }
        }
        return 1;
    }

    public java.lang.String Di(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var != null && f9Var.getMsgId() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            lf3.d dVar = lf3.d.f318314a;
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(msgId, Q0, i17);
            if (b17 == null || com.tencent.mm.sdk.platformtools.t8.K0(b17.f430024c) || dVar.f(b17) != 0) {
                return null;
            }
            return b17.f430024c;
        }
        return null;
    }

    public jz5.l Ni(com.tencent.mm.storage.f9 f9Var, int i17, com.tencent.mm.pointers.PInt ret) {
        kotlin.jvm.internal.o.g(ret, "ret");
        if (f9Var != null) {
            if (f9Var.getMsgId() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
                return new jz5.l(null, null);
            }
            lf3.d dVar = lf3.d.f318314a;
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(msgId, Q0, i17);
            if (b17 != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17.f430024c)) {
                    return new jz5.l(null, null);
                }
                int f17 = dVar.f(b17);
                ret.value = f17;
                return (f17 == 0 || f17 == 1) ? new jz5.l(b17.f430024c, b17.f430028g) : new jz5.l(null, null);
            }
        }
        return new jz5.l(null, null);
    }

    public void Ri(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, java.lang.String str, java.lang.Long l17) {
        if (msgIdTalker != null) {
            java.lang.String a17 = msgIdTalker.a();
            long j17 = msgIdTalker.f149480d;
            if (j17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mars.xlog.Log.e(this.f269762d, "insertOrUpdate error, " + j17 + ", " + a17 + ", filePath:" + str + ", uriId: " + l17);
                return;
            }
            lf3.d dVar = lf3.d.f318314a;
            up5.o b17 = dVar.b(j17, a17, i17);
            if (b17 == null) {
                b17 = new up5.o();
            }
            b17.f430022a = dVar.g(j17, a17, java.lang.Integer.valueOf(i17));
            b17.f430023b = i17;
            b17.f430024c = str;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            b17.f430025d = bool;
            b17.f430027f = bool;
            if (l17 != null) {
                l17.longValue();
                b17.f430028g = l17;
            }
            dVar.e(b17);
        }
    }

    public void Ui(com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String str, java.lang.Long l17) {
        if (f9Var != null) {
            Ri(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0()), i17, str, l17);
        }
    }

    public void Vi(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var == null || f9Var.getMsgId() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            return;
        }
        lf3.d dVar = lf3.d.f318314a;
        long msgId = f9Var.getMsgId();
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        up5.o b17 = dVar.b(msgId, Q0, i17);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.e(this.f269762d, "[setFileDeleted] file not exist, msgId:" + f9Var.getMsgId() + ", talker:" + f9Var.Q0() + ", path:" + b17.f430024c);
            b17.f430025d = java.lang.Boolean.TRUE;
            dVar.e(b17);
        }
    }

    public void Zi(java.lang.String str, long j17, int i17) {
        if (j17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        lf3.d dVar = lf3.d.f318314a;
        up5.o b17 = dVar.b(j17, str == null ? "" : str, i17);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.e(this.f269762d, "[setFileSaved] file not exist, msgId:" + j17 + ", talker:" + str + ", path:" + b17.f430024c);
            b17.f430027f = java.lang.Boolean.TRUE;
            dVar.e(b17);
        }
    }

    public void aj(java.lang.String str, long j17, long j18, int i17) {
        if (j17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        lf3.d dVar = lf3.d.f318314a;
        up5.o b17 = dVar.b(j17, str == null ? "" : str, i17);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.e(this.f269762d, "setIdForUri, msgId:" + j17 + ", talker:" + str + ", path:" + b17.f430024c + ", uriId: " + j18);
            b17.f430028g = java.lang.Long.valueOf(j18);
            dVar.e(b17);
        }
    }

    public void wi(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var == null || f9Var.getMsgId() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f269762d, "do delete, msgId:" + f9Var.getMsgId() + ", talker:" + f9Var.Q0());
        lf3.d.f318314a.a(f9Var.getMsgId(), f9Var.Q0(), java.lang.Integer.valueOf(i17));
    }
}
