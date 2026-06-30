package so2;

/* loaded from: classes2.dex */
public final class s2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f410588d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderContact f410589e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.h32 f410590f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.c32 f410591g;

    public s2(int i17, com.tencent.mm.protocal.protobuf.FinderContact finderContact, r45.h32 h32Var, r45.c32 c32Var) {
        this.f410588d = i17;
        this.f410589e = finderContact;
        this.f410590f = h32Var;
        this.f410591g = c32Var;
    }

    public final java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f410589e;
        java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
        return username == null ? "" : username;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (kotlin.jvm.internal.o.b(r2, r6.a()) != false) goto L28;
     */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.o.g(r6, r0)
            boolean r0 = r6 instanceof so2.s2
            r1 = -1
            if (r0 == 0) goto L51
            so2.s2 r6 = (so2.s2) r6
            int r0 = r6.f410588d
            int r2 = r5.f410588d
            if (r2 == r0) goto L13
            goto L51
        L13:
            r0 = 1
            r3 = 0
            if (r2 == r0) goto L36
            r4 = 2
            if (r2 == r4) goto L1c
        L1a:
            r0 = r3
            goto L4e
        L1c:
            java.lang.String r2 = r5.a()
            int r4 = r2.length()
            if (r4 <= 0) goto L28
            r4 = r0
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 == 0) goto L1a
            java.lang.String r6 = r6.a()
            boolean r6 = kotlin.jvm.internal.o.b(r2, r6)
            if (r6 == 0) goto L1a
            goto L4e
        L36:
            r0 = 4
            r2 = 0
            r45.h32 r4 = r5.f410590f
            if (r4 == 0) goto L41
            java.lang.String r4 = r4.getString(r0)
            goto L42
        L41:
            r4 = r2
        L42:
            r45.h32 r6 = r6.f410590f
            if (r6 == 0) goto L4a
            java.lang.String r2 = r6.getString(r0)
        L4a:
            boolean r0 = kotlin.jvm.internal.o.b(r4, r2)
        L4e:
            if (r0 == 0) goto L51
            r1 = r3
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.s2.d(com.tencent.mm.plugin.finder.feed.model.internal.r0):int");
    }

    @Override // in5.c
    public long getItemId() {
        java.lang.String string;
        r45.h32 h32Var = this.f410590f;
        if (h32Var == null || (string = h32Var.getString(4)) == null) {
            return 0L;
        }
        return string.hashCode();
    }

    @Override // in5.c
    public int h() {
        return -12;
    }
}
