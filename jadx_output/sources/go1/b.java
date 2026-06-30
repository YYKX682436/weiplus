package go1;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f273923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f273924e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f273925f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f273926g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f273927h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f273928i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f273929m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f273930n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f273931o;

    /* renamed from: p, reason: collision with root package name */
    public long f273932p;

    /* renamed from: q, reason: collision with root package name */
    public long f273933q;

    /* renamed from: r, reason: collision with root package name */
    public long f273934r;

    /* renamed from: s, reason: collision with root package name */
    public long f273935s;

    /* renamed from: t, reason: collision with root package name */
    public long f273936t;

    /* renamed from: u, reason: collision with root package name */
    public int f273937u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f273938v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f273939w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xn1.k f273940x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f273941y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo, long j17, xn1.k kVar, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f273938v = backupRangeInfo;
        this.f273939w = j17;
        this.f273940x = kVar;
        this.f273941y = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new go1.b(this.f273938v, this.f273939w, this.f273940x, this.f273941y, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((go1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0352, code lost:
    
        r33 = r1;
        r2 = r17;
        com.tencent.mars.xlog.Log.e(r2, "[Skip] talker=" + r14 + ", totalSize=" + r2 + ", lastCreateTime=" + r6.f347126e);
        r9 = r9;
        r1 = r12;
        r3 = r13;
        r5 = r15;
        r13 = r10;
        r6 = r11;
        r10 = r18;
        r7 = r7;
        r0 = null;
        r12 = r33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02b0  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0226 -> B:6:0x0232). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x024f -> B:7:0x026d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x02cd -> B:16:0x02e5). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
