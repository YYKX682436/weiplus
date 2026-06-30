package lm2;

/* loaded from: classes3.dex */
public final class l0 extends lm2.c {

    /* renamed from: i, reason: collision with root package name */
    public r45.gj1 f319420i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f319421m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ze2 f319422n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l0(boolean r3, r45.ch1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r4, r0)
            r2.<init>(r3, r4)
            r45.gj1 r3 = new r45.gj1
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
            if (r3 == 0) goto L5a
            r2.f319420i = r3
            r4 = 1
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L3b
            r3 = r1
        L3b:
            r2.f319421m = r3
            r45.gj1 r3 = r2.f319420i
            if (r3 == 0) goto L54
            r4 = 0
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r4)
            r45.ze2 r3 = (r45.ze2) r3
            if (r3 != 0) goto L4f
            r45.ze2 r3 = new r45.ze2
            r3.<init>()
        L4f:
            r2.f319422n = r3
            jz5.f0 r0 = jz5.f0.f302826a
            goto L5a
        L54:
            java.lang.String r3 = "payload"
            kotlin.jvm.internal.o.o(r3)
            throw r0
        L5a:
            if (r0 != 0) goto L6c
            r45.gj1 r3 = new r45.gj1
            r3.<init>()
            r2.f319420i = r3
            r2.f319421m = r1
            r45.ze2 r3 = new r45.ze2
            r3.<init>()
            r2.f319422n = r3
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.l0.<init>(boolean, r45.ch1):void");
    }

    @Override // lm2.c, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof lm2.l0) {
            return super.d(obj);
        }
        return -1;
    }

    @Override // lm2.c
    public java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LocationBoxMsg content:");
        java.lang.String str = this.f319421m;
        if (str == null) {
            kotlin.jvm.internal.o.o("msgContent");
            throw null;
        }
        sb6.append(str);
        sb6.append(", location:");
        sb6.append(i().getString(2));
        sb6.append(super.g());
        return sb6.toString();
    }

    public final r45.ze2 i() {
        r45.ze2 ze2Var = this.f319422n;
        if (ze2Var != null) {
            return ze2Var;
        }
        kotlin.jvm.internal.o.o(ya.b.LOCATION);
        throw null;
    }

    @Override // lm2.i0
    public java.lang.String j() {
        java.lang.String string = i().getString(2);
        java.lang.String str = this.f319421m;
        if (str == null) {
            kotlin.jvm.internal.o.o("msgContent");
            throw null;
        }
        if (str.length() == 0) {
            if (!(string == null || string.length() == 0)) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491500da0, string);
                kotlin.jvm.internal.o.d(string2);
                return string2;
            }
        }
        java.lang.String str2 = this.f319421m;
        if (str2 != null) {
            return str2;
        }
        kotlin.jvm.internal.o.o("msgContent");
        throw null;
    }
}
