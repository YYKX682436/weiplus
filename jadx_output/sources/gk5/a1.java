package gk5;

/* loaded from: classes9.dex */
public final class a1 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new se5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        l15.c j17 = ((se5.a) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        v05.b k17;
        java.lang.String string;
        v05.b k18;
        v05.b k19;
        v05.b k27;
        v05.b k28;
        kotlin.jvm.internal.o.g(action, "action");
        l15.c j17 = ((se5.a) c7()).j();
        boolean z17 = false;
        if (j17 != null && (k28 = j17.k()) != null && k28.getInteger(k28.f368365d + 6) == 5) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.storage.f9 e76 = e7();
            int i17 = action.f454741b;
            if (e76 != null) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).T6(e7(), com.tencent.mm.ui.chatting.hd.d(i17));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                l15.c j18 = ((se5.a) c7()).j();
                java.lang.String str4 = "";
                if (j18 == null || (k27 = j18.k()) == null || (str = k27.getString(k27.f368365d + 9)) == null) {
                    str = "";
                }
                l15.c j19 = ((se5.a) c7()).j();
                if (j19 == null || (k19 = j19.k()) == null || (str2 = k19.getString(k19.f368365d + 2)) == null) {
                    str2 = "";
                }
                l15.c j27 = ((se5.a) c7()).j();
                if (j27 == null || (k18 = j27.k()) == null || (str3 = k18.getString(k18.f368365d + 3)) == null) {
                    str3 = "";
                }
                l15.c j28 = ((se5.a) c7()).j();
                if (j28 != null && (k17 = j28.k()) != null && (string = k17.getString(k17.f432315e + 14)) != null) {
                    str4 = string;
                }
                com.tencent.mm.ui.chatting.hd.o(getContext(), new com.tencent.mm.sendtowework.LinkData(str, str2, str3, str4), com.tencent.mm.ui.chatting.hd.d(i17));
            }
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((gk5.m1) pf5.z.f353948a.a(activity2).a(gk5.m1.class)).W6(action);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    @Override // m50.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o7(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "toUser"
            kotlin.jvm.internal.o.g(r15, r0)
            ot0.q r0 = r14.Z6()
            if (r0 == 0) goto Ldc
            ot0.q r1 = ot0.q.i(r0)
            r2 = 3
            r1.f348706s = r2
            android.content.Intent r2 = r14.getIntent()
            java.lang.String r3 = "reportSessionId"
            java.lang.String r7 = r2.getStringExtra(r3)
            com.tencent.mm.storage.f9 r2 = r14.e7()
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L9a
            com.tencent.mm.storage.f9 r2 = r14.e7()
            if (r2 == 0) goto L32
            java.lang.String r2 = r2.z0()
            goto L33
        L32:
            r2 = r5
        L33:
            if (r2 == 0) goto L9a
            com.tencent.mm.storage.f9 r2 = r14.e7()
            if (r2 == 0) goto L40
            java.lang.String r2 = r2.z0()
            goto L41
        L40:
            r2 = r5
        L41:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 != 0) goto L9a
            java.lang.Class<tg3.u0> r2 = tg3.u0.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r6 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r6)
            r8 = r2
            tg3.u0 r8 = (tg3.u0) r8
            com.tencent.mm.storage.f9 r9 = r14.e7()
            com.tencent.mm.storage.f9 r2 = r14.e7()
            if (r2 == 0) goto L65
            java.lang.String r2 = r2.z0()
            r10 = r2
            goto L66
        L65:
            r10 = r5
        L66:
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r2 = tg3.u0.ga(r8, r9, r10, r11, r12, r13)
            r6 = -1
            byte[] r2 = com.tencent.mm.vfs.w6.N(r2, r4, r6)     // Catch: java.lang.Exception -> L7c
            boolean r6 = r14.q7(r2)     // Catch: java.lang.Exception -> L7a
            if (r6 != 0) goto L98
            goto Ldc
        L7a:
            r6 = move-exception
            goto L7e
        L7c:
            r6 = move-exception
            r2 = r5
        L7e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "processAppMessageTransfer send to user: "
            r8.<init>(r9)
            r8.append(r15)
            java.lang.String r9 = ", exception"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "MicroMsg.ForwardLinkUIC"
            com.tencent.mars.xlog.Log.printErrStackTrace(r10, r6, r8, r9)
        L98:
            r6 = r2
            goto L9b
        L9a:
            r6 = r5
        L9b:
            java.lang.String r2 = r0.f348646d
            java.lang.String r0 = r0.H
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            com.tencent.mm.storage.f9 r10 = r14.e7()
            if (r10 == 0) goto Lab
            java.lang.String r5 = r10.G
        Lab:
            if (r5 != 0) goto Lae
            goto Laf
        Lae:
            r3 = r5
        Laf:
            java.lang.String r10 = c01.ia.v(r3)
            co.a r3 = r14.c7()
            se5.a r3 = (se5.a) r3
            int r5 = r3.f43702d
            int r5 = r5 + r4
            long r3 = r3.getLong(r5)
            co.a r5 = r14.c7()
            se5.a r5 = (se5.a) r5
            int r11 = r5.f43702d
            int r11 = r11 + 1
            java.lang.String r5 = r5.getString(r11)
            com.tencent.mm.plugin.msg.MsgIdTalker r11 = new com.tencent.mm.plugin.msg.MsgIdTalker
            r11.<init>(r3, r5)
            r3 = r0
            r4 = r15
            r5 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            com.tencent.mm.pluginsdk.model.app.k0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk5.a1.o7(java.lang.String):void");
    }

    public final boolean q7(byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardLinkUIC", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.graphics.e.b(bArr, 0, bArr.length, options);
        return options.outWidth >= 0 && options.outHeight >= 0;
    }
}
