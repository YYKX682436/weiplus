package oq;

/* loaded from: classes12.dex */
public final class d implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oq.e f347299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f347300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f347301c;

    public d(oq.e eVar, java.lang.CharSequence charSequence, java.util.LinkedList linkedList) {
        this.f347299a = eVar;
        this.f347300b = charSequence;
        this.f347301c = linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r2 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (java.lang.Character.isLowerCase(r2.charAt(r3)) == false) goto L21;
     */
    @Override // com.tencent.mm.smiley.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.mm.smiley.a1 r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r9, r0)
            boolean r0 = r9 instanceof oq.a
            r1 = 0
            if (r0 == 0) goto L7c
            oq.a r9 = (oq.a) r9
            f21.f r0 = r9.f347295b
            java.lang.String r2 = r0.f258892e
            java.lang.String r3 = "lang"
            kotlin.jvm.internal.o.f(r2, r3)
            oq.e r3 = r8.f347299a
            r3.getClass()
            java.lang.String r4 = "en"
            java.lang.String r5 = "it"
            java.lang.String r6 = "id"
            java.lang.String r7 = "vi"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}
            java.util.Set r4 = kz5.z.D0(r4)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L70
            r3.getClass()
            java.lang.CharSequence r2 = r8.f347300b
            if (r2 == 0) goto L6d
            int r3 = r2.length()
            if (r11 >= r3) goto L54
            char r3 = r2.charAt(r11)
            boolean r3 = java.lang.Character.isUpperCase(r3)
            if (r3 != 0) goto L52
            char r3 = r2.charAt(r11)
            boolean r3 = java.lang.Character.isLowerCase(r3)
            if (r3 == 0) goto L54
        L52:
            r2 = r1
            goto L6e
        L54:
            if (r10 <= 0) goto L6d
            int r3 = r10 + (-1)
            char r4 = r2.charAt(r3)
            boolean r4 = java.lang.Character.isUpperCase(r4)
            if (r4 != 0) goto L52
            char r2 = r2.charAt(r3)
            boolean r2 = java.lang.Character.isLowerCase(r2)
            if (r2 == 0) goto L6d
            goto L52
        L6d:
            r2 = 1
        L6e:
            if (r2 == 0) goto L7c
        L70:
            oq.c r2 = new oq.c
            f21.e r9 = r9.f347294a
            r2.<init>(r9, r0, r10, r11)
            java.util.LinkedList r9 = r8.f347301c
            r9.add(r2)
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.d.a(com.tencent.mm.smiley.a1, int, int):boolean");
    }
}
