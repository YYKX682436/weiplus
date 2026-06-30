package ut2;

/* loaded from: classes3.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f430910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f430912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f430913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.wv2 f430914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.sdk.platformtools.o4 o4Var, java.lang.String str, long j17, ut2.j5 j5Var, r45.wv2 wv2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430910e = o4Var;
        this.f430911f = str;
        this.f430912g = j17;
        this.f430913h = j5Var;
        this.f430914i = wv2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.h5(this.f430910e, this.f430911f, this.f430912g, this.f430913h, this.f430914i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430909d;
        ut2.j5 j5Var = this.f430913h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f430910e.putLong(this.f430911f, this.f430912g);
            android.content.Context context = j5Var.f430937e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xt2.n nVar = new xt2.n(context);
            android.view.View inflate = android.view.LayoutInflater.from(j5Var.f430937e.getContext()).inflate(com.tencent.mm.R.layout.azh, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kl7);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kln);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
            r45.wv2 wv2Var = this.f430914i;
            java.lang.String string = wv2Var.getString(0);
            if (string == null) {
                string = "";
            }
            wo0.c a17 = d1Var.a(((c61.i8) i5Var).Ai(string, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            kotlin.jvm.internal.o.d(imageView);
            ((wo0.b) a17).c(imageView);
            textView.setText(wv2Var.getString(1));
            android.view.ViewGroup viewGroup = nVar.f456897e;
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
            nVar.a(j5Var.j());
            j5Var.C = nVar;
            j5Var.f430936d.Y = true;
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Dj((ml2.r0) c17, ml2.f4.G, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
            long integer = wv2Var.getInteger(2) * 1000;
            this.f430909d = 1;
            if (kotlinx.coroutines.k1.b(integer, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        xt2.n nVar2 = j5Var.C;
        if (nVar2 != null) {
            nVar2.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
