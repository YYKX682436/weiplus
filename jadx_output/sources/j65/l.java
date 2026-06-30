package j65;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final j65.l f297965a = new j65.l();

    public final j65.k a(java.io.DataInputStream dataInputStream) {
        j65.w wVar;
        j65.o oVar;
        int i17;
        int readByte;
        kotlin.jvm.internal.o.g(dataInputStream, "dataInputStream");
        j65.k kVar = new j65.k();
        dataInputStream.readInt();
        dataInputStream.readInt();
        int readInt = dataInputStream.readInt();
        com.tencent.mars.xlog.Log.i("MMStrResourceParser", "string count = %s", java.lang.Integer.valueOf(readInt));
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(readInt);
        int readInt2 = dataInputStream.readInt();
        int i18 = 0;
        for (int i19 = 0; i19 < readInt; i19++) {
            readInt2 += dataInputStream.readShort();
            sparseIntArray.append(readInt2, i18);
            i18 += dataInputStream.readShort();
        }
        byte[] bArr = new byte[i18];
        j65.u uVar = null;
        try {
            if (dataInputStream.read(bArr, 0, i18) != i18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. data length no equal.");
            }
            wVar = new j65.w(sparseIntArray, bArr);
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            wVar = null;
        }
        kVar.f297962a = wVar;
        int readInt3 = dataInputStream.readInt();
        com.tencent.mars.xlog.Log.i("MMStrResourceParser", "plurals string count = %d", java.lang.Integer.valueOf(readInt3));
        if (readInt3 > 0) {
            android.util.SparseArray sparseArray = new android.util.SparseArray(readInt3);
            int readInt4 = dataInputStream.readInt();
            int i27 = 0;
            int i28 = 0;
            while (i27 < readInt3) {
                int readInt5 = dataInputStream.readInt() + readInt4;
                try {
                    readByte = dataInputStream.readByte();
                } catch (java.io.IOException e18) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MMStrResourceParser", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                }
                if (readByte < 0) {
                    i17 = 0;
                    i28 += i17;
                    i27++;
                    readInt4 = readInt5;
                } else {
                    int[] iArr = new int[readByte];
                    int[] iArr2 = new int[readByte];
                    i17 = 0;
                    int i29 = i28;
                    for (int i37 = 0; i37 < readByte; i37++) {
                        iArr[i37] = dataInputStream.readByte();
                        iArr2[i37] = i29;
                        short readShort = dataInputStream.readShort();
                        i17 += readShort;
                        i29 += readShort;
                    }
                    sparseArray.append(readInt5, new j65.n(readInt5, iArr, iArr2));
                    i28 += i17;
                    i27++;
                    readInt4 = readInt5;
                }
            }
            try {
                byte[] bArr2 = new byte[i28];
                if (dataInputStream.read(bArr2, 0, i28) != i28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed. data length no equal.");
                }
                oVar = new j65.o(sparseArray, bArr2);
            } catch (java.io.IOException e19) {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                oVar = null;
            }
            kVar.f297963b = oVar;
        }
        int readInt6 = dataInputStream.readInt();
        int readInt7 = dataInputStream.readInt();
        com.tencent.mars.xlog.Log.i("MMStrResourceParser", "string array count：%d", java.lang.Integer.valueOf(readInt6));
        if (readInt6 > 0) {
            android.util.SparseArray sparseArray2 = new android.util.SparseArray(readInt6);
            int i38 = 0;
            for (int i39 = 0; i39 < readInt6; i39++) {
                readInt7 += dataInputStream.readInt();
                int readInt8 = dataInputStream.readInt();
                int[] iArr3 = new int[readInt8];
                for (int i47 = 0; i47 < readInt8; i47++) {
                    iArr3[i47] = i38;
                    i38 += dataInputStream.readShort();
                }
                sparseArray2.append(readInt7, new j65.t(readInt7, iArr3));
            }
            try {
                byte[] bArr3 = new byte[i38];
                if (dataInputStream.read(bArr3, 0, i38) != i38) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed. data length no equal.");
                }
                uVar = new j65.u(sparseArray2, bArr3);
            } catch (java.io.IOException e27) {
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
            }
            kVar.f297964c = uVar;
        }
        return kVar;
    }
}
