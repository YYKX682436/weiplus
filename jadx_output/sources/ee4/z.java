package ee4;

/* loaded from: classes4.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.c0 f251772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f251773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f251774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l56.i f251775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251776h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f251777i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f251778m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f251779n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f251780o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f251781p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.List f251782q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f251783r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f251785t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f251786u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ee4.h1 f251787v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ee4.c0 c0Var, int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28, ee4.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251772d = c0Var;
        this.f251773e = i17;
        this.f251774f = i18;
        this.f251775g = iVar;
        this.f251776h = str;
        this.f251777i = list;
        this.f251778m = ed4Var;
        this.f251779n = linkedList;
        this.f251780o = i19;
        this.f251781p = z17;
        this.f251782q = list2;
        this.f251783r = pInt;
        this.f251784s = str2;
        this.f251785t = i27;
        this.f251786u = i28;
        this.f251787v = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$2");
        ee4.z zVar = new ee4.z(this.f251772d, this.f251773e, this.f251774f, this.f251775g, this.f251776h, this.f251777i, this.f251778m, this.f251779n, this.f251780o, this.f251781p, this.f251782q, this.f251783r, this.f251784s, this.f251785t, this.f251786u, this.f251787v, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$2");
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$2");
        ee4.z zVar = (ee4.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$2");
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x084d, code lost:
    
        if ((r8.f373311d == 0.0f ? true : r6) == false) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0426  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 2333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee4.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
