package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public abstract class i1 {
    public static void a(android.app.Activity activity, android.content.Intent intent, android.content.Intent intent2, java.lang.String str, int i17, com.tencent.mm.ui.tools.h1 h1Var) {
        if (intent == null || intent.getData() == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.AsyncObtainImage", "param error, %b", objArr);
            return;
        }
        if (intent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
            new com.tencent.mm.ui.tools.f1(intent, activity, str, h1Var, intent2, i17).execute(0);
            return;
        }
        java.lang.String b17 = b(activity, intent, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent, filePath:%s", b17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return;
        }
        if (h1Var != null) {
            intent2.putExtra("CropImage_OutputPath", h1Var.a(b17));
        }
        intent2.putExtra("CropImage_ImgPath", b17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/ui/tools/AsyncObtainImage", "asyncResolvePhoto", "(Landroid/app/Activity;Landroid/content/Intent;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/ui/tools/AsyncObtainImage$IOnGenOutputPath;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        if ((r15.a() ? r15.f213266a.F(r15.f213267b) : false) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r13, android.content.Intent r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.i1.b(android.content.Context, android.content.Intent, java.lang.String):java.lang.String");
    }

    public static java.lang.String c(java.lang.String str, android.graphics.Bitmap bitmap) {
        try {
            java.lang.String str2 = str + (kk.k.g(android.text.format.DateFormat.format("yyyy-MM-dd-HH-mm-ss", java.lang.System.currentTimeMillis()).toString().getBytes()) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2);
            if (!r6Var.m()) {
                r6Var.k();
            }
            com.tencent.mm.sdk.platformtools.x.o0(r6Var.o(), new com.tencent.mm.ui.tools.g1(bitmap));
            com.tencent.mars.xlog.Log.i("MicroMsg.AsyncObtainImage", "photo image from data, path:".concat(str2));
            return str2;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e17, "saveBmp Error.", new java.lang.Object[0]);
            return null;
        }
    }
}
