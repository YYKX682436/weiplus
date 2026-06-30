package oj4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.g2 f345817d;

    public k(pj4.g2 g2Var) {
        this.f345817d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pj4.r rVar;
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commit postInfo:");
        pj4.g2 g2Var = this.f345817d;
        kotlin.jvm.internal.o.g(g2Var, "<this>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("TextStatusPostInfo[rowId:");
        sb7.append(g2Var.f355069n);
        sb7.append(",useDefaultBackground:");
        sb7.append(g2Var.f355064f);
        sb7.append(",uploadFilePath:");
        sb7.append(g2Var.f355065g);
        sb7.append(",thumbPath:");
        sb7.append(g2Var.f355066h);
        sb7.append(",excludeUserNames:");
        sb7.append(g2Var.f355063e);
        sb7.append(",textStatusExtInfo:[");
        pj4.b0 textStatusExtInfo = g2Var.f355062d;
        kotlin.jvm.internal.o.f(textStatusExtInfo, "textStatusExtInfo");
        sb7.append(bk4.l.b(textStatusExtInfo));
        sb7.append(" mod_status_option:");
        sb7.append(g2Var.f355075t);
        sb7.append("]]");
        sb6.append(sb7.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", sb6.toString());
        long j18 = g2Var.f355069n;
        oj4.l lVar = oj4.l.f345818a;
        if (j18 <= 0) {
            java.lang.String str = g2Var.f355076u;
            if (str == null || str.length() == 0) {
                rVar = null;
            } else {
                com.tencent.mm.protobuf.f parseFrom = new pj4.r().parseFrom(android.util.Base64.decode(g2Var.f355076u, 0));
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.PrivateInfo");
                rVar = (pj4.r) parseFrom;
            }
            ai4.m0 m0Var = ai4.m0.f5173a;
            java.lang.String a17 = en1.a.a();
            java.lang.String str2 = g2Var.f355073r;
            pj4.b0 b0Var = g2Var.f355062d;
            java.lang.String str3 = g2Var.f355074s;
            kotlin.jvm.internal.o.d(a17);
            kotlin.jvm.internal.o.d(str2);
            kotlin.jvm.internal.o.d(b0Var);
            long g17 = ai4.b.g(m0Var, a17, str2, b0Var, 3, str3, 0L, 0.0f, null, rVar, false, ag1.b.CTRL_INDEX, null);
            java.lang.String str4 = g2Var.f355073r;
            java.lang.String str5 = str4 == null ? "" : str4;
            if (str4 == null || str4.length() == 0) {
                mj4.h i17 = m0Var.G().i(en1.a.a(), g2Var.f355062d.f354982q);
                str5 = i17 != null ? ((mj4.k) i17).l() : "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal: ".concat(str5));
            int i18 = g2Var.f355062d.f354974f;
            bk4.n nVar = bk4.n.f21513a;
            if (i18 == 1) {
                j17 = g17;
                if (com.tencent.mm.vfs.w6.j(g2Var.f355066h)) {
                    java.lang.String g18 = nVar.g("thumb", str5, "");
                    long d17 = com.tencent.mm.vfs.w6.d(g2Var.f355066h, g18, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + d17 + ", img thumb " + g2Var.f355066h + " to " + g18);
                    if (d17 <= 0) {
                        lVar.d(g2Var.f355066h, g18);
                    }
                }
                if (com.tencent.mm.vfs.w6.j(g2Var.f355065g)) {
                    java.lang.String g19 = nVar.g("image", str5, "");
                    long d18 = com.tencent.mm.vfs.w6.d(g2Var.f355065g, g19, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + d18 + ", img file " + g2Var.f355065g + " to " + g19);
                    if (d18 > 0) {
                        g2Var.f355065g = g19;
                    } else if (lVar.d(g2Var.f355065g, g19)) {
                        g2Var.f355065g = g19;
                    }
                }
            } else if (i18 != 2) {
                java.lang.String g27 = nVar.g("thumb", str5, "");
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal: delete old thumb " + com.tencent.mm.vfs.w6.h(g27) + ", " + g27);
                j17 = g17;
            } else {
                if (com.tencent.mm.vfs.w6.j(g2Var.f355066h)) {
                    java.lang.String g28 = nVar.g("thumb", str5, "");
                    j17 = g17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + com.tencent.mm.vfs.w6.d(g2Var.f355066h, g28, false) + ", video thumb " + g2Var.f355066h + " to " + g28);
                } else {
                    j17 = g17;
                }
                if (com.tencent.mm.vfs.w6.j(g2Var.f355065g)) {
                    java.lang.String g29 = nVar.g("video", str5, "");
                    long d19 = com.tencent.mm.vfs.w6.d(g2Var.f355065g, g29, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + d19 + ", video file " + g2Var.f355065g + " to " + g29);
                    if (d19 > 0) {
                        g2Var.f355065g = g29;
                    }
                }
            }
            if (g2Var.f355075t != 1) {
                com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
                java.lang.Object value = ((jz5.n) com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173567v2).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((com.tencent.mm.sdk.platformtools.o4) value).putString(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173568w2, java.lang.String.valueOf(j17));
            }
            g2Var.f355069n = j17;
            if (lVar.c(g2Var)) {
                g2Var.f355070o = true;
            }
            oj4.j.f345815a.g(g2Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "commit: check postNow=" + lVar.c(g2Var));
        if (lVar.c(g2Var)) {
            pm0.v.X(new oj4.a(new oj4.b(g2Var)));
            return;
        }
        oj4.n nVar2 = new oj4.n(g2Var);
        oj4.m mVar = new oj4.m(java.lang.System.currentTimeMillis(), nVar2);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("doUpload: rowId=");
        pj4.g2 g2Var2 = nVar2.f345821a;
        sb8.append(g2Var2.f355069n);
        sb8.append(", statusId=");
        sb8.append(g2Var2.f355073r);
        sb8.append(", createTime=");
        sb8.append(g2Var2.f355062d.f354982q);
        sb8.append(", mediaType=");
        pj4.b0 b0Var2 = g2Var2.f355062d;
        sb8.append(b0Var2 != null ? java.lang.Integer.valueOf(b0Var2.f354974f) : null);
        sb8.append(", uploadFile=");
        sb8.append(g2Var2.f355065g);
        sb8.append(", thumbFile=");
        sb8.append(g2Var2.f355066h);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadTask", sb8.toString());
        pj4.b0 b0Var3 = g2Var2.f355062d;
        int i19 = b0Var3 != null ? b0Var3.f354974f : 1;
        java.lang.String str6 = g2Var2.f355065g;
        java.lang.String str7 = g2Var2.f355066h;
        if (str6 == null || r26.n0.N(str6)) {
            return;
        }
        if (str7 == null || r26.n0.N(str7)) {
            return;
        }
        oj4.d dVar = new oj4.d(mVar);
        if (i19 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusUploader", "uploadImage");
            dn.m mVar2 = new dn.m();
            mVar2.f241785d = "task_TextStatusUploader_2";
            mVar2.f241787f = dVar;
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            mVar2.field_mediaId = com.tencent.mm.sdk.platformtools.w2.b(str6.getBytes());
            mVar2.field_fullpath = str6;
            mVar2.field_thumbpath = str7;
            mVar2.field_talker = "";
            mVar2.field_needStorage = true;
            mVar2.field_fileType = 20304;
            mVar2.field_appType = 256;
            mVar2.field_bzScene = 2;
            mVar2.A = 60;
            mVar2.B = 300;
            mVar2.field_priority = 2;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusUploader", "isVideo");
        dn.m mVar3 = new dn.m();
        mVar3.f241785d = "task_TextStatusUploader_1";
        mVar3.f241787f = dVar;
        char[] cArr2 = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mVar3.field_mediaId = com.tencent.mm.sdk.platformtools.w2.b(str6.getBytes());
        mVar3.field_fullpath = str6;
        mVar3.field_thumbpath = str7;
        mVar3.field_talker = "";
        mVar3.field_needStorage = true;
        mVar3.field_fileType = 20302;
        mVar3.field_appType = 256;
        mVar3.Z = 8;
        mVar3.field_bzScene = 2;
        mVar3.A = 600;
        mVar3.B = 1200;
        mVar3.field_priority = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar3);
    }
}
