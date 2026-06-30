package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class t1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.e2 f117413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117414b;

    public t1(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var, java.lang.String str) {
        this.f117413a = e2Var;
        this.f117414b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[EDGE_INSN: B:21:0x0062->B:22:0x0062 BREAK  A[LOOP:0: B:6:0x0023->B:31:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:6:0x0023->B:31:?, LOOP_END, SYNTHETIC] */
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
            java.lang.String r2 = "Finder.FinderGameLiveSearchUIC"
            com.tencent.mm.plugin.finder.live.viewmodel.e2 r3 = r9.f117413a
            r4 = 0
            if (r0 != 0) goto L76
            int r0 = r10.f70616b
            if (r0 != 0) goto L76
            com.tencent.mm.protobuf.f r10 = r10.f70618d
            r45.hv1 r10 = (r45.hv1) r10
            r0 = 1
            java.util.LinkedList r10 = r10.getList(r0)
            java.lang.String r5 = "getGame_user_info_list(...)"
            kotlin.jvm.internal.o.f(r10, r5)
            java.util.Iterator r10 = r10.iterator()
        L23:
            boolean r5 = r10.hasNext()
            r6 = 0
            if (r5 == 0) goto L61
            java.lang.Object r5 = r10.next()
            r7 = r5
            r45.n73 r7 = (r45.n73) r7
            com.tencent.mm.protobuf.f r8 = r7.getCustom(r0)
            r45.z53 r8 = (r45.z53) r8
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.getString(r4)
            goto L3f
        L3e:
            r8 = r6
        L3f:
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r8 != 0) goto L5d
            com.tencent.mm.protobuf.f r7 = r7.getCustom(r0)
            r45.z53 r7 = (r45.z53) r7
            if (r7 == 0) goto L52
            java.lang.String r7 = r7.getString(r4)
            goto L53
        L52:
            r7 = r6
        L53:
            java.lang.String r8 = r9.f117414b
            boolean r7 = kotlin.jvm.internal.o.b(r7, r8)
            if (r7 == 0) goto L5d
            r7 = r0
            goto L5e
        L5d:
            r7 = r4
        L5e:
            if (r7 == 0) goto L23
            goto L62
        L61:
            r5 = r6
        L62:
            r45.n73 r5 = (r45.n73) r5
            if (r5 == 0) goto L6e
            yz5.l r10 = r3.f117073x
            if (r10 == 0) goto L6e
            r10.invoke(r5)
            r6 = r1
        L6e:
            if (r6 != 0) goto L99
            java.lang.String r10 = "CgiFinderLiveGetUserGameConfig error, no match game"
            com.tencent.mars.xlog.Log.i(r2, r10)
            goto L99
        L76:
            java.lang.String r10 = "CgiFinderLiveGetUserGameConfig error, toast"
            com.tencent.mars.xlog.Log.i(r2, r10)
            androidx.appcompat.app.AppCompatActivity r10 = r3.f117056d
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.mm.ui.MMActivity) r10
            androidx.appcompat.app.AppCompatActivity r10 = r10.getContext()
            androidx.appcompat.app.AppCompatActivity r0 = r3.f117056d
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.mm.ui.MMActivity) r0
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            r2 = 2131763761(0x7f102231, float:1.9158636E38)
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r10 = db5.t7.makeText(r10, r0, r4)
            r10.show()
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.t1.call(java.lang.Object):java.lang.Object");
    }
}
