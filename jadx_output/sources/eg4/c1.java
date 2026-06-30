package eg4;

/* loaded from: classes4.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252684e = addFriendVerifyRecordUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg4.c1(this.f252684e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg4.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: Exception -> 0x0203, TryCatch #2 {Exception -> 0x0203, blocks: (B:16:0x005b, B:18:0x0061, B:19:0x0067, B:20:0x0072, B:22:0x0078, B:24:0x0084, B:30:0x0094, B:31:0x009b, B:33:0x009f, B:40:0x00af, B:49:0x00b7, B:51:0x00fc, B:193:0x01a1, B:195:0x01b5, B:196:0x01f3, B:219:0x01ff, B:220:0x0202, B:178:0x0103, B:181:0x010d, B:185:0x012a, B:186:0x0157, B:191:0x0168, B:198:0x012f, B:200:0x013a, B:201:0x013d, B:205:0x014b, B:207:0x0151, B:208:0x0154, B:215:0x01fc), top: B:15:0x005b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: Exception -> 0x0203, TryCatch #2 {Exception -> 0x0203, blocks: (B:16:0x005b, B:18:0x0061, B:19:0x0067, B:20:0x0072, B:22:0x0078, B:24:0x0084, B:30:0x0094, B:31:0x009b, B:33:0x009f, B:40:0x00af, B:49:0x00b7, B:51:0x00fc, B:193:0x01a1, B:195:0x01b5, B:196:0x01f3, B:219:0x01ff, B:220:0x0202, B:178:0x0103, B:181:0x010d, B:185:0x012a, B:186:0x0157, B:191:0x0168, B:198:0x012f, B:200:0x013a, B:201:0x013d, B:205:0x014b, B:207:0x0151, B:208:0x0154, B:215:0x01fc), top: B:15:0x005b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
