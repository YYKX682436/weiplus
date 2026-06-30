package ek2;

/* loaded from: classes2.dex */
public final class q extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.p f253518u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(long r5, int r7, java.lang.String r8, java.lang.String r9, ek2.p r10) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r4.<init>(r0, r1, r0)
            r4.f253518u = r10
            r45.mx0 r10 = new r45.mx0
            r10.<init>()
            db2.t4 r0 = db2.t4.f228171a
            r2 = 24009(0x5dc9, float:3.3644E-41)
            r45.kv0 r0 = r0.a(r2)
            r10.f380875d = r0
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            java.lang.String r0 = xy2.c.e(r0)
            r10.f380876e = r0
            r10.f380877f = r5
            r10.f380878g = r7
            r0 = 0
            if (r8 == 0) goto L33
            int r3 = r8.length()
            if (r3 != 0) goto L31
            goto L33
        L31:
            r3 = r0
            goto L34
        L33:
            r3 = r1
        L34:
            if (r3 != 0) goto L38
            r10.f380879h = r8
        L38:
            if (r9 == 0) goto L42
            int r3 = r9.length()
            if (r3 != 0) goto L41
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L46
            r10.f380880i = r9
        L46:
            com.tencent.mm.modelbase.l r0 = new com.tencent.mm.modelbase.l
            r0.<init>()
            r0.f70664a = r10
            r45.nx0 r10 = new r45.nx0
            r10.<init>()
            r45.ie r1 = new r45.ie
            r1.<init>()
            r10.BaseResponse = r1
            r45.du5 r3 = new r45.du5
            r3.<init>()
            r1.f376960e = r3
            r0.f70665b = r10
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findercoliveinvitemanage"
            r0.f70666c = r10
            r0.f70667d = r2
            com.tencent.mm.modelbase.o r10 = r0.a()
            r4.p(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "init invitationId="
            r10.<init>(r0)
            r10.append(r5)
            java.lang.String r5 = ", actionType="
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = ", targetFinderUsername="
            r10.append(r5)
            r10.append(r8)
            java.lang.String r5 = ", initiatorFinderUsername="
            r10.append(r5)
            r10.append(r9)
            java.lang.String r5 = r10.toString()
            java.lang.String r6 = "Finder.CgiCoLiveInviteManage"
            com.tencent.mars.xlog.Log.i(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek2.q.<init>(long, int, java.lang.String, java.lang.String, ek2.p):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.nx0 resp = (r45.nx0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLiveInviteManage", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        ek2.p pVar = this.f253518u;
        if (pVar != null) {
            pVar.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
