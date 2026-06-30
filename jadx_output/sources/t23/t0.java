package t23;

/* loaded from: classes10.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f415267a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f415268b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.SparseArray f415269c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f415270d;

    /* renamed from: e, reason: collision with root package name */
    public int f415271e;

    public t0() {
        long j17;
        this.f415267a = 5;
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (defaultSharedPreferences.getInt("com.tencent.mm.plugin.gallery.cache.cache-up-to-date", 0) == 0) {
            defaultSharedPreferences.edit().putInt("com.tencent.mm.plugin.gallery.cache.cache-up-to-date", 1).apply();
            java.lang.String str = lp0.b.D() + "diskcache";
            com.tencent.mars.xlog.Log.i("MicroMsg.DiskCache", str);
            com.tencent.mm.vfs.w6.f(str);
        }
        try {
            android.os.StatFs statFs = new android.os.StatFs(lp0.b.e0());
            j17 = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (java.lang.Exception unused) {
            j17 = 0;
        }
        int i17 = (int) (((((float) j17) / 1024.0f) / 1024.0f) / 1024.0f);
        if (i17 < 64) {
            this.f415267a = 5;
        } else if (i17 < 128) {
            this.f415267a = 10;
        }
        int i18 = android.preference.PreferenceManager.getDefaultSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193071a).getInt("com.tencent.mm.plugin.gallery.cache.cache-file-num", 0);
        if (i18 == 0 || i18 != this.f415267a) {
            java.lang.String e17 = e();
            if (e17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DiskCache", "cache path: %s.", e17);
                com.tencent.mm.vfs.w6.f(e17);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "shared storage is not currently available.");
            }
        }
        android.preference.PreferenceManager.getDefaultSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193071a).edit().putInt("com.tencent.mm.plugin.gallery.cache.cache-file-num", this.f415267a).apply();
        java.lang.String e18 = e();
        if (e18 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DiskCache", "use old dir!!!");
            e18 = lp0.b.D() + "diskcache";
        }
        com.tencent.mm.vfs.r6 r6Var = !com.tencent.mm.sdk.platformtools.t8.K0(e18) ? new com.tencent.mm.vfs.r6(e18) : null;
        if (r6Var == null) {
            throw new java.lang.IllegalArgumentException("save dir is null");
        }
        if (!r6Var.y()) {
            r6Var.J();
            r6Var.o();
        }
        this.f415268b = r6Var;
        this.f415270d = new android.util.SparseArray();
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "want close %s fail: %s", closeable.getClass().getName(), e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void b() {
        android.util.SparseArray sparseArray = this.f415269c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return;
        }
        for (int i17 = 0; i17 < this.f415269c.size(); i17++) {
            a((java.io.RandomAccessFile) this.f415269c.valueAt(i17));
        }
        this.f415269c.clear();
    }

    public final void c(int i17) {
        android.util.SparseArray sparseArray = this.f415269c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f415269c == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.DiskCache", "file map is invalid, is null? [%s]", objArr);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = this.f415268b;
        if (i17 < 0) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l("cache.idx", false, true);
            com.tencent.mm.vfs.z7 z7Var = r6Var == null ? com.tencent.mm.vfs.z7.f213276i : r6Var.f213166d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str = z7Var.f213279f;
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
            if (m17.a()) {
                m17.f213266a.d(m17.f213267b);
            }
            this.f415270d.clear();
        } else {
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i18 = 0; i18 < this.f415270d.size(); i18++) {
                r45.mz3 mz3Var = (r45.mz3) this.f415270d.valueAt(i18);
                if (mz3Var.f380942g != i17) {
                    sparseArray2.put(this.f415270d.keyAt(i18), mz3Var);
                }
            }
            this.f415270d = sparseArray2;
            i();
        }
        if (i17 >= 0) {
            a((java.io.Closeable) this.f415269c.get(i17));
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(f(i17), false, true);
            com.tencent.mm.vfs.z7 z7Var2 = r6Var == null ? com.tencent.mm.vfs.z7.f213276i : r6Var.f213166d;
            if (l18 != null && !l18.isEmpty()) {
                java.lang.String str2 = z7Var2.f213279f;
                z7Var2 = new com.tencent.mm.vfs.z7(z7Var2.f213277d, z7Var2.f213278e, str2 + '/' + l18, z7Var2.f213280g, z7Var2.f213281h);
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(z7Var2, null);
            if (m18.a()) {
                m18.f213266a.d(m18.f213267b);
                return;
            }
            return;
        }
        b();
        int i19 = 0;
        while (true) {
            int i27 = this.f415267a;
            if (i19 >= i27) {
                return;
            }
            java.lang.String l19 = com.tencent.mm.vfs.e8.l(f(i27), false, true);
            com.tencent.mm.vfs.z7 z7Var3 = r6Var == null ? com.tencent.mm.vfs.z7.f213276i : r6Var.f213166d;
            if (l19 != null && !l19.isEmpty()) {
                java.lang.String str3 = z7Var3.f213279f;
                z7Var3 = new com.tencent.mm.vfs.z7(z7Var3.f213277d, z7Var3.f213278e, str3 + '/' + l19, z7Var3.f213280g, z7Var3.f213281h);
            }
            com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(z7Var3, null);
            if (m19.a()) {
                m19.f213266a.d(m19.f213267b);
            }
            i19++;
        }
    }

    public android.graphics.Bitmap d(int i17) {
        android.util.SparseArray sparseArray = this.f415269c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "want to get bitmap, but data file is null");
            return null;
        }
        r45.mz3 mz3Var = (r45.mz3) this.f415270d.get(i17);
        if (mz3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DiskCache", "oh!!! indexNode is null!!!");
            return null;
        }
        try {
            byte[] bArr = new byte[mz3Var.f380941f];
            java.io.RandomAccessFile randomAccessFile = (java.io.RandomAccessFile) this.f415269c.get(mz3Var.f380942g);
            randomAccessFile.seek(mz3Var.f380940e);
            randomAccessFile.read(bArr, 0, mz3Var.f380941f);
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
            if (G != null) {
                G.getWidth();
                G.getHeight();
            } else {
                this.f415270d.remove(i17);
            }
            return G;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DiskCache", "read data fail, key[%d]: %s", java.lang.Integer.valueOf(i17), th6.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", th6, "", new java.lang.Object[0]);
            this.f415270d.remove(i17);
            return null;
        }
    }

    public final java.lang.String e() {
        try {
            return com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir()).o() + "/imgcache";
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String f(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache.data");
        java.lang.String str = "";
        if (i17 != 0) {
            str = "" + i17;
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final void g(int i17) {
        try {
            android.util.SparseArray sparseArray = this.f415269c;
            com.tencent.mm.vfs.r6 r6Var = this.f415268b;
            if (sparseArray == null) {
                this.f415269c = new android.util.SparseArray();
                for (int i18 = 0; i18 < this.f415267a; i18++) {
                    this.f415269c.put(i18, com.tencent.mm.vfs.w6.B(r6Var + "/" + f(i18), true));
                }
                return;
            }
            if (i17 >= 0) {
                java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(r6Var + "/" + f(i17), true);
                a((java.io.Closeable) this.f415269c.get(i17));
                this.f415269c.put(i17, B);
                return;
            }
            b();
            for (int i19 = 0; i19 < this.f415267a; i19++) {
                this.f415269c.put(i19, com.tencent.mm.vfs.w6.B(r6Var + "/" + f(i19), true));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "load data file error: %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
            this.f415269c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public void h(int i17, android.graphics.Bitmap bitmap) {
        android.util.SparseArray sparseArray = this.f415269c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f415269c != null ? 0 : 1);
            com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "want to put bitmap, but data file is invalid, is null?[%s]", objArr);
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(bitmap != null ? 0 : 1);
            com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "put bmp, value error, bmp is null? [%s]", objArr2);
            return;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        android.util.SparseArray sparseArray2 = this.f415269c;
        int i18 = -1;
        if (sparseArray2 != null && sparseArray2.size() > 0) {
            android.util.SparseArray sparseArray3 = this.f415269c;
            if (sparseArray3 != null && sparseArray3.size() > 0) {
                int i19 = 0;
                while (true) {
                    try {
                        if (i19 >= this.f415269c.size()) {
                            break;
                        }
                        java.io.RandomAccessFile randomAccessFile = (java.io.RandomAccessFile) this.f415269c.valueAt(i19);
                        randomAccessFile.length();
                        if (randomAccessFile.length() < 52428800) {
                            i18 = i19;
                            break;
                        }
                        i19++;
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            if (i18 < 0) {
                int i27 = this.f415271e + 1;
                i18 = i27 >= this.f415267a ? 0 : i27;
                c(i18);
                g(i18);
            }
        }
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "impossible!!! put bmp, file suffix < 0");
            return;
        }
        r45.mz3 mz3Var = (r45.mz3) this.f415270d.get(i17);
        if (mz3Var == null) {
            mz3Var = new r45.mz3();
            mz3Var.f380939d = i17;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            java.lang.System.currentTimeMillis();
            java.io.RandomAccessFile randomAccessFile2 = (java.io.RandomAccessFile) this.f415269c.get(i18);
            mz3Var.f380940e = randomAccessFile2.length();
            mz3Var.f380942g = i18;
            mz3Var.f380941f = byteArrayOutputStream.size();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            randomAccessFile2.seek(mz3Var.f380940e);
            randomAccessFile2.write(byteArray);
            this.f415271e = i18;
            java.lang.System.currentTimeMillis();
            this.f415270d.put(i17, mz3Var);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void i() {
        r45.mz3 mz3Var;
        r45.lz3 lz3Var = new r45.lz3();
        for (int i17 = 0; i17 < this.f415270d.size(); i17++) {
            try {
                mz3Var = (r45.mz3) this.f415270d.valueAt(i17);
            } catch (java.lang.ClassCastException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e17, "saveIndex ClassCastException.", new java.lang.Object[0]);
                mz3Var = null;
            }
            if (mz3Var != null) {
                lz3Var.f379997d.add(mz3Var);
                int i18 = mz3Var.f380939d;
            }
        }
        try {
            com.tencent.mm.sdk.platformtools.t8.W1(new com.tencent.mm.vfs.r6(this.f415268b, "cache.idx").o(), lz3Var.toByteArray());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "save index data error: %s", e18.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e18, "", new java.lang.Object[0]);
        }
    }
}
