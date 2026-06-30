package id2;

/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f290609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f290610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f290612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(v65.n nVar, com.tencent.mm.modelbase.f fVar, android.content.Context context, boolean z17, id2.u3 u3Var) {
        super(0);
        this.f290609d = nVar;
        this.f290610e = fVar;
        this.f290611f = context;
        this.f290612g = z17;
        this.f290613h = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ix0 ix0Var;
        com.tencent.mm.modelbase.f fVar = this.f290610e;
        this.f290609d.a(java.lang.Boolean.valueOf(xg2.g.e(fVar)));
        if (xg2.g.e(fVar)) {
            java.util.Iterator it = ((r45.m02) fVar.f70618d).getList(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    ix0Var = null;
                    break;
                }
                ix0Var = (r45.ix0) it.next();
                if (ix0Var.getInteger(0) == 15) {
                    break;
                }
            }
            if (ix0Var != null) {
                int integer = ix0Var.getInteger(1);
                android.content.Context context = this.f290611f;
                if (integer == 0) {
                    com.tencent.mm.protobuf.g byteString = ix0Var.getByteString(3);
                    if (byteString != null) {
                        com.tencent.mm.protobuf.g gVar = byteString.f192156a.length > 0 ? byteString : null;
                        if (gVar != null) {
                            r45.z02 z02Var = new r45.z02();
                            z02Var.parseFrom(gVar.g());
                            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "#executeUpload finally done. new remain: " + z02Var.getInteger(0));
                            if (this.f290612g) {
                                java.lang.String string = this.f290613h.getContext().getResources().getString(com.tencent.mm.R.string.f491767e65);
                                kotlin.jvm.internal.o.f(string, "getString(...)");
                                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                                e4Var.f211776c = string;
                                e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
                                e4Var.c();
                            }
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "#executeUpload fail: " + ix0Var.getInteger(1));
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var2.f211776c = ix0Var.getString(2);
                    e4Var2.c();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
