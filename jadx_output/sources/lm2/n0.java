package lm2;

/* loaded from: classes3.dex */
public final class n0 extends lm2.c {

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f319430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n0(boolean r3, r45.ch1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r4, r0)
            r2.<init>(r3, r4)
            r45.th1 r3 = new r45.th1
            r3.<init>()
            r0 = 4
            com.tencent.mm.protobuf.g r4 = r4.getByteString(r0)
            r0 = 0
            if (r4 == 0) goto L1a
            byte[] r4 = r4.g()
            goto L1b
        L1a:
            r4 = r0
        L1b:
            java.lang.String r1 = ""
            if (r4 != 0) goto L20
            goto L2e
        L20:
            r3.parseFrom(r4)     // Catch: java.lang.Exception -> L24
            goto L2f
        L24:
            r3 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mm.sdk.platformtools.Log.a(r4, r1, r3)
        L2e:
            r3 = r0
        L2f:
            if (r3 == 0) goto L3a
            java.lang.String r3 = r3.f386424d
            if (r3 != 0) goto L36
            r3 = r1
        L36:
            r2.f319430i = r3
            jz5.f0 r0 = jz5.f0.f302826a
        L3a:
            if (r0 != 0) goto L43
            r45.th1 r3 = new r45.th1
            r3.<init>()
            r2.f319430i = r1
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.n0.<init>(boolean, r45.ch1):void");
    }

    @Override // lm2.c, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof lm2.n0) {
            return super.d(obj);
        }
        return -1;
    }

    @Override // lm2.c
    public java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SysTextBoxMsg content:");
        java.lang.String str = this.f319430i;
        if (str == null) {
            kotlin.jvm.internal.o.o("msgContent");
            throw null;
        }
        sb6.append(str);
        sb6.append(", ");
        sb6.append(super.g());
        return sb6.toString();
    }

    @Override // lm2.i0
    public java.lang.String j() {
        java.lang.String str = this.f319430i;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("msgContent");
        throw null;
    }
}
