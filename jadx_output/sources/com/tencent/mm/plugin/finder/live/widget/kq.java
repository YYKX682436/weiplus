package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kq implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nq f118851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f118852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f118853c;

    public kq(com.tencent.mm.plugin.finder.live.widget.nq nqVar, kotlin.coroutines.Continuation continuation, r45.z53 z53Var) {
        this.f118851a = nqVar;
        this.f118852b = continuation;
        this.f118853c = z53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[EDGE_INSN: B:21:0x0066->B:22:0x0066 BREAK  A[LOOP:0: B:6:0x0024->B:30:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:6:0x0024->B:30:?, LOOP_END, SYNTHETIC] */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.modelbase.f r10 = (com.tencent.mm.modelbase.f) r10
            int r0 = r10.f70615a
            jz5.f0 r1 = jz5.f0.f302826a
            kotlin.coroutines.Continuation r2 = r9.f118852b
            com.tencent.mm.plugin.finder.live.widget.nq r3 = r9.f118851a
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L85
            int r0 = r10.f70616b
            if (r0 != 0) goto L85
            com.tencent.mm.protobuf.f r10 = r10.f70618d
            r45.hv1 r10 = (r45.hv1) r10
            r0 = 1
            java.util.LinkedList r10 = r10.getList(r0)
            java.lang.String r6 = "getGame_user_info_list(...)"
            kotlin.jvm.internal.o.f(r10, r6)
            java.util.Iterator r10 = r10.iterator()
        L24:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L65
            java.lang.Object r6 = r10.next()
            r7 = r6
            r45.n73 r7 = (r45.n73) r7
            com.tencent.mm.protobuf.f r8 = r7.getCustom(r0)
            r45.z53 r8 = (r45.z53) r8
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.getString(r4)
            goto L3f
        L3e:
            r8 = r5
        L3f:
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r8 != 0) goto L61
            com.tencent.mm.protobuf.f r7 = r7.getCustom(r0)
            r45.z53 r7 = (r45.z53) r7
            if (r7 == 0) goto L52
            java.lang.String r7 = r7.getString(r4)
            goto L53
        L52:
            r7 = r5
        L53:
            r45.z53 r8 = r9.f118853c
            java.lang.String r8 = r8.getString(r4)
            boolean r7 = kotlin.jvm.internal.o.b(r7, r8)
            if (r7 == 0) goto L61
            r7 = r0
            goto L62
        L61:
            r7 = r4
        L62:
            if (r7 == 0) goto L24
            goto L66
        L65:
            r6 = r5
        L66:
            r45.n73 r6 = (r45.n73) r6
            if (r6 == 0) goto L73
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r6)
            r2.resumeWith(r10)
            r10 = r1
            goto L74
        L73:
            r10 = r5
        L74:
            if (r10 != 0) goto La3
            java.lang.String r10 = r3.H
            java.lang.String r0 = "CgiFinderLiveGetUserGameConfig error, no match game"
            com.tencent.mars.xlog.Log.i(r10, r0)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r5)
            r2.resumeWith(r10)
            goto La3
        L85:
            java.lang.String r10 = r3.H
            java.lang.String r0 = "CgiFinderLiveGetUserGameConfig error, toast"
            com.tencent.mars.xlog.Log.i(r10, r0)
            r10 = 2131763761(0x7f102231, float:1.9158636E38)
            android.content.Context r0 = r3.f118183e
            java.lang.String r10 = r0.getString(r10)
            android.widget.Toast r10 = db5.t7.makeText(r0, r10, r4)
            r10.show()
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r5)
            r2.resumeWith(r10)
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.kq.call(java.lang.Object):java.lang.Object");
    }
}
