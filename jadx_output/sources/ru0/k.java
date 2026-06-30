package ru0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f399682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f399683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, float f17, java.lang.String str, java.util.ArrayList arrayList) {
        super(1);
        this.f399682d = j17;
        this.f399683e = f17;
        this.f399684f = str;
        this.f399685g = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            java.lang.String r0 = "sent"
            kotlin.jvm.internal.o.g(r15, r0)
            float r7 = r14.f399683e
            java.lang.String r8 = r14.f399684f
            java.lang.String r0 = "$mainLangId"
            kotlin.jvm.internal.o.f(r8, r0)
            jz5.g r0 = ru0.m.f399689a
            java.lang.String r0 = "text"
            java.lang.String r0 = r15.optString(r0)
            if (r0 == 0) goto L23
            int r0 = r0.length()
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            if (r0 == 0) goto L27
            goto L45
        L27:
            java.lang.String r0 = "ms_end"
            r1 = 0
            long r9 = r15.optLong(r0, r1)
            java.lang.String r0 = "ms_begin"
            long r11 = r15.optLong(r0, r1)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L3a
            goto L45
        L3a:
            r0 = r15
            r1 = r8
            r2 = r11
            r4 = r9
            r6 = r7
            java.util.List r0 = ru0.m.d(r0, r1, r2, r4, r6)
            if (r0 != 0) goto L47
        L45:
            r15 = 0
            goto L77
        L47:
            r45.me4 r13 = new r45.me4
            r13.<init>()
            r13.f380414h = r8
            r13.f380416m = r11
            long r1 = r14.f399682d
            long r1 = r1 + r11
            r13.f380410d = r1
            long r1 = r9 - r11
            float r1 = (float) r1
            float r1 = r1 / r7
            long r1 = (long) r1
            r13.f380411e = r1
            java.util.LinkedList r1 = r13.f380412f
            r1.addAll(r0)
            java.lang.String r0 = "translations"
            org.json.JSONArray r15 = r15.optJSONArray(r0)
            if (r15 != 0) goto L6a
            goto L76
        L6a:
            ru0.j r0 = new ru0.j
            r1 = r0
            r2 = r13
            r3 = r11
            r5 = r9
            r1.<init>(r2, r3, r5, r7)
            c75.c.d(r15, r0)
        L76:
            r15 = r13
        L77:
            if (r15 == 0) goto L7e
            java.util.ArrayList r0 = r14.f399685g
            r0.add(r15)
        L7e:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru0.k.invoke(java.lang.Object):java.lang.Object");
    }
}
