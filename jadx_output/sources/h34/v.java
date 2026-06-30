package h34;

/* loaded from: classes11.dex */
public abstract class v {
    public static b21.r a(r45.eh4 eh4Var) {
        if (eh4Var == null) {
            return null;
        }
        try {
            b21.r rVar = new b21.r();
            rVar.f17358t = "wx5aa333606550dfd5";
            rVar.f17345d = 4;
            rVar.f17346e = java.lang.String.valueOf(eh4Var.f373482e);
            rVar.f17347f = eh4Var.f373498x;
            rVar.f17350i = eh4Var.f373486i;
            rVar.f17355q = eh4Var.f373496v;
            rVar.f17348g = eh4Var.f373484g;
            rVar.f17349h = eh4Var.f373485h;
            rVar.f17354p = eh4Var.f373495u;
            java.lang.String str = eh4Var.f373491q;
            rVar.f17352n = str;
            rVar.f17353o = str;
            rVar.P = eh4Var.f373483f;
            java.lang.String str2 = eh4Var.f373488n;
            if (str2 == null) {
                str2 = "";
            }
            rVar.f17351m = str2;
            java.lang.String str3 = eh4Var.f373489o;
            if (str3 == null) {
                str3 = "";
            }
            rVar.f17362x = str3;
            rVar.T = true;
            return rVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeMusicLogic", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
            return null;
        }
    }

    public static b21.r b(byte[] bArr, long j17) {
        if (bArr != null && bArr.length > 0) {
            try {
                r45.t36 t36Var = (r45.t36) new r45.t36().parseFrom(bArr);
                b21.r rVar = new b21.r();
                rVar.f17345d = 4;
                rVar.f17346e = java.lang.String.valueOf(t36Var.f386099e);
                rVar.f17347f = t36Var.f386100f;
                rVar.f17350i = x51.j1.f(t36Var.f386103i);
                java.lang.String f17 = x51.j1.f(t36Var.f386104m);
                rVar.f17351m = f17;
                rVar.f17356r = i34.d.b(f17);
                rVar.f17355q = x51.j1.f(t36Var.f386108q);
                rVar.f17348g = x51.j1.f(t36Var.f386101g);
                rVar.f17349h = x51.j1.f(t36Var.f386102h);
                rVar.f17354p = x51.j1.f(t36Var.f386107p);
                rVar.f17352n = x51.j1.f(t36Var.f386105n);
                rVar.f17353o = x51.j1.f(t36Var.f386106o);
                return rVar;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeMusicLogic", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
            }
        }
        return null;
    }

    public static java.lang.String c() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("shakemusic/");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb6.toString());
        if (!r6Var.m() || !r6Var.y()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", r6Var.o());
            r6Var.J();
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, ".nomedia");
        if (!r6Var2.m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", r6Var.o());
            try {
                r6Var2.k();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeMusicLogic", e17, "", new java.lang.Object[0]);
            }
        }
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
            return null;
        }
        return r6Var.o() + "/";
    }
}
