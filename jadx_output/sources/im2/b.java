package im2;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.live.plugin.no0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f292252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f292252e = "FinderLiveEndSquareHolderPlugin";
    }

    public final so2.v2 Y() {
        android.content.Context context = this.f113668d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.no0
    public void a() {
        java.lang.String u17 = pm0.v.u(Y().f410659n.getLong(0));
        com.tencent.mars.xlog.Log.i(this.f292252e, "report enter square");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("liveid", u17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.V2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        java.lang.String str = b17;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.T8(zbVar, t1Var, hashMap, str, "temp_30", null, null, false, 112, null);
        com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent finderLiveScrollSquareStatusEvent = new com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent();
        am.ub ubVar = finderLiveScrollSquareStatusEvent.f54290g;
        ubVar.f8070a = 6L;
        ubVar.f8071b = true;
        ubVar.f8072c = u17;
        finderLiveScrollSquareStatusEvent.e();
        com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent finderLiveSquareStatusEvent = new com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent();
        am.yb ybVar = finderLiveSquareStatusEvent.f54294g;
        ybVar.f8449a = 4L;
        ybVar.f8450b = 0;
        r45.la2 la2Var = Y().f410667v;
        ybVar.f8451c = la2Var != null ? la2Var.getByteString(2) : null;
        ybVar.f8452d = Y().f410668w;
        finderLiveSquareStatusEvent.e();
        this.f113668d.post(new im2.a(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.no0
    public void b(com.tencent.mm.plugin.finder.live.viewmodel.c4 data) {
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View view = this.f113668d;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.s76);
        view.findViewById(com.tencent.mm.R.id.s7b);
        android.graphics.Bitmap bitmap = data.f116971c;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
