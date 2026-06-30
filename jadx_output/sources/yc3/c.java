package yc3;

/* loaded from: classes.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showToast";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if ((r2.length() == 0) != false) goto L11;
     */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "duration"
            r1 = 1500(0x5dc, float:2.102E-42)
            r6.optInt(r0, r1)
            java.lang.String r0 = "title"
            java.lang.String r0 = r6.optString(r0)
            java.lang.String r1 = "optString(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r2 = "icon"
            java.lang.String r3 = "success"
            java.lang.String r2 = r6.optString(r2, r3)
            kotlin.jvm.internal.o.f(r2, r1)
            java.lang.String r1 = "mask"
            r6.optBoolean(r1)
            int r6 = r0.length()
            r1 = 0
            r4 = 1
            if (r6 != 0) goto L31
            r6 = r4
            goto L32
        L31:
            r6 = r1
        L32:
            if (r6 != 0) goto L3d
            int r6 = r2.length()
            if (r6 != 0) goto L3b
            r1 = r4
        L3b:
            if (r1 == 0) goto L42
        L3d:
            java.lang.String r6 = "tile or icon empty!"
            r5.h(r4, r6)
        L42:
            int r6 = r2.hashCode()
            r1 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r6 == r1) goto L74
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r6 == r1) goto L65
            r1 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r6 == r1) goto L56
            goto L80
        L56:
            java.lang.String r6 = "error"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L5f
            goto L80
        L5f:
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            db5.t7.g(r6, r0)
            goto L80
        L65:
            java.lang.String r6 = "none"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L6e
            goto L80
        L6e:
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            db5.t7.m(r6, r0)
            goto L80
        L74:
            boolean r6 = r2.equals(r3)
            if (r6 != 0) goto L7b
            goto L80
        L7b:
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            db5.t7.h(r6, r0)
        L80:
            r5.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc3.c.t(lc3.a0):void");
    }
}
