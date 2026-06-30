package zf4;

/* loaded from: classes13.dex */
public abstract class r {
    public static boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        zf4.q c17 = c(str);
        if (c17 == null) {
            return true;
        }
        int i17 = c17.field_msglocalid;
        if (i17 != 0) {
            pt0.f0.P7(c17.field_user, i17);
        }
        zf4.l.Bi().d(str);
        zf4.b0 Bi = zf4.l.Bi();
        java.lang.String b17 = b(str, false);
        java.util.HashMap hashMap = (java.util.HashMap) Bi.f472650e;
        zf4.i iVar = (zf4.i) hashMap.get(b17);
        if (iVar != null) {
            java.io.RandomAccessFile randomAccessFile = iVar.f472669a;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    iVar.f472669a = null;
                } catch (java.io.IOException unused) {
                }
            }
            hashMap.remove(b17);
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b(str, false));
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return m17.a() && m17.f213266a.d(m17.f213267b);
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        c01.d9.b().getClass();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.h1.c(ys3.l.a(), "recbiz_", str, ".rec", 2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return null;
        }
        if (z17) {
            return c17;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c17);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            m17.f213266a.F(m17.f213267b);
        }
        return c17;
    }

    public static zf4.q c(java.lang.String str) {
        zf4.q qVar;
        android.database.Cursor f17 = zf4.l.Bi().f472649d.f("SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2 FROM VoiceRemindInfo WHERE filename= ?", new java.lang.String[]{str}, 2);
        if (f17.moveToFirst()) {
            qVar = new zf4.q();
            qVar.convertFrom(f17);
        } else {
            qVar = null;
        }
        f17.close();
        return qVar;
    }

    public static zf4.i d(java.lang.String str) {
        zf4.b0 Bi = zf4.l.Bi();
        java.lang.String b17 = b(str, false);
        java.util.HashMap hashMap = (java.util.HashMap) Bi.f472650e;
        if (hashMap.get(b17) == null) {
            hashMap.put(b17, new zf4.i(b17));
        }
        return (zf4.i) hashMap.get(b17);
    }

    public static boolean e(java.lang.String str) {
        if (str == null) {
            return false;
        }
        zf4.q c17 = c(str);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindLogic", "Set error failed file:".concat(str));
            return false;
        }
        c17.field_status = 98;
        c17.field_lastmodifytime = java.lang.System.currentTimeMillis() / 1000;
        c17.U = com.tencent.mapsdk.internal.km.f50100e;
        boolean f17 = f(c17);
        if (c17.field_msglocalid == 0 || com.tencent.mm.sdk.platformtools.t8.K0(c17.field_user)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindLogic", "setError failed msg id:" + c17.field_msglocalid + " user:" + c17.field_user);
            return f17;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(c17.field_user, c17.field_msglocalid);
        Li.setMsgId(c17.field_msglocalid);
        Li.r1(5);
        Li.u1(c17.field_user);
        Li.d1(zf4.p.a(c17.field_human, -1L, true));
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
        return f17;
    }

    public static boolean f(zf4.q qVar) {
        if (qVar == null || qVar.U == -1) {
            return false;
        }
        zf4.b0 Bi = zf4.l.Bi();
        java.lang.String str = qVar.field_filename;
        Bi.getClass();
        iz5.a.g(null, str.length() > 0);
        android.content.ContentValues convertTo = qVar.convertTo();
        if (convertTo.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindStorage", "update failed, no values set");
            return false;
        }
        if (Bi.f472649d.p("VoiceRemindInfo", convertTo, "filename= ?", new java.lang.String[]{str}) <= 0) {
            return false;
        }
        Bi.doNotify();
        return true;
    }
}
