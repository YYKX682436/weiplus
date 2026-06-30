package ee5;

/* loaded from: classes9.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251887d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f251888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.h2 f251889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(ee5.h2 h2Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251889f = h2Var;
        this.f251890g = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.g2 g2Var = new ee5.g2(this.f251889f, this.f251890g, continuation);
        g2Var.f251888e = obj;
        return g2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
