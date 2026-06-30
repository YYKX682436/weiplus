package yc2;

/* loaded from: classes2.dex */
public final class a extends xc2.o {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:48:0x0044, B:16:0x0051), top: B:47:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #0 {Exception -> 0x006c, blocks: (B:39:0x0065, B:22:0x0071), top: B:38:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    @Override // xc2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r18 = this;
            r1 = r18
            super.l()
            xc2.p0 r0 = r1.f453162b
            java.lang.String r2 = ""
            if (r0 == 0) goto L1b
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f453234a
            if (r0 == 0) goto L1b
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.getNative_info()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.getNecessary_params()
            if (r0 != 0) goto L1c
        L1b:
            r0 = r2
        L1c:
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
            r4.<init>(r0)     // Catch: java.lang.Exception -> L23
            goto L3c
        L23:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "err "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "FinderAuthorCircleTagEventHandler"
            ot5.g.c(r4, r0)
            r4 = r3
        L3c:
            java.lang.String r5 = "safeGetString"
            r6 = 1
            r7 = 0
            java.lang.String r0 = "object_id"
            if (r4 == 0) goto L4e
            boolean r8 = r4.has(r0)     // Catch: java.lang.Exception -> L4c
            if (r8 != r6) goto L4e
            r8 = r6
            goto L4f
        L4c:
            r0 = move-exception
            goto L56
        L4e:
            r8 = r7
        L4f:
            if (r8 == 0) goto L5f
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L4c
            goto L60
        L56:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mm.sdk.platformtools.Log.a(r5, r2, r0)
            r8 = r3
            goto L61
        L5f:
            r0 = r3
        L60:
            r8 = r0
        L61:
            java.lang.String r0 = "object_nonce_id"
            if (r4 == 0) goto L6e
            boolean r9 = r4.has(r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r6) goto L6e
            goto L6f
        L6c:
            r0 = move-exception
            goto L77
        L6e:
            r6 = r7
        L6f:
            if (r6 == 0) goto L7e
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L6c
            r3 = r0
            goto L7e
        L77:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mm.sdk.platformtools.Log.a(r5, r2, r0)
        L7e:
            r12 = r3
            in5.s0 r0 = r1.f453161a
            if (r0 == 0) goto Lc8
            java.lang.Class<zy2.a7> r2 = zy2.a7.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r3 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r9 = r2
            zy2.a7 r9 = (zy2.a7) r9
            long r10 = pm0.v.Z(r8)
            java.lang.String r2 = "getContext(...)"
            android.content.Context r0 = r0.f293121e
            kotlin.jvm.internal.o.f(r0, r2)
            pf5.z r2 = pf5.z.f353948a
            boolean r3 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r3 == 0) goto Lbc
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r2.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r0 = r0.a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r0 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r0
            int r13 = r0.f135380n
            r14 = 1
            r15 = 0
            r16 = 16
            r17 = 0
            zy2.a7.sg(r9, r10, r12, r13, r14, r15, r16, r17)
            goto Lc8
        Lbc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.a.l():void");
    }
}
