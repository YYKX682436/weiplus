package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class a7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f192460a;

    /* renamed from: b, reason: collision with root package name */
    public final android.net.Uri f192461b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f192462c;

    public a7(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str) {
        this.f192460a = contentResolver;
        this.f192461b = uri;
        this.f192462c = str;
    }

    public void a() {
        try {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "item should not be actively deleted");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "MediaStore delete fail: " + th6.getMessage());
        }
    }

    public java.io.OutputStream b() {
        try {
            return this.f192460a.openOutputStream(this.f192461b);
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "MediaStore getOutputStream fail: " + e17.getMessage());
            return null;
        }
    }

    public void c() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("is_pending", (java.lang.Integer) 0);
                this.f192460a.update(this.f192461b, contentValues, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "MediaStore update uri pending failed: " + e17.getMessage());
            }
        }
    }
}
