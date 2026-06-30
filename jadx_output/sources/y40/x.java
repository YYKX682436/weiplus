package y40;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f459333d;

    /* renamed from: e, reason: collision with root package name */
    public int f459334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f459335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f459336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f459337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459338i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j17, android.content.Intent intent, y40.i0 i0Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f459335f = j17;
        this.f459336g = intent;
        this.f459337h = i0Var;
        this.f459338i = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y40.x(this.f459335f, this.f459336g, this.f459337h, this.f459338i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y40.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0a26 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 2793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
