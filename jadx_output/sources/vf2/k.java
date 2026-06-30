package vf2;

/* loaded from: classes3.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vf2.q f436344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436345b;

    public k(vf2.q qVar, java.lang.String str) {
        this.f436344a = qVar;
        this.f436345b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[EDGE_INSN: B:21:0x0065->B:22:0x0065 BREAK  A[LOOP:0: B:6:0x0026->B:31:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:6:0x0026->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.modelbase.f r13 = (com.tencent.mm.modelbase.f) r13
            int r0 = r13.f70615a
            jz5.f0 r1 = jz5.f0.f302826a
            r2 = 2131763761(0x7f102231, float:1.9158636E38)
            r3 = 0
            vf2.q r10 = r12.f436344a
            java.lang.String r11 = "FinderLiveAnchorScreenCastLivingStatusController"
            if (r0 != 0) goto L98
            int r0 = r13.f70616b
            if (r0 != 0) goto L98
            com.tencent.mm.protobuf.f r13 = r13.f70618d
            r45.hv1 r13 = (r45.hv1) r13
            r0 = 1
            java.util.LinkedList r13 = r13.getList(r0)
            java.lang.String r4 = "getGame_user_info_list(...)"
            kotlin.jvm.internal.o.f(r13, r4)
            java.util.Iterator r13 = r13.iterator()
        L26:
            boolean r4 = r13.hasNext()
            r5 = 0
            if (r4 == 0) goto L64
            java.lang.Object r4 = r13.next()
            r6 = r4
            r45.n73 r6 = (r45.n73) r6
            com.tencent.mm.protobuf.f r7 = r6.getCustom(r0)
            r45.z53 r7 = (r45.z53) r7
            if (r7 == 0) goto L41
            java.lang.String r7 = r7.getString(r3)
            goto L42
        L41:
            r7 = r5
        L42:
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r7 != 0) goto L60
            com.tencent.mm.protobuf.f r6 = r6.getCustom(r0)
            r45.z53 r6 = (r45.z53) r6
            if (r6 == 0) goto L55
            java.lang.String r6 = r6.getString(r3)
            goto L56
        L55:
            r6 = r5
        L56:
            java.lang.String r7 = r12.f436345b
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)
            if (r6 == 0) goto L60
            r6 = r0
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 == 0) goto L26
            goto L65
        L64:
            r4 = r5
        L65:
            r45.n73 r4 = (r45.n73) r4
            r10.f436354m = r4
            if (r4 == 0) goto L7f
            r13 = 0
            r6 = 0
            vf2.j r7 = new vf2.j
            r7.<init>(r10, r4, r5)
            r8 = 3
            r9 = 0
            r4 = r10
            r5 = r13
            kotlinx.coroutines.r2 r13 = com.tencent.mm.plugin.finder.live.util.y.o(r4, r5, r6, r7, r8, r9)
            if (r13 != 0) goto L7d
            goto L7f
        L7d:
            r1 = r13
            goto Lb0
        L7f:
            java.lang.String r13 = "CgiFinderLiveGetUserGameConfig error, no match game"
            com.tencent.mars.xlog.Log.i(r11, r13)
            android.content.Context r13 = r10.O6()
            android.content.Context r0 = r10.O6()
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r13 = db5.t7.makeText(r13, r0, r3)
            r13.show()
            goto Lb0
        L98:
            java.lang.String r13 = "CgiFinderLiveGetUserGameConfig error, toast"
            com.tencent.mars.xlog.Log.i(r11, r13)
            android.content.Context r13 = r10.O6()
            android.content.Context r0 = r10.O6()
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r13 = db5.t7.makeText(r13, r0, r3)
            r13.show()
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vf2.k.call(java.lang.Object):java.lang.Object");
    }
}
