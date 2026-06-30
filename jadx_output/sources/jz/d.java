package jz;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302556d;

    /* renamed from: e, reason: collision with root package name */
    public int f302557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.c f302558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qi3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302558f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jz.d(this.f302558f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jz.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x024c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ae A[Catch: Exception -> 0x026a, TryCatch #1 {Exception -> 0x026a, blocks: (B:10:0x0022, B:11:0x024d, B:12:0x0027, B:13:0x0225, B:16:0x002c, B:17:0x01f5, B:20:0x0031, B:21:0x01e3, B:23:0x0036, B:24:0x01bb, B:27:0x003b, B:28:0x0188, B:30:0x01ae, B:33:0x01e7, B:36:0x0040, B:37:0x015a, B:39:0x0045, B:40:0x0133, B:43:0x004a, B:44:0x00d3, B:46:0x004f, B:47:0x00ac, B:51:0x0057, B:52:0x0077, B:54:0x009d, B:57:0x00d7, B:59:0x00df, B:61:0x00fa, B:63:0x00fe, B:65:0x0104, B:68:0x015e, B:72:0x005e), top: B:2:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e7 A[Catch: Exception -> 0x026a, TryCatch #1 {Exception -> 0x026a, blocks: (B:10:0x0022, B:11:0x024d, B:12:0x0027, B:13:0x0225, B:16:0x002c, B:17:0x01f5, B:20:0x0031, B:21:0x01e3, B:23:0x0036, B:24:0x01bb, B:27:0x003b, B:28:0x0188, B:30:0x01ae, B:33:0x01e7, B:36:0x0040, B:37:0x015a, B:39:0x0045, B:40:0x0133, B:43:0x004a, B:44:0x00d3, B:46:0x004f, B:47:0x00ac, B:51:0x0057, B:52:0x0077, B:54:0x009d, B:57:0x00d7, B:59:0x00df, B:61:0x00fa, B:63:0x00fe, B:65:0x0104, B:68:0x015e, B:72:0x005e), top: B:2:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d A[Catch: Exception -> 0x026a, TryCatch #1 {Exception -> 0x026a, blocks: (B:10:0x0022, B:11:0x024d, B:12:0x0027, B:13:0x0225, B:16:0x002c, B:17:0x01f5, B:20:0x0031, B:21:0x01e3, B:23:0x0036, B:24:0x01bb, B:27:0x003b, B:28:0x0188, B:30:0x01ae, B:33:0x01e7, B:36:0x0040, B:37:0x015a, B:39:0x0045, B:40:0x0133, B:43:0x004a, B:44:0x00d3, B:46:0x004f, B:47:0x00ac, B:51:0x0057, B:52:0x0077, B:54:0x009d, B:57:0x00d7, B:59:0x00df, B:61:0x00fa, B:63:0x00fe, B:65:0x0104, B:68:0x015e, B:72:0x005e), top: B:2:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7 A[Catch: Exception -> 0x026a, TryCatch #1 {Exception -> 0x026a, blocks: (B:10:0x0022, B:11:0x024d, B:12:0x0027, B:13:0x0225, B:16:0x002c, B:17:0x01f5, B:20:0x0031, B:21:0x01e3, B:23:0x0036, B:24:0x01bb, B:27:0x003b, B:28:0x0188, B:30:0x01ae, B:33:0x01e7, B:36:0x0040, B:37:0x015a, B:39:0x0045, B:40:0x0133, B:43:0x004a, B:44:0x00d3, B:46:0x004f, B:47:0x00ac, B:51:0x0057, B:52:0x0077, B:54:0x009d, B:57:0x00d7, B:59:0x00df, B:61:0x00fa, B:63:0x00fe, B:65:0x0104, B:68:0x015e, B:72:0x005e), top: B:2:0x0012, outer: #0 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jz.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
