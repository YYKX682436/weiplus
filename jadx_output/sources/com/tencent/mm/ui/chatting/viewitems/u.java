package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f205636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f205637e;

    /* renamed from: f, reason: collision with root package name */
    public long f205638f;

    /* renamed from: g, reason: collision with root package name */
    public int f205639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.c f205640h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f205641i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f205642m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205643n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205644o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205645p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f205646q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f205648s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f205649t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zy2.c cVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, long j17, android.view.View view, java.lang.String str, yb5.d dVar, long j18, com.tencent.mm.storage.f9 f9Var, kotlin.jvm.internal.h0 h0Var, long j19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f205640h = cVar;
        this.f205641i = a0Var;
        this.f205642m = j17;
        this.f205643n = view;
        this.f205644o = str;
        this.f205645p = dVar;
        this.f205646q = j18;
        this.f205647r = f9Var;
        this.f205648s = h0Var;
        this.f205649t = j19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.u(this.f205640h, this.f205641i, this.f205642m, this.f205643n, this.f205644o, this.f205645p, this.f205646q, this.f205647r, this.f205648s, this.f205649t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:22|(1:26)|27|(2:29|(5:31|32|(2:37|(1:39)(1:231))(1:232)|40|(30:115|(1:230)(1:119)|(2:121|(4:123|(1:125)(1:128)|126|127))|129|(1:229)(1:133)|134|(1:136)(1:228)|(1:138)|139|140|141|(4:143|(1:145)(1:151)|(1:147)(1:150)|(1:149))|(4:153|(1:155)(1:161)|(1:157)(1:160)|(1:159))|162|(1:164)|165|(4:167|(1:169)(1:175)|(1:171)(1:174)|(1:173))|(4:177|(1:179)(1:185)|(1:181)(1:184)|(1:183))|186|(1:188)|189|190|(1:192)(1:224)|(1:194)|195|(1:197)(1:223)|(1:199)(1:222)|200|(1:202)(1:221)|(10:204|(1:206)(1:219)|207|(1:209)|210|(1:212)|213|(1:215)(1:218)|216|217)(1:220))(11:43|(1:45)(2:111|(1:113)(1:114))|46|(1:110)(1:52)|(1:109)(1:56)|57|(1:59)(1:108)|60|(1:62)|63|(6:99|(1:101)(1:107)|102|(1:104)|105|106)(2:66|(8:68|(1:70)(1:83)|71|(1:82)(1:75)|76|(1:78)(1:81)|79|80)(3:84|(1:86)(1:98)|(6:88|(1:90)(1:96)|91|(1:93)|94|95)(1:97))))))(1:234)|233|32|(37:34|37|(0)(0)|40|(0)|115|(1:117)|230|(0)|129|(1:131)|229|134|(0)(0)|(0)|139|140|141|(0)|(0)|162|(0)|165|(0)|(0)|186|(0)|189|190|(0)(0)|(0)|195|(0)(0)|(0)(0)|200|(0)(0)|(0)(0))|232|40|(0)|115|(0)|230|(0)|129|(0)|229|134|(0)(0)|(0)|139|140|141|(0)|(0)|162|(0)|165|(0)|(0)|186|(0)|189|190|(0)(0)|(0)|195|(0)(0)|(0)(0)|200|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x068d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x068e, code lost:
    
        com.tencent.mars.xlog.Log.w("ChatingItemAppMsgFinderLiveFeed", "err:" + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05b2 A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:141:0x05a8, B:143:0x05b2, B:149:0x05c3, B:153:0x05ca, B:159:0x05da, B:162:0x05e4, B:164:0x0604, B:165:0x060d, B:167:0x0628, B:173:0x0637, B:177:0x0645, B:183:0x0654, B:186:0x0664, B:188:0x0672, B:189:0x067a), top: B:140:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05ca A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:141:0x05a8, B:143:0x05b2, B:149:0x05c3, B:153:0x05ca, B:159:0x05da, B:162:0x05e4, B:164:0x0604, B:165:0x060d, B:167:0x0628, B:173:0x0637, B:177:0x0645, B:183:0x0654, B:186:0x0664, B:188:0x0672, B:189:0x067a), top: B:140:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0604 A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:141:0x05a8, B:143:0x05b2, B:149:0x05c3, B:153:0x05ca, B:159:0x05da, B:162:0x05e4, B:164:0x0604, B:165:0x060d, B:167:0x0628, B:173:0x0637, B:177:0x0645, B:183:0x0654, B:186:0x0664, B:188:0x0672, B:189:0x067a), top: B:140:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0628 A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:141:0x05a8, B:143:0x05b2, B:149:0x05c3, B:153:0x05ca, B:159:0x05da, B:162:0x05e4, B:164:0x0604, B:165:0x060d, B:167:0x0628, B:173:0x0637, B:177:0x0645, B:183:0x0654, B:186:0x0664, B:188:0x0672, B:189:0x067a), top: B:140:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0645 A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:141:0x05a8, B:143:0x05b2, B:149:0x05c3, B:153:0x05ca, B:159:0x05da, B:162:0x05e4, B:164:0x0604, B:165:0x060d, B:167:0x0628, B:173:0x0637, B:177:0x0645, B:183:0x0654, B:186:0x0664, B:188:0x0672, B:189:0x067a), top: B:140:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0672 A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:141:0x05a8, B:143:0x05b2, B:149:0x05c3, B:153:0x05ca, B:159:0x05da, B:162:0x05e4, B:164:0x0604, B:165:0x060d, B:167:0x0628, B:173:0x0637, B:177:0x0645, B:183:0x0654, B:186:0x0664, B:188:0x0672, B:189:0x067a), top: B:140:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa A[ADDED_TO_REGION] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instructions count: 2031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
