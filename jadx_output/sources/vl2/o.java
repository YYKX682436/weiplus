package vl2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vl2.h f437859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f437860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vl2.h hVar, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437859e = hVar;
        this.f437860f = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vl2.o(this.f437859e, this.f437860f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vl2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
