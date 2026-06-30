package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

/* loaded from: classes16.dex */
public class Mp4SeekTable implements com.tencent.qqmusic.mediaplayer.seektable.SeekTable {
    private final java.util.Map<java.lang.String, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box> essentialStblChunkMap;
    private final com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd mdhd;

    /* loaded from: classes16.dex */
    public interface Function1<T, R> {
        R call(T t17);
    }

    public Mp4SeekTable() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.essentialStblChunkMap = hashMap;
        hashMap.put("stco", new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco());
        hashMap.put("co64", new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64());
        hashMap.put("stts", new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts());
        hashMap.put("stsc", new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc());
        hashMap.put("stsz", new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz());
        this.mdhd = new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd();
    }

    private static void chunkOfSample(com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc stsc, int i17, int[] iArr) {
        boolean z17;
        int entryCount = stsc.getEntryCount();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 1;
        while (true) {
            int i29 = stsc.getFirstChunk()[i18];
            int i37 = ((i29 - i28) * i19) + i27;
            if (i17 < i37) {
                z17 = true;
                break;
            }
            i19 = stsc.getSamplesPerChunk()[i18];
            if (i18 < entryCount) {
                i18++;
                i27 = i37;
            }
            if (i18 >= entryCount) {
                z17 = false;
                i28 = i29;
                break;
            }
            i28 = i29;
        }
        int i38 = i19 != 0 ? z17 ? ((i17 - i27) / i19) + i28 : i28 : 1;
        iArr[0] = i38;
        iArr[1] = i27 + ((i38 - i28) * i19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needMoreChunks(java.util.HashSet<java.lang.String> hashSet) {
        if (hashSet.size() > 2) {
            return true;
        }
        return hashSet.contains("stco") && hashSet.contains("co64");
    }

    private static long offset64OfChunk(com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64 co64, int i17) {
        if (i17 > co64.getEntryCount()) {
            return co64.getChunkOffset()[co64.getEntryCount() - 1];
        }
        if (co64.getEntryCount() > 0) {
            return co64.getChunkOffset()[i17 - 1];
        }
        return 8L;
    }

    private static int offsetOfChunk(com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco stco, int i17) {
        if (i17 > stco.getEntryCount()) {
            return stco.getChunkOffset()[stco.getEntryCount() - 1];
        }
        if (stco.getEntryCount() > 0) {
            return stco.getChunkOffset()[i17 - 1];
        }
        return 8;
    }

    private static int offsetOfSampleInChunk(com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz stsz, int i17, int i18) {
        if (stsz.getSampleSize() != 0) {
            return (i17 - i18) * stsz.getSampleSize();
        }
        int min = java.lang.Math.min(i17, stsz.getSampleCount());
        int i19 = 0;
        while (i18 < min) {
            i19 += stsz.getEntrySize()[i18];
            i18++;
        }
        return i19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("invalid box: critical box not found!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r8.call(r1).booleanValue() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseChunks(com.tencent.qqmusic.mediaplayer.seektable.Parsable r6, java.util.Map<java.lang.String, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box> r7, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.Function1<java.util.HashSet<java.lang.String>, java.lang.Boolean> r8) {
        /*
            com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox r0 = new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r2 = r7.keySet()
            r1.<init>(r2)
        Le:
            if (r8 == 0) goto L1c
            java.lang.Object r2 = r8.call(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4e
        L1c:
            int r2 = r1.size()
            if (r2 == 0) goto L4e
            long r2 = r6.available()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4e
            r2 = 0
            r0.parse(r6, r2)
            java.lang.String r2 = r0.getType()
            java.lang.Object r3 = r7.get(r2)
            com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box r3 = (com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box) r3
            if (r3 != 0) goto L47
            long r2 = r0.getSize()
            r4 = 8
            long r2 = r2 - r4
            r6.skip(r2)
            goto Le
        L47:
            r3.parse(r6, r0)
            r1.remove(r2)
            goto Le
        L4e:
            if (r8 == 0) goto L65
            java.lang.Object r6 = r8.call(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            goto L65
        L5d:
            com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException r6 = new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException
            java.lang.String r7 = "invalid box: critical box not found!"
            r6.<init>(r7)
            throw r6
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.parseChunks(com.tencent.qqmusic.mediaplayer.seektable.Parsable, java.util.Map, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable$Function1):void");
    }

    private static int sampleOfTime(com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts stts, int i17) {
        int entryCount = stts.getEntryCount();
        boolean z17 = false;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i18 >= entryCount) {
                break;
            }
            i27 = stts.getSampleDelta()[i18];
            int i28 = stts.getSampleCount()[i18];
            int i29 = i28 * i27;
            if (i17 < i29) {
                z17 = true;
                break;
            }
            i17 -= i29;
            i19 += i28;
            i18++;
        }
        return z17 ? i19 + (i17 / i27) : i19;
    }

    private long seekInternal(int i17) {
        long offset64OfChunk;
        int[] iArr = new int[2];
        chunkOfSample((com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc) this.essentialStblChunkMap.get("stsc"), sampleOfTime((com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts) this.essentialStblChunkMap.get("stts"), i17), iArr);
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (this.essentialStblChunkMap.get("stco").getSize() != 0) {
            offset64OfChunk = offsetOfChunk((com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco) this.essentialStblChunkMap.get("stco"), i18);
        } else {
            if (this.essentialStblChunkMap.get("co64").getSize() == 0) {
                throw new java.lang.RuntimeException("invalid stbl: both [stco] nor [co64] was found!");
            }
            offset64OfChunk = offset64OfChunk((com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64) this.essentialStblChunkMap.get("co64"), i18);
        }
        return offset64OfChunk + offsetOfSampleInChunk((com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz) this.essentialStblChunkMap.get("stsz"), r9, i19);
    }

    private static com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box seekTo(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, java.lang.String str) {
        com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox ghostBox = new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox();
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
        com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox ghostBox2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            boolean z17 = false;
            while (true) {
                if (!z17 && parsable.available() > 0) {
                    ghostBox.parse(parsable, null);
                    if (!nextToken.equalsIgnoreCase(ghostBox.getType())) {
                        parsable.skip(ghostBox.getSize() - 8);
                    } else {
                        if (!stringTokenizer.hasMoreTokens()) {
                            ghostBox2 = ghostBox;
                            break;
                        }
                        z17 = true;
                    }
                }
            }
        }
        return ghostBox2;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper parsableInputStreamWrapper = new com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper(iDataSource);
        if (seekTo(parsableInputStreamWrapper, "moov.trak.mdia") == null) {
            throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("invalid mp4: no [mdia] was found!");
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("mdhd", this.mdhd);
        hashMap.put("minf", new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox());
        parseChunks(parsableInputStreamWrapper, hashMap, null);
        if (seekTo(parsableInputStreamWrapper, "stbl") == null) {
            throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("invalid mp4: no [stbl] was found!");
        }
        parseChunks(parsableInputStreamWrapper, this.essentialStblChunkMap, new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.Function1<java.util.HashSet<java.lang.String>, java.lang.Boolean>() { // from class: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.1
            @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.Function1
            public java.lang.Boolean call(java.util.HashSet<java.lang.String> hashSet) {
                return java.lang.Boolean.valueOf(com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.needMoreChunks(hashSet));
            }
        });
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j17) {
        return seekInternal((int) java.lang.Math.round((this.mdhd.getTimeScale() * j17) / 1000.0d));
    }
}
