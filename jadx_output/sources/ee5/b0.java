package ee5;

/* loaded from: classes9.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251827d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f251828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.h0 f251829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ee5.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251829f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.b0 b0Var = new ee5.b0(this.f251829f, continuation);
        b0Var.f251828e = obj;
        return b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0145. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
