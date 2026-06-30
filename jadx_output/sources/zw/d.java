package zw;

/* loaded from: classes7.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f476496d;

    /* renamed from: e, reason: collision with root package name */
    public int f476497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f476501i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f476502m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, android.content.Context context, yz5.l lVar, qc0.m1 m1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476498f = list;
        this.f476499g = context;
        this.f476500h = lVar;
        this.f476501i = m1Var;
        this.f476502m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zw.d(this.f476498f, this.f476499g, this.f476500h, this.f476501i, this.f476502m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zw.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0422 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
