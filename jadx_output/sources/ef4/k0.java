package ef4;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef4.k0 f252459a = new ef4.k0();

    public final java.lang.String a(int i17, java.lang.String str) {
        java.lang.String b17;
        if (str == null) {
            b17 = "story_local_video_" + i17;
        } else {
            b17 = com.tencent.mm.modelcdntran.i2.b("storyvideo", i17, "story", str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return null;
        }
        return b17;
    }

    public final nf4.o b(if4.h videoItem) {
        kotlin.jvm.internal.o.g(videoItem, "videoItem");
        boolean a17 = videoItem.a();
        long j17 = videoItem.f291254b;
        if (a17) {
            nf4.o oVar = new nf4.o();
            oVar.field_storyId = j17;
            oVar.field_url = "";
            oVar.field_cacheSize = 0;
            oVar.field_totalSize = 0;
            oVar.field_filePath = "";
            return oVar;
        }
        java.lang.String c17 = c(videoItem.f291258f, videoItem.f291256d);
        java.lang.String str = c17 != null ? c17 : "";
        if (!(str.length() == 0)) {
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(str);
            com.tencent.mm.vfs.w6.u(r17);
            com.tencent.mm.vfs.w6.t(r17);
        }
        ef4.v vVar = ef4.w.f252468t;
        nf4.p k17 = vVar.k();
        nf4.o oVar2 = null;
        if (j17 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Test get mediaId error ");
            sb6.append(j17);
            sb6.append(' ');
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i(nf4.p.f336879f, sb6.toString());
        } else {
            android.database.Cursor B = k17.f336880d.B("select * from StoryVideoCacheInfo  where storyId = '" + j17 + "' ", null);
            if (B != null) {
                if (B.moveToFirst()) {
                    nf4.o oVar3 = new nf4.o();
                    oVar3.convertFrom(B);
                    oVar2 = oVar3;
                }
                B.close();
            }
        }
        if (oVar2 == null) {
            oVar2 = new nf4.o();
            oVar2.field_storyId = j17;
            oVar2.field_url = videoItem.f291258f.f390023f;
            oVar2.field_cacheSize = 0;
            oVar2.field_totalSize = 0;
            oVar2.field_filePath = c17;
            vVar.k().insert(oVar2);
        }
        java.lang.String str2 = oVar2.field_filePath;
        if (str2 == null || str2.length() == 0) {
            oVar2.field_filePath = c17;
        }
        return oVar2;
    }

    public final java.lang.String c(r45.xe6 xe6Var, java.lang.String str) {
        if (xe6Var == null) {
            return null;
        }
        ef4.c0 c0Var = ef4.c0.f252438a;
        java.lang.String str2 = xe6Var.f390023f;
        java.lang.String str3 = "";
        if (str2 != null) {
            java.lang.String concat = c0Var.a(str).concat("video/");
            byte[] bytes = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            if (g17 != null) {
                str3 = com.tencent.mm.vfs.w6.i(concat + g17 + ".v", true);
                kotlin.jvm.internal.o.d(str3);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoLogic", "get story video path %s", str3);
        return str3;
    }

    public final java.lang.String d(r45.xe6 xe6Var) {
        if (xe6Var == null) {
            return null;
        }
        java.lang.String str = xe6Var.f390021d;
        if (str == null) {
            return "";
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(ef4.w.f252468t.b() + str + ".v", true);
        kotlin.jvm.internal.o.d(i17);
        return i17.concat(".u");
    }
}
