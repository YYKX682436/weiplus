package sp2;

/* loaded from: classes2.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f411247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f411248h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f411249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(sp2.x3 x3Var, int i17, int i18, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411245e = x3Var;
        this.f411246f = i17;
        this.f411247g = i18;
        this.f411248h = recyclerView;
        this.f411249i = wxRecyclerAdapter;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.v3(this.f411245e, this.f411246f, this.f411247g, this.f411248h, this.f411249i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.v3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00fd, code lost:
    
        if (r4.isPaused() == true) goto L34;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.v3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
