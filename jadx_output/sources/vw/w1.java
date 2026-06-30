package vw;

/* loaded from: classes11.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440744d;

    /* renamed from: e, reason: collision with root package name */
    public int f440745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f440746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f440747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f440748h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440749i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j17, android.content.Intent intent, vw.m2 m2Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440746f = j17;
        this.f440747g = intent;
        this.f440748h = m2Var;
        this.f440749i = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.w1(this.f440746f, this.f440747g, this.f440748h, this.f440749i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x09bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0168  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 2687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
