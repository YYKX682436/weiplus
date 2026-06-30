package ho1;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f282677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f282678e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f282679f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f282680g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f282681h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f282682i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f282683m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f282684n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f282685o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f282686p;

    /* renamed from: q, reason: collision with root package name */
    public long f282687q;

    /* renamed from: r, reason: collision with root package name */
    public long f282688r;

    /* renamed from: s, reason: collision with root package name */
    public long f282689s;

    /* renamed from: t, reason: collision with root package name */
    public long f282690t;

    /* renamed from: u, reason: collision with root package name */
    public int f282691u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f282692v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f282693w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f282694x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ xn1.k f282695y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo, long j17, com.tencent.wechat.aff.affroam.g gVar, xn1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282692v = backupRangeInfo;
        this.f282693w = j17;
        this.f282694x = gVar;
        this.f282695y = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ho1.g1(this.f282692v, this.f282693w, this.f282694x, this.f282695y, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ho1.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0341 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x028f  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x020a -> B:6:0x0220). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x023b -> B:7:0x024a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x02a6 -> B:13:0x02ba). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ho1.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
