package m85;

/* loaded from: classes4.dex */
public final class b implements n85.g {

    /* renamed from: a, reason: collision with root package name */
    public static final m85.b f324828a = new m85.b();

    @Override // n85.g
    public void a(android.content.Context context, java.lang.String snsId) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        com.tencent.mars.xlog.Log.i("PlatformOp", "showDetailUI() called with: context = " + context + ", snsId = " + snsId);
        dx1.g.f244489a.j("MomentsTogetherHistoryBrowsing", "withFriendDetailCount", snsId, bx1.u.f36313h);
    }

    @Override // n85.g
    public java.lang.String b(int i17, r45.jj4 media) {
        kotlin.jvm.internal.o.g(media, "media");
        return null;
    }

    @Override // n85.g
    public boolean c() {
        return false;
    }

    @Override // n85.g
    public void d(android.content.Context context, kotlinx.coroutines.y0 scope, java.lang.String seq, int i17, int i18, yz5.l cb6) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(seq, "seq");
        kotlin.jvm.internal.o.g(cb6, "cb");
    }

    @Override // n85.g
    public void e(android.content.Context context, int i17, boolean z17, n85.e data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("PlatformOp", "imagePreview() called with: context = " + context + ", localId = " + i17);
        dx1.g.f244489a.j("MomentsTogetherHistoryBrowsing", "withFriendGalleryCount", java.lang.Integer.valueOf(i17), bx1.u.f36313h);
    }

    @Override // n85.g
    public java.lang.Object f(r45.jj4 jj4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("PlatformOp", "getSnsMediaBitmap() called with: mediaId = " + jj4Var.f377855d + ", thumb = " + z17);
        return null;
    }

    @Override // n85.g
    public java.lang.String g() {
        return "";
    }

    @Override // n85.g
    public java.lang.String getDisplayName(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("PlatformOp", "getDisplayName() called with: userName = ".concat(userName));
        return "";
    }

    @Override // n85.g
    public java.lang.String getUsername() {
        return "";
    }

    @Override // n85.g
    public java.lang.Object h(java.lang.String str, java.lang.String str2, boolean z17, kotlin.coroutines.Continuation continuation) {
        return null;
    }

    @Override // n85.g
    public java.lang.String i(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("PlatformOp", "getDisplayTime() called with: context = " + context + ", createTime = " + i17);
        return "";
    }

    @Override // n85.g
    public void j(android.content.Context context, java.lang.String username, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // n85.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(long r5, int r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof m85.a
            if (r0 == 0) goto L13
            r0 = r8
            m85.a r0 = (m85.a) r0
            int r1 = r0.f324827f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324827f = r1
            goto L18
        L13:
            m85.a r0 = new m85.a
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f324825d
            pz5.a r1 = pz5.a.f359186d
            int r0 = r0.f324827f
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            kotlin.ResultKt.throwOnFailure(r8)
            n85.k r8 = (n85.k) r8
            if (r8 != 0) goto L57
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "getPage() called with: feedId = "
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r5 = ", pageSize = "
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            java.lang.String r6 = "PlatformOp"
            com.tencent.mars.xlog.Log.i(r6, r5)
        L51:
            n85.i r8 = new n85.i
            r5 = 0
            r8.<init>(r5, r1, r5)
        L57:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m85.b.k(long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // n85.g
    public java.lang.String l() {
        return "";
    }

    @Override // n85.g
    public long m(java.lang.String snsId) {
        kotlin.jvm.internal.o.g(snsId, "snsId");
        return 0L;
    }

    @Override // n85.g
    public fk4.p n(int i17, r45.jj4 media, int i18) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.d(null);
        return null;
    }

    @Override // n85.g
    public java.lang.Object o(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("PlatformOp", "getAvatarBitmap() called with: userName = " + str);
        return null;
    }

    @Override // n85.g
    public boolean p() {
        return false;
    }

    @Override // n85.g
    public java.lang.String q() {
        return "";
    }

    @Override // n85.g
    public int r() {
        return 0;
    }
}
