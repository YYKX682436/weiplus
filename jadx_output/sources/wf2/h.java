package wf2;

/* loaded from: classes10.dex */
public final class h implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf2.j f445581a;

    public h(wf2.j jVar) {
        this.f445581a = jVar;
    }

    @Override // qj5.q
    public java.lang.String a() {
        android.content.Context context;
        java.lang.Object obj = this.f445581a.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        return context.getString(com.tencent.mm.R.string.ec_);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a5, code lost:
    
        r0.set(0, java.lang.Integer.valueOf(r0.getInteger(0) | 4));
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0129 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:12:0x0044, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:24:0x007b, B:27:0x0087, B:29:0x008d, B:31:0x0094, B:33:0x009a, B:35:0x00a1, B:37:0x00ab, B:39:0x00b1, B:41:0x00bb, B:43:0x00c1, B:44:0x00c5, B:46:0x00cb, B:53:0x00e2, B:55:0x00e8, B:57:0x00ee, B:62:0x00fa, B:65:0x0101, B:67:0x0107, B:72:0x0113, B:73:0x0159, B:75:0x0163, B:77:0x016a, B:79:0x017e, B:80:0x0184, B:82:0x0193, B:84:0x019b, B:89:0x01a5, B:90:0x01b1, B:100:0x0129, B:103:0x0130, B:105:0x0136, B:110:0x0142, B:124:0x0080), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0183  */
    @Override // qj5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p15.n b(boolean r18) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.h.b(boolean):p15.n");
    }

    @Override // qj5.q
    public void c() {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#onShareEnd called");
        wf2.j jVar = this.f445581a;
        kotlinx.coroutines.r2 r2Var = jVar.f445589r;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            kotlinx.coroutines.r2 r2Var2 = jVar.f445589r;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            jVar.f445589r = null;
        }
        jVar.b7();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // qj5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof wf2.g
            if (r6 == 0) goto L13
            r6 = r7
            wf2.g r6 = (wf2.g) r6
            int r0 = r6.f445580f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f445580f = r0
            goto L18
        L13:
            wf2.g r6 = new wf2.g
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.f445578d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f445580f
            r2 = 0
            r3 = 1
            java.lang.String r4 = "FinderLiveScreenShotEventSubscribeController"
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "#getGenImgPath call"
            com.tencent.mars.xlog.Log.i(r4, r7)
            java.lang.String r7 = wf2.j.f445583v
            wf2.j r7 = r5.f445581a
            boolean r1 = r7.i7()
            if (r1 != 0) goto L4a
            java.lang.String r6 = "#getGenImgPath not support post generation"
            com.tencent.mars.xlog.Log.i(r4, r6)
            return r2
        L4a:
            java.lang.String r1 = "#getGenImgPath start"
            com.tencent.mars.xlog.Log.i(r4, r1)
            r6.f445580f = r3
            java.lang.Object r7 = r7.d7(r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L64
            int r6 = r7.length()
            if (r6 != 0) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L6c
            java.lang.String r6 = "#getGenImgPath generateAndSavePosterSilently failed"
            com.tencent.mars.xlog.Log.e(r4, r6)
            return r2
        L6c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "#getGenImgPath success, posterPath="
            r6.<init>(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r4, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.h.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qj5.q
    public java.lang.String e() {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#getOriImgPath call");
        return null;
    }

    @Override // qj5.q
    public int i() {
        java.lang.String str = wf2.j.f445583v;
        wf2.j jVar = this.f445581a;
        if (!jVar.i7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#getSwitchBtnVisibility not support post generation");
            return 8;
        }
        if (jVar.f7()) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#getSwitchBtnVisibility insufficient memory for screenshot");
        return 8;
    }
}
