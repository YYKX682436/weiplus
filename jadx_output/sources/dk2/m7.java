package dk2;

/* loaded from: classes3.dex */
public final class m7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233762d;

    /* renamed from: e, reason: collision with root package name */
    public int f233763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.na0 f233765g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(ce2.i iVar, r45.na0 na0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233764f = iVar;
        this.f233765g = na0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.m7(this.f233764f, this.f233765g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.m7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.m7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
