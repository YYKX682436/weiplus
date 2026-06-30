package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class r3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.q3 f186801d = new com.tencent.mm.plugin.webview.ui.tools.q3(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f186802e = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.o3.f186725d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f186803f = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.n3.f185854d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f186804g = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.p3.f186746d);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186805a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.j3 f186806b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f186807c;

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018c, code lost:
    
        a(com.tencent.mm.sdk.platformtools.t8.D1(r2, 0));
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:6:0x004b, B:8:0x0057, B:9:0x0059, B:11:0x005f, B:14:0x006c, B:16:0x007c, B:25:0x0083, B:27:0x008c, B:29:0x0095, B:31:0x009d, B:33:0x00a5, B:38:0x00be, B:41:0x00c7, B:45:0x00d1, B:53:0x00e2, B:55:0x0121, B:60:0x0142, B:62:0x0128, B:64:0x013a, B:66:0x0178, B:67:0x0199, B:69:0x01a1, B:73:0x01aa, B:75:0x01b0, B:79:0x017c, B:81:0x0182, B:86:0x018c, B:87:0x0195), top: B:5:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:6:0x004b, B:8:0x0057, B:9:0x0059, B:11:0x005f, B:14:0x006c, B:16:0x007c, B:25:0x0083, B:27:0x008c, B:29:0x0095, B:31:0x009d, B:33:0x00a5, B:38:0x00be, B:41:0x00c7, B:45:0x00d1, B:53:0x00e2, B:55:0x0121, B:60:0x0142, B:62:0x0128, B:64:0x013a, B:66:0x0178, B:67:0x0199, B:69:0x01a1, B:73:0x01aa, B:75:0x01b0, B:79:0x017c, B:81:0x0182, B:86:0x018c, B:87:0x0195), top: B:5:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:6:0x004b, B:8:0x0057, B:9:0x0059, B:11:0x005f, B:14:0x006c, B:16:0x007c, B:25:0x0083, B:27:0x008c, B:29:0x0095, B:31:0x009d, B:33:0x00a5, B:38:0x00be, B:41:0x00c7, B:45:0x00d1, B:53:0x00e2, B:55:0x0121, B:60:0x0142, B:62:0x0128, B:64:0x013a, B:66:0x0178, B:67:0x0199, B:69:0x01a1, B:73:0x01aa, B:75:0x01b0, B:79:0x017c, B:81:0x0182, B:86:0x018c, B:87:0x0195), top: B:5:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:6:0x004b, B:8:0x0057, B:9:0x0059, B:11:0x005f, B:14:0x006c, B:16:0x007c, B:25:0x0083, B:27:0x008c, B:29:0x0095, B:31:0x009d, B:33:0x00a5, B:38:0x00be, B:41:0x00c7, B:45:0x00d1, B:53:0x00e2, B:55:0x0121, B:60:0x0142, B:62:0x0128, B:64:0x013a, B:66:0x0178, B:67:0x0199, B:69:0x01a1, B:73:0x01aa, B:75:0x01b0, B:79:0x017c, B:81:0x0182, B:86:0x018c, B:87:0x0195), top: B:5:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:6:0x004b, B:8:0x0057, B:9:0x0059, B:11:0x005f, B:14:0x006c, B:16:0x007c, B:25:0x0083, B:27:0x008c, B:29:0x0095, B:31:0x009d, B:33:0x00a5, B:38:0x00be, B:41:0x00c7, B:45:0x00d1, B:53:0x00e2, B:55:0x0121, B:60:0x0142, B:62:0x0128, B:64:0x013a, B:66:0x0178, B:67:0x0199, B:69:0x01a1, B:73:0x01aa, B:75:0x01b0, B:79:0x017c, B:81:0x0182, B:86:0x018c, B:87:0x0195), top: B:5:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r3(com.tencent.mm.plugin.webview.ui.tools.WebViewUI r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.r3.<init>(com.tencent.mm.plugin.webview.ui.tools.WebViewUI):void");
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.j3 j3Var = this.f186806b;
        if (i17 == 0) {
            j3Var.f184853b = false;
        } else if (i17 != 1) {
            j3Var.f184853b = com.tencent.mm.ui.bk.C();
        } else {
            j3Var.f184853b = true;
        }
    }
}
