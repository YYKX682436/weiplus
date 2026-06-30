package hi2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281503a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281504b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f281505c;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f281503a = str;
        this.f281504b = str2;
        this.f281505c = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi2.a)) {
            return false;
        }
        hi2.a aVar = (hi2.a) obj;
        return kotlin.jvm.internal.o.b(this.f281503a, aVar.f281503a) && kotlin.jvm.internal.o.b(this.f281504b, aVar.f281504b) && kotlin.jvm.internal.o.b(this.f281505c, aVar.f281505c);
    }

    public int hashCode() {
        java.lang.String str = this.f281503a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f281504b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f281505c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveMicAnchorReportStruct(finderUsername=" + this.f281503a + ", feedId=" + this.f281504b + ", candidateRequestId=" + this.f281505c + ')';
    }

    public a(r45.xn1 xn1Var) {
        this((xn1Var == null || (r2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : r2.getUsername(), (xn1Var == null || (r6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (r6 = r6.getLive_info()) == null) ? null : pm0.v.u(r6.getLong(11)), null);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.kz0 live_info;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(km2.q r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L15
            r45.xn1 r2 = r6.f309187r
            if (r2 == 0) goto L15
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderContact r2 = (com.tencent.mm.protocal.protobuf.FinderContact) r2
            if (r2 == 0) goto L15
            java.lang.String r2 = r2.getUsername()
            goto L16
        L15:
            r2 = r1
        L16:
            if (r6 == 0) goto L25
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r6.E
            if (r3 == 0) goto L25
            long r3 = r3.getId()
        L20:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L41
        L25:
            if (r6 == 0) goto L40
            r45.xn1 r3 = r6.f309187r
            if (r3 == 0) goto L40
            com.tencent.mm.protobuf.f r0 = r3.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = (com.tencent.mm.protocal.protobuf.FinderContact) r0
            if (r0 == 0) goto L40
            r45.kz0 r0 = r0.getLive_info()
            if (r0 == 0) goto L40
            r3 = 11
            long r3 = r0.getLong(r3)
            goto L20
        L40:
            r0 = r1
        L41:
            if (r0 == 0) goto L4c
            long r3 = r0.longValue()
            java.lang.String r0 = pm0.v.u(r3)
            goto L4d
        L4c:
            r0 = r1
        L4d:
            if (r6 == 0) goto L51
            java.lang.String r1 = r6.F
        L51:
            r5.<init>(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hi2.a.<init>(km2.q):void");
    }
}
