package zu3;

/* loaded from: classes10.dex */
public final class j extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f475810g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Matrix f475811h;

    public /* synthetic */ j(com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, int i17, kotlin.jvm.internal.i iVar) {
        this(iEmojiInfo, (i17 & 2) != 0 ? new android.graphics.Matrix() : matrix, (i17 & 4) != 0 ? new android.graphics.Matrix() : matrix2);
    }

    @Override // zu3.o
    public com.tencent.mm.protobuf.f toProtoBuf() {
        java.lang.String str;
        java.lang.String name;
        r45.si0 si0Var = new r45.si0();
        java.lang.String str2 = "";
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f475810g;
        if (iEmojiInfo == null || (str = iEmojiInfo.getMd5()) == null) {
            str = "";
        }
        si0Var.f385753d = str;
        if (iEmojiInfo != null && (name = iEmojiInfo.getName()) != null) {
            str2 = name;
        }
        si0Var.f385754e = str2;
        si0Var.f385755f = f(this.f475763f);
        si0Var.f385756g = f(this.f475811h);
        si0Var.f385757h = e();
        return si0Var;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]md5:");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f475810g;
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        sb6.append(" name:");
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getName() : null);
        return sb6.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.graphics.Matrix showMatrix, android.graphics.Matrix editorMatrix) {
        super(zu3.e.f475797f);
        kotlin.jvm.internal.o.g(showMatrix, "showMatrix");
        kotlin.jvm.internal.o.g(editorMatrix, "editorMatrix");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f475811h = matrix;
        this.f475810g = iEmojiInfo;
        matrix.set(showMatrix);
        this.f475763f.set(editorMatrix);
        java.lang.String jVar = toString();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiItem", jVar, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035 A[Catch: IOException -> 0x0090, TryCatch #1 {IOException -> 0x0090, blocks: (B:3:0x0013, B:8:0x0035, B:10:0x007d, B:11:0x0086, B:20:0x0027, B:17:0x0022), top: B:2:0x0013, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(r45.de r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.EmojiItem"
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.o.g(r8, r1)
            zu3.e r1 = zu3.e.f475797f
            r7.<init>(r1)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r7.f475811h = r1
            r45.si0 r1 = new r45.si0     // Catch: java.io.IOException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L90
            r45.cu5 r8 = r8.f372339e     // Catch: java.io.IOException -> L90
            com.tencent.mm.protobuf.g r8 = r8.f371841f     // Catch: java.io.IOException -> L90
            byte[] r8 = r8.f192156a     // Catch: java.io.IOException -> L90
            r2 = 0
            if (r8 != 0) goto L22
            goto L32
        L22:
            r1.parseFrom(r8)     // Catch: java.lang.Exception -> L26
            goto L33
        L26:
            r8 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.String r3 = ""
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.io.IOException -> L90
            com.tencent.mm.sdk.platformtools.Log.a(r1, r3, r8)     // Catch: java.io.IOException -> L90
        L32:
            r1 = r2
        L33:
            if (r1 == 0) goto L9b
            java.lang.Class<com.tencent.mm.feature.emoji.api.f6> r8 = com.tencent.mm.feature.emoji.api.f6.class
            i95.m r8 = i95.n0.c(r8)     // Catch: java.io.IOException -> L90
            com.tencent.mm.feature.emoji.api.f6 r8 = (com.tencent.mm.feature.emoji.api.f6) r8     // Catch: java.io.IOException -> L90
            java.lang.String r3 = r1.f385753d     // Catch: java.io.IOException -> L90
            com.tencent.mm.feature.emoji.p1 r8 = (com.tencent.mm.feature.emoji.p1) r8     // Catch: java.io.IOException -> L90
            r8.getClass()     // Catch: java.io.IOException -> L90
            java.lang.Class<k12.s> r8 = k12.s.class
            i95.m r8 = i95.n0.c(r8)     // Catch: java.io.IOException -> L90
            k12.s r8 = (k12.s) r8     // Catch: java.io.IOException -> L90
            g30.h r8 = (g30.h) r8     // Catch: java.io.IOException -> L90
            s25.b r8 = r8.Bi()     // Catch: java.io.IOException -> L90
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r8.y(r3)     // Catch: java.io.IOException -> L90
            r7.f475810g = r8     // Catch: java.io.IOException -> L90
            android.graphics.Matrix r8 = r7.f475811h     // Catch: java.io.IOException -> L90
            r45.zz6 r3 = r1.f385756g     // Catch: java.io.IOException -> L90
            java.lang.String r4 = "showMatrix"
            kotlin.jvm.internal.o.f(r3, r4)     // Catch: java.io.IOException -> L90
            float[] r3 = r7.g(r3)     // Catch: java.io.IOException -> L90
            r8.setValues(r3)     // Catch: java.io.IOException -> L90
            android.graphics.Matrix r8 = r7.f475763f     // Catch: java.io.IOException -> L90
            r45.zz6 r3 = r1.f385755f     // Catch: java.io.IOException -> L90
            java.lang.String r4 = "editorMatrix"
            kotlin.jvm.internal.o.f(r3, r4)     // Catch: java.io.IOException -> L90
            float[] r3 = r7.g(r3)     // Catch: java.io.IOException -> L90
            r8.setValues(r3)     // Catch: java.io.IOException -> L90
            r45.bi0 r8 = r1.f385757h     // Catch: java.io.IOException -> L90
            if (r8 == 0) goto L86
            long r3 = r8.f370772d     // Catch: java.io.IOException -> L90
            long r5 = r8.f370773e     // Catch: java.io.IOException -> L90
            bv3.d r8 = r7.f475760c     // Catch: java.io.IOException -> L90
            r8.d(r3, r5)     // Catch: java.io.IOException -> L90
        L86:
            java.lang.String r8 = r7.toString()     // Catch: java.io.IOException -> L90
            int r1 = rl.b.f397143a     // Catch: java.io.IOException -> L90
            com.tencent.mars.xlog.Log.i(r0, r8, r2)     // Catch: java.io.IOException -> L90
            goto L9b
        L90:
            r8 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = rl.b.f397143a
            java.lang.String r2 = "EmojiItem parse error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r8, r2, r1)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.j.<init>(r45.de):void");
    }
}
