package vf2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436326d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f436327e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f436328f;

    /* renamed from: g, reason: collision with root package name */
    public int f436329g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436330h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vf2.q f436331i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f436332m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vf2.q qVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436331i = qVar;
        this.f436332m = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vf2.c cVar = new vf2.c(this.f436331i, this.f436332m, continuation);
        cVar.f436330h = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vf2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x014c -> B:23:0x0044). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
