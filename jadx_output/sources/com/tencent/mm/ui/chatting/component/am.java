package com.tencent.mm.ui.chatting.component;

/* loaded from: classes2.dex */
public final class am extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f198643d;

    /* renamed from: e, reason: collision with root package name */
    public int f198644e;

    /* renamed from: f, reason: collision with root package name */
    public int f198645f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f198646g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f198647h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f198648i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f198649m;

    /* renamed from: n, reason: collision with root package name */
    public long f198650n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f198651o;

    /* renamed from: p, reason: collision with root package name */
    public int f198652p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f198653q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f198654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f198655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f198656t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(java.util.ArrayList arrayList, com.tencent.mm.ui.chatting.component.fm fmVar, long j17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f198653q = arrayList;
        this.f198654r = fmVar;
        this.f198655s = j17;
        this.f198656t = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.am(this.f198653q, this.f198654r, this.f198655s, this.f198656t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.am) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:103|104|105|106|12|(5:87|(1:89)|90|(1:92)(1:94)|93)(2:14|(4:16|(1:18)(1:22)|(1:20)|21))|23|24|25|(4:27|(1:(1:38)(6:39|40|41|42|43|(1:45)(4:47|8|9|(0))))(4:29|(1:31)(1:36)|(1:33)|34)|25|(2:85|86)(0))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:4|(3:5|6|7)|8|9|(3:100|101|(10:103|104|105|106|12|(5:87|(1:89)|90|(1:92)(1:94)|93)(2:14|(4:16|(1:18)(1:22)|(1:20)|21))|23|24|25|(4:27|(1:(1:38)(6:39|40|41|42|43|(1:45)(4:47|8|9|(0))))(4:29|(1:31)(1:36)|(1:33)|34)|25|(2:85|86)(0))(0)))|11|12|(0)(0)|23|24|25|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:39|40|41|42|43|(1:45)(4:47|8|9|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0164, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e8, code lost:
    
        r9.s0(r8, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016b, code lost:
    
        r15 = r6;
        r6 = r14;
        r14 = r4;
        r4 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e4, code lost:
    
        r4.s0(r8, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0168, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
    
        r15 = r6;
        r6 = r14;
        r14 = r4;
        r4 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e2, code lost:
    
        r4.s0(r8, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0121 A[Catch: x3 -> 0x0110, j -> 0x015f, TryCatch #10 {x3 -> 0x0110, j -> 0x015f, blocks: (B:106:0x0108, B:12:0x011d, B:14:0x0121, B:16:0x012b, B:18:0x0133, B:21:0x013a, B:87:0x013f, B:89:0x014a, B:90:0x014d, B:92:0x0151, B:93:0x0155), top: B:105:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f A[Catch: x3 -> 0x0110, j -> 0x015f, TryCatch #10 {x3 -> 0x0110, j -> 0x015f, blocks: (B:106:0x0108, B:12:0x011d, B:14:0x0121, B:16:0x012b, B:18:0x0133, B:21:0x013a, B:87:0x013f, B:89:0x014a, B:90:0x014d, B:92:0x0151, B:93:0x0155), top: B:105:0x0108 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b5 -> B:25:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f6 -> B:8:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0181 -> B:24:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0187 -> B:24:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01c8 -> B:23:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ce -> B:23:0x01e2). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.am.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
