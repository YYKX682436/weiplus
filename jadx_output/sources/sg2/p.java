package sg2;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407924d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg2.p(this.f407924d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = false;
        java.lang.String str = this.f407924d;
        if (str == null || str.length() == 0) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.Object obj2 = ((java.util.LinkedHashMap) sg2.x.f407959e).get(str);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(obj2, bool)) {
            return bool;
        }
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            boolean z18 = false;
            while (it.hasNext()) {
                java.lang.String name = ((com.tencent.mm.vfs.x1) it.next()).f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                if (r26.n0.B(name, "manifest.json", false)) {
                    z18 = true;
                }
            }
            z17 = z18;
        }
        if (z17) {
            sg2.x.f407959e.put(str, java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
