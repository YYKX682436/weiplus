package d7;

/* loaded from: classes13.dex */
public final class p implements t6.f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f226831a = "Exif\u0000\u0000".getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f226832b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    @Override // t6.f
    public com.bumptech.glide.load.ImageHeaderParser$ImageType a(java.io.InputStream inputStream) {
        q7.n.b(inputStream);
        return d(new d7.o(inputStream));
    }

    @Override // t6.f
    public com.bumptech.glide.load.ImageHeaderParser$ImageType b(java.nio.ByteBuffer byteBuffer) {
        q7.n.b(byteBuffer);
        return d(new d7.l(byteBuffer));
    }

    @Override // t6.f
    public int c(java.io.InputStream inputStream, x6.b bVar) {
        int i17;
        q7.n.b(inputStream);
        d7.o oVar = new d7.o(inputStream);
        q7.n.b(bVar);
        int a17 = oVar.a();
        int i18 = -1;
        if (!((a17 & 65496) == 65496 || a17 == 19789 || a17 == 18761)) {
            android.util.Log.isLoggable("DfltImageHeaderParser", 3);
            return i18;
        }
        while (true) {
            java.io.InputStream inputStream2 = oVar.f226829a;
            if (((short) (inputStream2.read() & 255)) == 255) {
                short read = (short) (inputStream2.read() & 255);
                if (read == 218) {
                    break;
                }
                if (read != 217) {
                    i17 = oVar.a() - 2;
                    if (read == 225) {
                        break;
                    }
                    long j17 = i17;
                    if (oVar.skip(j17) != j17) {
                        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                        break;
                    }
                } else {
                    android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
            } else {
                android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                break;
            }
        }
        i17 = -1;
        if (i17 == -1) {
            android.util.Log.isLoggable("DfltImageHeaderParser", 3);
        } else {
            x6.l lVar = (x6.l) bVar;
            byte[] bArr = (byte[]) lVar.c(i17, byte[].class);
            try {
                i18 = e(oVar, bArr, i17);
            } finally {
                lVar.g(bArr);
            }
        }
        return i18;
    }

    public final com.bumptech.glide.load.ImageHeaderParser$ImageType d(d7.n nVar) {
        int a17 = nVar.a();
        if (a17 == 65496) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG;
        }
        int a18 = ((a17 << 16) & (-65536)) | (nVar.a() & 65535);
        if (a18 == -1991225785) {
            nVar.skip(21L);
            return nVar.b() >= 3 ? com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A : com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
        }
        if ((a18 >> 8) == 4671814) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
        }
        if (a18 != 1380533830) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        }
        nVar.skip(4L);
        if ((((nVar.a() << 16) & (-65536)) | (nVar.a() & 65535)) != 1464156752) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        }
        int a19 = ((nVar.a() << 16) & (-65536)) | (nVar.a() & 65535);
        if ((a19 & (-256)) != 1448097792) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        }
        int i17 = a19 & 255;
        if (i17 == 88) {
            nVar.skip(4L);
            return (nVar.b() & 16) != 0 ? com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A : com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
        }
        if (i17 != 76) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
        }
        nVar.skip(4L);
        return (nVar.b() & 8) != 0 ? com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A : com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
    }

    public final int e(d7.n nVar, byte[] bArr, int i17) {
        java.nio.ByteOrder byteOrder;
        if (nVar.c(bArr, i17) != i17) {
            android.util.Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = f226831a;
        boolean z17 = bArr != null && i17 > bArr2.length;
        if (z17) {
            int i18 = 0;
            while (true) {
                if (i18 >= bArr2.length) {
                    break;
                }
                if (bArr[i18] != bArr2[i18]) {
                    z17 = false;
                    break;
                }
                i18++;
            }
        }
        if (!z17) {
            android.util.Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        d7.m mVar = new d7.m(bArr, i17);
        short a17 = mVar.a(6);
        if (a17 == 18761) {
            byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        } else if (a17 != 19789) {
            android.util.Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        }
        java.nio.ByteBuffer byteBuffer = mVar.f226824a;
        byteBuffer.order(byteOrder);
        int i19 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
        short a18 = mVar.a(i19);
        for (int i27 = 0; i27 < a18; i27++) {
            int i28 = i19 + 2 + (i27 * 12);
            if (mVar.a(i28) == 274) {
                short a19 = mVar.a(i28 + 2);
                if (a19 < 1 || a19 > 12) {
                    android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i29 = i28 + 4;
                    int i37 = byteBuffer.remaining() - i29 >= 4 ? byteBuffer.getInt(i29) : -1;
                    if (i37 < 0) {
                        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                        int i38 = i37 + f226832b[a19];
                        if (i38 > 4) {
                            android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i39 = i28 + 8;
                            if (i39 < 0 || i39 > byteBuffer.remaining()) {
                                android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i38 >= 0 && i38 + i39 <= byteBuffer.remaining()) {
                                    return mVar.a(i39);
                                }
                                android.util.Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
