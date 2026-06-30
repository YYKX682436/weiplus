package wd4;

/* loaded from: classes4.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444959d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f444960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f444961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f444962g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f444963h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f444964i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f444965m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f444966n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444967o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ wd4.r f444968p;

    /* renamed from: q, reason: collision with root package name */
    public int f444969q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wd4.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f444968p = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$1");
        this.f444967o = obj;
        this.f444969q |= Integer.MIN_VALUE;
        java.lang.Object c17 = this.f444968p.c(null, null, null, null, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$1");
        return c17;
    }
}
