package df2;

/* loaded from: classes3.dex */
public final class qw extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231191d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231192e;

    /* renamed from: f, reason: collision with root package name */
    public int f231193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveShopMsgEvent f231195h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(df2.xw xwVar, com.tencent.mm.autogen.events.FinderLiveShopMsgEvent finderLiveShopMsgEvent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231194g = xwVar;
        this.f231195h = finderLiveShopMsgEvent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qw(this.f231194g, this.f231195h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qw) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
