package k50;

/* loaded from: classes9.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f304186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f304187e;

    /* renamed from: f, reason: collision with root package name */
    public int f304188f;

    /* renamed from: g, reason: collision with root package name */
    public int f304189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f304191i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f304192m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304193n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.util.List list, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304190h = list;
        this.f304191i = f9Var;
        this.f304192m = v2Var;
        this.f304193n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k50.b1(this.f304190h, this.f304191i, this.f304192m, this.f304193n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k50.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x02c4 -> B:5:0x02c8). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
