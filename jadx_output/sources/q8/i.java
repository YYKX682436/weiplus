package q8;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f360623c = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f360624a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f360625b = -1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.google.android.exoplayer2.metadata.Metadata r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = r8.f44104d
            int r3 = r2.length
            if (r1 >= r3) goto L4c
            r2 = r2[r1]
            boolean r3 = r2 instanceof com.google.android.exoplayer2.metadata.id3.CommentFrame
            if (r3 == 0) goto L49
            com.google.android.exoplayer2.metadata.id3.CommentFrame r2 = (com.google.android.exoplayer2.metadata.id3.CommentFrame) r2
            java.lang.String r3 = r2.f44128f
            java.lang.String r4 = "iTunSMPB"
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 != 0) goto L1c
        L1a:
            r2 = r0
            goto L46
        L1c:
            java.util.regex.Pattern r3 = q8.i.f360623c
            java.lang.String r2 = r2.f44129g
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.find()
            if (r3 == 0) goto L1a
            java.lang.String r3 = r2.group(r4)     // Catch: java.lang.NumberFormatException -> L1a
            r5 = 16
            int r3 = java.lang.Integer.parseInt(r3, r5)     // Catch: java.lang.NumberFormatException -> L1a
            r6 = 2
            java.lang.String r2 = r2.group(r6)     // Catch: java.lang.NumberFormatException -> L1a
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch: java.lang.NumberFormatException -> L1a
            if (r3 > 0) goto L41
            if (r2 <= 0) goto L1a
        L41:
            r7.f360624a = r3     // Catch: java.lang.NumberFormatException -> L1a
            r7.f360625b = r2     // Catch: java.lang.NumberFormatException -> L1a
            r2 = r4
        L46:
            if (r2 == 0) goto L49
            return r4
        L49:
            int r1 = r1 + 1
            goto L2
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.i.a(com.google.android.exoplayer2.metadata.Metadata):boolean");
    }
}
