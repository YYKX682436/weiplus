package iu0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294810d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294811e;

    /* renamed from: f, reason: collision with root package name */
    public int f294812f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f294814h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.io.File f294815i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, java.io.File file, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294814h = list;
        this.f294815i = file;
        this.f294816m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        iu0.f fVar = new iu0.f(this.f294814h, this.f294815i, this.f294816m, continuation);
        fVar.f294813g = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00c0 -> B:5:0x00c3). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
