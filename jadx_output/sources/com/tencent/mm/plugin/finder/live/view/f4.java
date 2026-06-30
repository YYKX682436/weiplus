package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class f4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f116286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnchorContactSettingView f116287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f116288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f116289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f116290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnchorContactSettingView finderLiveFansClubAnchorContactSettingView, boolean z17, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116287e = finderLiveFansClubAnchorContactSettingView;
        this.f116288f = z17;
        this.f116289g = c0Var;
        this.f116290h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.f4(this.f116287e, this.f116288f, this.f116289g, this.f116290h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.f4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(1:2)|(1:(2:5|6)(2:75|76))(10:77|78|(3:81|82|(9:84|(1:103)(1:88)|89|(2:(1:100)(1:102)|101)(1:91)|92|93|94|95|(1:97)))|80|8|54|(4:56|57|58|(3:60|61|62)(2:65|66))(2:68|(1:70)(2:71|72))|63|44|45)|7|8|54|(0)(0)|63|44|45|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        r1 = r1;
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0192 A[Catch: all -> 0x017d, TryCatch #3 {all -> 0x017d, blocks: (B:5:0x001d, B:7:0x0098, B:8:0x00b4, B:58:0x00ce, B:60:0x00d2, B:62:0x00fa, B:13:0x0188, B:15:0x0192, B:17:0x019f, B:24:0x01c1, B:25:0x01f3, B:27:0x01fd, B:29:0x0201, B:33:0x021a, B:35:0x021e, B:37:0x0227, B:39:0x022b, B:40:0x0270, B:41:0x0273, B:46:0x027f, B:47:0x0284, B:48:0x0210, B:52:0x01b0, B:53:0x01e0, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c, B:78:0x0038, B:82:0x0042, B:84:0x0046, B:86:0x004e, B:89:0x0057, B:92:0x0070, B:95:0x0091, B:101:0x0069), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fd A[Catch: all -> 0x017d, TryCatch #3 {all -> 0x017d, blocks: (B:5:0x001d, B:7:0x0098, B:8:0x00b4, B:58:0x00ce, B:60:0x00d2, B:62:0x00fa, B:13:0x0188, B:15:0x0192, B:17:0x019f, B:24:0x01c1, B:25:0x01f3, B:27:0x01fd, B:29:0x0201, B:33:0x021a, B:35:0x021e, B:37:0x0227, B:39:0x022b, B:40:0x0270, B:41:0x0273, B:46:0x027f, B:47:0x0284, B:48:0x0210, B:52:0x01b0, B:53:0x01e0, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c, B:78:0x0038, B:82:0x0042, B:84:0x0046, B:86:0x004e, B:89:0x0057, B:92:0x0070, B:95:0x0091, B:101:0x0069), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021e A[Catch: all -> 0x017d, TryCatch #3 {all -> 0x017d, blocks: (B:5:0x001d, B:7:0x0098, B:8:0x00b4, B:58:0x00ce, B:60:0x00d2, B:62:0x00fa, B:13:0x0188, B:15:0x0192, B:17:0x019f, B:24:0x01c1, B:25:0x01f3, B:27:0x01fd, B:29:0x0201, B:33:0x021a, B:35:0x021e, B:37:0x0227, B:39:0x022b, B:40:0x0270, B:41:0x0273, B:46:0x027f, B:47:0x0284, B:48:0x0210, B:52:0x01b0, B:53:0x01e0, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c, B:78:0x0038, B:82:0x0042, B:84:0x0046, B:86:0x004e, B:89:0x0057, B:92:0x0070, B:95:0x0091, B:101:0x0069), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x027f A[Catch: all -> 0x017d, TRY_ENTER, TryCatch #3 {all -> 0x017d, blocks: (B:5:0x001d, B:7:0x0098, B:8:0x00b4, B:58:0x00ce, B:60:0x00d2, B:62:0x00fa, B:13:0x0188, B:15:0x0192, B:17:0x019f, B:24:0x01c1, B:25:0x01f3, B:27:0x01fd, B:29:0x0201, B:33:0x021a, B:35:0x021e, B:37:0x0227, B:39:0x022b, B:40:0x0270, B:41:0x0273, B:46:0x027f, B:47:0x0284, B:48:0x0210, B:52:0x01b0, B:53:0x01e0, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c, B:78:0x0038, B:82:0x0042, B:84:0x0046, B:86:0x004e, B:89:0x0057, B:92:0x0070, B:95:0x0091, B:101:0x0069), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0210 A[Catch: all -> 0x017d, TryCatch #3 {all -> 0x017d, blocks: (B:5:0x001d, B:7:0x0098, B:8:0x00b4, B:58:0x00ce, B:60:0x00d2, B:62:0x00fa, B:13:0x0188, B:15:0x0192, B:17:0x019f, B:24:0x01c1, B:25:0x01f3, B:27:0x01fd, B:29:0x0201, B:33:0x021a, B:35:0x021e, B:37:0x0227, B:39:0x022b, B:40:0x0270, B:41:0x0273, B:46:0x027f, B:47:0x0284, B:48:0x0210, B:52:0x01b0, B:53:0x01e0, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c, B:78:0x0038, B:82:0x0042, B:84:0x0046, B:86:0x004e, B:89:0x0057, B:92:0x0070, B:95:0x0091, B:101:0x0069), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0 A[Catch: all -> 0x017d, TryCatch #3 {all -> 0x017d, blocks: (B:5:0x001d, B:7:0x0098, B:8:0x00b4, B:58:0x00ce, B:60:0x00d2, B:62:0x00fa, B:13:0x0188, B:15:0x0192, B:17:0x019f, B:24:0x01c1, B:25:0x01f3, B:27:0x01fd, B:29:0x0201, B:33:0x021a, B:35:0x021e, B:37:0x0227, B:39:0x022b, B:40:0x0270, B:41:0x0273, B:46:0x027f, B:47:0x0284, B:48:0x0210, B:52:0x01b0, B:53:0x01e0, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c, B:78:0x0038, B:82:0x0042, B:84:0x0046, B:86:0x004e, B:89:0x0057, B:92:0x0070, B:95:0x0091, B:101:0x0069), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126 A[Catch: j -> 0x0119, all -> 0x017d, TryCatch #2 {j -> 0x0119, blocks: (B:62:0x00fa, B:65:0x0120, B:66:0x0125, B:68:0x0126, B:70:0x012e, B:71:0x0179, B:72:0x017c), top: B:54:0x00ca }] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.tencent.mm.ui.widget.dialog.u1] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
