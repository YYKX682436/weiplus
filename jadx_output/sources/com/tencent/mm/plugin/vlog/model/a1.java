package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class a1 {
    public a1(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.util.List paths, java.util.List types, java.util.List sourceFrom) {
        androidx.exifinterface.media.ExifInterface exifInterface;
        int i17;
        kotlin.jvm.internal.o.g(paths, "paths");
        kotlin.jvm.internal.o.g(types, "types");
        kotlin.jvm.internal.o.g(sourceFrom, "sourceFrom");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        for (java.lang.Object obj : paths) {
            int i19 = i18 + 1;
            r8 = null;
            com.tencent.mm.plugin.vlog.model.q1 q1Var = null;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String path = (java.lang.String) obj;
            java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(types, i18);
            if (num != null && num.intValue() == 2) {
                kotlin.jvm.internal.o.g(path, "path");
                try {
                    qc0.d1 b17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.b(path);
                    if (b17 != null) {
                        int i27 = b17.f361363a;
                        int i28 = b17.f361364b;
                        long j17 = b17.f361366d;
                        int i29 = b17.f361368f;
                        if (i29 == 90 || i29 == 270) {
                            i17 = i28;
                        } else {
                            i17 = i27;
                            i27 = i28;
                        }
                        q1Var = new com.tencent.mm.plugin.vlog.model.q1(i17, i27, path, j17);
                    }
                } catch (java.lang.Exception e17) {
                    int i37 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SourceMaterial", e17, "createVideoSource error", new java.lang.Object[0]);
                }
                if (q1Var != null) {
                    q1Var.f175570c = ((java.lang.Number) sourceFrom.get(i18)).intValue();
                    linkedList.add(q1Var);
                }
            } else {
                kotlin.jvm.internal.o.g(path, "path");
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.graphics.e.d(path, options);
                java.io.InputStream E = com.tencent.mm.vfs.w6.E(path);
                if (E != null) {
                    try {
                        exifInterface = new androidx.exifinterface.media.ExifInterface(E);
                        vz5.b.a(E, null);
                    } finally {
                    }
                } else {
                    exifInterface = null;
                }
                java.lang.Integer valueOf = exifInterface != null ? java.lang.Integer.valueOf(exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1)) : null;
                char c17 = (valueOf != null && valueOf.intValue() == 6) ? 'Z' : (valueOf != null && valueOf.intValue() == 3) ? (char) 180 : (valueOf != null && valueOf.intValue() == 8) ? (char) 270 : (char) 0;
                int i38 = options.outWidth;
                int i39 = options.outHeight;
                if (c17 == 'Z' || c17 == 270) {
                    i38 = i39;
                    i39 = i38;
                }
                com.tencent.mm.plugin.vlog.model.o0 o0Var = new com.tencent.mm.plugin.vlog.model.o0(i38, i39, path);
                o0Var.f175570c = ((java.lang.Number) sourceFrom.get(i18)).intValue();
                linkedList.add(o0Var);
            }
            i18 = i19;
        }
        return linkedList;
    }
}
