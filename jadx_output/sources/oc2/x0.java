package oc2;

/* loaded from: classes8.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f344296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f344297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f344298f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f344299g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f344300h;

    /* renamed from: i, reason: collision with root package name */
    public long f344301i;

    /* renamed from: m, reason: collision with root package name */
    public int f344302m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f344303n;

    /* renamed from: o, reason: collision with root package name */
    public int f344304o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f344305p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.fz2 f344306q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344307r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f344308s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oc2.e f344309t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ oc2.h f344310u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(r45.fz2 fz2Var, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, boolean z17, oc2.e eVar, oc2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344306q = fz2Var;
        this.f344307r = renderView;
        this.f344308s = z17;
        this.f344309t = eVar;
        this.f344310u = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        oc2.x0 x0Var = new oc2.x0(this.f344306q, this.f344307r, this.f344308s, this.f344309t, this.f344310u, continuation);
        x0Var.f344305p = obj;
        return x0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oc2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00de -> B:54:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0149 -> B:49:0x015d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
