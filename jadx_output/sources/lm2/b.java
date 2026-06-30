package lm2;

/* loaded from: classes3.dex */
public final class b extends lm2.c {

    /* renamed from: i, reason: collision with root package name */
    public r45.gi1 f319367i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f319368m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f319369n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(boolean r3, r45.ch1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r4, r0)
            r2.<init>(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f319369n = r3
            r45.gi1 r3 = new r45.gi1
            r3.<init>()
            r0 = 4
            com.tencent.mm.protobuf.g r4 = r4.getByteString(r0)
            r0 = 0
            if (r4 == 0) goto L21
            byte[] r4 = r4.g()
            goto L22
        L21:
            r4 = r0
        L22:
            java.lang.String r1 = ""
            if (r4 != 0) goto L27
            goto L35
        L27:
            r3.parseFrom(r4)     // Catch: java.lang.Exception -> L2b
            goto L36
        L2b:
            r3 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mm.sdk.platformtools.Log.a(r4, r1, r3)
        L35:
            r3 = r0
        L36:
            if (r3 == 0) goto L5a
            r2.f319367i = r3
            r4 = 0
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L42
            goto L43
        L42:
            r1 = r3
        L43:
            r2.f319368m = r1
            java.util.ArrayList r3 = r2.f319369n
            r45.gi1 r4 = r2.f319367i
            if (r4 == 0) goto L54
            r0 = 1
            java.util.LinkedList r4 = r4.getList(r0)
            r3.addAll(r4)
            goto L63
        L54:
            java.lang.String r3 = "payload"
            kotlin.jvm.internal.o.o(r3)
            throw r0
        L5a:
            r45.gi1 r3 = new r45.gi1
            r3.<init>()
            r2.f319367i = r3
            r2.f319368m = r1
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.b.<init>(boolean, r45.ch1):void");
    }

    @Override // lm2.c, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof lm2.b) {
            return super.d(obj);
        }
        return -1;
    }

    @Override // lm2.c
    public java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AtBoxMsg, content:");
        java.lang.String str = this.f319368m;
        if (str == null) {
            kotlin.jvm.internal.o.o("msgContent");
            throw null;
        }
        sb6.append(str);
        sb6.append(", contacts:");
        sb6.append(kz5.n0.g0(this.f319369n, null, null, null, 0, null, lm2.a.f319365d, 31, null));
        sb6.append(", ");
        sb6.append(super.g());
        return sb6.toString();
    }

    @Override // lm2.i0
    public java.lang.String j() {
        java.lang.String str = this.f319368m;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("msgContent");
        throw null;
    }
}
