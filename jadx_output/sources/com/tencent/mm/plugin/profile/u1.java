package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f153623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f153624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153625i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f153626m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f153627n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.String str, java.lang.String str2, int i17, int i18, r45.v60 v60Var, java.lang.String str3, java.lang.Long l17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153620d = str;
        this.f153621e = str2;
        this.f153622f = i17;
        this.f153623g = i18;
        this.f153624h = v60Var;
        this.f153625i = str3;
        this.f153626m = l17;
        this.f153627n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.u1(this.f153620d, this.f153621e, this.f153622f, this.f153623g, this.f153624h, this.f153625i, this.f153626m, this.f153627n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[Catch: Exception -> 0x01a5, TryCatch #0 {Exception -> 0x01a5, blocks: (B:3:0x0019, B:5:0x002d, B:10:0x0039, B:13:0x003f, B:15:0x0049, B:16:0x004b, B:20:0x0070, B:21:0x0089, B:24:0x00c9, B:26:0x00e3, B:28:0x00ed, B:31:0x0130, B:32:0x014c, B:34:0x015f, B:36:0x0165, B:39:0x0182, B:41:0x0196, B:44:0x013b), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[Catch: Exception -> 0x01a5, TryCatch #0 {Exception -> 0x01a5, blocks: (B:3:0x0019, B:5:0x002d, B:10:0x0039, B:13:0x003f, B:15:0x0049, B:16:0x004b, B:20:0x0070, B:21:0x0089, B:24:0x00c9, B:26:0x00e3, B:28:0x00ed, B:31:0x0130, B:32:0x014c, B:34:0x015f, B:36:0x0165, B:39:0x0182, B:41:0x0196, B:44:0x013b), top: B:2:0x0019 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
