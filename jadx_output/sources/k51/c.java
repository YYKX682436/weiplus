package k51;

/* loaded from: classes12.dex */
public class c {
    public static final long a(long j17, java.lang.String str) {
        if (j17 >= 0) {
            return j17;
        }
        throw new k51.b("Bad value for " + str + ": " + j17);
    }

    public static void b(java.io.DataInputStream dataInputStream, java.util.List list, java.util.List list2) {
        try {
            int readInt = dataInputStream.readInt();
            a(readInt, "deltaFriendlyNewFileWorkRangeLength - readMinEntry");
            for (int i17 = 0; i17 < readInt; i17++) {
                dataInputStream.readInt();
                dataInputStream.readLong();
                dataInputStream.readLong();
                dataInputStream.readLong();
                long readInt2 = dataInputStream.readInt();
                a(readInt2, "readMinEntry - getGeneralPurposeFlagBit11");
                dataInputStream.readLong();
                dataInputStream.readLong();
                long readInt3 = dataInputStream.readInt();
                a(readInt3, "readMinEntry - getFileNameBytesSize");
                if (readInt3 > 0) {
                    if (list == null || !list.contains(java.lang.Long.valueOf(i17))) {
                        dataInputStream.skipBytes((int) readInt3);
                    } else {
                        byte[] bArr = new byte[(int) readInt3];
                        dataInputStream.readFully(bArr);
                        list2.add(i51.a.a(bArr, readInt2 == 1));
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public m51.e c(java.io.DataInputStream dataInputStream) {
        java.lang.String str;
        byte[] bytes = "MMPATCH7Z1_0".getBytes("US-ASCII");
        byte[] bArr = new byte[bytes.length];
        dataInputStream.readFully(bArr);
        if (!java.util.Arrays.equals(bytes, bArr)) {
            throw new k51.b("Bad identifier");
        }
        dataInputStream.skip(4L);
        long readLong = dataInputStream.readLong();
        a(readLong, "delta-friendly old file size");
        int readInt = dataInputStream.readInt();
        if (readInt > 0) {
            byte[] bArr2 = new byte[readInt];
            dataInputStream.readFully(bArr2);
            str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        } else {
            str = "";
        }
        long readLong2 = dataInputStream.readLong();
        a(readLong2, "newFileSize file size");
        com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchReader", "checkNonNegative, newFileSize = " + readLong2 + ", newFileMD5Length = " + readInt + ", newFileMD5 = " + str);
        java.lang.System.out.println("checkNonNegative, newFileSize = " + readLong2 + ", newFileMD5Length = " + readInt + ", newFileMD5 = " + str);
        long readInt2 = (long) dataInputStream.readInt();
        a(readInt2, "old file uncompression instruction count");
        int i17 = (int) readInt2;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        int i18 = 0;
        long j17 = -1;
        while (i18 < i17) {
            long readLong3 = dataInputStream.readLong();
            a(readLong3, "old file uncompression range offset");
            long j18 = readLong2;
            long readLong4 = dataInputStream.readLong();
            a(readLong4, "old file uncompression range length");
            long j19 = readLong;
            long readInt3 = dataInputStream.readInt();
            a(readInt3, "delta-friendly new file recompression range length");
            boolean z17 = readInt3 == 1;
            if (readLong3 < j17) {
                throw new k51.b("old file uncompression ranges out of order or overlapping");
            }
            arrayList.add(new h51.j(readLong3, readLong4, null, z17));
            j17 = readLong3 + readLong4;
            i18++;
            readLong2 = j18;
            readLong = j19;
        }
        long j27 = readLong;
        long j28 = readLong2;
        int readInt4 = dataInputStream.readInt();
        a(readInt4, "numDeltaFriendlyNewFileRecompressionInstructions");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt4);
        long j29 = -1;
        for (int i19 = 0; i19 < readInt4; i19++) {
            long readLong5 = dataInputStream.readLong();
            a(readLong5, "delta-friendly new file recompression range offset");
            long readLong6 = dataInputStream.readLong();
            a(readLong6, "delta-friendly new file recompression range length");
            long readInt5 = dataInputStream.readInt();
            a(readInt5, "isDeflateCompressedIndex");
            boolean z18 = readInt5 == 1;
            if (readLong5 < j29) {
                throw new k51.b("delta-friendly new file recompression ranges out of order or overlapping");
            }
            j29 = readLong5 + readLong6;
            arrayList2.add(new h51.j(readLong5, readLong6, null, z18));
        }
        int readInt6 = dataInputStream.readInt();
        a(readInt6, "mapSizePosNewToOldSize");
        for (int i27 = 0; i27 < readInt6; i27++) {
            dataInputStream.readLong();
            dataInputStream.readLong();
        }
        int readInt7 = dataInputStream.readInt();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(readInt7);
        for (int i28 = 0; i28 < readInt7; i28++) {
            long readLong7 = dataInputStream.readLong();
            a(readLong7, "newPosIndex - error");
            arrayList3.add(java.lang.Long.valueOf(readLong7));
        }
        java.util.Collections.sort(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.System.currentTimeMillis();
        b(dataInputStream, arrayList3, arrayList4);
        b(dataInputStream, null, arrayList4);
        long readInt8 = dataInputStream.readInt();
        if (readInt8 < 1 || readInt8 > 1) {
            throw new k51.b("Bad value for num delta records: " + readInt8 + " (valid range: [1,1]");
        }
        int i29 = (int) readInt8;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(i29);
        int i37 = 0;
        while (i37 < i29) {
            dataInputStream.readByte();
            long readLong8 = dataInputStream.readLong();
            a(readLong8, "deltaDescriptors - deltaFriendlyOldFileWorkRangeOffset");
            long readLong9 = dataInputStream.readLong();
            a(readLong9, "deltaDescriptors - deltaFriendlyOldFileWorkRangeLength");
            long readLong10 = dataInputStream.readLong();
            a(readLong10, "deltaDescriptors - deltaFriendlyNewFileWorkRangeOffset");
            long readLong11 = dataInputStream.readLong();
            a(readLong11, "deltaDescriptors - deltaFriendlyNewFileWorkRangeLength");
            java.util.ArrayList arrayList6 = arrayList2;
            long readLong12 = dataInputStream.readLong();
            a(readLong12, "delta length");
            arrayList5.add(new m51.a(new h51.j(readLong8, readLong9, null), new h51.j(readLong10, readLong11, null), readLong12));
            i37++;
            arrayList4 = arrayList4;
            arrayList2 = arrayList6;
            i29 = i29;
            arrayList3 = arrayList3;
            str = str;
        }
        return new m51.e(java.util.Collections.unmodifiableList(arrayList), java.util.Collections.unmodifiableList(arrayList2), j27, java.util.Collections.unmodifiableList(arrayList5), str, j28, ((m51.a) arrayList5.get(0)).f323524a.f279035e, ((m51.a) arrayList5.get(0)).f323525b.f279035e, arrayList3, arrayList4);
    }
}
