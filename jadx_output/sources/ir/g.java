package ir;

/* loaded from: classes12.dex */
public final class g extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f293836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f293837c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f293838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f293839e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(com.tencent.mm.api.IEmojiInfo r4, int r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "emojiInfo"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "sosDocId"
            kotlin.jvm.internal.o.g(r6, r0)
            qk.x6 r0 = r4.m1()
            r1 = -1
            if (r0 != 0) goto L14
            r0 = r1
            goto L1c
        L14:
            int[] r2 = ir.w0.f293911a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L1c:
            if (r0 == r1) goto L23
            r1 = 1
            if (r0 == r1) goto L23
            r0 = 6
            goto L24
        L23:
            r0 = 0
        L24:
            r3.<init>(r0)
            r3.f293836b = r4
            r3.f293837c = r5
            r3.f293838d = r6
            r3.f293839e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.g.<init>(com.tencent.mm.api.IEmojiInfo, int, java.lang.String, int):void");
    }

    @Override // ir.u0
    public boolean a(java.lang.Object obj) {
        if (equals(obj) && (obj instanceof ir.g)) {
            ir.g gVar = (ir.g) obj;
            qk.x6 m17 = gVar.f293836b.m1();
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f293836b;
            if (m17 == iEmojiInfo.m1() && gVar.f293836b.getIndex() == iEmojiInfo.getIndex() && gVar.f293836b.s1() == iEmojiInfo.s1() && gVar.f293837c == this.f293837c && gVar.f293836b.V() == iEmojiInfo.V()) {
                return true;
            }
        }
        return false;
    }

    @Override // ir.u0
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof ir.g)) {
            ir.g gVar = (ir.g) obj;
            java.lang.String md52 = gVar.f293836b.getMd5();
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f293836b;
            if (kotlin.jvm.internal.o.b(md52, iEmojiInfo.getMd5()) || (iEmojiInfo.b1() != 0 && gVar.f293836b.b1() == iEmojiInfo.b1())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ g(com.tencent.mm.api.IEmojiInfo iEmojiInfo, int i17, java.lang.String str, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(iEmojiInfo, i17, (i19 & 4) != 0 ? "" : str, (i19 & 8) != 0 ? 0 : i18);
    }
}
