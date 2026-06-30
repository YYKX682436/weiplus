package tx2;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f422534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r45.h32 h32Var, tx2.i0 i0Var) {
        super(1);
        this.f422534d = h32Var;
        this.f422535e = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#tv_do_not_show_notice click noticeid=");
        r45.h32 h32Var = this.f422534d;
        sb6.append(h32Var.getString(4));
        sb6.append(" resp.isSuccess=");
        sb6.append(fVar != null ? java.lang.Boolean.valueOf(fVar.b()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeBigCardWidget", sb6.toString());
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            r45.ml1 ml1Var = (r45.ml1) fVar.f70618d;
            if (ml1Var == null || (list = ml1Var.getList(1)) == null) {
                return null;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((r45.ix0) it.next()).getInteger(0) == 0) {
                    tx2.i0 i0Var = this.f422535e;
                    android.content.Context context = i0Var.f118381d;
                    db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.m3m), com.tencent.mm.R.raw.icons_filled_done);
                    java.util.Set set = tx2.h1.f422575a;
                    java.lang.String string = h32Var.getString(4);
                    if (!(string == null || string.length() == 0)) {
                        tx2.h1.f422575a.add(string);
                    }
                    yz5.a aVar = i0Var.A;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    i0Var.a();
                }
            }
        }
        return f0Var;
    }
}
