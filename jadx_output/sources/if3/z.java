package if3;

/* loaded from: classes12.dex */
public class z extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f291231e = {"CREATE TABLE IF NOT EXISTS massendinfo ( clientid text  PRIMARY KEY , status int  , createtime long  , lastmodifytime long  , filename text  , thumbfilename text  , tolist text  , tolistcount int  , msgtype int  , mediatime int  , datanetoffset int  , datalen int  , thumbnetoffset int  , thumbtotallen int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  massendinfostatus_index ON massendinfo ( status )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f291232d;

    public z(l75.k0 k0Var) {
        this.f291232d = k0Var;
    }

    public if3.y m0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        java.lang.String a17 = if3.f0.a();
        int a18 = com.tencent.mm.sdk.platformtools.l.a(str);
        java.lang.String g17 = kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes());
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
        if (i18 != 0 || (m11.c.a(str) && (n07 == null || (n07.outHeight <= 960 && n07.outWidth <= 960)))) {
            com.tencent.mm.vfs.w6.a(a17 + g17 + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, com.tencent.mm.vfs.w6.N(str, 0, -1));
        } else {
            if (!com.tencent.mm.sdk.platformtools.x.w(str, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, android.graphics.Bitmap.CompressFormat.JPEG, 70, a17, g17)) {
                return null;
            }
            com.tencent.mm.vfs.w6.P(a17, g17, g17 + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        }
        java.lang.String str3 = g17 + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        if (i18 == 0 && a18 != 0) {
            if (!com.tencent.mm.sdk.platformtools.x.y0(a17 + str3, a18, android.graphics.Bitmap.CompressFormat.JPEG, 90, a17 + (g17 + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG))) {
                return null;
            }
        }
        java.lang.String g18 = kk.k.g((str3 + java.lang.System.currentTimeMillis()).getBytes());
        if (!com.tencent.mm.sdk.platformtools.x.w(a17 + str3, 120, 120, android.graphics.Bitmap.CompressFormat.JPEG, 90, a17, g18)) {
            return null;
        }
        if3.y yVar = new if3.y();
        yVar.f291219o = 3;
        yVar.f291217m = str2;
        yVar.f291218n = i17;
        yVar.f291216i = g18;
        yVar.f291215h = str3;
        return yVar;
    }

    public if3.y n0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   where massendinfo.clientid = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        if3.y yVar = null;
        android.database.Cursor f17 = this.f291232d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            yVar = new if3.y();
            yVar.b(f17);
        }
        f17.close();
        return yVar;
    }

    public if3.y s0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   where massendinfo.reserved3 = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        if3.y yVar = null;
        android.database.Cursor f17 = this.f291232d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            yVar = new if3.y();
            yVar.b(f17);
        }
        f17.close();
        return yVar;
    }

    public android.database.Cursor u0(int i17) {
        return this.f291232d.B("select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   ORDER BY createtime ASC  LIMIT " + i17 + " offset (SELECT count(*) FROM massendinfo ) -" + i17, null);
    }

    public java.lang.String y0(if3.y yVar) {
        int i17 = yVar.f291219o;
        if (i17 == 1) {
            return yVar.d();
        }
        if (i17 == 3) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490517xd);
        }
        if (i17 == 34) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490600zm);
        }
        if (i17 == 43) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490596zi);
        }
        if (i17 == 47) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490382tf);
        }
        if (i17 != 49) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.bex);
        }
        int i18 = ot0.q.v(yVar.d()).f348666i;
        return (i18 == 51 || i18 == 129) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490432ux) : yVar.d();
    }

    public int z0(long j17) {
        android.database.Cursor B = this.f291232d.B("SELECT count(*) FROM massendinfo WHERE createtime >= " + j17, null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MasSendInfoStorage", "getMoreThanCreateTimeCount %s return %s ", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        B.close();
        return i17;
    }
}
