package xe5;

/* loaded from: classes10.dex */
public final class a0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f453978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xe5.i f453979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f453983f;

    public a0(kotlin.jvm.internal.f0 f0Var, xe5.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        this.f453978a = f0Var;
        this.f453979b = iVar;
        this.f453980c = str;
        this.f453981d = str2;
        this.f453982e = str3;
        this.f453983f = z17;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        boolean z17 = obj instanceof r45.l71;
        r45.l71 l71Var = z17 ? (r45.l71) obj : null;
        r45.nw1 nw1Var = l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null;
        this.f453978a.f310116d = i17;
        java.lang.String str = this.f453981d;
        if (nw1Var == null) {
            xe5.i iVar = this.f453979b;
            java.lang.String str2 = this.f453980c;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            iVar.b(1, j17, str2, str == null ? "" : str, i17);
        } else {
            qs5.n Vj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Vj(this.f453982e, nw1Var);
            xe5.i iVar2 = this.f453979b;
            java.lang.String str3 = this.f453980c;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            iVar2.c(2, j17, str3, str == null ? "" : str, Vj, nw1Var);
        }
        if (this.f453983f) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f435772a.b(z17 ? (r45.l71) obj : null);
        }
    }
}
