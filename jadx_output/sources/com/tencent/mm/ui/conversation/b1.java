package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f207455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207457h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207458i;

    public b1(java.lang.String str, android.content.Context context, com.tencent.mm.storage.l4 l4Var, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, java.lang.Runnable runnable) {
        this.f207453d = str;
        this.f207454e = context;
        this.f207455f = l4Var;
        this.f207456g = pBool;
        this.f207457h = progressDialog;
        this.f207458i = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c1, code lost:
    
        if (r7.moveToNext() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvDelLogic", "delAppBrandServiceConversationAndMsg talker:%s", r0);
        r8 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(r0);
        r9 = new r45.ac0();
        r10 = new r45.du5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r10.f372756d = r11;
        r10.f372757e = true;
        r9.f369912d = r10;
        r9.f369914f = r8.I0();
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, r9));
        c01.w9.h(r0, new com.tencent.mm.ui.conversation.i1());
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(r0, 15);
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.conversation.j1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r7.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r0 = new com.tencent.mm.storage.l4();
        r0.convertFrom(r7);
        r0 = r0.h1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.ConvDelLogic", "Delete Conversation and messages fail because username is null or nil.");
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.content.DialogInterface r18, int r19) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.b1.onClick(android.content.DialogInterface, int):void");
    }
}
