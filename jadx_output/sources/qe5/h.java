package qe5;

/* loaded from: classes12.dex */
public final class h extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.d f362118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if ((r0 != null && r0.field_status == r8.field_status) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.pluginsdk.model.app.d T6() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.h.T6():com.tencent.mm.pluginsdk.model.app.d");
    }

    public final kd5.e U6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final com.tencent.mm.storage.f9 V6() {
        kd5.e U6 = U6();
        if (U6 != null) {
            return U6.f306877e;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r0.intValue() == 130) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W6() {
        /*
            r7 = this;
            kd5.e r0 = r7.U6()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.f306884o
            if (r0 != r1) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L3a
            kd5.e r0 = r7.U6()
            if (r0 == 0) goto L32
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6
            java.lang.String r4 = r0.F
            r3.<init>(r4)
            boolean r4 = r3.m()
            if (r4 == 0) goto L2f
            long r3 = r3.C()
            long r5 = r0.f306894y
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            r1 = r2
        L30:
            r2 = r1
            goto L73
        L32:
            java.lang.String r0 = "MicroMsg.File.AppAttachLocalLogicUIC"
            java.lang.String r1 = "isRecordFileReadyToOpen fileDownloadState is null"
            com.tencent.mars.xlog.Log.i(r0, r1)
            goto L73
        L3a:
            ez.v0 r0 = ez.v0.f257777a
            com.tencent.mm.storage.f9 r0 = r7.V6()
            if (r0 == 0) goto L4b
            int r0 = g95.e0.b(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L5a
            r0.intValue()
            r3 = 130(0x82, float:1.82E-43)
            int r0 = r0.intValue()
            if (r0 != r3) goto L5a
            goto L5b
        L5a:
            r1 = r2
        L5b:
            if (r1 == 0) goto L6a
            com.tencent.mm.storage.f9 r0 = r7.V6()
            if (r0 == 0) goto L6a
            te5.h r1 = te5.h.f418649a
            boolean r0 = r1.a(r0)
            goto L72
        L6a:
            com.tencent.mm.pluginsdk.model.app.d r0 = r7.T6()
            boolean r0 = r7.X6(r0)
        L72:
            r2 = r0
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.h.W6():boolean");
    }

    public final boolean X6(com.tencent.mm.pluginsdk.model.app.d dVar) {
        if (dVar == null) {
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(dVar.field_fileFullPath);
        return dVar.field_totalLen != 0 && r6Var.m() && r6Var.C() == dVar.field_totalLen;
    }

    public final boolean Y6() {
        java.lang.String str;
        java.lang.String str2;
        if (!W6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachLocalLogicUIC", "summerapp tryOpenFile file is not ready");
            return true;
        }
        kd5.e U6 = U6();
        int i17 = U6 != null ? U6.f306878f : 0;
        if (i17 != 1) {
            if (i17 == 3) {
                android.content.Intent intent = new android.content.Intent();
                kd5.e U62 = U6();
                java.lang.String str3 = "";
                if (U62 == null || (str = U62.F) == null) {
                    str = "";
                }
                intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
                kd5.e U63 = U6();
                if (U63 != null && (str2 = U63.f306892w) != null) {
                    str3 = str2;
                }
                intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, str3);
                kd5.e U64 = U6();
                intent.putExtra("fileExt", U64 != null ? U64.f306893x : null);
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
                if (P6 == null) {
                    return true;
                }
                P6.setResult(-1, intent);
                P6.finish();
                return true;
            }
            kd5.e U65 = U6();
            if ((U65 != null ? U65.f306878f : 0) != 9) {
                kd5.e U66 = U6();
                if (U66 != null ? U66.f306884o : false) {
                    kd5.e U67 = U6();
                    if (U67 != null) {
                        U67.f306883n = 19;
                    }
                } else {
                    kd5.e U68 = U6();
                    if (U68 != null) {
                        U68.f306883n = 1;
                    }
                }
            }
            U6();
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            if (((qe5.z) zVar.a(activity).a(qe5.z.class)).b7()) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                if (((qe5.z) zVar.a(activity2).a(qe5.z.class)).c7()) {
                    jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
                    kd5.e U69 = U6();
                    java.lang.String str4 = U69 != null ? U69.f306893x : null;
                    ((ht.s) a0Var).getClass();
                    if (!com.tencent.mm.pluginsdk.model.t3.l(str4)) {
                        kd5.e U610 = U6();
                        java.lang.String str5 = U610 != null ? U610.f306893x : null;
                        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                        java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(str5);
                        kotlin.jvm.internal.o.f(e17, "getMimeTypeByExt(...)");
                        if (!((java.util.HashSet) com.tencent.mm.pluginsdk.model.t3.f189444c).contains(e17)) {
                            return true;
                        }
                        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                        kotlin.jvm.internal.o.g(activity3, "activity");
                        ((qe5.z) zVar.a(activity3).a(qe5.z.class)).e7();
                        return true;
                    }
                    androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
                    kotlin.jvm.internal.o.g(activity4, "activity");
                    com.tencent.mm.ui.chatting.uic.file.FileQBUIC fileQBUIC = (com.tencent.mm.ui.chatting.uic.file.FileQBUIC) zVar.a(activity4).a(com.tencent.mm.ui.chatting.uic.file.FileQBUIC.class);
                    android.os.Bundle bundleExtra = fileQBUIC.getIntent().getBundleExtra("jumpChat");
                    if (bundleExtra != null) {
                        bundleExtra.putString("dn", ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Ni(fileQBUIC.getContext(), bundleExtra));
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
                        obtain.writeBundle(bundleExtra);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                        com.tencent.mm.vfs.w6.R(lp0.b.h0("miniQBArg").u() + "/jumpChat", marshall);
                    }
                    androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
                    kotlin.jvm.internal.o.g(activity5, "activity");
                    return ((qe5.z) zVar.a(activity5).a(qe5.z.class)).d7(false);
                }
            }
        } else {
            kd5.e U611 = U6();
            if (U611 != null) {
                U611.f306883n = 7;
            }
            U6();
            androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
            kotlin.jvm.internal.o.g(activity6, "activity");
            pf5.z zVar2 = pf5.z.f353948a;
            if (((qe5.z) zVar2.a(activity6).a(qe5.z.class)).b7()) {
                androidx.appcompat.app.AppCompatActivity activity7 = getActivity();
                kotlin.jvm.internal.o.g(activity7, "activity");
                if (((qe5.z) zVar2.a(activity7).a(qe5.z.class)).d7(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
